package typingsJapgolly.isMyJsonValid.mod

import typingsJapgolly.isMyJsonValid.isMyJsonValidStrings.`null`
import typingsJapgolly.isMyJsonValid.isMyJsonValidStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableNumberSchema
  extends StObject
     with _AnySchema {
  
  var `type`: js.Array[number | `null`]
}
object NullableNumberSchema {
  
  inline def apply(`type`: js.Array[number | `null`]): NullableNumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableNumberSchema]
  }
  
  extension [Self <: NullableNumberSchema](x: Self) {
    
    inline def setType(value: js.Array[number | `null`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (number | `null`)*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
