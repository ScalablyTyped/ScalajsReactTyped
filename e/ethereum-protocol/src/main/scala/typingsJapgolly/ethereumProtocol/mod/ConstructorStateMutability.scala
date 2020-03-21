package typingsJapgolly.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.nonpayable
  - typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.payable
*/
trait ConstructorStateMutability extends js.Object

object ConstructorStateMutability {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nonpayable: typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.nonpayable = this.cast("nonpayable")
  @scala.inline
  def payable: typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.payable = this.cast("payable")
}

