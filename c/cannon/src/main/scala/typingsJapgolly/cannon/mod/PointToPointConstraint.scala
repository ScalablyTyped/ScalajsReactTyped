package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "PointToPointConstraint")
@js.native
open class PointToPointConstraint protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Constraint {
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    pivotA: typingsJapgolly.cannon.CANNON.Vec3,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    pivotB: typingsJapgolly.cannon.CANNON.Vec3
  ) = this()
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    pivotA: typingsJapgolly.cannon.CANNON.Vec3,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    pivotB: typingsJapgolly.cannon.CANNON.Vec3,
    maxForce: Double
  ) = this()
  
  /* CompleteClass */
  var bodyA: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bodyB: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var collideConnected: Boolean = js.native
  
  /* CompleteClass */
  override def disable(): Unit = js.native
  
  /* CompleteClass */
  override def enable(): Unit = js.native
  
  /* CompleteClass */
  var equations: js.Array[Any] = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
