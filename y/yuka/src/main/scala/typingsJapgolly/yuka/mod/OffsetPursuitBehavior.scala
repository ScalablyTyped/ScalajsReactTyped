package typingsJapgolly.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "OffsetPursuitBehavior")
@js.native
/**
  * Constructs a new offset pursuit behavior.
  *
  * @param [leader] - The leader vehicle.
  * @param [offset] - The offset from the leader.
  */
open class OffsetPursuitBehavior ()
  extends typingsJapgolly.yuka.srcYukaMod.OffsetPursuitBehavior {
  def this(leader: typingsJapgolly.yuka.srcSteeringVehicleMod.Vehicle) = this()
  def this(leader: Unit, offset: typingsJapgolly.yuka.srcMathVector3Mod.Vector3) = this()
  def this(
    leader: typingsJapgolly.yuka.srcSteeringVehicleMod.Vehicle,
    offset: typingsJapgolly.yuka.srcMathVector3Mod.Vector3
  ) = this()
}
