package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Session class provides access to session information, such as the user's email address (in
  * some circumstances) and language setting.
  */
trait Session extends StObject {
  
  def getActiveUser(): User
  
  def getActiveUserLocale(): String
  
  def getEffectiveUser(): User
  
  def getScriptTimeZone(): String
  
  def getTemporaryActiveUserKey(): String
  
  /** @deprecated DO NOT USE */ def getTimeZone(): String
  
  /** @deprecated DO NOT USE */ def getUser(): User
}
object Session {
  
  inline def apply(
    getActiveUser: CallbackTo[User],
    getActiveUserLocale: CallbackTo[String],
    getEffectiveUser: CallbackTo[User],
    getScriptTimeZone: CallbackTo[String],
    getTemporaryActiveUserKey: CallbackTo[String],
    getTimeZone: CallbackTo[String],
    getUser: CallbackTo[User]
  ): Session = {
    val __obj = js.Dynamic.literal(getActiveUser = getActiveUser.toJsFn, getActiveUserLocale = getActiveUserLocale.toJsFn, getEffectiveUser = getEffectiveUser.toJsFn, getScriptTimeZone = getScriptTimeZone.toJsFn, getTemporaryActiveUserKey = getTemporaryActiveUserKey.toJsFn, getTimeZone = getTimeZone.toJsFn, getUser = getUser.toJsFn)
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
    inline def setGetActiveUser(value: CallbackTo[User]): Self = StObject.set(x, "getActiveUser", value.toJsFn)
    
    inline def setGetActiveUserLocale(value: CallbackTo[String]): Self = StObject.set(x, "getActiveUserLocale", value.toJsFn)
    
    inline def setGetEffectiveUser(value: CallbackTo[User]): Self = StObject.set(x, "getEffectiveUser", value.toJsFn)
    
    inline def setGetScriptTimeZone(value: CallbackTo[String]): Self = StObject.set(x, "getScriptTimeZone", value.toJsFn)
    
    inline def setGetTemporaryActiveUserKey(value: CallbackTo[String]): Self = StObject.set(x, "getTemporaryActiveUserKey", value.toJsFn)
    
    inline def setGetTimeZone(value: CallbackTo[String]): Self = StObject.set(x, "getTimeZone", value.toJsFn)
    
    inline def setGetUser(value: CallbackTo[User]): Self = StObject.set(x, "getUser", value.toJsFn)
  }
}
