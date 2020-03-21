package typingsJapgolly.microsoftteams.microsoftTeams.authentication

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateParameters extends js.Object {
  /**
    * A function that is called if the authentication fails, with the reason for the failure returned from the authentication pop-up.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * The preferred height for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * A function that is called if the authentication succeeds, with the result returned from the authentication pop-up.
    */
  var successCallback: js.UndefOr[js.Function1[/* result */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * The URL for the authentication pop-up.
    */
  var url: String
  /**
    * The preferred width for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AuthenticateParameters {
  @scala.inline
  def apply(
    url: String,
    failureCallback: /* reason */ js.UndefOr[String] => Callback = null,
    height: Int | Double = null,
    successCallback: /* result */ js.UndefOr[String] => Callback = null,
    width: Int | Double = null
  ): AuthenticateParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (failureCallback != null) __obj.updateDynamic("failureCallback")(js.Any.fromFunction1((t0: /* reason */ js.UndefOr[java.lang.String]) => failureCallback(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (successCallback != null) __obj.updateDynamic("successCallback")(js.Any.fromFunction1((t0: /* result */ js.UndefOr[java.lang.String]) => successCallback(t0).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateParameters]
  }
}

