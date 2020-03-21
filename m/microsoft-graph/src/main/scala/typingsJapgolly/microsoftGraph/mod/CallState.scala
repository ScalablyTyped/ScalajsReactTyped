package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.incoming
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.establishing
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.established
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.hold
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.transferring
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.transferAccepted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.redirecting
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.terminating
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.terminated
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait CallState extends js.Object

object CallState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def established: typingsJapgolly.microsoftGraph.microsoftGraphStrings.established = this.cast("established")
  @scala.inline
  def establishing: typingsJapgolly.microsoftGraph.microsoftGraphStrings.establishing = this.cast("establishing")
  @scala.inline
  def hold: typingsJapgolly.microsoftGraph.microsoftGraphStrings.hold = this.cast("hold")
  @scala.inline
  def incoming: typingsJapgolly.microsoftGraph.microsoftGraphStrings.incoming = this.cast("incoming")
  @scala.inline
  def redirecting: typingsJapgolly.microsoftGraph.microsoftGraphStrings.redirecting = this.cast("redirecting")
  @scala.inline
  def terminated: typingsJapgolly.microsoftGraph.microsoftGraphStrings.terminated = this.cast("terminated")
  @scala.inline
  def terminating: typingsJapgolly.microsoftGraph.microsoftGraphStrings.terminating = this.cast("terminating")
  @scala.inline
  def transferAccepted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.transferAccepted = this.cast("transferAccepted")
  @scala.inline
  def transferring: typingsJapgolly.microsoftGraph.microsoftGraphStrings.transferring = this.cast("transferring")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

