package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "RaycastResult")
@js.native
open class RaycastResult ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.RaycastResult {
  
  /* CompleteClass */
  var body: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var distance: Double = js.native
  
  /* CompleteClass */
  var hasHit: Boolean = js.native
  
  /* CompleteClass */
  var hitNormalWorld: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var hitPointWorld: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var rayFromWorld: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var rayToWorld: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def set(
    rayFromWorld: typingsJapgolly.cannon.CANNON.Vec3,
    rayToWorld: typingsJapgolly.cannon.CANNON.Vec3,
    hitNormalWorld: typingsJapgolly.cannon.CANNON.Vec3,
    hitPointWorld: typingsJapgolly.cannon.CANNON.Vec3,
    shape: typingsJapgolly.cannon.CANNON.Shape,
    body: typingsJapgolly.cannon.CANNON.Body,
    distance: Double
  ): Unit = js.native
  
  /* CompleteClass */
  var shape: typingsJapgolly.cannon.CANNON.Shape = js.native
}
