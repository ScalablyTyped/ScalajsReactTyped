package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antdMobile.antdMobileStrings.`column-reverse`
import typingsJapgolly.antdMobile.antdMobileStrings.`row-reverse`
import typingsJapgolly.antdMobile.antdMobileStrings.`wrap-reverse`
import typingsJapgolly.antdMobile.antdMobileStrings.around
import typingsJapgolly.antdMobile.antdMobileStrings.baseline
import typingsJapgolly.antdMobile.antdMobileStrings.between
import typingsJapgolly.antdMobile.antdMobileStrings.center
import typingsJapgolly.antdMobile.antdMobileStrings.column
import typingsJapgolly.antdMobile.antdMobileStrings.end
import typingsJapgolly.antdMobile.antdMobileStrings.nowrap
import typingsJapgolly.antdMobile.antdMobileStrings.row
import typingsJapgolly.antdMobile.antdMobileStrings.start
import typingsJapgolly.antdMobile.antdMobileStrings.stretch
import typingsJapgolly.antdMobile.antdMobileStrings.wrap
import typingsJapgolly.antdMobile.flexFlexMod.FlexProps
import typingsJapgolly.antdMobile.flexMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flex {
  def apply(
    align: start | center | end | baseline | stretch = null,
    alignContent: start | end | center | between | around | stretch = null,
    className: String = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    onClick: /* e */ ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    prefixCls: String = null,
    role: String = null,
    style: CSSProperties = null,
    wrap: nowrap | wrap | `wrap-reverse` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FlexProps, default, Unit, FlexProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.flexFlexMod.FlexProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.flexMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.flexFlexMod.FlexProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/flex", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

