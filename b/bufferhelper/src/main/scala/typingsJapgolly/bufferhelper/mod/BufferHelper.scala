package typingsJapgolly.bufferhelper.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferHelper extends js.Object {
  def concat(buffer: js.Any): BufferHelper
  def empty(): BufferHelper
  def load(stream: js.Any, callback: js.Function1[/* arg */ js.Any, _]): Unit
  def toBuffer(): Buffer
  def toString(encoding: encoding): String
}

object BufferHelper {
  @scala.inline
  def apply(
    concat: js.Any => CallbackTo[BufferHelper],
    empty: CallbackTo[BufferHelper],
    load: (js.Any, js.Function1[/* arg */ js.Any, js.Any]) => Callback,
    toBuffer: CallbackTo[Buffer],
    toString: encoding => CallbackTo[String]
  ): BufferHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("concat")(js.Any.fromFunction1((t0: js.Any) => concat(t0).runNow()))
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("load")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* arg */ js.Any, js.Any]) => load(t0, t1).runNow()))
    __obj.updateDynamic("toBuffer")(toBuffer.toJsFn)
    __obj.updateDynamic("toString")(js.Any.fromFunction1((t0: typingsJapgolly.bufferhelper.mod.encoding) => toString(t0).runNow()))
    __obj.asInstanceOf[BufferHelper]
  }
}

