# Reddit Clone using Java Spring

This is a Reddit clone built using Java Spring. It allows users to create accounts, submit posts, upvote and downvote posts, and comment on posts.

## Technologies Used

- Java Spring
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Features

- User account creation and management
- Post creation and management
- Upvoting and downvoting of posts
- Commenting on posts
- Sorting of posts by popularity, date, and relevance

## Installation

1. Clone the repository:

git clone https://github.com/Ahmed-Elgohary1/reddit-clone.git


2. Create a PostgreSQL database and update the application.properties file with your database credentials:

spring.datasource.url=jdbc:mysql://localhost:5432/reddit_clone
spring.datasource.username=admin
spring.datasource.password=admin


3. Build and run the application:

./mvnw spring-boot:run


4. Open your web browser and navigate to http://localhost:8080 to view the application.

## Usage

1. Create an account by clicking on the "Sign Up" button and filling out the registration form.

2. Log in to your account by clicking on the "Log In" button and entering your credentials.

3. Submit a post by clicking on the "Submit Post" button and filling out the post form.

4. Upvote or downvote a post by clicking on the arrows next to the post.

5. Comment on a post by clicking on the "Comment" button and filling out the comment form.

6. Sort posts by popularity, date, or relevance by clicking on the corresponding buttons.

## Contributing

Contributions are welcome! If you find a bug or have a feature request, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
