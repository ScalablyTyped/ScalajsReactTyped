package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.PickOmitOmitPickPickAnima
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HelperText {
  
  @JSImport("react-native-paper", "HelperText")
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
    
    inline def adjustsFontSizeToFit(value: Any): this.type = set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    inline def allowFontScaling(value: Any): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def android_hyphenationFrequency(value: Any): this.type = set("android_hyphenationFrequency", value.asInstanceOf[js.Any])
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def dataDetectorType(value: Any): this.type = set("dataDetectorType", value.asInstanceOf[js.Any])
    
    inline def ellipsizeMode(value: Any): this.type = set("ellipsizeMode", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: Any): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def lineBreakMode(value: Any): this.type = set("lineBreakMode", value.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplier(value: Any): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def minimumFontScale(value: Any): this.type = set("minimumFontScale", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: Any): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def numberOfLines(value: Any): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: Any): this.type = set("onAccessibilityAction", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityEscape(value: Any): this.type = set("onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityTap(value: Any): this.type = set("onAccessibilityTap", value.asInstanceOf[js.Any])
    
    inline def onLayout(value: Any): this.type = set("onLayout", value.asInstanceOf[js.Any])
    
    inline def onLongPress(value: Any): this.type = set("onLongPress", value.asInstanceOf[js.Any])
    
    inline def onMagicTap(value: Any): this.type = set("onMagicTap", value.asInstanceOf[js.Any])
    
    inline def onPress(value: Any): this.type = set("onPress", value.asInstanceOf[js.Any])
    
    inline def onPressIn(value: Any): this.type = set("onPressIn", value.asInstanceOf[js.Any])
    
    inline def onPressOut(value: Any): this.type = set("onPressOut", value.asInstanceOf[js.Any])
    
    inline def onTextLayout(value: Any): this.type = set("onTextLayout", value.asInstanceOf[js.Any])
    
    inline def padding(value: Any): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def ref(value: Any): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def selectable(value: Any): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def selectionColor(value: Any): this.type = set("selectionColor", value.asInstanceOf[js.Any])
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressHighlighting(value: Any): this.type = set("suppressHighlighting", value.asInstanceOf[js.Any])
    
    inline def testID(value: Any): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def textBreakStrategy(value: Any): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: Any): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def visible(value: Any): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HelperText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickOmitOmitPickPickAnima): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
