package typingsJapgolly.shippo.mod.Shippo

import typingsJapgolly.shippo.anon.Amount
import typingsJapgolly.shippo.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParcelExtras extends StObject {
  
  var COD: js.UndefOr[Amount] = js.undefined
  
  var insurance: js.UndefOr[Content] = js.undefined
}
object ParcelExtras {
  
  inline def apply(): ParcelExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParcelExtras]
  }
  
  extension [Self <: ParcelExtras](x: Self) {
    
    inline def setCOD(value: Amount): Self = StObject.set(x, "COD", value.asInstanceOf[js.Any])
    
    inline def setCODUndefined: Self = StObject.set(x, "COD", js.undefined)
    
    inline def setInsurance(value: Content): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
  }
}
