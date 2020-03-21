package typingsJapgolly.reactNativeGestureHandler.swipeableMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.AnonBottom
import typingsJapgolly.reactNativeGestureHandler.AnonBottomHeight
import typingsJapgolly.reactNativeGestureHandler.AnonHeight
import typingsJapgolly.reactNativeGestureHandler.AnonLeft
import typingsJapgolly.reactNativeGestureHandler.AnonRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProperties, react-native-gesture-handler.react-native-gesture-handler/Swipeable.SwipeableExcludes> */
trait SwipeableProperties extends js.Object {
  var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var avgTouches: js.UndefOr[Boolean] = js.undefined
  var childrenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var hitSlop: js.UndefOr[Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var leftThreshold: js.UndefOr[Double] = js.undefined
  var maxDeltaX: js.UndefOr[Double] = js.undefined
  var maxDeltaY: js.UndefOr[Double] = js.undefined
  var maxPointers: js.UndefOr[Double] = js.undefined
  var minDeltaX: js.UndefOr[Double] = js.undefined
  var minDeltaY: js.UndefOr[Double] = js.undefined
  var minDist: js.UndefOr[Double] = js.undefined
  var minOffsetX: js.UndefOr[Double] = js.undefined
  var minOffsetY: js.UndefOr[Double] = js.undefined
  var minPointers: js.UndefOr[Double] = js.undefined
  var minVelocity: js.UndefOr[Double] = js.undefined
  var minVelocityX: js.UndefOr[Double] = js.undefined
  var minVelocityY: js.UndefOr[Double] = js.undefined
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
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  var simultaneousHandlers: js.UndefOr[Ref | js.Array[Ref]] = js.undefined
  var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  var waitFor: js.UndefOr[Ref | js.Array[Ref]] = js.undefined
}

object SwipeableProperties {
  @scala.inline
  def apply(
    activeOffsetX: Double | js.Array[Double] = null,
    activeOffsetY: Double | js.Array[Double] = null,
    avgTouches: js.UndefOr[Boolean] = js.undefined,
    childrenContainerStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    failOffsetX: Double | js.Array[Double] = null,
    failOffsetY: Double | js.Array[Double] = null,
    friction: Int | Double = null,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    id: String = null,
    leftThreshold: Int | Double = null,
    maxDeltaX: Int | Double = null,
    maxDeltaY: Int | Double = null,
    maxPointers: Int | Double = null,
    minDeltaX: Int | Double = null,
    minDeltaY: Int | Double = null,
    minDist: Int | Double = null,
    minOffsetX: Int | Double = null,
    minOffsetY: Int | Double = null,
    minPointers: Int | Double = null,
    minVelocity: Int | Double = null,
    minVelocityX: Int | Double = null,
    minVelocityY: Int | Double = null,
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
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref | js.Array[Ref] = null,
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined,
    waitFor: Ref | js.Array[Ref] = null
  ): SwipeableProperties = {
    val __obj = js.Dynamic.literal()
    if (activeOffsetX != null) __obj.updateDynamic("activeOffsetX")(activeOffsetX.asInstanceOf[js.Any])
    if (activeOffsetY != null) __obj.updateDynamic("activeOffsetY")(activeOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(avgTouches)) __obj.updateDynamic("avgTouches")(avgTouches.asInstanceOf[js.Any])
    if (childrenContainerStyle != null) __obj.updateDynamic("childrenContainerStyle")(childrenContainerStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (failOffsetX != null) __obj.updateDynamic("failOffsetX")(failOffsetX.asInstanceOf[js.Any])
    if (failOffsetY != null) __obj.updateDynamic("failOffsetY")(failOffsetY.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (leftThreshold != null) __obj.updateDynamic("leftThreshold")(leftThreshold.asInstanceOf[js.Any])
    if (maxDeltaX != null) __obj.updateDynamic("maxDeltaX")(maxDeltaX.asInstanceOf[js.Any])
    if (maxDeltaY != null) __obj.updateDynamic("maxDeltaY")(maxDeltaY.asInstanceOf[js.Any])
    if (maxPointers != null) __obj.updateDynamic("maxPointers")(maxPointers.asInstanceOf[js.Any])
    if (minDeltaX != null) __obj.updateDynamic("minDeltaX")(minDeltaX.asInstanceOf[js.Any])
    if (minDeltaY != null) __obj.updateDynamic("minDeltaY")(minDeltaY.asInstanceOf[js.Any])
    if (minDist != null) __obj.updateDynamic("minDist")(minDist.asInstanceOf[js.Any])
    if (minOffsetX != null) __obj.updateDynamic("minOffsetX")(minOffsetX.asInstanceOf[js.Any])
    if (minOffsetY != null) __obj.updateDynamic("minOffsetY")(minOffsetY.asInstanceOf[js.Any])
    if (minPointers != null) __obj.updateDynamic("minPointers")(minPointers.asInstanceOf[js.Any])
    if (minVelocity != null) __obj.updateDynamic("minVelocity")(minVelocity.asInstanceOf[js.Any])
    if (minVelocityX != null) __obj.updateDynamic("minVelocityX")(minVelocityX.asInstanceOf[js.Any])
    if (minVelocityY != null) __obj.updateDynamic("minVelocityY")(minVelocityY.asInstanceOf[js.Any])
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
    if (renderLeftActions != null) __obj.updateDynamic("renderLeftActions")(js.Any.fromFunction2((t0: /* progressAnimatedValue */ typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation, t1: /* dragAnimatedValue */ typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation) => renderLeftActions(t0, t1).runNow()))
    if (renderRightActions != null) __obj.updateDynamic("renderRightActions")(js.Any.fromFunction2((t0: /* progressAnimatedValue */ typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation, t1: /* dragAnimatedValue */ typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation) => renderRightActions(t0, t1).runNow()))
    if (rightThreshold != null) __obj.updateDynamic("rightThreshold")(rightThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableProperties]
  }
}

