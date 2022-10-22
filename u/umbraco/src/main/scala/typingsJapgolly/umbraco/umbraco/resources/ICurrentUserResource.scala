package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.currentUserResource
  * @description Used for read/updates for the currently logged in user
  *
  *
  **/
trait ICurrentUserResource extends StObject {
  
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
  def changePassword(changePasswordArgs: Any): IPromise[IResourcePromise]
  
  /**
    * @ngdoc method
    * @name umbraco.resources.currentUserResource#getMembershipProviderConfig
    * @methodOf umbraco.resources.currentUserResource
    *
    * @description
    * Gets the configuration of the user membership provider which is used to configure the change password form
    */
  def getMembershipProviderConfig(): Any
}
object ICurrentUserResource {
  
  inline def apply(changePassword: Any => IPromise[IResourcePromise], getMembershipProviderConfig: CallbackTo[Any]): ICurrentUserResource = {
    val __obj = js.Dynamic.literal(changePassword = js.Any.fromFunction1(changePassword), getMembershipProviderConfig = getMembershipProviderConfig.toJsFn)
    __obj.asInstanceOf[ICurrentUserResource]
  }
  
  extension [Self <: ICurrentUserResource](x: Self) {
    
    inline def setChangePassword(value: Any => IPromise[IResourcePromise]): Self = StObject.set(x, "changePassword", js.Any.fromFunction1(value))
    
    inline def setGetMembershipProviderConfig(value: CallbackTo[Any]): Self = StObject.set(x, "getMembershipProviderConfig", value.toJsFn)
  }
}
