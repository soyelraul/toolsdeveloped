/**
 * Best Practices
 */

/**
 * Obtain user details
 */
//FIXME: there is an issue with this implementation, please fix it
exports.getUser = function() {
    var var1 = {
        name: 'Pedro',
    };

    var var2 = {
        email: 'pedro.antoninho@academiadecodigo.org'
    };

    return Object.assign(var1, var2);
};

/**
 * Convert String to Number
 */
exports.parseNumber = function(num) {
    return parseInt(num, 10);
};

/**
 * Tests for equality 
 */
exports.isEqual = function(val1, val2) {
    return val1 === val2;
};
