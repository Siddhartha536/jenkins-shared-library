def call() {
    echo "Building jar using Jenkins Maven tool"
    withMaven(maven: 'maven-3.9') { // Replace 'Maven-3.8.5' with your configured tool name
        sh "mvn package"
    }
}
