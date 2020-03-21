package typingsJapgolly.realm.Realm.Sync

import typingsJapgolly.realm.realmStrings.downloadBeforeOpen
import typingsJapgolly.realm.realmStrings.openImmediately
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.realm.realmStrings.downloadBeforeOpen
  - typingsJapgolly.realm.realmStrings.openImmediately
*/
trait OpenRealmBehaviorType extends js.Object

object OpenRealmBehaviorType {
  @scala.inline
  def DownloadBeforeOpen: downloadBeforeOpen = this.cast("downloadBeforeOpen")
  @scala.inline
  def OpenImmediately: openImmediately = this.cast("openImmediately")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

