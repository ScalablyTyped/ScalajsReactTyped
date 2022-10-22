package typingsJapgolly.typedGraphql.graphqlMod

import typingsJapgolly.typedGraphql.typedGraphqlStrings.INPUT_OBJECT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionInputObjectType
  extends StObject
     with IntrospectionType {
  
  var description: js.UndefOr[String] = js.undefined
  
  var inputFields: js.Array[IntrospectionInputValue]
  
  var kind: INPUT_OBJECT
  
  var name: String
}
object IntrospectionInputObjectType {
  
  inline def apply(inputFields: js.Array[IntrospectionInputValue], name: String): IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = "INPUT_OBJECT", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputObjectType]
  }
  
  extension [Self <: IntrospectionInputObjectType](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInputFields(value: js.Array[IntrospectionInputValue]): Self = StObject.set(x, "inputFields", value.asInstanceOf[js.Any])
    
    inline def setInputFieldsVarargs(value: IntrospectionInputValue*): Self = StObject.set(x, "inputFields", js.Array(value*))
    
    inline def setKind(value: INPUT_OBJECT): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
