package typingsJapgolly.storybookAddonA11y

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsA11YPanelMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BoxShadow extends StObject {
    
    var boxShadow: String
    
    var outline: String
    
    var outlineOffset: Double
  }
  object BoxShadow {
    
    inline def apply(boxShadow: String, outline: String, outlineOffset: Double): BoxShadow = {
      val __obj = js.Dynamic.literal(boxShadow = boxShadow.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], outlineOffset = outlineOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxShadow]
    }
    
    extension [Self <: BoxShadow](x: Self) {
      
      inline def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineOffset(value: Double): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Items extends StObject {
    
    var items: js.Array[Result]
    
    var label: Element
    
    var panel: Element
    
    var `type`: RuleType
  }
  object Items {
    
    inline def apply(items: js.Array[Result], label: VdomElement, panel: VdomElement, `type`: RuleType): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.rawElement.asInstanceOf[js.Any], panel = panel.rawElement.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setItems(value: js.Array[Result]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Result*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabel(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPanel(value: VdomElement): Self = StObject.set(x, "panel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
