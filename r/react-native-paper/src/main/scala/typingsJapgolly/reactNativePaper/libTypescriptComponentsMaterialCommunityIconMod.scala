package typingsJapgolly.reactNativePaper

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.AccessibilityElementsHidden
import typingsJapgolly.reactNativePaper.anon.Focusable
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.ltr
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsMaterialCommunityIconMod {
  
  @JSImport("react-native-paper/lib/typescript/components/MaterialCommunityIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasNameColorSizeDirectionAllowFontScaling: IconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasNameColorSizeDirectionAllowFontScaling.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-native-paper/lib/typescript/components/MaterialCommunityIcon", "accessibilityProps")
  @js.native
  val accessibilityProps: AccessibilityElementsHidden | Focusable = js.native
  
  trait IconProps extends StObject {
    
    var allowFontScaling: js.UndefOr[Boolean] = js.undefined
    
    var color: String
    
    var direction: rtl | ltr
    
    var name: String
    
    var size: Double
  }
  object IconProps {
    
    inline def apply(color: String, direction: rtl | ltr, name: String, size: Double): IconProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: rtl | ltr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
