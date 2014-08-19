modules = {
    angular {
        resource url: "http://cdnjs.cloudflare.com/ajax/libs/angular.js/1.2.20/angular.js"
    }
    myApp {
        dependsOn "angular", "myAngularModule"
    }
}