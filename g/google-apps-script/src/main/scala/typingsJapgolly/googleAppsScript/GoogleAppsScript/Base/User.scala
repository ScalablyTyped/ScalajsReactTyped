package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a user, suitable for scripting.
  */
trait User extends StObject {
  
  def getEmail(): String
  
  /** @deprecated DO NOT USE */ def getUserLoginId(): String
}
object User {
  
  inline def apply(getEmail: CallbackTo[String], getUserLoginId: CallbackTo[String]): User = {
    val __obj = js.Dynamic.literal(getEmail = getEmail.toJsFn, getUserLoginId = getUserLoginId.toJsFn)
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setGetEmail(value: CallbackTo[String]): Self = StObject.set(x, "getEmail", value.toJsFn)
    
    inline def setGetUserLoginId(value: CallbackTo[String]): Self = StObject.set(x, "getUserLoginId", value.toJsFn)
  }
}
