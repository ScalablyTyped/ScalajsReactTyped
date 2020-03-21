package typingsJapgolly.reactNativeDialog.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeAnimatable.mod.Animation
import typingsJapgolly.reactNativeAnimatable.mod.CustomAnimation
import typingsJapgolly.reactNativeModal.modalMod.OnSwipeCompleteParams
import typingsJapgolly.reactNativeModal.typesMod.Direction
import typingsJapgolly.reactNativeModal.typesMod.OnOrientationChange
import typingsJapgolly.reactNativeModal.typesMod.OrNull
import typingsJapgolly.reactNativeModal.typesMod.Orientation
import typingsJapgolly.reactNativeModal.typesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<react-native-modal.react-native-modal.ModalProps, std.Exclude<keyof react-native-modal.react-native-modal.ModalProps, 'isVisible'>>> */
trait reactNativeModalContainerProps extends js.Object {
  var animationIn: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.undefined
  var animationInTiming: js.UndefOr[Double] = js.undefined
  var animationOut: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.undefined
  var animationOutTiming: js.UndefOr[Double] = js.undefined
  var avoidKeyboard: js.UndefOr[Boolean] = js.undefined
  var backdropColor: js.UndefOr[String] = js.undefined
  var backdropOpacity: js.UndefOr[Double] = js.undefined
  var backdropTransitionInTiming: js.UndefOr[Double] = js.undefined
  var backdropTransitionOutTiming: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var coverScreen: js.UndefOr[Boolean] = js.undefined
  var customBackdrop: js.UndefOr[Node] = js.undefined
  var deviceHeight: js.UndefOr[Double] = js.undefined
  var deviceWidth: js.UndefOr[Double] = js.undefined
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  var hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var onBackButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalWillHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalWillShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOrientationChange: js.UndefOr[OnOrientationChange] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.undefined
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
  var propagateSwipe: js.UndefOr[Boolean] = js.undefined
  var scrollHorizontal: js.UndefOr[Boolean] = js.undefined
  var scrollOffset: js.UndefOr[Double] = js.undefined
  var scrollOffsetMax: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[OrNull[js.Function1[/* e */ _, Unit]]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
  var swipeThreshold: js.UndefOr[Double] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object reactNativeModalContainerProps {
  @scala.inline
  def apply(
    animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    animationInTiming: Int | Double = null,
    animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    animationOutTiming: Int | Double = null,
    avoidKeyboard: js.UndefOr[Boolean] = js.undefined,
    backdropColor: String = null,
    backdropOpacity: Int | Double = null,
    backdropTransitionInTiming: Int | Double = null,
    backdropTransitionOutTiming: Int | Double = null,
    children: VdomNode = null,
    coverScreen: js.UndefOr[Boolean] = js.undefined,
    customBackdrop: VdomNode = null,
    deviceHeight: Int | Double = null,
    deviceWidth: Int | Double = null,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    onBackButtonPress: js.UndefOr[Callback] = js.undefined,
    onBackdropPress: js.UndefOr[Callback] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onModalHide: js.UndefOr[Callback] = js.undefined,
    onModalShow: js.UndefOr[Callback] = js.undefined,
    onModalWillHide: js.UndefOr[Callback] = js.undefined,
    onModalWillShow: js.UndefOr[Callback] = js.undefined,
    onOrientationChange: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onShow: js.UndefOr[Callback] = js.undefined,
    onSwipeCancel: js.UndefOr[Callback] = js.undefined,
    onSwipeComplete: /* params */ OnSwipeCompleteParams => Callback = null,
    onSwipeMove: /* percentageShown */ Double => Callback = null,
    onSwipeStart: js.UndefOr[Callback] = js.undefined,
    presentationStyle: PresentationStyle = null,
    propagateSwipe: js.UndefOr[Boolean] = js.undefined,
    scrollHorizontal: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: Int | Double = null,
    scrollOffsetMax: Int | Double = null,
    scrollTo: js.Any => Callback = null,
    style: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    swipeDirection: Direction | js.Array[Direction] = null,
    swipeThreshold: Int | Double = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): reactNativeModalContainerProps = {
    val __obj = js.Dynamic.literal()
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn.asInstanceOf[js.Any])
    if (animationInTiming != null) __obj.updateDynamic("animationInTiming")(animationInTiming.asInstanceOf[js.Any])
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut.asInstanceOf[js.Any])
    if (animationOutTiming != null) __obj.updateDynamic("animationOutTiming")(animationOutTiming.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidKeyboard)) __obj.updateDynamic("avoidKeyboard")(avoidKeyboard.asInstanceOf[js.Any])
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor.asInstanceOf[js.Any])
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (backdropTransitionInTiming != null) __obj.updateDynamic("backdropTransitionInTiming")(backdropTransitionInTiming.asInstanceOf[js.Any])
    if (backdropTransitionOutTiming != null) __obj.updateDynamic("backdropTransitionOutTiming")(backdropTransitionOutTiming.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(coverScreen)) __obj.updateDynamic("coverScreen")(coverScreen.asInstanceOf[js.Any])
    if (customBackdrop != null) __obj.updateDynamic("customBackdrop")(customBackdrop.rawNode.asInstanceOf[js.Any])
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(hideModalContentWhileAnimating)) __obj.updateDynamic("hideModalContentWhileAnimating")(hideModalContentWhileAnimating.asInstanceOf[js.Any])
    onBackButtonPress.foreach(p => __obj.updateDynamic("onBackButtonPress")(p.toJsFn))
    onBackdropPress.foreach(p => __obj.updateDynamic("onBackdropPress")(p.toJsFn))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    onModalHide.foreach(p => __obj.updateDynamic("onModalHide")(p.toJsFn))
    onModalShow.foreach(p => __obj.updateDynamic("onModalShow")(p.toJsFn))
    onModalWillHide.foreach(p => __obj.updateDynamic("onModalWillHide")(p.toJsFn))
    onModalWillShow.foreach(p => __obj.updateDynamic("onModalWillShow")(p.toJsFn))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onOrientationChange(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    onSwipeCancel.foreach(p => __obj.updateDynamic("onSwipeCancel")(p.toJsFn))
    if (onSwipeComplete != null) __obj.updateDynamic("onSwipeComplete")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactNativeModal.modalMod.OnSwipeCompleteParams) => onSwipeComplete(t0).runNow()))
    if (onSwipeMove != null) __obj.updateDynamic("onSwipeMove")(js.Any.fromFunction1((t0: /* percentageShown */ scala.Double) => onSwipeMove(t0).runNow()))
    onSwipeStart.foreach(p => __obj.updateDynamic("onSwipeStart")(p.toJsFn))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSwipe)) __obj.updateDynamic("propagateSwipe")(propagateSwipe.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHorizontal)) __obj.updateDynamic("scrollHorizontal")(scrollHorizontal.asInstanceOf[js.Any])
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (scrollOffsetMax != null) __obj.updateDynamic("scrollOffsetMax")(scrollOffsetMax.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction1((t0: js.Any) => scrollTo(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (swipeDirection != null) __obj.updateDynamic("swipeDirection")(swipeDirection.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[reactNativeModalContainerProps]
  }
}

