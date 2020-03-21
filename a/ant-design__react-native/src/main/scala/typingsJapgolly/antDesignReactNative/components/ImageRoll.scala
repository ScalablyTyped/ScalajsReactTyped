package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typingsJapgolly.antDesignReactNative.imageRollMod.ImageRollProps
import typingsJapgolly.antDesignReactNative.imageRollMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImageRoll {
  def apply(
    onCancel: Callback,
    onSelected: js.Object => Callback,
    cameraPickerProps: CameraRollPickerProps = null,
    cancelText: VdomNode = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ImageRollProps, default, Unit, ImageRollProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onSelected")(js.Any.fromFunction1((t0: js.Object) => onSelected(t0).runNow()))
    if (cameraPickerProps != null) __obj.updateDynamic("cameraPickerProps")(cameraPickerProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.imageRollMod.ImageRollProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.imageRollMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.imageRollMod.ImageRollProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

