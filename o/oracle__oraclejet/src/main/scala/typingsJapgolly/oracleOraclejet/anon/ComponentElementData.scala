package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentElementData extends StObject {
  
  var componentElement: org.scalajs.dom.Element
  
  var data: js.Object
}
object ComponentElementData {
  
  inline def apply(componentElement: org.scalajs.dom.Element, data: js.Object): ComponentElementData = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElementData]
  }
  
  extension [Self <: ComponentElementData](x: Self) {
    
    inline def setComponentElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
