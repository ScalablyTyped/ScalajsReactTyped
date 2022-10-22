package typingsJapgolly.seatsio.anon

import typingsJapgolly.seatsio.Seatsio.SelectionValidator
import typingsJapgolly.seatsio.seatsioStrings.consecutiveSeats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with SelectionValidator {
  
  var `type`: consecutiveSeats
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("consecutiveSeats")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: consecutiveSeats): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
