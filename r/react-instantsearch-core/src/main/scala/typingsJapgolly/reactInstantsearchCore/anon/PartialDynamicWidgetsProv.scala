package typingsJapgolly.reactInstantsearchCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ReactChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.DynamicWidgetsProvided> */
trait PartialDynamicWidgetsProv extends StObject {
  
  var attributesToRender: js.UndefOr[js.Array[String]] = js.undefined
  
  var children: js.UndefOr[ReactChild] = js.undefined
  
  var fallbackComponent: js.UndefOr[ComponentType[Attribute]] = js.undefined
}
object PartialDynamicWidgetsProv {
  
  inline def apply(): PartialDynamicWidgetsProv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDynamicWidgetsProv]
  }
  
  extension [Self <: PartialDynamicWidgetsProv](x: Self) {
    
    inline def setAttributesToRender(value: js.Array[String]): Self = StObject.set(x, "attributesToRender", value.asInstanceOf[js.Any])
    
    inline def setAttributesToRenderUndefined: Self = StObject.set(x, "attributesToRender", js.undefined)
    
    inline def setAttributesToRenderVarargs(value: String*): Self = StObject.set(x, "attributesToRender", js.Array(value*))
    
    inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFallbackComponent(value: ComponentType[Attribute]): Self = StObject.set(x, "fallbackComponent", value.asInstanceOf[js.Any])
    
    inline def setFallbackComponentUndefined: Self = StObject.set(x, "fallbackComponent", js.undefined)
  }
}
