pipeline{
    agent any
    stages{
        stage("run packer"){
            steps{
                sh "packer build -var "WORDPRESS_VERSION=5.0.4" image.json"
            }
        }
    }
}