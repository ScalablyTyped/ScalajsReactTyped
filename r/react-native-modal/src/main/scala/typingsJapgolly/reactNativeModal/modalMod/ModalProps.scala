package typingsJapgolly.reactNativeModal.modalMod

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
import typingsJapgolly.reactNativeModal.typesMod.Direction
import typingsJapgolly.reactNativeModal.typesMod.OnOrientationChange
import typingsJapgolly.reactNativeModal.typesMod.OrNull
import typingsJapgolly.reactNativeModal.typesMod.Orientation
import typingsJapgolly.reactNativeModal.typesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])
  var animationInTiming: Double
  var animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])
  var animationOutTiming: Double
  var avoidKeyboard: Boolean
  var backdropColor: String
  var backdropOpacity: Double
  var backdropTransitionInTiming: Double
  var backdropTransitionOutTiming: Double
  var children: Node
  var coverScreen: Boolean
  var customBackdrop: Node
  var deviceHeight: Double
  var deviceWidth: Double
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  var hasBackdrop: Boolean
  var hideModalContentWhileAnimating: Boolean
  var isVisible: Boolean
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOrientationChange: js.UndefOr[OnOrientationChange] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.undefined
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
  var propagateSwipe: Boolean
  var scrollHorizontal: Boolean
  var scrollOffset: Double
  var scrollOffsetMax: Double
  var scrollTo: OrNull[js.Function1[/* e */ _, Unit]]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
  var swipeThreshold: Double
  var useNativeDriver: Boolean
  def onBackButtonPress(): Unit
  def onBackdropPress(): Unit
  def onModalHide(): Unit
  def onModalShow(): Unit
  def onModalWillHide(): Unit
  def onModalWillShow(): Unit
}

object ModalProps {
  @scala.inline
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
    onBackButtonPress: Callback,
    onBackdropPress: Callback,
    onModalHide: Callback,
    onModalShow: Callback,
    onModalWillHide: Callback,
    onModalWillShow: Callback,
    propagateSwipe: Boolean,
    scrollHorizontal: Boolean,
    scrollOffset: Double,
    scrollOffsetMax: Double,
    swipeThreshold: Double,
    useNativeDriver: Boolean,
    children: VdomNode = null,
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
    swipeDirection: Direction | js.Array[Direction] = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.updateDynamic("onBackButtonPress")(onBackButtonPress.toJsFn)
    __obj.updateDynamic("onBackdropPress")(onBackdropPress.toJsFn)
    __obj.updateDynamic("onModalHide")(onModalHide.toJsFn)
    __obj.updateDynamic("onModalShow")(onModalShow.toJsFn)
    __obj.updateDynamic("onModalWillHide")(onModalWillHide.toJsFn)
    __obj.updateDynamic("onModalWillShow")(onModalWillShow.toJsFn)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ModalProps]
  }
}

