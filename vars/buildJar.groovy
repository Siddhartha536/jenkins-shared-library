def call() {
    echo "Building jar using system Maven"
    sh "mvn package"
}
