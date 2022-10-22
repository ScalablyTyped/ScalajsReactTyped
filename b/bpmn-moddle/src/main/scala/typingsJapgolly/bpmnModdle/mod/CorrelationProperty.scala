package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorrelationProperty
  extends StObject
     with BaseElement {
  
  var correlationPropertyRetrievalExpression: CorrelationPropertyRetrievalExpression
  
  var name: String
  
  var `type`: ItemDefinition
}
object CorrelationProperty {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationPropertyRetrievalExpression: CorrelationPropertyRetrievalExpression,
    id: String,
    name: String,
    `type`: ItemDefinition
  ): CorrelationProperty = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationPropertyRetrievalExpression = correlationPropertyRetrievalExpression.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationProperty]
  }
  
  extension [Self <: CorrelationProperty](x: Self) {
    
    inline def setCorrelationPropertyRetrievalExpression(value: CorrelationPropertyRetrievalExpression): Self = StObject.set(x, "correlationPropertyRetrievalExpression", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ItemDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
