package typingsJapgolly.sharedb.mod.middleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sharedb.sharedbStrings.current
  - typingsJapgolly.sharedb.sharedbStrings.byVersion
  - typingsJapgolly.sharedb.sharedbStrings.byTimestamp
*/
trait SnapshotType extends js.Object

object SnapshotType {
  @scala.inline
  def byTimestamp: typingsJapgolly.sharedb.sharedbStrings.byTimestamp = this.cast("byTimestamp")
  @scala.inline
  def byVersion: typingsJapgolly.sharedb.sharedbStrings.byVersion = this.cast("byVersion")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current: typingsJapgolly.sharedb.sharedbStrings.current = this.cast("current")
}

