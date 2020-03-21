package typingsJapgolly.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined auth0-js.auth0-js.Auth0Error & {  state ? :string} */
trait Auth0ParseHashError extends js.Object {
  // Need to include non-intuitive error fields that Auth0 uses
  var code: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var error: LibErrorCodes | SpecErrorCodes | String
  var errorDescription: js.UndefOr[String] = js.undefined
  // Auth0 is not consistent in the naming of the error description field
  var error_description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var original: js.UndefOr[js.Any] = js.undefined
  var policy: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object Auth0ParseHashError {
  @scala.inline
  def apply(
    error: LibErrorCodes | SpecErrorCodes | String,
    code: String = null,
    description: String = null,
    errorDescription: String = null,
    error_description: String = null,
    name: String = null,
    original: js.Any = null,
    policy: String = null,
    state: String = null,
    statusCode: Int | Double = null,
    statusText: String = null
  ): Auth0ParseHashError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (errorDescription != null) __obj.updateDynamic("errorDescription")(errorDescription.asInstanceOf[js.Any])
    if (error_description != null) __obj.updateDynamic("error_description")(error_description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0ParseHashError]
  }
}

