package typingsJapgolly.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldName extends StObject {
  
  var fieldName: String
  
  var parentTypeName: String
  
  var selectionSetGraphQL: String
  
  var selectionSetList: js.Array[String]
  
  var variables: StringDictionary[Any]
}
object FieldName {
  
  inline def apply(
    fieldName: String,
    parentTypeName: String,
    selectionSetGraphQL: String,
    selectionSetList: js.Array[String],
    variables: StringDictionary[Any]
  ): FieldName = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], parentTypeName = parentTypeName.asInstanceOf[js.Any], selectionSetGraphQL = selectionSetGraphQL.asInstanceOf[js.Any], selectionSetList = selectionSetList.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldName]
  }
  
  extension [Self <: FieldName](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setParentTypeName(value: String): Self = StObject.set(x, "parentTypeName", value.asInstanceOf[js.Any])
    
    inline def setSelectionSetGraphQL(value: String): Self = StObject.set(x, "selectionSetGraphQL", value.asInstanceOf[js.Any])
    
    inline def setSelectionSetList(value: js.Array[String]): Self = StObject.set(x, "selectionSetList", value.asInstanceOf[js.Any])
    
    inline def setSelectionSetListVarargs(value: String*): Self = StObject.set(x, "selectionSetList", js.Array(value*))
    
    inline def setVariables(value: StringDictionary[Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
