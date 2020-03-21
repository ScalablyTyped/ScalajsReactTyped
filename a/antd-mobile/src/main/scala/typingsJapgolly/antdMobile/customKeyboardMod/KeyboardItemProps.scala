package typingsJapgolly.antdMobile.customKeyboardMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Ref
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardItemProps extends HTMLTableDataProps {
  var iconOnly: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var tdRef: js.UndefOr[Ref] = js.undefined
  def onClick(event: ReactMouseEventFrom[HTMLTableDataCellElement with Element], value: String): Unit
}

object KeyboardItemProps {
  @scala.inline
  def apply(
    onClick: (ReactMouseEventFrom[HTMLTableDataCellElement with Element], String) => Callback,
    HTMLTableDataProps: HTMLTableDataProps = null,
    iconOnly: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    tdRef: Ref = null
  ): KeyboardItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactMouseEventFrom[typingsJapgolly.std.HTMLTableDataCellElement with org.scalajs.dom.raw.Element], t1: java.lang.String) => onClick(t0, t1).runNow()))
    if (HTMLTableDataProps != null) js.Dynamic.global.Object.assign(__obj, HTMLTableDataProps)
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (tdRef != null) __obj.updateDynamic("tdRef")(tdRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardItemProps]
  }
}

