package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.activityIndicatorIndexNativeMod.ActivityIndicatorNativeProps
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.large
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.small
import typingsJapgolly.antdMobileRn.styleIndexDotnativeMod.IActivityIndicatorStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActivityIndicator {
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    size: large | small = null,
    styles: IActivityIndicatorStyle = null,
    text: String = null,
    toast: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ActivityIndicatorNativeProps, 
    typingsJapgolly.antdMobileRn.mod.ActivityIndicator, 
    Unit, 
    ActivityIndicatorNativeProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.activityIndicatorIndexNativeMod.ActivityIndicatorNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.ActivityIndicator](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.activityIndicatorIndexNativeMod.ActivityIndicatorNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "ActivityIndicator")
  @js.native
  object componentImport extends js.Object
  
}

