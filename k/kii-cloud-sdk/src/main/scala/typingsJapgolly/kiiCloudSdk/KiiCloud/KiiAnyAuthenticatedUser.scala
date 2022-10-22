package typingsJapgolly.kiiCloudSdk.KiiCloud

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent any authenticated user for setting the ACL of an object. This will include anyone using the application who has registered and authenticated in the current session.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type. Example:
  */
trait KiiAnyAuthenticatedUser
  extends StObject
     with KiiACLSubject {
  
  /**
    * Returns the ID of AuthenticatedUser user.
    */
  def getID(): String
}
object KiiAnyAuthenticatedUser {
  
  inline def apply(getID: CallbackTo[String]): KiiAnyAuthenticatedUser = {
    val __obj = js.Dynamic.literal(getID = getID.toJsFn)
    __obj.asInstanceOf[KiiAnyAuthenticatedUser]
  }
  
  extension [Self <: KiiAnyAuthenticatedUser](x: Self) {
    
    inline def setGetID(value: CallbackTo[String]): Self = StObject.set(x, "getID", value.toJsFn)
  }
}
