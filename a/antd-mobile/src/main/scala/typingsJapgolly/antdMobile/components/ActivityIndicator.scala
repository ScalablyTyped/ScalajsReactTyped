package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.activityIndicatorMod.ActivityIndicatorProps
import typingsJapgolly.antdMobile.activityIndicatorMod.default
import typingsJapgolly.antdMobile.antdMobileStrings.large
import typingsJapgolly.antdMobile.antdMobileStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActivityIndicator {
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    prefixCls: String = null,
    size: large | small = null,
    text: String = null,
    toast: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ActivityIndicatorProps, default, Unit, ActivityIndicatorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.activityIndicatorMod.ActivityIndicatorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.activityIndicatorMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.activityIndicatorMod.ActivityIndicatorProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/activity-indicator", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

