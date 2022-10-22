package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.anon.CheckboxPropsrefRefCheckb
import typingsJapgolly.antDesignReactNative.anon.PartialCheckboxStyle
import typingsJapgolly.antDesignReactNative.libCheckboxCheckboxItemMod.CheckboxItemProps
import typingsJapgolly.antDesignReactNative.libCheckboxCheckboxMod.CheckboxProps
import typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.CheckboxForwardedRef
import typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.OnChangeParams
import typingsJapgolly.antDesignReactNative.libCheckboxStyleMod.CheckboxStyle
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  object AgreeItem {
    
    @JSImport("@ant-design/react-native", "Checkbox.AgreeItem")
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
      
      inline def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
      
      inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
      
      inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
      
      inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
      
      inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
      
      inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
      
      inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
      
      inline def onChange(value: /* _e */ OnChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* _e */ OnChangeParams) => value(t0).runNow()))
      
      inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def styleNull: this.type = set("style", null)
      
      inline def styles(value: Partial[CheckboxStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: AgreeItem.type): typingsJapgolly.antDesignReactNative.components.Checkbox.AgreeItem.Builder = new typingsJapgolly.antDesignReactNative.components.Checkbox.AgreeItem.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: /* props */ CheckboxProps): typingsJapgolly.antDesignReactNative.components.Checkbox.AgreeItem.Builder = new typingsJapgolly.antDesignReactNative.components.Checkbox.AgreeItem.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object CheckboxItem {
    
    @JSImport("@ant-design/react-native", "Checkbox.CheckboxItem")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: CheckboxItem.type): SharedBuilder_CheckboxItemProps_1831421440[typingsJapgolly.antDesignReactNative.mod.Checkbox.CheckboxItem] = new SharedBuilder_CheckboxItemProps_1831421440[typingsJapgolly.antDesignReactNative.mod.Checkbox.CheckboxItem](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CheckboxItemProps): SharedBuilder_CheckboxItemProps_1831421440[typingsJapgolly.antDesignReactNative.mod.Checkbox.CheckboxItem] = new SharedBuilder_CheckboxItemProps_1831421440[typingsJapgolly.antDesignReactNative.mod.Checkbox.CheckboxItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@ant-design/react-native", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[CheckboxForwardedRef] {
    
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
      value: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.none | typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.polite | typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.assertive
    ): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(
      value: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.auto | typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.yes | typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.no | typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`no-hide-descendants`
    ): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onChange(value: /* _e */ OnChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* _e */ OnChangeParams) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: PartialCheckboxStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Checkbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CheckboxPropsrefRefCheckb): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
