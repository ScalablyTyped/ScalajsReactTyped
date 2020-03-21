package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typingsJapgolly.antDesignReactNative.cameraRollPickerMod.default
import typingsJapgolly.reactNative.mod.CameraRollAssetType
import typingsJapgolly.reactNative.mod.CameraRollGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CameraRollPicker {
  def apply(
    first: Double,
    imageMargin: Double,
    imagesPerRow: Double,
    maximum: Double,
    after: String = null,
    assetType: CameraRollAssetType = null,
    backgroundColor: String = null,
    callback: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    containerWidth: Int | Double = null,
    groupName: String = null,
    groupTypes: CameraRollGroupType = null,
    mimeTypes: js.Array[String] = null,
    selectSingleItem: js.UndefOr[Boolean] = js.undefined,
    selected: js.Array[_] = null,
    selectedMarker: VdomElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CameraRollPickerProps, default, Unit, CameraRollPickerProps] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any])
  
      if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => callback(t0).runNow()))
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (groupTypes != null) __obj.updateDynamic("groupTypes")(groupTypes.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(selectSingleItem)) __obj.updateDynamic("selectSingleItem")(selectSingleItem.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedMarker != null) __obj.updateDynamic("selectedMarker")(selectedMarker.rawElement.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.cameraRollPickerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

