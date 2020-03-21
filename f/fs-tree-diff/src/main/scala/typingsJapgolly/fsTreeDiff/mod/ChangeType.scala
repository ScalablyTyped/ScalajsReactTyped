package typingsJapgolly.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.unlink
  - typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.rmdir
  - typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.mkdir
  - typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.create
  - typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.change
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.change = this.cast("change")
  @scala.inline
  def create: typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.create = this.cast("create")
  @scala.inline
  def mkdir: typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.mkdir = this.cast("mkdir")
  @scala.inline
  def rmdir: typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.rmdir = this.cast("rmdir")
  @scala.inline
  def unlink: typingsJapgolly.fsTreeDiff.fsTreeDiffStrings.unlink = this.cast("unlink")
}

