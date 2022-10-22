package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.column
import typingsJapgolly.gestalt.gestaltStrings.hidden
import typingsJapgolly.gestalt.gestaltStrings.row
import typingsJapgolly.gestalt.gestaltStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioGroupProps extends StObject {
  
  var children: Node
  
  var direction: js.UndefOr[column | row] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var legend: String
  
  var legendDisplay: js.UndefOr[visible | hidden] = js.undefined
}
object RadioGroupProps {
  
  inline def apply(id: String, legend: String): RadioGroupProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[RadioGroupProps]
  }
  
  extension [Self <: RadioGroupProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDirection(value: column | row): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendDisplay(value: visible | hidden): Self = StObject.set(x, "legendDisplay", value.asInstanceOf[js.Any])
    
    inline def setLegendDisplayUndefined: Self = StObject.set(x, "legendDisplay", js.undefined)
  }
}
