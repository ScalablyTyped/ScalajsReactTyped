package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudienceBuilder[Audience] extends DisplayBuilder[AudienceBuilder[Audience]] {
  def withAudience(userList: UserList): AudienceBuilder[Audience]
  def withAudienceId(audienceId: Double): AudienceBuilder[Audience]
  def withAudienceType(audienceType: AudienceType): AudienceBuilder[Audience]
}

object AudienceBuilder {
  @scala.inline
  def apply[Audience](
    build: CallbackTo[AdWordsOperation[AudienceBuilder[Audience]]],
    exclude: CallbackTo[AdWordsOperation[AudienceBuilder[Audience]]],
    withAudience: UserList => CallbackTo[AudienceBuilder[Audience]],
    withAudienceId: Double => CallbackTo[AudienceBuilder[Audience]],
    withAudienceType: AudienceType => CallbackTo[AudienceBuilder[Audience]],
    withCpc: Double => CallbackTo[AudienceBuilder[Audience]],
    withCpm: Double => CallbackTo[AudienceBuilder[Audience]]
  ): AudienceBuilder[Audience] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("exclude")(exclude.toJsFn)
    __obj.updateDynamic("withAudience")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.UserList) => withAudience(t0).runNow()))
    __obj.updateDynamic("withAudienceId")(js.Any.fromFunction1((t0: scala.Double) => withAudienceId(t0).runNow()))
    __obj.updateDynamic("withAudienceType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.AudienceType) => withAudienceType(t0).runNow()))
    __obj.updateDynamic("withCpc")(js.Any.fromFunction1((t0: scala.Double) => withCpc(t0).runNow()))
    __obj.updateDynamic("withCpm")(js.Any.fromFunction1((t0: scala.Double) => withCpm(t0).runNow()))
    __obj.asInstanceOf[AudienceBuilder[Audience]]
  }
}

