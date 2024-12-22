#!/user/bin/env groovy

def call(){
     echo "building the docker image..."
                    withCredentials([usernamePassword(credentialsId:'docker-hub-credentials',passwordVariable:'PASS',usernameVariable:'USER')]){
                        sh 'docker build -t siddhartha536/demo-app:3.0 .'
                        sh 'echo $PASS | docker login -u $USER --password-stdin'
                        sh 'docker push siddhartha536/demo-app:3.0'
                    }
}