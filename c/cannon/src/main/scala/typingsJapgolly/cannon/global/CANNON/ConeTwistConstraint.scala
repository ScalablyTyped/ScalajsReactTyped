package typingsJapgolly.cannon.global.CANNON

import typingsJapgolly.cannon.CANNON.IConeTwistConstraintOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.ConeTwistConstraint")
@js.native
open class ConeTwistConstraint protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Constraint {
  def this(bodyA: typingsJapgolly.cannon.CANNON.Body, bodyB: typingsJapgolly.cannon.CANNON.Body) = this()
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    options: IConeTwistConstraintOptions
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
