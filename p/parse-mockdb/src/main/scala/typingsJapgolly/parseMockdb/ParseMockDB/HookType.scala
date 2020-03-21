package typingsJapgolly.parseMockdb.ParseMockDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parseMockdb.parseMockdbStrings.beforeSave
  - typingsJapgolly.parseMockdb.parseMockdbStrings.beforeDelete
*/
trait HookType extends js.Object

object HookType {
  @scala.inline
  def beforeDelete: typingsJapgolly.parseMockdb.parseMockdbStrings.beforeDelete = this.cast("beforeDelete")
  @scala.inline
  def beforeSave: typingsJapgolly.parseMockdb.parseMockdbStrings.beforeSave = this.cast("beforeSave")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

