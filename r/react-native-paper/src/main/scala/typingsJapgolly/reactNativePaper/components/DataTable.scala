package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
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
import typingsJapgolly.reactNative.mod.TargetedEvent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedback
import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.DeepPartialThemeDark
import typingsJapgolly.reactNativePaper.anon.PickRemoveChildrenComponeAccessibilityLiveRegion
import typingsJapgolly.reactNativePaper.anon.PickTouchableWithoutFeedbAccessibilityElementsHidden
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityLanguage
import typingsJapgolly.reactNativePaper.anon.PickpagenumbernumberOfPag
import typingsJapgolly.reactNativePaper.libTypescriptComponentsDataTableDataTableCellMod.Props
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`box-none`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`box-only`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`no-hide-descendants`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.ascending
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.assertive
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.auto
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.descending
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.no
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.none
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.polite
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTable {
  
  object Cell {
    
    @JSImport("react-native-paper", "DataTable.Cell")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Cell.type): SharedBuilder_Props_799149358 = new SharedBuilder_Props_799149358(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Props): SharedBuilder_Props_799149358 = new SharedBuilder_Props_799149358(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("react-native-paper", "DataTable.Header")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[View] {
      
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
      
      inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
      
      inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
      
      inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
      
      inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
      
      inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
      
      inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
      
      inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
      
      inline def onMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
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
      
      inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
      
      inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def styleNull: this.type = set("style", null)
      
      inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      inline def theme(value: DeepPartialThemeDark): this.type = set("theme", value.asInstanceOf[js.Any])
      
      inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Header.type): typingsJapgolly.reactNativePaper.components.DataTable.Header.Builder = new typingsJapgolly.reactNativePaper.components.DataTable.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PickViewPropsRefAttributeAccessibilityLanguage): typingsJapgolly.reactNativePaper.components.DataTable.Header.Builder = new typingsJapgolly.reactNativePaper.components.DataTable.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Pagination {
    
    inline def apply(numberOfPages: Double, onPageChange: /* page */ Double => Callback, page: Double): typingsJapgolly.reactNativePaper.components.DataTable.Pagination.Builder = {
      val __props = js.Dynamic.literal(numberOfPages = numberOfPages.asInstanceOf[js.Any], onPageChange = js.Any.fromFunction1((t0: /* page */ Double) => onPageChange(t0).runNow()), page = page.asInstanceOf[js.Any])
      new typingsJapgolly.reactNativePaper.components.DataTable.Pagination.Builder(js.Array(this.component, __props.asInstanceOf[PickpagenumbernumberOfPag]))
    }
    
    @JSImport("react-native-paper", "DataTable.Pagination")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[View] {
      
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
      
      inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
      
      inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
      
      inline def labelNull: this.type = set("label", null)
      
      inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
      
      inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
      
      inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
      
      inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      inline def numberOfItemsPerPage(value: Double): this.type = set("numberOfItemsPerPage", value.asInstanceOf[js.Any])
      
      inline def numberOfItemsPerPageList(value: js.Array[Double]): this.type = set("numberOfItemsPerPageList", value.asInstanceOf[js.Any])
      
      inline def numberOfItemsPerPageListVarargs(value: Double*): this.type = set("numberOfItemsPerPageList", js.Array(value*))
      
      inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
      
      inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
      
      inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
      
      inline def onItemsPerPageChange(value: /* numberOfItemsPerPage */ Double => Callback): this.type = set("onItemsPerPageChange", js.Any.fromFunction1((t0: /* numberOfItemsPerPage */ Double) => value(t0).runNow()))
      
      inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
      
      inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
      
      inline def onMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
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
      
      inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
      
      inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def selectPageDropdownAccessibilityLabel(value: String): this.type = set("selectPageDropdownAccessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def selectPageDropdownLabel(value: VdomNode): this.type = set("selectPageDropdownLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def selectPageDropdownLabelNull: this.type = set("selectPageDropdownLabel", null)
      
      inline def selectPageDropdownLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("selectPageDropdownLabel", js.Array(value*))
      
      inline def selectPageDropdownLabelVdomElement(value: VdomElement): this.type = set("selectPageDropdownLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      inline def showFastPaginationControls(value: Boolean): this.type = set("showFastPaginationControls", value.asInstanceOf[js.Any])
      
      inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def styleNull: this.type = set("style", null)
      
      inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      inline def theme(value: DeepPartialThemeDark): this.type = set("theme", value.asInstanceOf[js.Any])
      
      inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PickpagenumbernumberOfPag): typingsJapgolly.reactNativePaper.components.DataTable.Pagination.Builder = new typingsJapgolly.reactNativePaper.components.DataTable.Pagination.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Row {
    
    @JSImport("react-native-paper", "DataTable.Row")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def accessibilityActions(value: Any): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def accessibilityElementsHidden(value: Any): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def accessibilityHint(value: Any): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def accessibilityIgnoresInvertColors(value: Any): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def accessibilityLabel(value: Any): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def accessibilityLiveRegion(value: Any): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def accessibilityRole(value: Any): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def accessibilityState(value: Any): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
      
      inline def accessibilityValue(value: Any): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def accessibilityViewIsModal(value: Any): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def accessible(value: Any): this.type = set("accessible", value.asInstanceOf[js.Any])
      
      inline def background(value: Any): this.type = set("background", value.asInstanceOf[js.Any])
      
      inline def borderless(value: Any): this.type = set("borderless", value.asInstanceOf[js.Any])
      
      inline def centered(value: Any): this.type = set("centered", value.asInstanceOf[js.Any])
      
      inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def delayLongPress(value: Any): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
      
      inline def delayPressIn(value: Any): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
      
      inline def delayPressOut(value: Any): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Any): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def hitSlop(value: Any): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      inline def importantForAccessibility(value: Any): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def onAccessibilityAction(value: Any): this.type = set("onAccessibilityAction", value.asInstanceOf[js.Any])
      
      inline def onAccessibilityEscape(value: Any): this.type = set("onAccessibilityEscape", value.asInstanceOf[js.Any])
      
      inline def onAccessibilityTap(value: Any): this.type = set("onAccessibilityTap", value.asInstanceOf[js.Any])
      
      inline def onBlur(value: Any): this.type = set("onBlur", value.asInstanceOf[js.Any])
      
      inline def onFocus(value: Any): this.type = set("onFocus", value.asInstanceOf[js.Any])
      
      inline def onLayout(value: Any): this.type = set("onLayout", value.asInstanceOf[js.Any])
      
      inline def onLongPress(value: Any): this.type = set("onLongPress", value.asInstanceOf[js.Any])
      
      inline def onMagicTap(value: Any): this.type = set("onMagicTap", value.asInstanceOf[js.Any])
      
      inline def onPress(value: Any): this.type = set("onPress", value.asInstanceOf[js.Any])
      
      inline def onPressIn(value: Any): this.type = set("onPressIn", value.asInstanceOf[js.Any])
      
      inline def onPressOut(value: Any): this.type = set("onPressOut", value.asInstanceOf[js.Any])
      
      inline def pointerEvents(value: Any): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
      
      inline def pressRetentionOffset(value: Any): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
      
      inline def rippleColor(value: Any): this.type = set("rippleColor", value.asInstanceOf[js.Any])
      
      inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def testID(value: Any): this.type = set("testID", value.asInstanceOf[js.Any])
      
      inline def theme(value: DeepPartialThemeDark): this.type = set("theme", value.asInstanceOf[js.Any])
      
      inline def touchSoundDisabled(value: Any): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
      
      inline def underlayColor(value: Any): this.type = set("underlayColor", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Row.type): typingsJapgolly.reactNativePaper.components.DataTable.Row.Builder = new typingsJapgolly.reactNativePaper.components.DataTable.Row.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PickRemoveChildrenComponeAccessibilityLiveRegion): typingsJapgolly.reactNativePaper.components.DataTable.Row.Builder = new typingsJapgolly.reactNativePaper.components.DataTable.Row.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("react-native-paper", "DataTable.Title")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[TouchableWithoutFeedback] {
      
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
      
      inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
      
      inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
      
      inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
      
      inline def numeric(value: Boolean): this.type = set("numeric", value.asInstanceOf[js.Any])
      
      inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
      
      inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
      
      inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
      
      inline def onBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
      
      inline def onFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
      
      inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
      
      inline def onLongPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
      
      inline def onPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def onPressIn(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def onPressOut(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
      
      inline def sortDirection(value: ascending | descending): this.type = set("sortDirection", value.asInstanceOf[js.Any])
      
      inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def styleNull: this.type = set("style", null)
      
      inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
      
      inline def textStyleNull: this.type = set("textStyle", null)
      
      inline def theme(value: DeepPartialThemeDark): this.type = set("theme", value.asInstanceOf[js.Any])
      
      inline def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Title.type): typingsJapgolly.reactNativePaper.components.DataTable.Title.Builder = new typingsJapgolly.reactNativePaper.components.DataTable.Title.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PickTouchableWithoutFeedbAccessibilityElementsHidden): typingsJapgolly.reactNativePaper.components.DataTable.Title.Builder = new typingsJapgolly.reactNativePaper.components.DataTable.Title.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-paper", "DataTable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: DataTable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: typingsJapgolly.reactNativePaper.libTypescriptComponentsDataTableDataTableMod.Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
