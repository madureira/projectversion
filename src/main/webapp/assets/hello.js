var Hello = (function(fn) {
	
	fn.prototype.sayHello = function() {
		console.log("Hello World!!!");
	};
	
	return fn;
	
})(function(){});