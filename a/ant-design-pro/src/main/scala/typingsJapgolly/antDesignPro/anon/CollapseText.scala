package typingsJapgolly.antDesignPro.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapseText extends StObject {
  
  var collapseText: js.UndefOr[Node] = js.undefined
  
  var expandText: js.UndefOr[Node] = js.undefined
  
  var selectAllText: js.UndefOr[Node] = js.undefined
}
object CollapseText {
  
  inline def apply(): CollapseText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseText]
  }
  
  extension [Self <: CollapseText](x: Self) {
    
    inline def setCollapseText(value: VdomNode): Self = StObject.set(x, "collapseText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setCollapseTextNull: Self = StObject.set(x, "collapseText", null)
    
    inline def setCollapseTextUndefined: Self = StObject.set(x, "collapseText", js.undefined)
    
    inline def setCollapseTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "collapseText", js.Array(value*))
    
    inline def setCollapseTextVdomElement(value: VdomElement): Self = StObject.set(x, "collapseText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExpandText(value: VdomNode): Self = StObject.set(x, "expandText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setExpandTextNull: Self = StObject.set(x, "expandText", null)
    
    inline def setExpandTextUndefined: Self = StObject.set(x, "expandText", js.undefined)
    
    inline def setExpandTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "expandText", js.Array(value*))
    
    inline def setExpandTextVdomElement(value: VdomElement): Self = StObject.set(x, "expandText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSelectAllText(value: VdomNode): Self = StObject.set(x, "selectAllText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSelectAllTextNull: Self = StObject.set(x, "selectAllText", null)
    
    inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
    
    inline def setSelectAllTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selectAllText", js.Array(value*))
    
    inline def setSelectAllTextVdomElement(value: VdomElement): Self = StObject.set(x, "selectAllText", value.rawElement.asInstanceOf[js.Any])
  }
}
