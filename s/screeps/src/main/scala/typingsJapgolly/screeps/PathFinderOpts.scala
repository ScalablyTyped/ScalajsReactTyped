package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing additional pathfinding flags.
  */
trait PathFinderOpts extends js.Object {
  /**
    * Instead of searching for a path to the goals this will search for a path away from the goals.
    * The cheapest path that is out of range of every goal will be returned. The default is false.
    */
  var flee: js.UndefOr[Boolean] = js.undefined
  /**
    * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand
    * the underlying A* algorithm mechanics! The default value is 1.
    */
  var heuristicWeight: js.UndefOr[Double] = js.undefined
  /**
    * The maximum allowed cost of the path returned. If at any point the pathfinder detects that it is impossible to find
    * a path with a cost less than or equal to maxCost it will immediately halt the search. The default is Infinity.
    */
  var maxCost: js.UndefOr[Double] = js.undefined
  /**
    * The maximum allowed pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU. The default value is 2000.
    */
  var maxOps: js.UndefOr[Double] = js.undefined
  /**
    * The maximum allowed rooms to search. The default (and maximum) is 16.
    */
  var maxRooms: js.UndefOr[Double] = js.undefined
  /**
    * Cost for walking on plain positions. The default is 1.
    */
  var plainCost: js.UndefOr[Double] = js.undefined
  /**
    * Request from the pathfinder to generate a CostMatrix for a certain room. The callback accepts one argument, roomName.
    * This callback will only be called once per room per search. If you are running multiple pathfinding operations in a
    * single room and in a single tick you may consider caching your CostMatrix to speed up your code. Please read the
    * CostMatrix documentation below for more information on CostMatrix.
    *
    * @param roomName The name of the room the pathfinder needs a cost matrix for.
    */
  var roomCallback: js.UndefOr[js.Function1[/* roomName */ String, Boolean | CostMatrix]] = js.undefined
  /**
    * Cost for walking on swamp positions. The default is 5.
    */
  var swampCost: js.UndefOr[Double] = js.undefined
}

object PathFinderOpts {
  @scala.inline
  def apply(
    flee: js.UndefOr[Boolean] = js.undefined,
    heuristicWeight: Int | Double = null,
    maxCost: Int | Double = null,
    maxOps: Int | Double = null,
    maxRooms: Int | Double = null,
    plainCost: Int | Double = null,
    roomCallback: /* roomName */ String => CallbackTo[Boolean | CostMatrix] = null,
    swampCost: Int | Double = null
  ): PathFinderOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flee)) __obj.updateDynamic("flee")(flee.asInstanceOf[js.Any])
    if (heuristicWeight != null) __obj.updateDynamic("heuristicWeight")(heuristicWeight.asInstanceOf[js.Any])
    if (maxCost != null) __obj.updateDynamic("maxCost")(maxCost.asInstanceOf[js.Any])
    if (maxOps != null) __obj.updateDynamic("maxOps")(maxOps.asInstanceOf[js.Any])
    if (maxRooms != null) __obj.updateDynamic("maxRooms")(maxRooms.asInstanceOf[js.Any])
    if (plainCost != null) __obj.updateDynamic("plainCost")(plainCost.asInstanceOf[js.Any])
    if (roomCallback != null) __obj.updateDynamic("roomCallback")(js.Any.fromFunction1((t0: /* roomName */ java.lang.String) => roomCallback(t0).runNow()))
    if (swampCost != null) __obj.updateDynamic("swampCost")(swampCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathFinderOpts]
  }
}

