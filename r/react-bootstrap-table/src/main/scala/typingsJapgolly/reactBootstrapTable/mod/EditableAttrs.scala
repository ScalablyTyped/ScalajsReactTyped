package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableAttrs extends js.Object {
  /**
  	 * Callback for on cell blur.
  	 */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  	 * Callback for onKeyDown.
  	 */
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  	 * Placeholder text to use for the cell editor field.
  	 */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
  	 * Function to pass a reference to the input editor field.
  	 */
  var ref: js.UndefOr[js.Function1[/* ref */ js.Any, _]] = js.undefined
}

object EditableAttrs {
  @scala.inline
  def apply(
    onBlur: js.UndefOr[Callback] = js.undefined,
    onKeyDown: js.UndefOr[Callback] = js.undefined,
    placeholder: String = null,
    ref: /* ref */ js.Any => CallbackTo[js.Any] = null
  ): EditableAttrs = {
    val __obj = js.Dynamic.literal()
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    onKeyDown.foreach(p => __obj.updateDynamic("onKeyDown")(p.toJsFn))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1((t0: /* ref */ js.Any) => ref(t0).runNow()))
    __obj.asInstanceOf[EditableAttrs]
  }
}

