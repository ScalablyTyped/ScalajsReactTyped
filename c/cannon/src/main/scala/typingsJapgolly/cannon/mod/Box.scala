package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Box")
@js.native
open class Box protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Box {
  def this(halfExtents: typingsJapgolly.cannon.CANNON.Vec3) = this()
  
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
/* static members */
object Box {
  
  @JSImport("cannon", "Box")
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateInertia(
    halfExtents: typingsJapgolly.cannon.CANNON.Vec3,
    mass: Double,
    target: typingsJapgolly.cannon.CANNON.Vec3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInertia")(halfExtents.asInstanceOf[js.Any], mass.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
