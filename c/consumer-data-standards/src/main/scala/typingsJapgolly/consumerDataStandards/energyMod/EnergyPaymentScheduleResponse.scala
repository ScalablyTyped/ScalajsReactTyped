package typingsJapgolly.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.PaymentSchedules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPaymentScheduleResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: PaymentSchedules
  
  var links: Links
  
  var meta: Meta
}
object EnergyPaymentScheduleResponse {
  
  inline def apply(data: PaymentSchedules, links: Links, meta: Meta): EnergyPaymentScheduleResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPaymentScheduleResponse]
  }
  
  extension [Self <: EnergyPaymentScheduleResponse](x: Self) {
    
    inline def setData(value: PaymentSchedules): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
