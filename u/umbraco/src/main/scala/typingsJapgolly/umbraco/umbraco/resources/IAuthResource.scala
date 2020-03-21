package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait IAuthResource extends js.Object {
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
  @scala.inline
  def apply(
    getCurrentUser: CallbackTo[IPromise[IResourcePromise]],
    getRemainingTimeoutSeconds: CallbackTo[IPromise[IResourcePromise]],
    isAuthenticated: CallbackTo[IPromise[IResourcePromise]],
    performLogin: (String, String) => CallbackTo[IPromise[IResourcePromise]],
    performLogout: CallbackTo[IPromise[IResourcePromise]]
  ): IAuthResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentUser")(getCurrentUser.toJsFn)
    __obj.updateDynamic("getRemainingTimeoutSeconds")(getRemainingTimeoutSeconds.toJsFn)
    __obj.updateDynamic("isAuthenticated")(isAuthenticated.toJsFn)
    __obj.updateDynamic("performLogin")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => performLogin(t0, t1).runNow()))
    __obj.updateDynamic("performLogout")(performLogout.toJsFn)
    __obj.asInstanceOf[IAuthResource]
  }
}

