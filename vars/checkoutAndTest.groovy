def call() {
    checkout scm
    sh 'mvn test'
}
