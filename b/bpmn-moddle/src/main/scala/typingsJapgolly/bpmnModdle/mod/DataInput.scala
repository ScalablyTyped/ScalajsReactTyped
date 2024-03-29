package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataInput
  extends StObject
     with ItemAwareElement {
  
  var inputSetRef: InputSet
  
  var inputSetWithOptional: InputSet
  
  var inputSetWithWhileExecuting: InputSet
  
  /** @default false */
  var isCollection: Boolean
  
  var name: String
}
object DataInput {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataState: DataState,
    id: String,
    inputSetRef: InputSet,
    inputSetWithOptional: InputSet,
    inputSetWithWhileExecuting: InputSet,
    isCollection: Boolean,
    itemSubjectRef: ItemDefinition,
    name: String
  ): DataInput = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSetRef = inputSetRef.asInstanceOf[js.Any], inputSetWithOptional = inputSetWithOptional.asInstanceOf[js.Any], inputSetWithWhileExecuting = inputSetWithWhileExecuting.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataInput]
  }
  
  extension [Self <: DataInput](x: Self) {
    
    inline def setInputSetRef(value: InputSet): Self = StObject.set(x, "inputSetRef", value.asInstanceOf[js.Any])
    
    inline def setInputSetWithOptional(value: InputSet): Self = StObject.set(x, "inputSetWithOptional", value.asInstanceOf[js.Any])
    
    inline def setInputSetWithWhileExecuting(value: InputSet): Self = StObject.set(x, "inputSetWithWhileExecuting", value.asInstanceOf[js.Any])
    
    inline def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
