package typingsJapgolly.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "BiBestFirstFinder")
@js.native
class BiBestFirstFinderCls () extends BiBestFirstFinder {
  def this(opt: JumpPointFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}

