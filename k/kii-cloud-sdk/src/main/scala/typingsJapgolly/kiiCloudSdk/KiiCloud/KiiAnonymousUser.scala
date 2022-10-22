package typingsJapgolly.kiiCloudSdk.KiiCloud

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent an anonymous user for setting the ACL of an object. This will include anyone using the application but have not signed up or authenticated as registered user.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type.
  */
trait KiiAnonymousUser
  extends StObject
     with KiiACLSubject {
  
  /**
    * Returns the ID of Anonymous user.
    */
  def getID(): String
}
object KiiAnonymousUser {
  
  inline def apply(getID: CallbackTo[String]): KiiAnonymousUser = {
    val __obj = js.Dynamic.literal(getID = getID.toJsFn)
    __obj.asInstanceOf[KiiAnonymousUser]
  }
  
  extension [Self <: KiiAnonymousUser](x: Self) {
    
    inline def setGetID(value: CallbackTo[String]): Self = StObject.set(x, "getID", value.toJsFn)
  }
}
