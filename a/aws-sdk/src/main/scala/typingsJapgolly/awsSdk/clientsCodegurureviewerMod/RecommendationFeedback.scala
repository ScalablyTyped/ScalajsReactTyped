package typingsJapgolly.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationFeedback extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CodeReview object. 
    */
  var CodeReviewArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the feedback was created.
    */
  var CreatedTimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the feedback was last updated.
    */
  var LastUpdatedTimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback.
    */
  var Reactions: js.UndefOr[typingsJapgolly.awsSdk.clientsCodegurureviewerMod.Reactions] = js.undefined
  
  /**
    * The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback.
    */
  var RecommendationId: js.UndefOr[typingsJapgolly.awsSdk.clientsCodegurureviewerMod.RecommendationId] = js.undefined
  
  /**
    * The ID of the user that made the API call.  The UserId is an IAM principal that can be specified as an Amazon Web Services account ID or an Amazon Resource Name (ARN). For more information, see  Specifying a Principal in the Amazon Web Services Identity and Access Management User Guide.
    */
  var UserId: js.UndefOr[typingsJapgolly.awsSdk.clientsCodegurureviewerMod.UserId] = js.undefined
}
object RecommendationFeedback {
  
  inline def apply(): RecommendationFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationFeedback]
  }
  
  extension [Self <: RecommendationFeedback](x: Self) {
    
    inline def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    inline def setCodeReviewArnUndefined: Self = StObject.set(x, "CodeReviewArn", js.undefined)
    
    inline def setCreatedTimeStamp(value: js.Date): Self = StObject.set(x, "CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeStampUndefined: Self = StObject.set(x, "CreatedTimeStamp", js.undefined)
    
    inline def setLastUpdatedTimeStamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeStampUndefined: Self = StObject.set(x, "LastUpdatedTimeStamp", js.undefined)
    
    inline def setReactions(value: Reactions): Self = StObject.set(x, "Reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "Reactions", js.undefined)
    
    inline def setReactionsVarargs(value: Reaction*): Self = StObject.set(x, "Reactions", js.Array(value*))
    
    inline def setRecommendationId(value: RecommendationId): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
