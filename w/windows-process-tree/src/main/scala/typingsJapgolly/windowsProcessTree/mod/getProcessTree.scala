package typingsJapgolly.windowsProcessTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("windows-process-tree", "getProcessTree")
@js.native
object getProcessTree extends js.Object {
  def apply(rootPid: Double, callback: js.Function1[/* tree */ ProcessTreeNode, Unit]): Unit = js.native
  def apply(rootPid: Double, callback: js.Function1[/* tree */ ProcessTreeNode, Unit], flags: ProcessDataFlag): Unit = js.native
}

