package typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCollection extends js.Object {
  // Gets a single setting by ID.
  def get(id: String): Setting
}

object SettingsCollection {
  @scala.inline
  def apply(get: String => CallbackTo[Setting]): SettingsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[SettingsCollection]
  }
}

