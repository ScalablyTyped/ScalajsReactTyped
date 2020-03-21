package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.imageItemMod.ImageItemProps
import typingsJapgolly.antDesignReactNative.imageItemMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImageItem {
  def apply(
    imageMargin: Double,
    imagesPerRow: Double,
    containerWidth: Int | Double = null,
    item: js.Any = null,
    onPress: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedMarker: VdomElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ImageItemProps, default, Unit, ImageItemProps] = {
    val __obj = js.Dynamic.literal(imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any])
  
      if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onPress(t0).runNow()))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedMarker != null) __obj.updateDynamic("selectedMarker")(selectedMarker.rawElement.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.imageItemMod.ImageItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.imageItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.imageItemMod.ImageItemProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

