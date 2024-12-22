def call() {
    echo "Building jar using Maven"
    def mavenHome = tool name: 'maven-3.9', type: 'maven' // Match the name in Global Tool Configuration
    env.PATH = "${mavenHome}/bin:${env.PATH}" // Add Maven to the PATH for this script
    sh "mvn -v" // Verify Maven is accessible
    sh "mvn package" // Execute Maven package command
}
