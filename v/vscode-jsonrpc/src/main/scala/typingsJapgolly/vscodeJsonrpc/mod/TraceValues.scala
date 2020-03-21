package typingsJapgolly.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.off
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.messages
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.verbose
*/
trait TraceValues extends js.Object

object TraceValues {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messages: typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.messages = this.cast("messages")
  @scala.inline
  def off: typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.off = this.cast("off")
  @scala.inline
  def verbose: typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.verbose = this.cast("verbose")
}

