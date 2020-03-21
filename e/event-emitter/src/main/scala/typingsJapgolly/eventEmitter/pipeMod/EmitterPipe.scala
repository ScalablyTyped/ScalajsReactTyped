package typingsJapgolly.eventEmitter.pipeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterPipe extends js.Object {
  def close(): Unit
}

object EmitterPipe {
  @scala.inline
  def apply(close: Callback): EmitterPipe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[EmitterPipe]
  }
}

