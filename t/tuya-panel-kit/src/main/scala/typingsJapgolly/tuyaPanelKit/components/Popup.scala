package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.BackIconColor
import typingsJapgolly.tuyaPanelKit.anon.`11`
import typingsJapgolly.tuyaPanelKit.mod.MotionFadeProps
import typingsJapgolly.tuyaPanelKit.mod.MotionPullUpProps
import typingsJapgolly.tuyaPanelKit.mod.MotionScaleFadeInProps
import typingsJapgolly.tuyaPanelKit.mod.MotionScalePullDownProps
import typingsJapgolly.tuyaPanelKit.mod.PopupProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`landscape-left`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`landscape-right`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`portrait-upside-down`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.both
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.fade_
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.formSheet
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.fullScreen
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.landscape
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.no
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.none_
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.overFullScreen
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.pageSheet
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.polite
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.portrait
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.singleCancel
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.singleConfirm
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.top
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popup {
  
  @JSImport("tuya-panel-kit", "Popup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Popup] {
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledBy(value: String | js.Array[String]): this.type = set("accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledByVarargs(value: String*): this.type = set("accessibilityLabelledBy", js.Array(value*))
    
    inline def accessibilityLanguage(value: String): this.type = set("accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def accessibilityLiveRegion(value: none_ | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def activeIdx(value: Double): this.type = set("activeIdx", value.asInstanceOf[js.Any])
    
    inline def alignContainer(value: top | center | bottom): this.type = set("alignContainer", value.asInstanceOf[js.Any])
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def animationType(value: fade_ | none_): this.type = set("animationType", value.asInstanceOf[js.Any])
    
    inline def backIconColor(value: String): this.type = set("backIconColor", value.asInstanceOf[js.Any])
    
    inline def backText(value: String): this.type = set("backText", value.asInstanceOf[js.Any])
    
    inline def cancelText(value: String): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    inline def cancelTextStyle(value: StyleProp[TextStyle]): this.type = set("cancelTextStyle", value.asInstanceOf[js.Any])
    
    inline def cancelTextStyleNull: this.type = set("cancelTextStyle", null)
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def confirmText(value: String): this.type = set("confirmText", value.asInstanceOf[js.Any])
    
    inline def confirmTextStyle(value: StyleProp[TextStyle]): this.type = set("confirmTextStyle", value.asInstanceOf[js.Any])
    
    inline def confirmTextStyleNull: this.type = set("confirmTextStyle", null)
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerType(value: both | singleConfirm | singleCancel): this.type = set("footerType", value.asInstanceOf[js.Any])
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def footerWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("footerWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def footerWrapperStyleNull: this.type = set("footerWrapperStyle", null)
    
    inline def hardwareAccelerated(value: Boolean): this.type = set("hardwareAccelerated", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def isAlign(value: Boolean): this.type = set("isAlign", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def maskStyle(value: StyleProp[ViewStyle]): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    inline def maskStyleNull: this.type = set("maskStyle", null)
    
    inline def modalChildStyle(value: StyleProp[ViewStyle]): this.type = set("modalChildStyle", value.asInstanceOf[js.Any])
    
    inline def modalChildStyleNull: this.type = set("modalChildStyle", null)
    
    inline def motionConfig(value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def motionType(value: none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown): this.type = set("motionType", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBack(value: /* args */ `11` => Callback): this.type = set("onBack", js.Any.fromFunction1((t0: /* args */ `11`) => value(t0).runNow()))
    
    inline def onCancel(value: Callback): this.type = set("onCancel", value.toJsFn)
    
    inline def onConfirm(value: (/* data */ Any, /* args */ `11`) => Callback): this.type = set("onConfirm", js.Any.fromFunction2((t0: /* data */ Any, t1: /* args */ `11`) => (value(t0, t1)).runNow()))
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMaskPress(value: /* args */ `11` => Callback): this.type = set("onMaskPress", js.Any.fromFunction1((t0: /* args */ `11`) => value(t0).runNow()))
    
    inline def onMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onOrientationChange(value: /* event */ NativeSyntheticEvent[Any] => Callback): this.type = set("onOrientationChange", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[Any]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: /* event */ PointerEvent => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerCancelCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerDown(value: /* event */ PointerEvent => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerDownCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerEnter(value: /* event */ PointerEvent => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerEnterCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerLeave(value: /* event */ PointerEvent => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerLeaveCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerMove(value: /* event */ PointerEvent => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerMoveCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerUp(value: /* event */ PointerEvent => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerUpCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onRequestClose(value: /* event */ NativeSyntheticEvent[Any] => Callback): this.type = set("onRequestClose", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[Any]) => value(t0).runNow()))
    
    inline def onResponderEnd(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderGrant(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderReject(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderRelease(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderStart(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderTerminate(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def onShow(value: /* event */ NativeSyntheticEvent[Any] => Callback): this.type = set("onShow", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[Any]) => value(t0).runNow()))
    
    inline def onStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onSwitchValueChange(value: /* value */ Boolean => Callback): this.type = set("onSwitchValueChange", js.Any.fromFunction1((t0: /* value */ Boolean) => value(t0).runNow()))
    
    inline def onTouchCancel(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchEnd(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchStart(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onlyLastModalVisible(value: Boolean): this.type = set("onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(value: `box-none` | none_ | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def presentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): this.type = set("presentationStyle", value.asInstanceOf[js.Any])
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def showBack(value: Boolean): this.type = set("showBack", value.asInstanceOf[js.Any])
    
    inline def showTitleDivider(value: Boolean): this.type = set("showTitleDivider", value.asInstanceOf[js.Any])
    
    inline def statusBarTranslucent(value: Boolean): this.type = set("statusBarTranslucent", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def subTitle(value: String): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    inline def supportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): this.type = set("supportedOrientations", value.asInstanceOf[js.Any])
    
    inline def supportedOrientationsVarargs(value: (portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`)*): this.type = set("supportedOrientations", js.Array(value*))
    
    inline def switchValue(value: Boolean): this.type = set("switchValue", value.asInstanceOf[js.Any])
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def theme(value: BackIconColor): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String | js.Array[String] | Node): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleTextStyle(value: StyleProp[TextStyle]): this.type = set("titleTextStyle", value.asInstanceOf[js.Any])
    
    inline def titleTextStyleNull: this.type = set("titleTextStyle", null)
    
    inline def titleVarargs(value: (Element | Empty | JsNumber | String)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def titleWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("titleWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def titleWrapperStyleNull: this.type = set("titleWrapperStyle", null)
    
    inline def transparent(value: Boolean): this.type = set("transparent", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def useKeyboardView(value: Boolean): this.type = set("useKeyboardView", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: StyleProp[TextStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  implicit def make(companion: Popup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
