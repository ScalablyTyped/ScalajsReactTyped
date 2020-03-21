package typingsJapgolly.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.pure
  - typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.view
  - typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.nonpayable
  - typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.payable
*/
trait StateMutability extends js.Object

object StateMutability {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nonpayable: typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.nonpayable = this.cast("nonpayable")
  @scala.inline
  def payable: typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.payable = this.cast("payable")
  @scala.inline
  def pure: typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.pure = this.cast("pure")
  @scala.inline
  def view: typingsJapgolly.ethereumProtocol.ethereumProtocolStrings.view = this.cast("view")
}

