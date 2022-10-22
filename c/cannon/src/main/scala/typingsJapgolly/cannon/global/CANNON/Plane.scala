package typingsJapgolly.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Plane")
@js.native
open class Plane ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Plane {
  
  /* CompleteClass */
  var boundingSphereRadius: Double = js.native
  
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typingsJapgolly.cannon.CANNON.Vec3): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def calculateWorldAABB(
    pos: typingsJapgolly.cannon.CANNON.Vec3,
    quat: typingsJapgolly.cannon.CANNON.Quaternion,
    min: Double,
    max: Double
  ): Unit = js.native
  
  /* CompleteClass */
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  override def computeWorldNormal(quat: typingsJapgolly.cannon.CANNON.Quaternion): Unit = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
  
  /* CompleteClass */
  var worldNormal: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var worldNormalNeedsUpdate: Boolean = js.native
}
