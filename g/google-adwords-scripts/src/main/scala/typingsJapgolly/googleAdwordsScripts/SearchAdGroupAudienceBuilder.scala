package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAdGroupAudienceBuilder[SearchAdGroupAudience] extends AdWordsBuilder[SearchAdGroupAudience] {
  def exclude(): AdWordsOperation[SearchAdGroupAudience]
  def withAudience(userList: UserList): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def withAudienceId(audienceId: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def withBidModifier(modifier: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
}

object SearchAdGroupAudienceBuilder {
  @scala.inline
  def apply[SearchAdGroupAudience](
    build: CallbackTo[AdWordsOperation[SearchAdGroupAudience]],
    exclude: CallbackTo[AdWordsOperation[SearchAdGroupAudience]],
    withAudience: UserList => CallbackTo[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]],
    withAudienceId: Double => CallbackTo[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]],
    withBidModifier: Double => CallbackTo[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]]
  ): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("exclude")(exclude.toJsFn)
    __obj.updateDynamic("withAudience")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.UserList) => withAudience(t0).runNow()))
    __obj.updateDynamic("withAudienceId")(js.Any.fromFunction1((t0: scala.Double) => withAudienceId(t0).runNow()))
    __obj.updateDynamic("withBidModifier")(js.Any.fromFunction1((t0: scala.Double) => withBidModifier(t0).runNow()))
    __obj.asInstanceOf[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]]
  }
}

