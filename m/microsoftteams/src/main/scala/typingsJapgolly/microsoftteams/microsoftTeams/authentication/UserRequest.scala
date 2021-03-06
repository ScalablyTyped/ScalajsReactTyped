package typingsJapgolly.microsoftteams.microsoftTeams.authentication

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRequest extends js.Object {
  /**
    * A function that is called if the token request fails, with the reason for the failure.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  /**
    * A function that is called if the token request succeeds, with the resulting token.
    */
  var successCallback: js.UndefOr[js.Function1[/* user */ UserProfile, Unit]] = js.undefined
}

object UserRequest {
  @scala.inline
  def apply(
    failureCallback: /* reason */ String => Callback = null,
    successCallback: /* user */ UserProfile => Callback = null
  ): UserRequest = {
    val __obj = js.Dynamic.literal()
    if (failureCallback != null) __obj.updateDynamic("failureCallback")(js.Any.fromFunction1((t0: /* reason */ java.lang.String) => failureCallback(t0).runNow()))
    if (successCallback != null) __obj.updateDynamic("successCallback")(js.Any.fromFunction1((t0: /* user */ typingsJapgolly.microsoftteams.microsoftTeams.authentication.UserProfile) => successCallback(t0).runNow()))
    __obj.asInstanceOf[UserRequest]
  }
}

