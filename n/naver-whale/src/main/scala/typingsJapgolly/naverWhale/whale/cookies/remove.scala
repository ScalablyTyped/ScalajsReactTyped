package typingsJapgolly.naverWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies.remove")
@js.native
object remove extends js.Object {
  def apply(details: typingsJapgolly.chrome.chrome.cookies.Details): Unit = js.native
  def apply(
    details: typingsJapgolly.chrome.chrome.cookies.Details,
    callback: js.Function1[/* details */ typingsJapgolly.chrome.chrome.cookies.Details, Unit]
  ): Unit = js.native
}

