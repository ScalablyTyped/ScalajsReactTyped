package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.anon.Data
import typingsJapgolly.qlik.qlikStrings.accordion
import typingsJapgolly.qlik.qlikStrings.items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition extends StObject {
  
  var component: accordion
  
  var items: Data
  
  var `type`: items
}
object Definition {
  
  inline def apply(items: Data): Definition = {
    val __obj = js.Dynamic.literal(component = "accordion", items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("items")
    __obj.asInstanceOf[Definition]
  }
  
  extension [Self <: Definition](x: Self) {
    
    inline def setComponent(value: accordion): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Data): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: items): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
