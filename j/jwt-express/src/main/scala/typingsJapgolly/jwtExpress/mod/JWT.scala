package typingsJapgolly.jwtExpress.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Response_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWT extends js.Object {
  /**
    * Indicates if the JWT is expired. valid will always be false if this is true.
    */
  var expired: Boolean
  /**
    * The jwt-express options.
    */
  var options: JWTExpressOptions
  /**
    * The payload of the JWT (must be an object). jwt-express will add a stales key-value pair to the payload for stale.
    */
  var payload: js.Any
  /**
    * The secret used to sign /verify the JWT.
    */
  var secret: String
  /**
    * Indicates if the JWT is stale. The default timeout before a JWT is considered stale is 15 minutes.
    */
  var stale: Boolean
  /**
    * The signed token of the JWT.
    */
  var token: String
  /**
    * Indicates if this JWT is valid. This means that the payload hasn't been tampered with and that the JWT hasn't expired yet.
    */
  var valid: Boolean
  /**
    * Resigns this JWT Objects's payload.
    *
    * @return this
    */
  def resign(): JWT
  /**
    * Calls the revoke function defined in the jwt.init() options with this JWT Object as the first parameter.
    *
    * @return this
    */
  def revoke(): JWT
  /**
    * Generates a signed token from the payload.
    *
    * @param payload The payload of the JWT (must be an object).
    * @return this
    */
  def sign(payload: js.Any): JWT
  /**
    * Stores this JWT in the cookie (if configured to use cookies).
    *
    * @param res The response in which to store the JWT.
    * @return this
    */
  def store(res: Response_): JWT
  /**
    * This function is called when the jwt is passed through JSON.stringify.
    * We don't want the secret or options to be stringified.
    *
    * @return The JSON form of the object.
    */
  def toJSON(): js.Any
  /**
    * Verify the token and load the info into this JWT.
    *
    * @param token The signed token to verify.
    * @return this
    */
  def verify(token: String): JWT
}

object JWT {
  @scala.inline
  def apply(
    expired: Boolean,
    options: JWTExpressOptions,
    payload: js.Any,
    resign: CallbackTo[JWT],
    revoke: CallbackTo[JWT],
    secret: String,
    sign: js.Any => CallbackTo[JWT],
    stale: Boolean,
    store: Response_ => CallbackTo[JWT],
    toJSON: CallbackTo[js.Any],
    token: String,
    valid: Boolean,
    verify: String => CallbackTo[JWT]
  ): JWT = {
    val __obj = js.Dynamic.literal(expired = expired.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.updateDynamic("resign")(resign.toJsFn)
    __obj.updateDynamic("revoke")(revoke.toJsFn)
    __obj.updateDynamic("sign")(js.Any.fromFunction1((t0: js.Any) => sign(t0).runNow()))
    __obj.updateDynamic("store")(js.Any.fromFunction1((t0: typingsJapgolly.express.mod.Response_) => store(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("verify")(js.Any.fromFunction1((t0: java.lang.String) => verify(t0).runNow()))
    __obj.asInstanceOf[JWT]
  }
}

