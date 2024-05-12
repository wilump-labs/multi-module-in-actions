dependencies {
    implementation("io.awspring.cloud:spring-cloud-aws-starter-s3:${property("awsS3Version")}")

    testImplementation("org.testcontainers:localstack:${property("testcontainersVersion")}")
    testImplementation("org.testcontainers:junit-jupiter:${property("testcontainersVersion")}")
}