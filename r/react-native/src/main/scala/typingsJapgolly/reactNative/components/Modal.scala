package typingsJapgolly.reactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.ModalProps
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.reactNativeStrings.`landscape-left`
import typingsJapgolly.reactNative.reactNativeStrings.`landscape-right`
import typingsJapgolly.reactNative.reactNativeStrings.`portrait-upside-down`
import typingsJapgolly.reactNative.reactNativeStrings.fade
import typingsJapgolly.reactNative.reactNativeStrings.formSheet
import typingsJapgolly.reactNative.reactNativeStrings.fullScreen
import typingsJapgolly.reactNative.reactNativeStrings.landscape
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.overFullScreen
import typingsJapgolly.reactNative.reactNativeStrings.pageSheet
import typingsJapgolly.reactNative.reactNativeStrings.portrait
import typingsJapgolly.reactNative.reactNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animationType: none | slide | fade = null,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onOrientationChange: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onRequestClose: js.UndefOr[Callback] = js.undefined,
    onShow: ReactEventFrom[NodeHandle with Element] => Callback = null,
    presentationStyle: fullScreen | pageSheet | formSheet | overFullScreen = null,
    supportedOrientations: js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ] = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalProps, typingsJapgolly.reactNative.mod.Modal, Unit, ModalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.asInstanceOf[js.Any])
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onOrientationChange(t0).runNow()))
    onRequestClose.foreach(p => __obj.updateDynamic("onRequestClose")(p.toJsFn))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onShow(t0).runNow()))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNative.mod.ModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNative.mod.Modal](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNative.mod.ModalProps])(children: _*)
  }
  @JSImport("react-native", "Modal")
  @js.native
  object componentImport extends js.Object
  
}

