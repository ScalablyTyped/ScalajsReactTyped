package typingsJapgolly.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<gatsby.gatsby.ActivityTracker, 'end'> & {tick (increment ? : number): void, done (): void,   total  :number} */
@js.native
trait ProgressActivityTracker extends js.Object {
  var panic: LogErrorType = js.native
  var panicOnBuild: LogErrorType = js.native
  var setStatus: js.Function1[/* status */ String, Unit] = js.native
  var span: js.Object = js.native
  var start: js.Function0[js.Function0[Unit]] = js.native
  var total: Double = js.native
  def done(): Unit = js.native
  def tick(): Unit = js.native
  def tick(increment: Double): Unit = js.native
}

