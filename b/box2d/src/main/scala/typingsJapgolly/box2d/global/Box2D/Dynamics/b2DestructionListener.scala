package typingsJapgolly.box2d.global.Box2D.Dynamics

import typingsJapgolly.box2d.Box2D.Dynamics.Joints.b2Joint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2DestructionListener")
@js.native
open class b2DestructionListener ()
  extends StObject
     with typingsJapgolly.box2d.Box2D.Dynamics.b2DestructionListener {
  
  /**
    * Called when any fixture is about to be destroyed due to the destruction of its parent body.
    * @param fixture b2Fixture being destroyed.
    **/
  /* CompleteClass */
  override def SayGoodbyeFixture(fixture: typingsJapgolly.box2d.Box2D.Dynamics.b2Fixture): Unit = js.native
  
  /**
    * Called when any joint is about to be destroyed due to the destruction of one of its attached bodies.
    * @param joint b2Joint being destroyed.
    **/
  /* CompleteClass */
  override def SayGoodbyeJoint(joint: b2Joint): Unit = js.native
}
