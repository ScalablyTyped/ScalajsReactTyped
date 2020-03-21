package typingsJapgolly.reactNativeShare.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeShare.overlayMod.OverlayProps
import typingsJapgolly.reactNativeShare.overlayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay {
  def apply(
    visible: Boolean,
    onCancel: Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OverlayProps, default, Unit, OverlayProps] = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeShare.overlayMod.OverlayProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeShare.overlayMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeShare.overlayMod.OverlayProps])(children: _*)
  }
  @JSImport("react-native-share/Overlay", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

