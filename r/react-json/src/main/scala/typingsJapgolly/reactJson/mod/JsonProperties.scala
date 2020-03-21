package typingsJapgolly.reactJson.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonProperties extends js.Object {
  var onChange: js.UndefOr[OnChangeHandler] = js.undefined
  var value: js.Any
}

object JsonProperties {
  @scala.inline
  def apply(value: js.Any, onChange: /* value */ js.Any => Callback = null): JsonProperties = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    __obj.asInstanceOf[JsonProperties]
  }
}

