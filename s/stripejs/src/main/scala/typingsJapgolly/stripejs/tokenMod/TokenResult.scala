package typingsJapgolly.stripejs.tokenMod

import typingsJapgolly.stripejs.mod.StripeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenResult extends js.Object {
  /**
    * There was an error. This includes client-side validation errors.
    */
  var error: js.UndefOr[StripeError] = js.undefined
  /**
    * The generated string that can be used for communication with the backend
    */
  var token: js.UndefOr[Token] = js.undefined
}

object TokenResult {
  @scala.inline
  def apply(error: StripeError = null, token: Token = null): TokenResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResult]
  }
}

