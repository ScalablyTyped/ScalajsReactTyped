package typingsJapgolly.reactDashNativeDashGestureDashHandler.swipeableMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableProperties extends js.Object {
  var childrenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var leftThreshold: js.UndefOr[Double] = js.undefined
  var onSwipeableClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeableLeftOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeableLeftWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeableOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeableRightOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeableRightWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeableWillClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeableWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overshootFriction: js.UndefOr[Double] = js.undefined
  var overshootLeft: js.UndefOr[Boolean] = js.undefined
  var overshootRight: js.UndefOr[Boolean] = js.undefined
  /**
    * 
    * This map describes the values to use as inputRange for extra interpolation:
    * AnimatedValue: [startValue, endValue]
    * 
    * progressAnimatedValue: [0, 1]
    * dragAnimatedValue: [0, +]
    * 
    * To support `rtl` flexbox layouts use `flexDirection` styling.
    * */
  var renderLeftActions: js.UndefOr[
    js.Function2[
      /* progressAnimatedValue */ AnimatedInterpolation, 
      /* dragAnimatedValue */ AnimatedInterpolation, 
      Node
    ]
  ] = js.undefined
  /**
    * 
    * This map describes the values to use as inputRange for extra interpolation:
    * AnimatedValue: [startValue, endValue]
    * 
    * progressAnimatedValue: [0, 1]
    * dragAnimatedValue: [0, -]
    * 
    * To support `rtl` flexbox layouts use `flexDirection` styling.
    * */
  var renderRightActions: js.UndefOr[
    js.Function2[
      /* progressAnimatedValue */ AnimatedInterpolation, 
      /* dragAnimatedValue */ AnimatedInterpolation, 
      Node
    ]
  ] = js.undefined
  var rightThreshold: js.UndefOr[Double] = js.undefined
  var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
}

object SwipeableProperties {
  @scala.inline
  def apply(
    childrenContainerStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    friction: Int | Double = null,
    leftThreshold: Int | Double = null,
    onSwipeableClose: js.UndefOr[Callback] = js.undefined,
    onSwipeableLeftOpen: js.UndefOr[Callback] = js.undefined,
    onSwipeableLeftWillOpen: js.UndefOr[Callback] = js.undefined,
    onSwipeableOpen: js.UndefOr[Callback] = js.undefined,
    onSwipeableRightOpen: js.UndefOr[Callback] = js.undefined,
    onSwipeableRightWillOpen: js.UndefOr[Callback] = js.undefined,
    onSwipeableWillClose: js.UndefOr[Callback] = js.undefined,
    onSwipeableWillOpen: js.UndefOr[Callback] = js.undefined,
    overshootFriction: Int | Double = null,
    overshootLeft: js.UndefOr[Boolean] = js.undefined,
    overshootRight: js.UndefOr[Boolean] = js.undefined,
    renderLeftActions: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => CallbackTo[Node] = null,
    renderRightActions: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => CallbackTo[Node] = null,
    rightThreshold: Int | Double = null,
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  ): SwipeableProperties = {
    val __obj = js.Dynamic.literal()
    if (childrenContainerStyle != null) __obj.updateDynamic("childrenContainerStyle")(childrenContainerStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (leftThreshold != null) __obj.updateDynamic("leftThreshold")(leftThreshold.asInstanceOf[js.Any])
    onSwipeableClose.foreach(p => __obj.updateDynamic("onSwipeableClose")(p.toJsFn))
    onSwipeableLeftOpen.foreach(p => __obj.updateDynamic("onSwipeableLeftOpen")(p.toJsFn))
    onSwipeableLeftWillOpen.foreach(p => __obj.updateDynamic("onSwipeableLeftWillOpen")(p.toJsFn))
    onSwipeableOpen.foreach(p => __obj.updateDynamic("onSwipeableOpen")(p.toJsFn))
    onSwipeableRightOpen.foreach(p => __obj.updateDynamic("onSwipeableRightOpen")(p.toJsFn))
    onSwipeableRightWillOpen.foreach(p => __obj.updateDynamic("onSwipeableRightWillOpen")(p.toJsFn))
    onSwipeableWillClose.foreach(p => __obj.updateDynamic("onSwipeableWillClose")(p.toJsFn))
    onSwipeableWillOpen.foreach(p => __obj.updateDynamic("onSwipeableWillOpen")(p.toJsFn))
    if (overshootFriction != null) __obj.updateDynamic("overshootFriction")(overshootFriction.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootLeft)) __obj.updateDynamic("overshootLeft")(overshootLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootRight)) __obj.updateDynamic("overshootRight")(overshootRight.asInstanceOf[js.Any])
    if (renderLeftActions != null) __obj.updateDynamic("renderLeftActions")(js.Any.fromFunction2((t0: /* progressAnimatedValue */ typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation, t1: /* dragAnimatedValue */ typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation) => renderLeftActions(t0, t1).runNow()))
    if (renderRightActions != null) __obj.updateDynamic("renderRightActions")(js.Any.fromFunction2((t0: /* progressAnimatedValue */ typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation, t1: /* dragAnimatedValue */ typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation) => renderRightActions(t0, t1).runNow()))
    if (rightThreshold != null) __obj.updateDynamic("rightThreshold")(rightThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableProperties]
  }
}

