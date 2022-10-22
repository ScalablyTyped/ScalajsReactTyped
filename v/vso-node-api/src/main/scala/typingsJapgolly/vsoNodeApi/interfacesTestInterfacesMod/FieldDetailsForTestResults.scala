package typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldDetailsForTestResults extends StObject {
  
  /**
    * Group by field name
    */
  var fieldName: String
  
  /**
    * Group by field values
    */
  var groupsForField: js.Array[Any]
}
object FieldDetailsForTestResults {
  
  inline def apply(fieldName: String, groupsForField: js.Array[Any]): FieldDetailsForTestResults = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], groupsForField = groupsForField.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDetailsForTestResults]
  }
  
  extension [Self <: FieldDetailsForTestResults](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setGroupsForField(value: js.Array[Any]): Self = StObject.set(x, "groupsForField", value.asInstanceOf[js.Any])
    
    inline def setGroupsForFieldVarargs(value: Any*): Self = StObject.set(x, "groupsForField", js.Array(value*))
  }
}
