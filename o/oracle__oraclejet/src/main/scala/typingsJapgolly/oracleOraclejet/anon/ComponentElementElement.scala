package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentElementElement extends StObject {
  
  var componentElement: org.scalajs.dom.Element
}
object ComponentElementElement {
  
  inline def apply(componentElement: org.scalajs.dom.Element): ComponentElementElement = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElementElement]
  }
  
  extension [Self <: ComponentElementElement](x: Self) {
    
    inline def setComponentElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
  }
}
