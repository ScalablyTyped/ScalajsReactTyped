package typingsJapgolly.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing:
  * path - An array of RoomPosition objects.
  * ops - Total number of operations performed before this path was calculated.
  * cost - The total cost of the path as derived from `plainCost`, `swampCost` and any given CostMatrix instances.
  * incomplete - If the pathfinder fails to find a complete path, this will be true.
  *   Note that `path` will still be populated with a partial path which represents the closest path it could find given the search parameters.
  */
trait PathFinderPath extends js.Object {
  /**
    * The total cost of the path as derived from `plainCost`, `swampCost` and any given CostMatrix instances.
    */
  var cost: Double
  /**
    * If the pathfinder fails to find a complete path, this will be true.
    *
    * Note that `path` will still be populated with a partial path which represents the closest path it could find given the search parameters.
    */
  var incomplete: Boolean
  /**
    * Total number of operations performed before this path was calculated.
    */
  var ops: Double
  /**
    * An array of RoomPosition objects.
    */
  var path: js.Array[RoomPosition]
}

object PathFinderPath {
  @scala.inline
  def apply(cost: Double, incomplete: Boolean, ops: Double, path: js.Array[RoomPosition]): PathFinderPath = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathFinderPath]
  }
}

