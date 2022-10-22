package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactInstantsearchCore.anon.Attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-instantsearch-core.react-instantsearch-core.DynamicWidgetsExposed, 'children' | 'fallbackComponent'> & {  attributesToRender :std.Array<string>} */
trait DynamicWidgetsProvided extends StObject {
  
  /** The list of refinement values to display returned from the Algolia API. */
  var attributesToRender: js.Array[String]
  
  var children: js.UndefOr[ReactChild] = js.undefined
  
  var fallbackComponent: js.UndefOr[ComponentType[Attribute]] = js.undefined
}
object DynamicWidgetsProvided {
  
  inline def apply(attributesToRender: js.Array[String]): DynamicWidgetsProvided = {
    val __obj = js.Dynamic.literal(attributesToRender = attributesToRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicWidgetsProvided]
  }
  
  extension [Self <: DynamicWidgetsProvided](x: Self) {
    
    inline def setAttributesToRender(value: js.Array[String]): Self = StObject.set(x, "attributesToRender", value.asInstanceOf[js.Any])
    
    inline def setAttributesToRenderVarargs(value: String*): Self = StObject.set(x, "attributesToRender", js.Array(value*))
    
    inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFallbackComponent(value: ComponentType[Attribute]): Self = StObject.set(x, "fallbackComponent", value.asInstanceOf[js.Any])
    
    inline def setFallbackComponentUndefined: Self = StObject.set(x, "fallbackComponent", js.undefined)
  }
}
