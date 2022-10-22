package typingsJapgolly.fastJsonStringify.mod

import typingsJapgolly.fastJsonStringify.fastJsonStringifyStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerSchema
  extends StObject
     with BaseSchema
     with Schema {
  
  var `type`: integer
}
object IntegerSchema {
  
  inline def apply(): IntegerSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[IntegerSchema]
  }
  
  extension [Self <: IntegerSchema](x: Self) {
    
    inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
