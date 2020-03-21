package typingsJapgolly.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azdata.azdataStrings.shell
  - typingsJapgolly.azdata.azdataStrings.iopub
  - typingsJapgolly.azdata.azdataStrings.stdin
  - typingsJapgolly.azdata.azdataStrings.execute_reply
*/
trait Channel extends js.Object

object Channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def execute_reply: typingsJapgolly.azdata.azdataStrings.execute_reply = this.cast("execute_reply")
  @scala.inline
  def iopub: typingsJapgolly.azdata.azdataStrings.iopub = this.cast("iopub")
  @scala.inline
  def shell: typingsJapgolly.azdata.azdataStrings.shell = this.cast("shell")
  @scala.inline
  def stdin: typingsJapgolly.azdata.azdataStrings.stdin = this.cast("stdin")
}

