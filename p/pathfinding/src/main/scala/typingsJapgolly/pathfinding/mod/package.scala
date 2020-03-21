package typingsJapgolly.pathfinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JumpPointFinder = js.Function1[
    /* opt */ typingsJapgolly.pathfinding.mod.JumpPointFinderOptions, 
    typingsJapgolly.pathfinding.mod.JPFNeverMoveDiagonally | typingsJapgolly.pathfinding.mod.JPFAlwaysMoveDiagonally | typingsJapgolly.pathfinding.mod.JPFMoveDiagonallyIfNoObstacles | typingsJapgolly.pathfinding.mod.JPFMoveDiagonallyIfAtMostOneObstacle
  ]
}
