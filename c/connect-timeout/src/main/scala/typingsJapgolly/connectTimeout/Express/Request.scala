package typingsJapgolly.connectTimeout.Express

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * @summary true if timeout fired; false otherwise.
    */
  var timedout: Boolean
  /**
    * @summary Clears the timeout on the request.
    */
  def clearTimeout(): Unit
}

object Request {
  @scala.inline
  def apply(clearTimeout: Callback, timedout: Boolean): Request = {
    val __obj = js.Dynamic.literal(timedout = timedout.asInstanceOf[js.Any])
    __obj.updateDynamic("clearTimeout")(clearTimeout.toJsFn)
    __obj.asInstanceOf[Request]
  }
}

