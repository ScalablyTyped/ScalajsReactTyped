package typingsJapgolly.node.fsMod.symlink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.dir
  - typings.node.nodeStrings.file
  - typings.node.nodeStrings.junction
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dir: typingsJapgolly.node.nodeStrings.dir = this.cast("dir")
  @scala.inline
  def file: typingsJapgolly.node.nodeStrings.file = this.cast("file")
  @scala.inline
  def junction: typingsJapgolly.node.nodeStrings.junction = this.cast("junction")
}

