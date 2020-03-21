package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Deprecated. For spreadsheets created in the newer version of Google Sheets, use the more powerful
  *     Protection class instead. Although this class is deprecated, it remains available
  *     for compatibility with the older version of Sheets.
  * Access and modify protected sheets in the older version of Google Sheets.
  */
trait PageProtection extends js.Object {
  /** @deprecated DO NOT USE */ def addUser(email: String): Unit
  /** @deprecated DO NOT USE */ def getUsers(): js.Array[String]
  /** @deprecated DO NOT USE */ def isProtected(): Boolean
  /** @deprecated DO NOT USE */ def removeUser(user: String): Unit
  /** @deprecated DO NOT USE */ def setProtected(protection: Boolean): Unit
}

object PageProtection {
  @scala.inline
  def apply(
    addUser: String => Callback,
    getUsers: CallbackTo[js.Array[String]],
    isProtected: CallbackTo[Boolean],
    removeUser: String => Callback,
    setProtected: Boolean => Callback
  ): PageProtection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addUser")(js.Any.fromFunction1((t0: java.lang.String) => addUser(t0).runNow()))
    __obj.updateDynamic("getUsers")(getUsers.toJsFn)
    __obj.updateDynamic("isProtected")(isProtected.toJsFn)
    __obj.updateDynamic("removeUser")(js.Any.fromFunction1((t0: java.lang.String) => removeUser(t0).runNow()))
    __obj.updateDynamic("setProtected")(js.Any.fromFunction1((t0: scala.Boolean) => setProtected(t0).runNow()))
    __obj.asInstanceOf[PageProtection]
  }
}

