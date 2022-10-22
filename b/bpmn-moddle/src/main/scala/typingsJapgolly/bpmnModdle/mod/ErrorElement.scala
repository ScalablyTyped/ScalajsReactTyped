package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorElement
  extends StObject
     with BaseElement {
  
  var errorCode: String
  
  var name: String
  
  var structureRef: ItemDefinition
}
object ErrorElement {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    errorCode: String,
    id: String,
    name: String,
    structureRef: ItemDefinition
  ): ErrorElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorElement]
  }
  
  extension [Self <: ErrorElement](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStructureRef(value: ItemDefinition): Self = StObject.set(x, "structureRef", value.asInstanceOf[js.Any])
  }
}
