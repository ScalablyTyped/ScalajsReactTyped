package typingsJapgolly.isMyJsonValid.mod

import typingsJapgolly.isMyJsonValid.isMyJsonValidStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberSchema
  extends StObject
     with _AnySchema {
  
  var `type`: number
}
object NumberSchema {
  
  inline def apply(): NumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[NumberSchema]
  }
  
  extension [Self <: NumberSchema](x: Self) {
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
