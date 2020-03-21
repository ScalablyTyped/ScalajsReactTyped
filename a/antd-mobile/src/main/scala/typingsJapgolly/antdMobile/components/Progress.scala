package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.antdMobileStrings.fixed
import typingsJapgolly.antdMobile.antdMobileStrings.normal
import typingsJapgolly.antdMobile.progressMod.ProgressProps
import typingsJapgolly.antdMobile.progressMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Progress {
  def apply(
    appearTransition: js.UndefOr[Boolean] = js.undefined,
    barStyle: CSSProperties = null,
    className: String = null,
    percent: Int | Double = null,
    position: fixed | normal = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    unfilled: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ProgressProps, default, Unit, ProgressProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.progressMod.ProgressProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.progressMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.progressMod.ProgressProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/progress", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

