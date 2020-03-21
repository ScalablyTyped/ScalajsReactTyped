package typingsJapgolly.officeUiFabricReact.textFieldTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextField extends js.Object {
  /** Gets the selection end of the text field. Returns -1 if there is no selection. */
  var selectionEnd: Double | Null
  /** Gets the selection start of the text field. Returns -1 if there is no selection. */
  var selectionStart: Double | Null
  /** Gets the current value of the input. */
  var value: js.UndefOr[String] = js.undefined
  /** Blurs the input */
  def blur(): Unit
  /** Sets focus to the input. */
  def focus(): Unit
  /** Select the value of the text field. */
  def select(): Unit
  /** Sets the selection end of the text field to a specified value. */
  def setSelectionEnd(value: Double): Unit
  /**
    * Sets the start and end positions of a selection in a text field.
    * Call with start and end set to the same value to set the cursor position.
    * @param start - Index of the start of the selection.
    * @param end - Index of the end of the selection.
    */
  def setSelectionRange(start: Double, end: Double): Unit
  /** Sets the selection start of the text field to a specified value. */
  def setSelectionStart(value: Double): Unit
}

object ITextField {
  @scala.inline
  def apply(
    blur: Callback,
    focus: Callback,
    select: Callback,
    setSelectionEnd: Double => Callback,
    setSelectionRange: (Double, Double) => Callback,
    setSelectionStart: Double => Callback,
    selectionEnd: Int | Double = null,
    selectionStart: Int | Double = null,
    value: String = null
  ): ITextField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blur")(blur.toJsFn)
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.updateDynamic("setSelectionEnd")(js.Any.fromFunction1((t0: scala.Double) => setSelectionEnd(t0).runNow()))
    __obj.updateDynamic("setSelectionRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setSelectionRange(t0, t1).runNow()))
    __obj.updateDynamic("setSelectionStart")(js.Any.fromFunction1((t0: scala.Double) => setSelectionStart(t0).runNow()))
    if (selectionEnd != null) __obj.updateDynamic("selectionEnd")(selectionEnd.asInstanceOf[js.Any])
    if (selectionStart != null) __obj.updateDynamic("selectionStart")(selectionStart.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextField]
  }
}

