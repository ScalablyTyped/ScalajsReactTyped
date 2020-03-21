package typingsJapgolly.naverWhale.whale.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browserAction.getBadgeBackgroundColor")
@js.native
object getBadgeBackgroundColor extends js.Object {
  def apply(
    details: typingsJapgolly.chrome.chrome.browserAction.TabDetails,
    callback: js.Function1[/* result */ typingsJapgolly.chrome.chrome.browserAction.ColorArray, Unit]
  ): Unit = js.native
}

