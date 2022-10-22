package typingsJapgolly.dateFns.anon

import typingsJapgolly.dateFns.dateFnsInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalDigits extends StObject {
  
  var additionalDigits: js.UndefOr[
    typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2`
  ] = js.undefined
}
object AdditionalDigits {
  
  inline def apply(): AdditionalDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalDigits]
  }
  
  extension [Self <: AdditionalDigits](x: Self) {
    
    inline def setAdditionalDigits(value: typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2`): Self = StObject.set(x, "additionalDigits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDigitsUndefined: Self = StObject.set(x, "additionalDigits", js.undefined)
  }
}
