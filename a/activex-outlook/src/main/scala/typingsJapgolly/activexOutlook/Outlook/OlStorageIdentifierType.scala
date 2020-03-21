package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
import typingsJapgolly.activexOutlook.activexOutlookNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`1`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`2`
  - typingsJapgolly.activexOutlook.activexOutlookNumbers.`0`
*/
trait OlStorageIdentifierType extends js.Object

object OlStorageIdentifierType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olIdentifyByEntryID: `1` = this.cast(1)
  @scala.inline
  def olIdentifyByMessageClass: `2` = this.cast(2)
  @scala.inline
  def olIdentifyBySubject: `0` = this.cast(0)
}

