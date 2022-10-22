package typingsJapgolly.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /**
    * The name of the dimension. Dimension names must contain only ASCII characters, must include at least one non-whitespace character, and cannot start with a colon (:).
    */
  var Name: DimensionName
  
  /**
    * The value of the dimension. Dimension values must contain only ASCII characters and must include at least one non-whitespace character.
    */
  var Value: DimensionValue
}
object Dimension {
  
  inline def apply(Name: DimensionName, Value: DimensionValue): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  
  extension [Self <: Dimension](x: Self) {
    
    inline def setName(value: DimensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
