package typingsJapgolly.childProcessPromise.mod

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcessPromise[T] extends Promise[T] {
  var childProcess: ChildProcess = js.native
}

