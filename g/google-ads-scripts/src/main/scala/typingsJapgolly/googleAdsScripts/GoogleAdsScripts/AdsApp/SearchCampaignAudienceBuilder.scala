package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for SearchCampaignAudience and SearchCampaignExcludedAudience objects.
  *
  * Example usage:
  *
  *      var audienceBuilder = campaign.targeting().newUserListBuilder();
  *      var audienceOperation = audienceBuilder
  *          .withAudienceId(3)       // required
  *          .build();                // add the audience, or .exclude() to exclude the audience.
  *      var audience = audienceOperation.getResult();
  */
trait SearchCampaignAudienceBuilder
  extends StObject
     with Builder[SearchCampaignAudienceOperation] {
  
  /** Builds the excluded audience. */
  def exclude(): SearchCampaignExcludedAudienceOperation
  
  /** Sets the user list of the audience. */
  def withAudience(userList: UserList): this.type
  
  /** Sets the audience ID of the audience. */
  def withAudienceId(audienceId: Double): this.type
  
  /** Sets the bid modifier value for this audience to the specified value. */
  def withBidModifier(modifier: Double): this.type
}
object SearchCampaignAudienceBuilder {
  
  inline def apply(
    build: CallbackTo[SearchCampaignAudienceOperation],
    exclude: CallbackTo[SearchCampaignExcludedAudienceOperation],
    withAudience: UserList => SearchCampaignAudienceBuilder,
    withAudienceId: Double => SearchCampaignAudienceBuilder,
    withBidModifier: Double => SearchCampaignAudienceBuilder
  ): SearchCampaignAudienceBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[SearchCampaignAudienceBuilder]
  }
  
  extension [Self <: SearchCampaignAudienceBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[SearchCampaignExcludedAudienceOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithAudience(value: UserList => SearchCampaignAudienceBuilder): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    inline def setWithAudienceId(value: Double => SearchCampaignAudienceBuilder): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithBidModifier(value: Double => SearchCampaignAudienceBuilder): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
