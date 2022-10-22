package typingsJapgolly.yuka

import typingsJapgolly.yuka.srcMathVector3Mod.Vector3
import typingsJapgolly.yuka.srcSteeringSteeringBehaviorMod.SteeringBehavior
import typingsJapgolly.yuka.srcSteeringVehicleMod.Vehicle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSteeringBehaviorsSeekBehaviorMod {
  
  @JSImport("yuka/src/steering/behaviors/SeekBehavior", "SeekBehavior")
  @js.native
  /**
    * Constructs a new seek behavior.
    *
    * @param [target] - The target vector.
    */
  open class SeekBehavior () extends SteeringBehavior {
    def this(target: Vector3) = this()
    
    /**
      * Calculates the steering force for a single simulation step.
      *
      * @param vehicle - The game entity the force is produced for.
      * @param force - The force/result vector.
      * @return The force/result vector.
      */
    def calculate(vehicle: Vehicle, force: Vector3): Vector3 = js.native
    
    /**
      * The target vector.
      */
    var target: Vector3 = js.native
  }
}
