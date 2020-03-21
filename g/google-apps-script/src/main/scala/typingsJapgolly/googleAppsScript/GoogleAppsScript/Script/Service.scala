package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and manipulate script publishing.
  */
trait Service extends js.Object {
  /** @deprecated DO NOT USE */ def disable(): Unit
  def getUrl(): String
  def isEnabled(): Boolean
}

object Service {
  @scala.inline
  def apply(disable: Callback, getUrl: CallbackTo[String], isEnabled: CallbackTo[Boolean]): Service = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.updateDynamic("isEnabled")(isEnabled.toJsFn)
    __obj.asInstanceOf[Service]
  }
}

