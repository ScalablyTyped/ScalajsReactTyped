package typingsJapgolly.rmcPicker

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictx
  extends /* x */ StringDictionary[js.Any] {
  def ref(picker: js.Any): Unit
}

object AnonDictx {
  @scala.inline
  def apply(ref: js.Any => Callback, StringDictionary: /* x */ StringDictionary[js.Any] = null): AnonDictx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ref")(js.Any.fromFunction1((t0: js.Any) => ref(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictx]
  }
}

