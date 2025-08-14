def call(String ProjectName,String ImageTag,String DockerHubUser){
        echo "Pushing image to docker hub..."
                withCredentials([usernamePassword(credentialsId:'DockerHubCred',passwordVariable:'dockerHubPass',usernameVariable:'DockerHubUser')]){
                    sh "docker login -u ${env.DockerHubUser} -p ${env.dockerHubPass}"  
                }
                      sh "docker push ${DockerHubUser}/${ProjectName}:${ImageTag}"

}
