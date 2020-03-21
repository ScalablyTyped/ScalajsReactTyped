package typingsJapgolly.naverWhale.whale.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.history.getVisits")
@js.native
object getVisits extends js.Object {
  def apply(
    details: typingsJapgolly.chrome.chrome.history.Url,
    callback: js.Function1[/* results */ js.Array[typingsJapgolly.chrome.chrome.history.VisitItem], Unit]
  ): Unit = js.native
}

