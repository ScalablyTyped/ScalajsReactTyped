package typingsJapgolly.dateFns.anon

import typingsJapgolly.dateFns.dateFnsInts.`2`
import typingsJapgolly.dateFns.dateFnsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FractionDigits extends StObject {
  
  var fractionDigits: js.UndefOr[
    typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3`
  ] = js.undefined
}
object FractionDigits {
  
  inline def apply(): FractionDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractionDigits]
  }
  
  extension [Self <: FractionDigits](x: Self) {
    
    inline def setFractionDigits(
      value: typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3`
    ): Self = StObject.set(x, "fractionDigits", value.asInstanceOf[js.Any])
    
    inline def setFractionDigitsUndefined: Self = StObject.set(x, "fractionDigits", js.undefined)
  }
}
