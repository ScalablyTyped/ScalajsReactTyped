package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antdMobile.antdMobileStrings.lg
import typingsJapgolly.antdMobile.antdMobileStrings.md
import typingsJapgolly.antdMobile.antdMobileStrings.sm
import typingsJapgolly.antdMobile.antdMobileStrings.xl
import typingsJapgolly.antdMobile.antdMobileStrings.xs
import typingsJapgolly.antdMobile.whiteSpaceMod.WhiteSpaceProps
import typingsJapgolly.antdMobile.whiteSpaceMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WhiteSpace {
  def apply(
    className: String = null,
    onClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    prefixCls: String = null,
    size: xs | sm | md | lg | xl = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[WhiteSpaceProps, default, Unit, WhiteSpaceProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.whiteSpaceMod.WhiteSpaceProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.whiteSpaceMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.whiteSpaceMod.WhiteSpaceProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/white-space", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

