package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.interactive
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.remoteInteractive
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.network
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.batch
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.service
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait LogonType extends js.Object

object LogonType {
  @scala.inline
  def batch: typingsJapgolly.microsoftGraph.microsoftGraphStrings.batch = this.cast("batch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def interactive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.interactive = this.cast("interactive")
  @scala.inline
  def network: typingsJapgolly.microsoftGraph.microsoftGraphStrings.network = this.cast("network")
  @scala.inline
  def remoteInteractive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.remoteInteractive = this.cast("remoteInteractive")
  @scala.inline
  def service: typingsJapgolly.microsoftGraph.microsoftGraphStrings.service = this.cast("service")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

