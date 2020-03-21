package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCampaignAudienceBuilder[SearchCampaignAudience] extends AdWordsBuilder[SearchCampaignAudience] {
  def exclude(): AdWordsOperation[SearchCampaignAudience]
  def withAudience(userList: UserList): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  def withAudienceId(audienceId: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  def withBidModifier(modifier: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
}

object SearchCampaignAudienceBuilder {
  @scala.inline
  def apply[SearchCampaignAudience](
    build: CallbackTo[AdWordsOperation[SearchCampaignAudience]],
    exclude: CallbackTo[AdWordsOperation[SearchCampaignAudience]],
    withAudience: UserList => CallbackTo[SearchCampaignAudienceBuilder[SearchCampaignAudience]],
    withAudienceId: Double => CallbackTo[SearchCampaignAudienceBuilder[SearchCampaignAudience]],
    withBidModifier: Double => CallbackTo[SearchCampaignAudienceBuilder[SearchCampaignAudience]]
  ): SearchCampaignAudienceBuilder[SearchCampaignAudience] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("exclude")(exclude.toJsFn)
    __obj.updateDynamic("withAudience")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.UserList) => withAudience(t0).runNow()))
    __obj.updateDynamic("withAudienceId")(js.Any.fromFunction1((t0: scala.Double) => withAudienceId(t0).runNow()))
    __obj.updateDynamic("withBidModifier")(js.Any.fromFunction1((t0: scala.Double) => withBidModifier(t0).runNow()))
    __obj.asInstanceOf[SearchCampaignAudienceBuilder[SearchCampaignAudience]]
  }
}

