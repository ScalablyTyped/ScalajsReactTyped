package typingsJapgolly.naverWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies.getAll")
@js.native
object getAll extends js.Object {
  def apply(
    details: typingsJapgolly.chrome.chrome.cookies.GetAllDetails,
    callback: js.Function1[/* cookies */ js.Array[typingsJapgolly.chrome.chrome.cookies.Cookie], Unit]
  ): Unit = js.native
}

