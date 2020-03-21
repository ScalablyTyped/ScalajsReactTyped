package typingsJapgolly.ecol.collectionEventMod.CollectionEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ecol.ecolStrings.insert
  - typingsJapgolly.ecol.ecolStrings.erase
  - typingsJapgolly.ecol.ecolStrings.refresh
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def erase: typingsJapgolly.ecol.ecolStrings.erase = this.cast("erase")
  @scala.inline
  def insert: typingsJapgolly.ecol.ecolStrings.insert = this.cast("insert")
  @scala.inline
  def refresh: typingsJapgolly.ecol.ecolStrings.refresh = this.cast("refresh")
}

