package typingsJapgolly.jwtExpress.mod._Global_.Express

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jwtExpress.mod.JWT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /**
    * Returns a newly created / signed JWT Object from the payload. If you are using cookies,
    * it will automatically store the JWT in the cookie as well.
    *
    * @param payload The payload of the JWT
    * @return The newly created JWT
    */
  def jwt(payload: js.Any): JWT
}

object Response {
  @scala.inline
  def apply(jwt: js.Any => CallbackTo[JWT]): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jwt")(js.Any.fromFunction1((t0: js.Any) => jwt(t0).runNow()))
    __obj.asInstanceOf[Response]
  }
}

