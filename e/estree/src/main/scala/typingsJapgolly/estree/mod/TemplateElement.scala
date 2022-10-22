package typingsJapgolly.estree.mod

import typingsJapgolly.estree.anon.Cooked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateElement
  extends StObject
     with BaseNode {
  
  var tail: Boolean
  
  @JSName("type")
  var type_TemplateElement: typingsJapgolly.estree.estreeStrings.TemplateElement
  
  var value: Cooked
}
object TemplateElement {
  
  inline def apply(tail: Boolean, value: Cooked): TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateElement")
    __obj.asInstanceOf[TemplateElement]
  }
  
  extension [Self <: TemplateElement](x: Self) {
    
    inline def setTail(value: Boolean): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.TemplateElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Cooked): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
