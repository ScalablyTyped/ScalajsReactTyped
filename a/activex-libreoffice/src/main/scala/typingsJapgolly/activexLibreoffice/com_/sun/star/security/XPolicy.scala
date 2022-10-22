package typingsJapgolly.activexLibreoffice.com_.sun.star.security

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for getting sets of permissions of a specified user or the default permissions if no user is given.
  * @see com.sun.star.security.Policy
  * @since OOo 1.1.2
  */
trait XPolicy
  extends StObject
     with XInterface {
  
  /**
    * Gets the default permissions granted to all users.
    * @returns default permissions
    */
  val DefaultPermissions: SafeArray[Any]
  
  /**
    * Gets the default permissions granted to all users.
    * @returns default permissions
    */
  def getDefaultPermissions(): SafeArray[Any]
  
  /**
    * Gets the permissions of the specified user excluding the default permissions granted to all users.
    * @param userId user id
    * @returns permissions of the specified user
    */
  def getPermissions(userId: String): SafeArray[Any]
  
  /** Refreshes the policy configuration. */
  def refresh(): Unit
}
object XPolicy {
  
  inline def apply(
    DefaultPermissions: SafeArray[Any],
    acquire: Callback,
    getDefaultPermissions: CallbackTo[SafeArray[Any]],
    getPermissions: String => SafeArray[Any],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback
  ): XPolicy = {
    val __obj = js.Dynamic.literal(DefaultPermissions = DefaultPermissions.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDefaultPermissions = getDefaultPermissions.toJsFn, getPermissions = js.Any.fromFunction1(getPermissions), queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn)
    __obj.asInstanceOf[XPolicy]
  }
  
  extension [Self <: XPolicy](x: Self) {
    
    inline def setDefaultPermissions(value: SafeArray[Any]): Self = StObject.set(x, "DefaultPermissions", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultPermissions(value: CallbackTo[SafeArray[Any]]): Self = StObject.set(x, "getDefaultPermissions", value.toJsFn)
    
    inline def setGetPermissions(value: String => SafeArray[Any]): Self = StObject.set(x, "getPermissions", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
  }
}
