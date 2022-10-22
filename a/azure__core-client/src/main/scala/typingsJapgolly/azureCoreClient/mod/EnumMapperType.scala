package typingsJapgolly.azureCoreClient.mod

import typingsJapgolly.azureCoreClient.azureCoreClientStrings.Enum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumMapperType
  extends StObject
     with MapperType {
  
  /**
    * Values allowed by this mapper.
    */
  var allowedValues: js.Array[Any]
  
  /**
    * Name of the enum type mapper.
    */
  var name: Enum
}
object EnumMapperType {
  
  inline def apply(allowedValues: js.Array[Any]): EnumMapperType = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], name = "Enum")
    __obj.asInstanceOf[EnumMapperType]
  }
  
  extension [Self <: EnumMapperType](x: Self) {
    
    inline def setAllowedValues(value: js.Array[Any]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesVarargs(value: Any*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setName(value: Enum): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
