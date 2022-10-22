package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCampaignAudienceBuilder[SearchCampaignAudience]
  extends StObject
     with AdWordsBuilder[SearchCampaignAudience] {
  
  def exclude(): AdWordsOperation[SearchCampaignAudience]
  
  def withAudience(userList: UserList): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  
  def withAudienceId(audienceId: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  
  def withBidModifier(modifier: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
}
object SearchCampaignAudienceBuilder {
  
  inline def apply[SearchCampaignAudience](
    build: CallbackTo[AdWordsOperation[SearchCampaignAudience]],
    exclude: CallbackTo[AdWordsOperation[SearchCampaignAudience]],
    withAudience: UserList => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    withAudienceId: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    withBidModifier: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]
  ): SearchCampaignAudienceBuilder[SearchCampaignAudience] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[SearchCampaignAudienceBuilder[SearchCampaignAudience]]
  }
  
  extension [Self <: SearchCampaignAudienceBuilder[?], SearchCampaignAudience](x: Self & SearchCampaignAudienceBuilder[SearchCampaignAudience]) {
    
    inline def setExclude(value: CallbackTo[AdWordsOperation[SearchCampaignAudience]]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithAudience(value: UserList => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    inline def setWithAudienceId(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithBidModifier(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
