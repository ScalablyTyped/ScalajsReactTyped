package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.currentUserResource
  * @description Used for read/updates for the currently logged in user
  *
  *
  **/
trait ICurrentUserResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.currentUserResource#changePassword
    * @methodOf umbraco.resources.currentUserResource
    *
    * @description
    * Changes the current users password
    *
    * @returns {Promise} resourcePromise object containing the user array.
    *
    */
  def changePassword(changePasswordArgs: js.Any): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.currentUserResource#getMembershipProviderConfig
    * @methodOf umbraco.resources.currentUserResource
    *
    * @description
    * Gets the configuration of the user membership provider which is used to configure the change password form
    */
  def getMembershipProviderConfig(): js.Any
}

object ICurrentUserResource {
  @scala.inline
  def apply(
    changePassword: js.Any => CallbackTo[IPromise[IResourcePromise]],
    getMembershipProviderConfig: CallbackTo[js.Any]
  ): ICurrentUserResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changePassword")(js.Any.fromFunction1((t0: js.Any) => changePassword(t0).runNow()))
    __obj.updateDynamic("getMembershipProviderConfig")(getMembershipProviderConfig.toJsFn)
    __obj.asInstanceOf[ICurrentUserResource]
  }
}

