package typingsJapgolly.reactNativeScreens.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TargetedEvent
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeScreens.anon.DismissCount
import typingsJapgolly.reactNativeScreens.libTypescriptTypesMod.GestureResponseDistanceType
import typingsJapgolly.reactNativeScreens.libTypescriptTypesMod.ScreenOrientationTypes
import typingsJapgolly.reactNativeScreens.libTypescriptTypesMod.ScreenReplaceTypes
import typingsJapgolly.reactNativeScreens.libTypescriptTypesMod.StackAnimationTypes
import typingsJapgolly.reactNativeScreens.libTypescriptTypesMod.StackPresentationTypes
import typingsJapgolly.reactNativeScreens.libTypescriptTypesMod.SwipeDirectionTypes
import typingsJapgolly.reactNativeScreens.libTypescriptTypesMod.TransitionProgressEventType
import typingsJapgolly.reactNativeScreens.reactNativeScreensInts.`0`
import typingsJapgolly.reactNativeScreens.reactNativeScreensInts.`1`
import typingsJapgolly.reactNativeScreens.reactNativeScreensInts.`2`
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.`box-none`
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.`box-only`
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.assertive
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.auto
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.dark
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.fade
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.inverted
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.light
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.no
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.none
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.polite
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.slide
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PickScreenPropschildrenac_1103899125[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
  
  inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
  
  inline def accessibilityComponentType(value: Any): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
  
  inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
  
  inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
  
  inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
  
  inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
  
  inline def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
  
  inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
  
  inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
  
  inline def accessibilityTraits(value: Any): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
  
  inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
  
  inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
  
  inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
  
  inline def active(value: `0` | `1` | (AnimatedInterpolation[Double | String])): this.type = set("active", value.asInstanceOf[js.Any])
  
  inline def activityState(value: `0` | `1` | `2` | (AnimatedInterpolation[Double | String])): this.type = set("activityState", value.asInstanceOf[js.Any])
  
  inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
  
  inline def customAnimationOnSwipe(value: Boolean): this.type = set("customAnimationOnSwipe", value.asInstanceOf[js.Any])
  
  inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
  
  inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
  
  inline def freezeOnBlur(value: Boolean): this.type = set("freezeOnBlur", value.asInstanceOf[js.Any])
  
  inline def fullScreenSwipeEnabled(value: Boolean): this.type = set("fullScreenSwipeEnabled", value.asInstanceOf[js.Any])
  
  inline def gestureEnabled(value: Boolean): this.type = set("gestureEnabled", value.asInstanceOf[js.Any])
  
  inline def gestureResponseDistance(value: GestureResponseDistanceType): this.type = set("gestureResponseDistance", value.asInstanceOf[js.Any])
  
  inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
  
  inline def hideKeyboardOnSwipe(value: Boolean): this.type = set("hideKeyboardOnSwipe", value.asInstanceOf[js.Any])
  
  inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
  
  inline def homeIndicatorHidden(value: Boolean): this.type = set("homeIndicatorHidden", value.asInstanceOf[js.Any])
  
  inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
  
  inline def isNativeStack(value: Boolean): this.type = set("isNativeStack", value.asInstanceOf[js.Any])
  
  inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
  
  inline def nativeBackButtonDismissalEnabled(value: Boolean): this.type = set("nativeBackButtonDismissalEnabled", value.asInstanceOf[js.Any])
  
  inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
  
  inline def navigationBarColor(value: String): this.type = set("navigationBarColor", value.asInstanceOf[js.Any])
  
  inline def navigationBarHidden(value: Boolean): this.type = set("navigationBarHidden", value.asInstanceOf[js.Any])
  
  inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
  
  inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
  
  inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
  
  inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
  
  inline def onAppear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onAppear", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
  
  inline def onComponentRef(value: /* view */ Any => Callback): this.type = set("onComponentRef", js.Any.fromFunction1((t0: /* view */ Any) => value(t0).runNow()))
  
  inline def onDisappear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onDisappear", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
  
  inline def onDismissed(value: /* e */ NativeSyntheticEvent[DismissCount] => Callback): this.type = set("onDismissed", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[DismissCount]) => value(t0).runNow()))
  
  inline def onHeaderBackButtonClicked(value: Callback): this.type = set("onHeaderBackButtonClicked", value.toJsFn)
  
  inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
  
  inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
  
  inline def onMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
  
  inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
  
  inline def onNativeDismissCancelled(value: /* e */ NativeSyntheticEvent[DismissCount] => Callback): this.type = set("onNativeDismissCancelled", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[DismissCount]) => value(t0).runNow()))
  
  inline def onResponderEnd(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onResponderGrant(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onResponderMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onResponderReject(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onResponderRelease(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onResponderStart(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onResponderTerminate(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
  
  inline def onStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
  
  inline def onStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
  
  inline def onTouchCancel(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onTouchEnd(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onTouchEndCapture(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onTouchMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onTouchStart(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onTransitionProgress(value: /* e */ NativeSyntheticEvent[TransitionProgressEventType] => Callback): this.type = set("onTransitionProgress", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TransitionProgressEventType]) => value(t0).runNow()))
  
  inline def onWillAppear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onWillAppear", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
  
  inline def onWillDisappear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onWillDisappear", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
  
  inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
  
  inline def preventNativeDismiss(value: Boolean): this.type = set("preventNativeDismiss", value.asInstanceOf[js.Any])
  
  inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
  
  inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
  
  inline def replaceAnimation(value: ScreenReplaceTypes): this.type = set("replaceAnimation", value.asInstanceOf[js.Any])
  
  inline def screenOrientation(value: ScreenOrientationTypes): this.type = set("screenOrientation", value.asInstanceOf[js.Any])
  
  inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
  
  inline def stackAnimation(value: StackAnimationTypes): this.type = set("stackAnimation", value.asInstanceOf[js.Any])
  
  inline def stackPresentation(value: StackPresentationTypes): this.type = set("stackPresentation", value.asInstanceOf[js.Any])
  
  inline def statusBarAnimation(value: none | fade | slide): this.type = set("statusBarAnimation", value.asInstanceOf[js.Any])
  
  inline def statusBarColor(value: String): this.type = set("statusBarColor", value.asInstanceOf[js.Any])
  
  inline def statusBarHidden(value: Boolean): this.type = set("statusBarHidden", value.asInstanceOf[js.Any])
  
  inline def statusBarStyle(value: inverted | auto | light | dark): this.type = set("statusBarStyle", value.asInstanceOf[js.Any])
  
  inline def statusBarTranslucent(value: Boolean): this.type = set("statusBarTranslucent", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def swipeDirection(value: SwipeDirectionTypes): this.type = set("swipeDirection", value.asInstanceOf[js.Any])
  
  inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  
  inline def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  
  inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
  
  inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
  
  inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
  
  inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
  
  inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
}
