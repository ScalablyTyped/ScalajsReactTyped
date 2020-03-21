package typingsJapgolly.reactNativePopupDialog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNativePopupDialog.mod.OverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay {
  def apply(
    onPress: ReactEventFrom[NodeHandle with Element] => Callback,
    animationDuration: Int | Double = null,
    backgroundColor: String = null,
    opacity: Int | Double = null,
    pointerEvents: String = null,
    showOverlay: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OverlayProps, typingsJapgolly.reactNativePopupDialog.mod.Overlay, Unit, OverlayProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativePopupDialog.mod.OverlayProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativePopupDialog.mod.Overlay](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativePopupDialog.mod.OverlayProps])(children: _*)
  }
  @JSImport("react-native-popup-dialog", "Overlay")
  @js.native
  object componentImport extends js.Object
  
}

