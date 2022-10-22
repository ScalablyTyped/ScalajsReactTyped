package typingsJapgolly.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldType extends StObject {
  
  var dataTypeId: Double
  
  var name: String
}
object FieldType {
  
  inline def apply(dataTypeId: Double, name: String): FieldType = {
    val __obj = js.Dynamic.literal(dataTypeId = dataTypeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
  
  extension [Self <: FieldType](x: Self) {
    
    inline def setDataTypeId(value: Double): Self = StObject.set(x, "dataTypeId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
