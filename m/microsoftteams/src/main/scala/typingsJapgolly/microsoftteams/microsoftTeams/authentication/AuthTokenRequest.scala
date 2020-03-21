package typingsJapgolly.microsoftteams.microsoftTeams.authentication

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthTokenRequest extends js.Object {
  /**
    * A function that is called if the token request fails, with the reason for the failure.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  /**
    * An array of resource URIs identifying the target resources for which the token should be requested.
    */
  var resources: js.Array[String]
  /**
    * A function that is called if the token request succeeds, with the resulting token.
    */
  var successCallback: js.UndefOr[js.Function1[/* token */ String, Unit]] = js.undefined
}

object AuthTokenRequest {
  @scala.inline
  def apply(
    resources: js.Array[String],
    failureCallback: /* reason */ String => Callback = null,
    successCallback: /* token */ String => Callback = null
  ): AuthTokenRequest = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    if (failureCallback != null) __obj.updateDynamic("failureCallback")(js.Any.fromFunction1((t0: /* reason */ java.lang.String) => failureCallback(t0).runNow()))
    if (successCallback != null) __obj.updateDynamic("successCallback")(js.Any.fromFunction1((t0: /* token */ java.lang.String) => successCallback(t0).runNow()))
    __obj.asInstanceOf[AuthTokenRequest]
  }
}

