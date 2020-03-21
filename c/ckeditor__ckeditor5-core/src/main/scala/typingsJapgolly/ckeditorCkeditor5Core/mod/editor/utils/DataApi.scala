package typingsJapgolly.ckeditorCkeditor5Core.mod.editor.utils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataApi extends js.Object {
  def getData(): String
  def setData(data: String): Unit
}

object DataApi {
  @scala.inline
  def apply(getData: CallbackTo[String], setData: String => Callback): DataApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: java.lang.String) => setData(t0).runNow()))
    __obj.asInstanceOf[DataApi]
  }
}

