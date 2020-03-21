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
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`3`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
*/
trait OlBusyStatus extends js.Object

object OlBusyStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olBusy: `2` = this.cast(2)
  @scala.inline
  def olFree: `0` = this.cast(0)
  @scala.inline
  def olOutOfOffice: `3` = this.cast(3)
  @scala.inline
  def olTentative: `1` = this.cast(1)
}

