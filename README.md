# p_and_c_insurtech_policyholder360_api
This API is designed to show how you might mock, test document a new API. In this case, we're assuming that we're going to create a basic user management API.

It has basic CRUD operations listed below.

Hit the "Run in Postman" button to see the pre-request and test scripts powering this collection.

Try running the collection through the Collection Runner to see how the mock allows us to scope out all our responses and write our tests in advance.

## Summary

Having undergone the effort of building out our collection in Postman first:

- Using Postman Mocks
- Writing tests
 
This has allowed us to then build out our API to match, meaning we could:
(Update the `url` in the environment to `http://localhost:3000` and run the following Node API: https://github.com/matt-ball/users-api)

- Debug our API as it was being built
- Ensure parity with our mocks, meeting the designed blueprint
- Run tests against the API as it was being built so that it's watertight

As a result:

- We now have a shareable collection for our API
- We have beautiful, rich documentation showing how it works
- We can run our collection in a fully automated fashion and attach it to our CI/CD pipeline
- We can create a Postman Monitor with no added effort to check for responsiveness and correctness

### Link to further [documentation](https://www.postman.com/insurance-demo/workspace/p-c-insurtech/documentation/16873021-1d4bf222-4a7e-4c67-9098-519bd03dde67) within Postman
