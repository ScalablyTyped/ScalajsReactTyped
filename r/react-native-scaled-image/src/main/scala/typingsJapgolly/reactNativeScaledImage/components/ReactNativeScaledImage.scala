package typingsJapgolly.reactNativeScaledImage.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNativeScaledImage.mod.ScaledImageProps
import typingsJapgolly.reactNativeScaledImage.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeScaledImage {
  def apply(
    source: ImageSourcePropType,
    height: Int | Double = null,
    style: StyleProp[ImageStyle] = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScaledImageProps, default, Unit, ScaledImageProps] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
      if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeScaledImage.mod.ScaledImageProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeScaledImage.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeScaledImage.mod.ScaledImageProps])(children: _*)
  }
  @JSImport("react-native-scaled-image", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

