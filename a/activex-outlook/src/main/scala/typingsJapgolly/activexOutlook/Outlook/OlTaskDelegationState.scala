package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`2`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`2`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`3`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
*/
trait OlTaskDelegationState extends js.Object

object OlTaskDelegationState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olTaskDelegationAccepted: `2` = this.cast(2)
  @scala.inline
  def olTaskDelegationDeclined: `3` = this.cast(3)
  @scala.inline
  def olTaskDelegationUnknown: `1` = this.cast(1)
  @scala.inline
  def olTaskNotDelegated: `0` = this.cast(0)
}

