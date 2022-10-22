package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "SPHSystem")
@js.native
open class SPHSystem ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.SPHSystem {
  
  /* CompleteClass */
  override def add(particle: typingsJapgolly.cannon.CANNON.Particle): Unit = js.native
  
  /* CompleteClass */
  var densities: js.Array[Double] = js.native
  
  /* CompleteClass */
  var density: Double = js.native
  
  /* CompleteClass */
  var eps: Double = js.native
  
  /* CompleteClass */
  override def getNeighbors(
    particle: typingsJapgolly.cannon.CANNON.Particle,
    neighbors: js.Array[typingsJapgolly.cannon.CANNON.Particle]
  ): Unit = js.native
  
  /* CompleteClass */
  override def gradw(rVec: typingsJapgolly.cannon.CANNON.Vec3, resultVec: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def nablaw(r: Double): Double = js.native
  
  /* CompleteClass */
  var neighbors: js.Array[Double] = js.native
  
  /* CompleteClass */
  var particles: js.Array[typingsJapgolly.cannon.CANNON.Particle] = js.native
  
  /* CompleteClass */
  var pressures: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def remove(particle: typingsJapgolly.cannon.CANNON.Particle): Unit = js.native
  
  /* CompleteClass */
  var smoothingRadius: Double = js.native
  
  /* CompleteClass */
  var speedOfSound: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  var viscosity: Double = js.native
  
  /* CompleteClass */
  override def w(r: Double): Double = js.native
}
