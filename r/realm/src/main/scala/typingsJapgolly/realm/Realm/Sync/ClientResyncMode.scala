package typingsJapgolly.realm.Realm.Sync

import typingsJapgolly.realm.realmStrings.discard
import typingsJapgolly.realm.realmStrings.manual
import typingsJapgolly.realm.realmStrings.recover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.realm.realmStrings.discard
  - typingsJapgolly.realm.realmStrings.manual
  - typingsJapgolly.realm.realmStrings.recover
*/
trait ClientResyncMode extends js.Object

object ClientResyncMode {
  @scala.inline
  def Discard: discard = this.cast("discard")
  @scala.inline
  def Manual: manual = this.cast("manual")
  @scala.inline
  def Recover: recover = this.cast("recover")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

