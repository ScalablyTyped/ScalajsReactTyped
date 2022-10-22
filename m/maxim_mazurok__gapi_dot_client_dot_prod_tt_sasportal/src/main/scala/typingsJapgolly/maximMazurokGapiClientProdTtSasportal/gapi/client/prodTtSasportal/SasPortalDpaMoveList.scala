package typingsJapgolly.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalDpaMoveList extends StObject {
  
  /** The ID of the DPA. */
  var dpaId: js.UndefOr[String] = js.undefined
  
  /** The frequency range that the move list affects. */
  var frequencyRange: js.UndefOr[SasPortalFrequencyRange] = js.undefined
}
object SasPortalDpaMoveList {
  
  inline def apply(): SasPortalDpaMoveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDpaMoveList]
  }
  
  extension [Self <: SasPortalDpaMoveList](x: Self) {
    
    inline def setDpaId(value: String): Self = StObject.set(x, "dpaId", value.asInstanceOf[js.Any])
    
    inline def setDpaIdUndefined: Self = StObject.set(x, "dpaId", js.undefined)
    
    inline def setFrequencyRange(value: SasPortalFrequencyRange): Self = StObject.set(x, "frequencyRange", value.asInstanceOf[js.Any])
    
    inline def setFrequencyRangeUndefined: Self = StObject.set(x, "frequencyRange", js.undefined)
  }
}
