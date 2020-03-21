package typingsJapgolly.reactNativeModal.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeAnimatable.mod.Animation
import typingsJapgolly.reactNativeAnimatable.mod.CustomAnimation
import typingsJapgolly.reactNativeModal.modalMod.ModalProps
import typingsJapgolly.reactNativeModal.modalMod.OnSwipeCompleteParams
import typingsJapgolly.reactNativeModal.typesMod.Direction
import typingsJapgolly.reactNativeModal.typesMod.Orientation
import typingsJapgolly.reactNativeModal.typesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ModalProps_514393770[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
    animationInTiming: Double,
    animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
    animationOutTiming: Double,
    avoidKeyboard: Boolean,
    backdropColor: String,
    backdropOpacity: Double,
    backdropTransitionInTiming: Double,
    backdropTransitionOutTiming: Double,
    coverScreen: Boolean,
    deviceHeight: Double,
    deviceWidth: Double,
    hasBackdrop: Boolean,
    hideModalContentWhileAnimating: Boolean,
    isVisible: Boolean,
    propagateSwipe: Boolean,
    scrollHorizontal: Boolean,
    scrollOffset: Double,
    scrollOffsetMax: Double,
    swipeThreshold: Double,
    useNativeDriver: Boolean,
    onBackButtonPress: Callback,
    onBackdropPress: Callback,
    onModalHide: Callback,
    onModalShow: Callback,
    onModalWillHide: Callback,
    onModalWillShow: Callback,
    customBackdrop: VdomNode = null,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onOrientationChange: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onShow: js.UndefOr[Callback] = js.undefined,
    onSwipeCancel: js.UndefOr[Callback] = js.undefined,
    onSwipeComplete: /* params */ OnSwipeCompleteParams => Callback = null,
    onSwipeMove: /* percentageShown */ Double => Callback = null,
    onSwipeStart: js.UndefOr[Callback] = js.undefined,
    presentationStyle: PresentationStyle = null,
    scrollTo: js.Any => Callback = null,
    style: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    swipeDirection: Direction | js.Array[Direction] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalProps, ComponentRef, Unit, ModalProps] = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onBackButtonPress")(onBackButtonPress.toJsFn)
    __obj.updateDynamic("onBackdropPress")(onBackdropPress.toJsFn)
    __obj.updateDynamic("onModalHide")(onModalHide.toJsFn)
    __obj.updateDynamic("onModalShow")(onModalShow.toJsFn)
    __obj.updateDynamic("onModalWillHide")(onModalWillHide.toJsFn)
    __obj.updateDynamic("onModalWillShow")(onModalWillShow.toJsFn)
    if (customBackdrop != null) __obj.updateDynamic("customBackdrop")(customBackdrop.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.asInstanceOf[js.Any])
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onOrientationChange(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    onSwipeCancel.foreach(p => __obj.updateDynamic("onSwipeCancel")(p.toJsFn))
    if (onSwipeComplete != null) __obj.updateDynamic("onSwipeComplete")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactNativeModal.modalMod.OnSwipeCompleteParams) => onSwipeComplete(t0).runNow()))
    if (onSwipeMove != null) __obj.updateDynamic("onSwipeMove")(js.Any.fromFunction1((t0: /* percentageShown */ scala.Double) => onSwipeMove(t0).runNow()))
    onSwipeStart.foreach(p => __obj.updateDynamic("onSwipeStart")(p.toJsFn))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction1((t0: js.Any) => scrollTo(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (swipeDirection != null) __obj.updateDynamic("swipeDirection")(swipeDirection.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeModal.modalMod.ModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeModal.modalMod.ModalProps])(children: _*)
  }
}

