package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.authResource
  * @description
  * This Resource perfomrs actions to common authentication tasks for the Umbraco backoffice user
  *
  * @requires $q
  * @requires $http
  * @requires umbRequestHelper
  * @requires angularHelper
  */
trait IAuthResource extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#getCurrentUser
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Sends a request to the server to get the current user details, will return a 401 if the user is not logged in
    *
    * ##usage
    * <pre>
    * authResource.getCurrentUser()
    *    .then(function(data) {
    *        //Do stuff for fetching the current logged in Umbraco backoffice user
    *    });
    * </pre>
    * @returns {Promise} resourcePromise object
    *
    */
  def getCurrentUser(): IPromise[IResourcePromise]
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#getRemainingTimeoutSeconds
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Gets the user's remaining seconds before their login times out
    *
    * ##usage
    * <pre>
    * authResource.getRemainingTimeoutSeconds()
    *    .then(function(data) {
    *        //Number of seconds is returned
    *    });
    * </pre>
    * @returns {Promise} resourcePromise object
    *
    */
  def getRemainingTimeoutSeconds(): IPromise[IResourcePromise]
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#isAuthenticated
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Checks if the user is logged in or not - does not return 401 or 403
    *
    * ##usage
    * <pre>
    * authResource.isAuthenticated()
    *    .then(function(data) {
    *        //Do stuff to check if user is authenticated
    *    });
    * </pre>
    * @returns {Promise} resourcePromise object
    *
    */
  def isAuthenticated(): IPromise[IResourcePromise]
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#performLogin
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Logs the Umbraco backoffice user in if the credentials are good
    *
    * ##usage
    * <pre>
    * authResource.performLogin(login, password)
    *    .then(function(data) {
    *        //Do stuff for login...
    *    });
    * </pre>
    * @param {string} login Username of backoffice user
    * @param {string} password Password of backoffice user
    * @returns {Promise} resourcePromise object
    *
    */
  def performLogin(username: String, password: String): IPromise[IResourcePromise]
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#performLogout
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Logs out the Umbraco backoffice user
    *
    * ##usage
    * <pre>
    * authResource.performLogout()
    *    .then(function(data) {
    *        //Do stuff for logging out...
    *    });
    * </pre>
    * @returns {Promise} resourcePromise object
    *
    */
  def performLogout(): IPromise[IResourcePromise]
}
object IAuthResource {
  
  inline def apply(
    getCurrentUser: CallbackTo[IPromise[IResourcePromise]],
    getRemainingTimeoutSeconds: CallbackTo[IPromise[IResourcePromise]],
    isAuthenticated: CallbackTo[IPromise[IResourcePromise]],
    performLogin: (String, String) => IPromise[IResourcePromise],
    performLogout: CallbackTo[IPromise[IResourcePromise]]
  ): IAuthResource = {
    val __obj = js.Dynamic.literal(getCurrentUser = getCurrentUser.toJsFn, getRemainingTimeoutSeconds = getRemainingTimeoutSeconds.toJsFn, isAuthenticated = isAuthenticated.toJsFn, performLogin = js.Any.fromFunction2(performLogin), performLogout = performLogout.toJsFn)
    __obj.asInstanceOf[IAuthResource]
  }
  
  extension [Self <: IAuthResource](x: Self) {
    
    inline def setGetCurrentUser(value: CallbackTo[IPromise[IResourcePromise]]): Self = StObject.set(x, "getCurrentUser", value.toJsFn)
    
    inline def setGetRemainingTimeoutSeconds(value: CallbackTo[IPromise[IResourcePromise]]): Self = StObject.set(x, "getRemainingTimeoutSeconds", value.toJsFn)
    
    inline def setIsAuthenticated(value: CallbackTo[IPromise[IResourcePromise]]): Self = StObject.set(x, "isAuthenticated", value.toJsFn)
    
    inline def setPerformLogin(value: (String, String) => IPromise[IResourcePromise]): Self = StObject.set(x, "performLogin", js.Any.fromFunction2(value))
    
    inline def setPerformLogout(value: CallbackTo[IPromise[IResourcePromise]]): Self = StObject.set(x, "performLogout", value.toJsFn)
  }
}
