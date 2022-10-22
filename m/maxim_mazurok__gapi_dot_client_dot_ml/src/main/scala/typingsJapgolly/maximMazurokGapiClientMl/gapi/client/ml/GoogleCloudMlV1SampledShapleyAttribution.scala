package typingsJapgolly.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1SampledShapleyAttribution extends StObject {
  
  /** The number of feature permutations to consider when approximating the Shapley values. */
  var numPaths: js.UndefOr[Double] = js.undefined
}
object GoogleCloudMlV1SampledShapleyAttribution {
  
  inline def apply(): GoogleCloudMlV1SampledShapleyAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SampledShapleyAttribution]
  }
  
  extension [Self <: GoogleCloudMlV1SampledShapleyAttribution](x: Self) {
    
    inline def setNumPaths(value: Double): Self = StObject.set(x, "numPaths", value.asInstanceOf[js.Any])
    
    inline def setNumPathsUndefined: Self = StObject.set(x, "numPaths", js.undefined)
  }
}
