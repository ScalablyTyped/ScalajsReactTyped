package typingsJapgolly.antd.editableMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onCancel(): Unit
  def onSave(value: String): Unit
}

object EditableProps {
  @scala.inline
  def apply(
    onCancel: Callback,
    onSave: String => Callback,
    `aria-label`: String = null,
    className: String = null,
    direction: ltr | rtl = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    value: String = null
  ): EditableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onSave")(js.Any.fromFunction1((t0: java.lang.String) => onSave(t0).runNow()))
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditableProps]
  }
}

