package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ActivityIndicatorProps
import typingsJapgolly.reactNative.mod.BackgroundPropType
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TargetedEvent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`box-none`
import typingsJapgolly.reactNative.reactNativeStrings.`box-only`
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.anon.TypeofComponent
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distIconsIconMod.IconNode
import typingsJapgolly.reactNativeElements.distTabTabMod.TabItemProps
import typingsJapgolly.reactNativeElements.distTabTabMod.TabProps
import typingsJapgolly.reactNativeElements.distTextTextMod.TextProps
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.assertive
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.auto
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.bottom
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.clear
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.default
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.left
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.no
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.none
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.outline
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.polite
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.primary
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.right
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.solid
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.top
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.yes
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[TabProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[TabProps & Partial[ThemeProps[TabProps]]]))
  }
  
  object Item {
    
    inline def apply(
      replaceTheme: RecursivePartialFullThemeAvatar => Callback,
      theme: Theme[TabItemProps],
      updateTheme: RecursivePartialFullThemeAvatar => Callback
    ): typingsJapgolly.reactNativeElements.components.Tab.Item.Builder = {
      val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
      new typingsJapgolly.reactNativeElements.components.Tab.Item.Builder(js.Array(this.component, __props.asInstanceOf[TabItemProps & Partial[ThemeProps[TabItemProps]]]))
    }
    
    @JSImport("react-native-elements/dist/tab/Tab", "Tab.Item")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def TouchableComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object]
            ])
      ): this.type = set("TouchableComponent", value.asInstanceOf[js.Any])
      
      inline def ViewComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object]
            ])
      ): this.type = set("ViewComponent", value.asInstanceOf[js.Any])
      
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
      
      inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      
      inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
      
      inline def background(value: BackgroundPropType): this.type = set("background", value.asInstanceOf[js.Any])
      
      inline def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
      
      inline def buttonStyleNull: this.type = set("buttonStyle", null)
      
      inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
      
      inline def containerStyleNull: this.type = set("containerStyle", null)
      
      inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
      
      inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
      
      inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def disabledStyle(value: StyleProp[ViewStyle]): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
      
      inline def disabledStyleNull: this.type = set("disabledStyle", null)
      
      inline def disabledTitleStyle(value: StyleProp[TextStyle]): this.type = set("disabledTitleStyle", value.asInstanceOf[js.Any])
      
      inline def disabledTitleStyleNull: this.type = set("disabledTitleStyle", null)
      
      inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      inline def icon(value: IconNode): this.type = set("icon", value.asInstanceOf[js.Any])
      
      inline def iconContainerStyle(value: StyleProp[ViewStyle]): this.type = set("iconContainerStyle", value.asInstanceOf[js.Any])
      
      inline def iconContainerStyleNull: this.type = set("iconContainerStyle", null)
      
      inline def iconPosition(value: left | right | top | bottom): this.type = set("iconPosition", value.asInstanceOf[js.Any])
      
      inline def iconRight(value: Boolean): this.type = set("iconRight", value.asInstanceOf[js.Any])
      
      inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def linearGradientProps(value: js.Object): this.type = set("linearGradientProps", value.asInstanceOf[js.Any])
      
      inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
      
      inline def loadingProps(value: ActivityIndicatorProps): this.type = set("loadingProps", value.asInstanceOf[js.Any])
      
      inline def loadingStyle(value: StyleProp[ViewStyle]): this.type = set("loadingStyle", value.asInstanceOf[js.Any])
      
      inline def loadingStyleNull: this.type = set("loadingStyle", null)
      
      inline def nextFocusDown(value: Double): this.type = set("nextFocusDown", value.asInstanceOf[js.Any])
      
      inline def nextFocusForward(value: Double): this.type = set("nextFocusForward", value.asInstanceOf[js.Any])
      
      inline def nextFocusLeft(value: Double): this.type = set("nextFocusLeft", value.asInstanceOf[js.Any])
      
      inline def nextFocusRight(value: Double): this.type = set("nextFocusRight", value.asInstanceOf[js.Any])
      
      inline def nextFocusUp(value: Double): this.type = set("nextFocusUp", value.asInstanceOf[js.Any])
      
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
      
      inline def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
      
      inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def styleNull: this.type = set("style", null)
      
      inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      inline def title(value: String | Element): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def titleProps(value: TextProps): this.type = set("titleProps", value.asInstanceOf[js.Any])
      
      inline def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
      
      inline def titleStyleNull: this.type = set("titleStyle", null)
      
      inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
      
      inline def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
      
      inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def `type`(value: solid | clear | outline): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def useForeground(value: Boolean): this.type = set("useForeground", value.asInstanceOf[js.Any])
      
      inline def variant(value: primary | default): this.type = set("variant", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: TabItemProps & Partial[ThemeProps[TabItemProps]]): typingsJapgolly.reactNativeElements.components.Tab.Item.Builder = new typingsJapgolly.reactNativeElements.components.Tab.Item.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-elements/dist/tab/Tab", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledBy(value: String | js.Array[String]): this.type = set("accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledByVarargs(value: String*): this.type = set("accessibilityLabelledBy", js.Array(value*))
    
    inline def accessibilityLanguage(value: String): this.type = set("accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def accessibilityLiveRegion(
      value: typingsJapgolly.reactNative.reactNativeStrings.none | typingsJapgolly.reactNative.reactNativeStrings.polite | typingsJapgolly.reactNative.reactNativeStrings.assertive
    ): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def disableIndicator(value: Boolean): this.type = set("disableIndicator", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(
      value: typingsJapgolly.reactNative.reactNativeStrings.auto | typingsJapgolly.reactNative.reactNativeStrings.yes | typingsJapgolly.reactNative.reactNativeStrings.no | typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
    ): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def indicatorStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def indicatorStyleNull: this.type = set("indicatorStyle", null)
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onChange(value: /* value */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
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
    
    inline def onStartShouldSetResponder(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onTouchCancel(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def pointerEvents(
      value: `box-none` | typingsJapgolly.reactNative.reactNativeStrings.none | `box-only` | typingsJapgolly.reactNative.reactNativeStrings.auto
    ): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def variant(value: primary | default): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabProps & Partial[ThemeProps[TabProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
