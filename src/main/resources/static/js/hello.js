angular.module('BagBoxApp', []).controller('home', function($scope, $http) {
	$http.get('authentication/').success(function(data) {
		$scope.greeting = data;
	})
});

angular.module('inscriptionController', []).controller('home', function($scope, $http) {
	$http.get('authentication/').success(function(data) {
		$scope.greeting = data;
	})
});