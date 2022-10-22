package typingsJapgolly.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDescriptionWidth extends StObject {
  
  var component: DescriptionWidth
  
  var global: js.Array[String]
}
object ComponentDescriptionWidth {
  
  inline def apply(component: DescriptionWidth, global: js.Array[String]): ComponentDescriptionWidth = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDescriptionWidth]
  }
  
  extension [Self <: ComponentDescriptionWidth](x: Self) {
    
    inline def setComponent(value: DescriptionWidth): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
