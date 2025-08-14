def call(String imageName, String imageTag, String dockerUser) {
    if (!imageName) { error "Image name is required" }
    if (!imageTag) { imageTag = "latest" }

    echo "Building Docker image: ${dockerUser}/${imageName}:${imageTag}"

    sh """
        docker build -t ${dockerUser}/${imageName}:${imageTag} -t ${dockerUser}/${imageName}:latest .
    """
}
