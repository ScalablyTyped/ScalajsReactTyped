package typingsJapgolly.ioredis.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var args: js.Array[ValueType]
  var isCustomCommand: Boolean
  def getKeys(): js.Array[String | Buffer]
  def getSlot(): Double | Null
}

object Command {
  @scala.inline
  def apply(
    args: js.Array[ValueType],
    getKeys: CallbackTo[js.Array[String | Buffer]],
    getSlot: CallbackTo[Double | Null],
    isCustomCommand: Boolean
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isCustomCommand = isCustomCommand.asInstanceOf[js.Any])
    __obj.updateDynamic("getKeys")(getKeys.toJsFn)
    __obj.updateDynamic("getSlot")(getSlot.toJsFn)
    __obj.asInstanceOf[Command]
  }
}

