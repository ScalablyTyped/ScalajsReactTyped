package typingsJapgolly.fsTreeDiff.mod

import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-tree-diff", "FSTreeEntry")
@js.native
class FSTreeEntry () extends Entry {
  /* CompleteClass */
  override var mode: Double = js.native
  /* CompleteClass */
  override var mtime: js.Date = js.native
  /* CompleteClass */
  override var relativePath: String = js.native
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def isDirectory(): Boolean = js.native
  def isFile(): Boolean = js.native
}

/* static members */
@JSImport("fs-tree-diff", "FSTreeEntry")
@js.native
object FSTreeEntry extends js.Object {
  def fromStat(relativePath: String, stat: Stats): Entry = js.native
}

