package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiaPosDataProvider extends StObject {
  
  /** The ID of the POS data provider. */
  var posDataProviderId: js.UndefOr[String] = js.undefined
  
  /** The account ID by which this merchant is known to the POS data provider. */
  var posExternalAccountId: js.UndefOr[String] = js.undefined
}
object LiaPosDataProvider {
  
  inline def apply(): LiaPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaPosDataProvider]
  }
  
  extension [Self <: LiaPosDataProvider](x: Self) {
    
    inline def setPosDataProviderId(value: String): Self = StObject.set(x, "posDataProviderId", value.asInstanceOf[js.Any])
    
    inline def setPosDataProviderIdUndefined: Self = StObject.set(x, "posDataProviderId", js.undefined)
    
    inline def setPosExternalAccountId(value: String): Self = StObject.set(x, "posExternalAccountId", value.asInstanceOf[js.Any])
    
    inline def setPosExternalAccountIdUndefined: Self = StObject.set(x, "posExternalAccountId", js.undefined)
  }
}
