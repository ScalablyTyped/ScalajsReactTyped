package typingsJapgolly.naverWhale

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.pageCapture.SaveDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpageCapture extends js.Object {
  def saveAsMHTML(details: SaveDetails, callback: js.Function1[/* mhtmlData */ js.Any, Unit]): Unit
}

object TypeofpageCapture {
  @scala.inline
  def apply(saveAsMHTML: (SaveDetails, js.Function1[/* mhtmlData */ js.Any, Unit]) => Callback): TypeofpageCapture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("saveAsMHTML")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.pageCapture.SaveDetails, t1: js.Function1[/* mhtmlData */ js.Any, scala.Unit]) => saveAsMHTML(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofpageCapture]
  }
}

