package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Particle")
@js.native
open class Particle ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Shape {
  
  /* CompleteClass */
  var boundingSphereRadius: Double = js.native
  
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typingsJapgolly.cannon.CANNON.Vec3): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
}
