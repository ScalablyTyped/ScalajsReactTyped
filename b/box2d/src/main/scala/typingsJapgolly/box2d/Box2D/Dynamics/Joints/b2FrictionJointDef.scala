package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import japgolly.scalajs.react.Callback
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2FrictionJointDef
  extends StObject
     with b2JointDef {
  
  /**
    * Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor World anchor.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit
  
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2
  
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2
  
  /**
    * The maximum force in N.
    **/
  var maxForce: Double
  
  /**
    * The maximum friction torque in N-m.
    **/
  var maxTorque: Double
}
object b2FrictionJointDef {
  
  inline def apply(
    Initialize: (b2Body, b2Body, b2Vec2) => Callback,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    maxForce: Double,
    maxTorque: Double,
    `type`: Double,
    userData: Any
  ): b2FrictionJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction3((t0: b2Body, t1: b2Body, t2: b2Vec2) => (Initialize(t0, t1, t2)).runNow()), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], maxTorque = maxTorque.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FrictionJointDef]
  }
  
  extension [Self <: b2FrictionJointDef](x: Self) {
    
    inline def setInitialize(value: (b2Body, b2Body, b2Vec2) => Callback): Self = StObject.set(x, "Initialize", js.Any.fromFunction3((t0: b2Body, t1: b2Body, t2: b2Vec2) => (value(t0, t1, t2)).runNow()))
    
    inline def setLocalAnchorA(value: b2Vec2): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorB(value: b2Vec2): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    inline def setMaxTorque(value: Double): Self = StObject.set(x, "maxTorque", value.asInstanceOf[js.Any])
  }
}
