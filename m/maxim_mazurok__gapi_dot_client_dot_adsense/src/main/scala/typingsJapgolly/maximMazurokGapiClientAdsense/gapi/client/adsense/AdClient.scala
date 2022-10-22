package typingsJapgolly.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdClient extends StObject {
  
  /** Output only. Resource name of the ad client. Format: accounts/{account}/adclients/{adclient} */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Reporting product code of the ad client. For example, "AFC" for AdSense for Content. Corresponds to the `PRODUCT_CODE` dimension, and present only if the ad client
    * supports reporting.
    */
  var productCode: js.UndefOr[String] = js.undefined
  
  /** Output only. Unique ID of the ad client as used in the `AD_CLIENT_ID` reporting dimension. Present only if the ad client supports reporting. */
  var reportingDimensionId: js.UndefOr[String] = js.undefined
  
  /** Output only. State of the ad client. */
  var state: js.UndefOr[String] = js.undefined
}
object AdClient {
  
  inline def apply(): AdClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdClient]
  }
  
  extension [Self <: AdClient](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProductCode(value: String): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setReportingDimensionId(value: String): Self = StObject.set(x, "reportingDimensionId", value.asInstanceOf[js.Any])
    
    inline def setReportingDimensionIdUndefined: Self = StObject.set(x, "reportingDimensionId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
