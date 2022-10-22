package typingsJapgolly.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.EvadeBehavior")
@js.native
/**
  * Constructs a new evade behavior.
  *
  * @param [pursuer] - The agent to evade from.
  * @param [panicDistance] - The agent only flees from the pursuer if it is inside this radius.
  * @param [predictionFactor] - This factor determines how far the vehicle predicts the movement of the pursuer.
  */
open class EvadeBehavior ()
  extends typingsJapgolly.yuka.mod.EvadeBehavior {
  def this(pursuer: typingsJapgolly.yuka.srcCoreMovingEntityMod.MovingEntity) = this()
  def this(pursuer: Unit, panicDistance: Double) = this()
  def this(pursuer: typingsJapgolly.yuka.srcCoreMovingEntityMod.MovingEntity, panicDistance: Double) = this()
  def this(pursuer: Unit, panicDistance: Double, predictionFactor: Double) = this()
  def this(pursuer: Unit, panicDistance: Unit, predictionFactor: Double) = this()
  def this(
    pursuer: typingsJapgolly.yuka.srcCoreMovingEntityMod.MovingEntity,
    panicDistance: Double,
    predictionFactor: Double
  ) = this()
  def this(
    pursuer: typingsJapgolly.yuka.srcCoreMovingEntityMod.MovingEntity,
    panicDistance: Unit,
    predictionFactor: Double
  ) = this()
}
