package typingsJapgolly.naverWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies.set")
@js.native
object set extends js.Object {
  def apply(details: typingsJapgolly.chrome.chrome.cookies.SetDetails): Unit = js.native
  def apply(
    details: typingsJapgolly.chrome.chrome.cookies.SetDetails,
    callback: js.Function1[/* cookie */ typingsJapgolly.chrome.chrome.cookies.Cookie | Null, Unit]
  ): Unit = js.native
}

