package typingsJapgolly.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1RecommendationStateInfo extends StObject {
  
  /** The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED. */
  var state: js.UndefOr[String] = js.undefined
  
  /** A map of metadata for the state, provided by user or automations systems. */
  var stateMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object GoogleCloudRecommenderV1RecommendationStateInfo {
  
  inline def apply(): GoogleCloudRecommenderV1RecommendationStateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1RecommendationStateInfo]
  }
  
  extension [Self <: GoogleCloudRecommenderV1RecommendationStateInfo](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    inline def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
