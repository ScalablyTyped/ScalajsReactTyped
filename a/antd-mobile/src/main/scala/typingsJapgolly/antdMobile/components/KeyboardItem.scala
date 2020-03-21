package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.antdMobile.customKeyboardMod.HTMLTableDataProps
import typingsJapgolly.antdMobile.customKeyboardMod.KeyboardItemProps
import typingsJapgolly.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeyboardItem {
  def apply(
    onClick: (ReactMouseEventFrom[HTMLTableDataCellElement with Element], String) => Callback,
    HTMLTableDataProps: HTMLTableDataProps = null,
    iconOnly: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    tdRef: Ref = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    KeyboardItemProps, 
    typingsJapgolly.antdMobile.customKeyboardMod.KeyboardItem, 
    Unit, 
    KeyboardItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactMouseEventFrom[typingsJapgolly.std.HTMLTableDataCellElement with org.scalajs.dom.raw.Element], t1: java.lang.String) => onClick(t0, t1).runNow()))
    if (HTMLTableDataProps != null) js.Dynamic.global.Object.assign(__obj, HTMLTableDataProps)
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (tdRef != null) __obj.updateDynamic("tdRef")(tdRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.customKeyboardMod.KeyboardItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.customKeyboardMod.KeyboardItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.customKeyboardMod.KeyboardItemProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/input-item/CustomKeyboard", "KeyboardItem")
  @js.native
  object componentImport extends js.Object
  
}

