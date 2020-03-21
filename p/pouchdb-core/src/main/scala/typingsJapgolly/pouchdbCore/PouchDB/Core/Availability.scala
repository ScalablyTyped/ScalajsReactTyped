package typingsJapgolly.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pouchdbCore.pouchdbCoreStrings.available
  - typingsJapgolly.pouchdbCore.pouchdbCoreStrings.compacted
  - typingsJapgolly.pouchdbCore.pouchdbCoreStrings.`not compacted`
  - typingsJapgolly.pouchdbCore.pouchdbCoreStrings.missing
*/
trait Availability extends js.Object

object Availability {
  @scala.inline
  def available: typingsJapgolly.pouchdbCore.pouchdbCoreStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compacted: typingsJapgolly.pouchdbCore.pouchdbCoreStrings.compacted = this.cast("compacted")
  @scala.inline
  def missing: typingsJapgolly.pouchdbCore.pouchdbCoreStrings.missing = this.cast("missing")
  @scala.inline
  def `not compacted`: typingsJapgolly.pouchdbCore.pouchdbCoreStrings.`not compacted` = this.cast("not compacted")
}

