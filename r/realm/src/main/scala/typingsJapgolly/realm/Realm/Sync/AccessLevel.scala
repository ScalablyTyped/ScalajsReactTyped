package typingsJapgolly.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.realm.realmStrings.none
  - typingsJapgolly.realm.realmStrings.read
  - typingsJapgolly.realm.realmStrings.write
  - typingsJapgolly.realm.realmStrings.admin
*/
trait AccessLevel extends js.Object

object AccessLevel {
  @scala.inline
  def admin: typingsJapgolly.realm.realmStrings.admin = this.cast("admin")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.realm.realmStrings.none = this.cast("none")
  @scala.inline
  def read: typingsJapgolly.realm.realmStrings.read = this.cast("read")
  @scala.inline
  def write: typingsJapgolly.realm.realmStrings.write = this.cast("write")
}

