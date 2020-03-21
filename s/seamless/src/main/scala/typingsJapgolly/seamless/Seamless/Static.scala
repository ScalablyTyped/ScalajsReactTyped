package typingsJapgolly.seamless.Seamless

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  var options: ConnectOptions
  def connect(options: ConnectOptions): Connection
}

object Static {
  @scala.inline
  def apply(connect: ConnectOptions => CallbackTo[Connection], options: ConnectOptions): Static = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("connect")(js.Any.fromFunction1((t0: typingsJapgolly.seamless.Seamless.ConnectOptions) => connect(t0).runNow()))
    __obj.asInstanceOf[Static]
  }
}

