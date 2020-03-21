package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a user, suitable for scripting.
  */
trait User extends js.Object {
  def getEmail(): String
  /** @deprecated DO NOT USE */ def getUserLoginId(): String
}

object User {
  @scala.inline
  def apply(getEmail: CallbackTo[String], getUserLoginId: CallbackTo[String]): User = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEmail")(getEmail.toJsFn)
    __obj.updateDynamic("getUserLoginId")(getUserLoginId.toJsFn)
    __obj.asInstanceOf[User]
  }
}

