package typingsJapgolly.rsocketCore.rsocketleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rsocketCore.rsocketCoreStrings.Accept
  - typingsJapgolly.rsocketCore.rsocketCoreStrings.Reject
  - typingsJapgolly.rsocketCore.rsocketCoreStrings.Terminate
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def Accept: typingsJapgolly.rsocketCore.rsocketCoreStrings.Accept = this.cast("Accept")
  @scala.inline
  def Reject: typingsJapgolly.rsocketCore.rsocketCoreStrings.Reject = this.cast("Reject")
  @scala.inline
  def Terminate: typingsJapgolly.rsocketCore.rsocketCoreStrings.Terminate = this.cast("Terminate")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

