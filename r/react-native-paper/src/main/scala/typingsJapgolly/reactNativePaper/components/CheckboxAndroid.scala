package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.PickRemoveChildrenComponeAccessibilityElementsHidden
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxAndroid {
  
  @JSImport("react-native-paper/lib/typescript/components/Checkbox/CheckboxAndroid", JSImport.Default)
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
    
    inline def color(value: Any): this.type = set("color", value.asInstanceOf[js.Any])
    
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
    
    inline def pressRetentionOffset(value: Any): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def rippleColor(value: Any): this.type = set("rippleColor", value.asInstanceOf[js.Any])
    
    inline def status(value: Any): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def testID(value: Any): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def touchSoundDisabled(value: Any): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def uncheckedColor(value: Any): this.type = set("uncheckedColor", value.asInstanceOf[js.Any])
    
    inline def underlayColor(value: Any): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CheckboxAndroid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickRemoveChildrenComponeAccessibilityElementsHidden): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
