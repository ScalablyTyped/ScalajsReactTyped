package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtension extends StObject {
  
  var controller: js.UndefOr[Any] = js.undefined
  
  var definition: js.UndefOr[IDefinition] = js.undefined
  
  var initialProperties: js.UndefOr[IInitialProperties] = js.undefined
  
  var paint: js.UndefOr[js.Function2[/* $element */ HTMLElement, /* layout */ js.UndefOr[Any], Unit]] = js.undefined
  
  var support: js.UndefOr[ISupport] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
}
object IExtension {
  
  inline def apply(): IExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExtension]
  }
  
  extension [Self <: IExtension](x: Self) {
    
    inline def setController(value: Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setDefinition(value: IDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setInitialProperties(value: IInitialProperties): Self = StObject.set(x, "initialProperties", value.asInstanceOf[js.Any])
    
    inline def setInitialPropertiesUndefined: Self = StObject.set(x, "initialProperties", js.undefined)
    
    inline def setPaint(value: (/* $element */ HTMLElement, /* layout */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "paint", js.Any.fromFunction2((t0: /* $element */ HTMLElement, t1: /* layout */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setSupport(value: ISupport): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
