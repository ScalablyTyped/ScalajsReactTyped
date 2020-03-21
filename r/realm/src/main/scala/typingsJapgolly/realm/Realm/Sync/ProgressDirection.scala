package typingsJapgolly.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.realm.realmStrings.download
  - typingsJapgolly.realm.realmStrings.upload
*/
trait ProgressDirection extends js.Object

object ProgressDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def download: typingsJapgolly.realm.realmStrings.download = this.cast("download")
  @scala.inline
  def upload: typingsJapgolly.realm.realmStrings.upload = this.cast("upload")
}

