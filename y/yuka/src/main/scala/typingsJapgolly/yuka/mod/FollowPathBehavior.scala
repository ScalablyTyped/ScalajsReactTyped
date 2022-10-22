package typingsJapgolly.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "FollowPathBehavior")
@js.native
/**
  * Constructs a new follow path behavior.
  *
  * @param [path] - The path to follow.
  * @param [nextWaypointDistance] - The distance the agent seeks for the next waypoint.
  */
open class FollowPathBehavior ()
  extends typingsJapgolly.yuka.srcYukaMod.FollowPathBehavior {
  def this(path: typingsJapgolly.yuka.srcSteeringPathMod.Path) = this()
  def this(path: Unit, nextWaypointDistance: Double) = this()
  def this(path: typingsJapgolly.yuka.srcSteeringPathMod.Path, nextWaypointDistance: Double) = this()
}
