package typingsJapgolly.childProcessPromise.mod

import typingsJapgolly.childProcessPromise.ReadonlyOptionsExecFileOp
import typingsJapgolly.childProcessPromise.ReadonlyOptionsExecFileOpCapture
import typingsJapgolly.childProcessPromise.ReadonlyOptionsExecFileOpCwd
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child-process-promise", "execFile")
@js.native
object execFile extends js.Object {
  def apply(file: String): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(file: String, args: js.Array[String]): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(file: String, args: js.Array[String], options: ReadonlyOptionsExecFileOp): ChildProcessPromise[PromiseResult[Buffer]] = js.native
  def apply(file: String, args: js.Array[String], options: ReadonlyOptionsExecFileOpCapture): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(file: String, args: js.Array[String], options: ReadonlyOptionsExecFileOpCwd): ChildProcessPromise[PromiseResult[String | Buffer]] = js.native
  def apply(file: String, args: Null, options: ReadonlyOptionsExecFileOp): ChildProcessPromise[PromiseResult[Buffer]] = js.native
  def apply(file: String, args: Null, options: ReadonlyOptionsExecFileOpCapture): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(file: String, args: Null, options: ReadonlyOptionsExecFileOpCwd): ChildProcessPromise[PromiseResult[String | Buffer]] = js.native
  def apply(file: String, options: ReadonlyOptionsExecFileOp): ChildProcessPromise[PromiseResult[Buffer]] = js.native
  def apply(file: String, options: ReadonlyOptionsExecFileOpCapture): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(file: String, options: ReadonlyOptionsExecFileOpCwd): ChildProcessPromise[PromiseResult[String | Buffer]] = js.native
}

