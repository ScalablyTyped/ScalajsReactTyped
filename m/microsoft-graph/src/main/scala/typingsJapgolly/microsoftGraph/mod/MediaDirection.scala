package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.inactive
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.sendOnly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.receiveOnly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.sendReceive
*/
trait MediaDirection extends js.Object

object MediaDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.inactive = this.cast("inactive")
  @scala.inline
  def receiveOnly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.receiveOnly = this.cast("receiveOnly")
  @scala.inline
  def sendOnly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.sendOnly = this.cast("sendOnly")
  @scala.inline
  def sendReceive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.sendReceive = this.cast("sendReceive")
}

