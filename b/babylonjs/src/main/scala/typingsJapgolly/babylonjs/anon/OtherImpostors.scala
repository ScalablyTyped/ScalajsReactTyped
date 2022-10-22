package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.PhysicsImpostor
import typingsJapgolly.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherImpostors extends StObject {
  
  def callback(
    collider: PhysicsImpostor,
    collidedAgainst: PhysicsImpostor,
    point: Nullable[Vector3],
    distance: Double,
    impulse: Double,
    normal: Nullable[Vector3]
  ): Unit
  
  var otherImpostors: js.Array[PhysicsImpostor]
}
object OtherImpostors {
  
  inline def apply(
    callback: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3], Double, Double, Nullable[Vector3]) => japgolly.scalajs.react.Callback,
    otherImpostors: js.Array[PhysicsImpostor]
  ): OtherImpostors = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction6((t0: PhysicsImpostor, t1: PhysicsImpostor, t2: Nullable[Vector3], t3: Double, t4: Double, t5: Nullable[Vector3]) => (callback(t0, t1, t2, t3, t4, t5)).runNow()), otherImpostors = otherImpostors.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherImpostors]
  }
  
  extension [Self <: OtherImpostors](x: Self) {
    
    inline def setCallback(
      value: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3], Double, Double, Nullable[Vector3]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "callback", js.Any.fromFunction6((t0: PhysicsImpostor, t1: PhysicsImpostor, t2: Nullable[Vector3], t3: Double, t4: Double, t5: Nullable[Vector3]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setOtherImpostors(value: js.Array[PhysicsImpostor]): Self = StObject.set(x, "otherImpostors", value.asInstanceOf[js.Any])
    
    inline def setOtherImpostorsVarargs(value: PhysicsImpostor*): Self = StObject.set(x, "otherImpostors", js.Array(value*))
  }
}
