package typingsJapgolly.yuka

import typingsJapgolly.yuka.srcCoreMovingEntityMod.MovingEntity
import typingsJapgolly.yuka.srcMathVector3Mod.Vector3
import typingsJapgolly.yuka.srcSteeringSteeringBehaviorMod.SteeringBehavior
import typingsJapgolly.yuka.srcSteeringVehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSteeringBehaviorsPursuitBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/PursuitBehavior", "PursuitBehavior")
  @js.native
  /**
    * Constructs a new pursuit behavior.
    *
    * @param [evader] - The agent to pursue.
    * @param [predictionFactor] - This factor determines how far the vehicle predicts the movement of the evader.
    */
  open class PursuitBehavior () extends SteeringBehavior {
    def this(evader: MovingEntity) = this()
    def this(evader: Null, predictionFactor: Double) = this()
    def this(evader: Unit, predictionFactor: Double) = this()
    def this(evader: MovingEntity, predictionFactor: Double) = this()
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
    
    /**
      * The agent to pursue.
      * @default null
      */
    var evader: MovingEntity | Null = js.native
    
    /**
      * This factor determines how far the vehicle predicts the movement of the evader.
      * @default 1
      */
    var predictionFactor: Double = js.native
  }
}
