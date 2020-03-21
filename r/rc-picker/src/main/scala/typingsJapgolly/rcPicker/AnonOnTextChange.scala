package typingsJapgolly.rcPicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnTextChange extends js.Object {
  /** Must useMemo, to assume that `valueTexts` only match on the first change */
  var valueTexts: js.Array[String]
  def onTextChange(text: String): Unit
}

object AnonOnTextChange {
  @scala.inline
  def apply(onTextChange: String => Callback, valueTexts: js.Array[String]): AnonOnTextChange = {
    val __obj = js.Dynamic.literal(valueTexts = valueTexts.asInstanceOf[js.Any])
    __obj.updateDynamic("onTextChange")(js.Any.fromFunction1((t0: java.lang.String) => onTextChange(t0).runNow()))
    __obj.asInstanceOf[AnonOnTextChange]
  }
}

