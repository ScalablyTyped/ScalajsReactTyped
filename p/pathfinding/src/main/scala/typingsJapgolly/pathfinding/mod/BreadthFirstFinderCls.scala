package typingsJapgolly.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "BreadthFirstFinder")
@js.native
class BreadthFirstFinderCls () extends BreadthFirstFinder {
  def this(opt: BiBreadthFirstFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}

