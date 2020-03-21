package typingsJapgolly.csurf.Express

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  def csrfToken(): String
}

object Request {
  @scala.inline
  def apply(csrfToken: CallbackTo[String]): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("csrfToken")(csrfToken.toJsFn)
    __obj.asInstanceOf[Request]
  }
}

