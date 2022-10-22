package typingsJapgolly.reactNativeModal.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.PanResponderGestureState
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`box-none`
import typingsJapgolly.reactNative.reactNativeStrings.`box-only`
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeModal.distModalMod.OnSwipeCompleteParams
import typingsJapgolly.reactNativeModal.distTypesMod.Direction
import typingsJapgolly.reactNativeModal.distTypesMod.PresentationStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ModalProps1950666618[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
  
  inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
  
  inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
  
  inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
  
  inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
  
  inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
  
  inline def accessibilityLabelledBy(value: String | js.Array[String]): this.type = set("accessibilityLabelledBy", value.asInstanceOf[js.Any])
  
  inline def accessibilityLabelledByVarargs(value: String*): this.type = set("accessibilityLabelledBy", js.Array(value*))
  
  inline def accessibilityLanguage(value: String): this.type = set("accessibilityLanguage", value.asInstanceOf[js.Any])
  
  inline def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
  
  inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
  
  inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
  
  inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
  
  inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
  
  inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
  
  inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
  
  inline def customBackdrop(value: VdomNode): this.type = set("customBackdrop", value.rawNode.asInstanceOf[js.Any])
  
  inline def customBackdropNull: this.type = set("customBackdrop", null)
  
  inline def customBackdropVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customBackdrop", js.Array(value*))
  
  inline def customBackdropVdomElement(value: VdomElement): this.type = set("customBackdrop", value.rawElement.asInstanceOf[js.Any])
  
  inline def deviceHeight(value: Double): this.type = set("deviceHeight", value.asInstanceOf[js.Any])
  
  inline def deviceHeightNull: this.type = set("deviceHeight", null)
  
  inline def deviceWidth(value: Double): this.type = set("deviceWidth", value.asInstanceOf[js.Any])
  
  inline def deviceWidthNull: this.type = set("deviceWidth", null)
  
  inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
  
  inline def hardwareAccelerated(value: Boolean): this.type = set("hardwareAccelerated", value.asInstanceOf[js.Any])
  
  inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
  
  inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
  
  inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
  
  inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
  
  inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
  
  inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
  
  inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
  
  inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
  
  inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
  
  inline def onLayout(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
  
  inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
  
  inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
  
  inline def onOrientationChange(value: /* orientation */ NativeSyntheticEvent[Any] => Callback): this.type = set("onOrientationChange", js.Any.fromFunction1((t0: /* orientation */ NativeSyntheticEvent[Any]) => value(t0).runNow()))
  
  inline def onPointerCancel(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerCancelCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerDown(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerDownCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerEnter(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerEnterCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerLeave(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerLeaveCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerMove(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerMoveCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerUp(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onPointerUpCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onResponderEnd(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onResponderGrant(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onResponderMove(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onResponderReject(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onResponderRelease(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onResponderStart(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onResponderTerminate(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onResponderTerminationRequest(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
  
  inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
  
  inline def onStartShouldSetResponder(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
  
  inline def onStartShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
  
  inline def onSwipeCancel(value: /* gestureState */ PanResponderGestureState => Callback): this.type = set("onSwipeCancel", js.Any.fromFunction1((t0: /* gestureState */ PanResponderGestureState) => value(t0).runNow()))
  
  inline def onSwipeComplete(
    value: (/* params */ OnSwipeCompleteParams, /* gestureState */ PanResponderGestureState) => Callback
  ): this.type = set("onSwipeComplete", js.Any.fromFunction2((t0: /* params */ OnSwipeCompleteParams, t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
  
  inline def onSwipeMove(value: (/* percentageShown */ Double, /* gestureState */ PanResponderGestureState) => Callback): this.type = set("onSwipeMove", js.Any.fromFunction2((t0: /* percentageShown */ Double, t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
  
  inline def onSwipeStart(value: /* gestureState */ PanResponderGestureState => Callback): this.type = set("onSwipeStart", js.Any.fromFunction1((t0: /* gestureState */ PanResponderGestureState) => value(t0).runNow()))
  
  inline def onTouchCancel(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onTouchEnd(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onTouchEndCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onTouchMove(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onTouchStart(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
  
  inline def presentationStyle(value: PresentationStyle): this.type = set("presentationStyle", value.asInstanceOf[js.Any])
  
  inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
  
  inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
  
  inline def scrollTo(value: /* e */ Any => Callback): this.type = set("scrollTo", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
  
  inline def scrollToNull: this.type = set("scrollTo", null)
  
  inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def swipeDirection(value: Direction | js.Array[Direction]): this.type = set("swipeDirection", value.asInstanceOf[js.Any])
  
  inline def swipeDirectionVarargs(value: Direction*): this.type = set("swipeDirection", js.Array(value*))
  
  inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  
  inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
  
  inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
  
  inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
  
  inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
  
  inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
  
  inline def useNativeDriverForBackdrop(value: Boolean): this.type = set("useNativeDriverForBackdrop", value.asInstanceOf[js.Any])
}
