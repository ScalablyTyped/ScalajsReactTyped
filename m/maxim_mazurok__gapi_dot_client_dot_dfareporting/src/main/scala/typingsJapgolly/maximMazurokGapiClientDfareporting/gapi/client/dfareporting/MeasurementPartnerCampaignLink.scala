package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasurementPartnerCampaignLink extends StObject {
  
  /** . */
  var linkStatus: js.UndefOr[String] = js.undefined
  
  /** Measurement partner used for tag wrapping. */
  var measurementPartner: js.UndefOr[String] = js.undefined
  
  /** Partner campaign ID needed for establishing linking with Measurement partner. */
  var partnerCampaignId: js.UndefOr[String] = js.undefined
}
object MeasurementPartnerCampaignLink {
  
  inline def apply(): MeasurementPartnerCampaignLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasurementPartnerCampaignLink]
  }
  
  extension [Self <: MeasurementPartnerCampaignLink](x: Self) {
    
    inline def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    inline def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
    
    inline def setMeasurementPartner(value: String): Self = StObject.set(x, "measurementPartner", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPartnerUndefined: Self = StObject.set(x, "measurementPartner", js.undefined)
    
    inline def setPartnerCampaignId(value: String): Self = StObject.set(x, "partnerCampaignId", value.asInstanceOf[js.Any])
    
    inline def setPartnerCampaignIdUndefined: Self = StObject.set(x, "partnerCampaignId", js.undefined)
  }
}
