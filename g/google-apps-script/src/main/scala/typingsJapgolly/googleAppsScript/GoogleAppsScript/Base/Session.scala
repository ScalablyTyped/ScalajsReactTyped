package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Session class provides access to session information, such as the user's email address (in
  * some circumstances) and language setting.
  */
trait Session extends js.Object {
  def getActiveUser(): User
  def getActiveUserLocale(): String
  def getEffectiveUser(): User
  def getScriptTimeZone(): String
  def getTemporaryActiveUserKey(): String
  /** @deprecated DO NOT USE */ def getTimeZone(): String
  /** @deprecated DO NOT USE */ def getUser(): User
}

object Session {
  @scala.inline
  def apply(
    getActiveUser: CallbackTo[User],
    getActiveUserLocale: CallbackTo[String],
    getEffectiveUser: CallbackTo[User],
    getScriptTimeZone: CallbackTo[String],
    getTemporaryActiveUserKey: CallbackTo[String],
    getTimeZone: CallbackTo[String],
    getUser: CallbackTo[User]
  ): Session = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActiveUser")(getActiveUser.toJsFn)
    __obj.updateDynamic("getActiveUserLocale")(getActiveUserLocale.toJsFn)
    __obj.updateDynamic("getEffectiveUser")(getEffectiveUser.toJsFn)
    __obj.updateDynamic("getScriptTimeZone")(getScriptTimeZone.toJsFn)
    __obj.updateDynamic("getTemporaryActiveUserKey")(getTemporaryActiveUserKey.toJsFn)
    __obj.updateDynamic("getTimeZone")(getTimeZone.toJsFn)
    __obj.updateDynamic("getUser")(getUser.toJsFn)
    __obj.asInstanceOf[Session]
  }
}

