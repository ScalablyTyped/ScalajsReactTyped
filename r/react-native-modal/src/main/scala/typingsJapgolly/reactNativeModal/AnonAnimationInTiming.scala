package typingsJapgolly.reactNativeModal

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationInTiming extends js.Object {
  var animationIn: String
  var animationInTiming: Double
  var animationOut: String
  var animationOutTiming: Double
  var avoidKeyboard: Boolean
  var backdropColor: String
  var backdropOpacity: Double
  var backdropTransitionInTiming: Double
  var backdropTransitionOutTiming: Double
  var coverScreen: Boolean
  var customBackdrop: Null
  var deviceHeight: Null
  var deviceWidth: Null
  var hasBackdrop: Boolean
  var hideModalContentWhileAnimating: Boolean
  var isVisible: Boolean
  var propagateSwipe: Boolean
  var scrollHorizontal: Boolean
  var scrollOffset: Double
  var scrollOffsetMax: Double
  var scrollTo: Null
  var supportedOrientations: js.Array[String]
  var swipeThreshold: Double
  var useNativeDriver: Boolean
  def onBackButtonPress(): Null
  def onBackdropPress(): Null
  def onModalHide(): Null
  def onModalShow(): Null
  def onModalWillHide(): Null
  def onModalWillShow(): Null
}

object AnonAnimationInTiming {
  @scala.inline
  def apply(
    animationIn: String,
    animationInTiming: Double,
    animationOut: String,
    animationOutTiming: Double,
    avoidKeyboard: Boolean,
    backdropColor: String,
    backdropOpacity: Double,
    backdropTransitionInTiming: Double,
    backdropTransitionOutTiming: Double,
    coverScreen: Boolean,
    customBackdrop: Null,
    deviceHeight: Null,
    deviceWidth: Null,
    hasBackdrop: Boolean,
    hideModalContentWhileAnimating: Boolean,
    isVisible: Boolean,
    onBackButtonPress: CallbackTo[Null],
    onBackdropPress: CallbackTo[Null],
    onModalHide: CallbackTo[Null],
    onModalShow: CallbackTo[Null],
    onModalWillHide: CallbackTo[Null],
    onModalWillShow: CallbackTo[Null],
    propagateSwipe: Boolean,
    scrollHorizontal: Boolean,
    scrollOffset: Double,
    scrollOffsetMax: Double,
    scrollTo: Null,
    supportedOrientations: js.Array[String],
    swipeThreshold: Double,
    useNativeDriver: Boolean
  ): AnonAnimationInTiming = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], customBackdrop = customBackdrop.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], scrollTo = scrollTo.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.updateDynamic("onBackButtonPress")(onBackButtonPress.toJsFn)
    __obj.updateDynamic("onBackdropPress")(onBackdropPress.toJsFn)
    __obj.updateDynamic("onModalHide")(onModalHide.toJsFn)
    __obj.updateDynamic("onModalShow")(onModalShow.toJsFn)
    __obj.updateDynamic("onModalWillHide")(onModalWillHide.toJsFn)
    __obj.updateDynamic("onModalWillShow")(onModalWillShow.toJsFn)
    __obj.asInstanceOf[AnonAnimationInTiming]
  }
}

