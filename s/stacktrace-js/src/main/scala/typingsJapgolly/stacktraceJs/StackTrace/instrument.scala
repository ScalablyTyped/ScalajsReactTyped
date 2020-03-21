package typingsJapgolly.stacktraceJs.StackTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StackTrace.instrument")
@js.native
object instrument extends js.Object {
  def apply[TFunc /* <: js.Function */](fn: TFunc, callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit]): TFunc = js.native
  def apply[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
    errback: js.Function1[/* error */ js.Error, Unit]
  ): TFunc = js.native
  def apply[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
    errback: js.Function1[/* error */ js.Error, Unit],
    thisArg: js.Any
  ): TFunc = js.native
}

