package typingsJapgolly.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansPurchaseRecommendationResponse extends StObject {
  
  /**
    * Information that regards this specific recommendation set.
    */
  var Metadata: js.UndefOr[SavingsPlansPurchaseRecommendationMetadata] = js.undefined
  
  /**
    * The token for the next set of retrievable results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
    */
  var SavingsPlansPurchaseRecommendation: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.SavingsPlansPurchaseRecommendation] = js.undefined
}
object GetSavingsPlansPurchaseRecommendationResponse {
  
  inline def apply(): GetSavingsPlansPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationResponse]
  }
  
  extension [Self <: GetSavingsPlansPurchaseRecommendationResponse](x: Self) {
    
    inline def setMetadata(value: SavingsPlansPurchaseRecommendationMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setSavingsPlansPurchaseRecommendation(value: SavingsPlansPurchaseRecommendation): Self = StObject.set(x, "SavingsPlansPurchaseRecommendation", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlansPurchaseRecommendationUndefined: Self = StObject.set(x, "SavingsPlansPurchaseRecommendation", js.undefined)
  }
}
