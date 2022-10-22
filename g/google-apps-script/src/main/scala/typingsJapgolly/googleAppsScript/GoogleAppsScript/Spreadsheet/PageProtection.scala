package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Deprecated. For spreadsheets created in the newer version of Google Sheets, use the more powerful
  *     Protection class instead. Although this class is deprecated, it remains available
  *     for compatibility with the older version of Sheets.
  * Access and modify protected sheets in the older version of Google Sheets.
  */
trait PageProtection extends StObject {
  
  /** @deprecated DO NOT USE */ def addUser(email: String): Unit
  
  /** @deprecated DO NOT USE */ def getUsers(): js.Array[String]
  
  /** @deprecated DO NOT USE */ def isProtected(): Boolean
  
  /** @deprecated DO NOT USE */ def removeUser(user: String): Unit
  
  /** @deprecated DO NOT USE */ def setProtected(protection: Boolean): Unit
}
object PageProtection {
  
  inline def apply(
    addUser: String => Callback,
    getUsers: CallbackTo[js.Array[String]],
    isProtected: CallbackTo[Boolean],
    removeUser: String => Callback,
    setProtected: Boolean => Callback
  ): PageProtection = {
    val __obj = js.Dynamic.literal(addUser = js.Any.fromFunction1((t0: String) => addUser(t0).runNow()), getUsers = getUsers.toJsFn, isProtected = isProtected.toJsFn, removeUser = js.Any.fromFunction1((t0: String) => removeUser(t0).runNow()), setProtected = js.Any.fromFunction1((t0: Boolean) => setProtected(t0).runNow()))
    __obj.asInstanceOf[PageProtection]
  }
  
  extension [Self <: PageProtection](x: Self) {
    
    inline def setAddUser(value: String => Callback): Self = StObject.set(x, "addUser", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetUsers(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getUsers", value.toJsFn)
    
    inline def setIsProtected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isProtected", value.toJsFn)
    
    inline def setRemoveUser(value: String => Callback): Self = StObject.set(x, "removeUser", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetProtected(value: Boolean => Callback): Self = StObject.set(x, "setProtected", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
