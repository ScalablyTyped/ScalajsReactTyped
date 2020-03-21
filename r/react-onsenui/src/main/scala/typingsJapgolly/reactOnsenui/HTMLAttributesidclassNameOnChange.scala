package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   onChange ? :(e : std.Event): void,   value ? :number,   disabled ? :boolean} */
trait HTMLAttributesidclassNameOnChange extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object HTMLAttributesidclassNameOnChange {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    modifier: String = null,
    onChange: /* e */ Event_ => Callback = null,
    style: CSSProperties = null,
    value: Int | Double = null
  ): HTMLAttributesidclassNameOnChange = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameOnChange]
  }
}

