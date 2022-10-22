package typingsJapgolly.cannon.mod

import typingsJapgolly.cannon.CANNON.ISpringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Spring")
@js.native
open class Spring ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Spring {
  def this(options: ISpringOptions) = this()
  
  /* CompleteClass */
  override def applyForce(): Unit = js.native
  
  /* CompleteClass */
  var bodyA: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bodyB: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var damping: Double = js.native
  
  /* CompleteClass */
  override def getWorldAnchorA(result: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def getWorldAnchorB(result: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  var localAnchorA: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var localAnchorB: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var restLength: Double = js.native
  
  /* CompleteClass */
  override def setWorldAnchorA(worldAnchorA: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def setWorldAnchorB(worldAnchorB: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  var stffness: Double = js.native
}
