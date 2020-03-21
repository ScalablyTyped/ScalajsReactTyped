package typingsJapgolly.expressBoom.mod._Global_.Express

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoomError[Data] extends js.Object {
  var data: Data
  var isBoom: Boolean
  var isServer: Boolean
  var message: String
  var output: Output
  def reformat(): Unit
}

object BoomError {
  @scala.inline
  def apply[Data](
    data: Data,
    isBoom: Boolean,
    isServer: Boolean,
    message: String,
    output: Output,
    reformat: Callback
  ): BoomError[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isBoom = isBoom.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.updateDynamic("reformat")(reformat.toJsFn)
    __obj.asInstanceOf[BoomError[Data]]
  }
}

