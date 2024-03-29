package typingsJapgolly.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1Resource extends StObject {
  
  /** The analysis state of this resource. */
  var analysisState: js.UndefOr[IamPolicyAnalysisState] = js.undefined
  
  /** The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format) */
  var fullResourceName: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssetV1Resource {
  
  inline def apply(): GoogleCloudAssetV1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Resource]
  }
  
  extension [Self <: GoogleCloudAssetV1Resource](x: Self) {
    
    inline def setAnalysisState(value: IamPolicyAnalysisState): Self = StObject.set(x, "analysisState", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStateUndefined: Self = StObject.set(x, "analysisState", js.undefined)
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
