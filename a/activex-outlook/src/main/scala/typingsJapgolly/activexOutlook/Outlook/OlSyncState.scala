package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
*/
trait OlSyncState extends js.Object

object OlSyncState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olSyncStarted: `1` = this.cast(1)
  @scala.inline
  def olSyncStopped: `0` = this.cast(0)
}

