package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`2`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`3`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`4`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`5`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`6`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`2`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`3`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`6`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`4`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`5`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`7`
*/
trait OlTrackingStatus extends js.Object

object OlTrackingStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olTrackingDelivered: `1` = this.cast(1)
  @scala.inline
  def olTrackingNone: `0` = this.cast(0)
  @scala.inline
  def olTrackingNotDelivered: `2` = this.cast(2)
  @scala.inline
  def olTrackingNotRead: `3` = this.cast(3)
  @scala.inline
  def olTrackingRead: `6` = this.cast(6)
  @scala.inline
  def olTrackingRecallFailure: `4` = this.cast(4)
  @scala.inline
  def olTrackingRecallSuccess: `5` = this.cast(5)
  @scala.inline
  def olTrackingReplied: `7` = this.cast(7)
}

