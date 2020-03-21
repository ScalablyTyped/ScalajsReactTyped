package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`2`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`3`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`2`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`4`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`3`
*/
trait OlTaskStatus extends js.Object

object OlTaskStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olTaskComplete: `2` = this.cast(2)
  @scala.inline
  def olTaskDeferred: `4` = this.cast(4)
  @scala.inline
  def olTaskInProgress: `1` = this.cast(1)
  @scala.inline
  def olTaskNotStarted: `0` = this.cast(0)
  @scala.inline
  def olTaskWaiting: `3` = this.cast(3)
}

