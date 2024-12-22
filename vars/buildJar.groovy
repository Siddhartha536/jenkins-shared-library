#!/user/bin/env groovy

def call(){
    echo "Building jar"
    sh "mvn clean package"
}