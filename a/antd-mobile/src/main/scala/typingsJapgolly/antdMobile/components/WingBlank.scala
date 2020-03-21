package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.antdMobileStrings.lg
import typingsJapgolly.antdMobile.antdMobileStrings.md
import typingsJapgolly.antdMobile.antdMobileStrings.sm
import typingsJapgolly.antdMobile.wingBlankMod.WingBlankProps
import typingsJapgolly.antdMobile.wingBlankMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WingBlank {
  def apply(
    className: String = null,
    prefixCls: String = null,
    size: sm | md | lg = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[WingBlankProps, default, Unit, WingBlankProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.wingBlankMod.WingBlankProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.wingBlankMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.wingBlankMod.WingBlankProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/wing-blank", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

