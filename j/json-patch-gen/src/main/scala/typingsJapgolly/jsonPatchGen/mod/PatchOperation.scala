package typingsJapgolly.jsonPatchGen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.replace
  - typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.add
  - typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.remove
*/
trait PatchOperation extends js.Object

object PatchOperation {
  @scala.inline
  def add: typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def remove: typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.remove = this.cast("remove")
  @scala.inline
  def replace: typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.replace = this.cast("replace")
}

