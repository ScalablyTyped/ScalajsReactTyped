package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined screeps.FindPathOpts & {  filter ? :any | string,   algorithm ? :string} */
trait FindPathOptsfilteranystri extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as obstacles during the search. This option cannot
    * be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var avoid: js.UndefOr[js.Array[_ | RoomPosition]] = js.undefined
  /**
    * You can use this callback to modify a CostMatrix for any room during the search. The callback accepts two arguments, roomName
    * and costMatrix. Use the costMatrix instance to make changes to the positions costs. If you return a new matrix from this callback,
    * it will be used instead of the built-in cached one. This option is only used when the new PathFinder is enabled.
    *
    * @param roomName The name of the room.
    * @param costMatrix The current CostMatrix
    * @returns The new CostMatrix to use
    */
  var costCallback: js.UndefOr[
    js.Function2[/* roomName */ String, /* costMatrix */ CostMatrix, Boolean | CostMatrix]
  ] = js.undefined
  var filter: js.UndefOr[js.Any | String] = js.undefined
  /**
    * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand the underlying
    * A* algorithm mechanics! The default value is 1.2.
    */
  var heuristicWeight: js.UndefOr[Double] = js.undefined
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as walkable tiles during the search. This option
    * cannot be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var ignore: js.UndefOr[js.Array[_ | RoomPosition]] = js.undefined
  /**
    * Treat squares with creeps as walkable. Can be useful with too many moving creeps around or in some other cases. The default
    * value is false.
    */
  var ignoreCreeps: js.UndefOr[Boolean] = js.undefined
  /**
    * Treat squares with destructible structures (constructed walls, ramparts, spawns, extensions) as walkable. Use this flag when
    * you need to move through a territory blocked by hostile structures. If a creep with an ATTACK body part steps on such a square,
    * it automatically attacks the structure. The default value is false.
    */
  var ignoreDestructibleStructures: js.UndefOr[Boolean] = js.undefined
  /**
    * Ignore road structures. Enabling this option can speed up the search. The default value is false. This is only used when the
    * new PathFinder is enabled.
    */
  var ignoreRoads: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum limit of possible pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU.
    * The default value is 2000.
    */
  var maxOps: js.UndefOr[Double] = js.undefined
  /**
    * The maximum allowed rooms to search. The default (and maximum) is 16. This is only used when the new PathFinder is enabled.
    */
  var maxRooms: js.UndefOr[Double] = js.undefined
  /**
    * Cost for walking on plain positions. The default is 1.
    */
  var plainCost: js.UndefOr[Double] = js.undefined
  /**
    * Path to within (range) tiles of target tile. The default is to path to the tile that the target is on (0).
    */
  var range: js.UndefOr[Double] = js.undefined
  /**
    * If true, the result path will be serialized using Room.serializePath. The default is false.
    */
  var serialize: js.UndefOr[Boolean] = js.undefined
  /**
    * Cost for walking on swamp positions. The default is 5.
    */
  var swampCost: js.UndefOr[Double] = js.undefined
}

object FindPathOptsfilteranystri {
  @scala.inline
  def apply(
    algorithm: String = null,
    avoid: js.Array[_ | RoomPosition] = null,
    costCallback: (/* roomName */ String, /* costMatrix */ CostMatrix) => CallbackTo[Boolean | CostMatrix] = null,
    filter: js.Any | String = null,
    heuristicWeight: Int | Double = null,
    ignore: js.Array[_ | RoomPosition] = null,
    ignoreCreeps: js.UndefOr[Boolean] = js.undefined,
    ignoreDestructibleStructures: js.UndefOr[Boolean] = js.undefined,
    ignoreRoads: js.UndefOr[Boolean] = js.undefined,
    maxOps: Int | Double = null,
    maxRooms: Int | Double = null,
    plainCost: Int | Double = null,
    range: Int | Double = null,
    serialize: js.UndefOr[Boolean] = js.undefined,
    swampCost: Int | Double = null
  ): FindPathOptsfilteranystri = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (avoid != null) __obj.updateDynamic("avoid")(avoid.asInstanceOf[js.Any])
    if (costCallback != null) __obj.updateDynamic("costCallback")(js.Any.fromFunction2((t0: /* roomName */ java.lang.String, t1: /* costMatrix */ typingsJapgolly.screeps.CostMatrix) => costCallback(t0, t1).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (heuristicWeight != null) __obj.updateDynamic("heuristicWeight")(heuristicWeight.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCreeps)) __obj.updateDynamic("ignoreCreeps")(ignoreCreeps.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDestructibleStructures)) __obj.updateDynamic("ignoreDestructibleStructures")(ignoreDestructibleStructures.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreRoads)) __obj.updateDynamic("ignoreRoads")(ignoreRoads.asInstanceOf[js.Any])
    if (maxOps != null) __obj.updateDynamic("maxOps")(maxOps.asInstanceOf[js.Any])
    if (maxRooms != null) __obj.updateDynamic("maxRooms")(maxRooms.asInstanceOf[js.Any])
    if (plainCost != null) __obj.updateDynamic("plainCost")(plainCost.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(serialize)) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (swampCost != null) __obj.updateDynamic("swampCost")(swampCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPathOptsfilteranystri]
  }
}

