package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import japgolly.scalajs.react.Callback
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2PulleyJointDef
  extends StObject
     with b2JointDef {
  
  /**
    * Initialize the bodies, anchors, and length using the world anchors.
    * @param bA Body A.
    * @param bB Body B.
    * @param gaA Ground anchor A.
    * @param gaB Ground anchor B.
    * @param anchorA Anchor A.
    * @param anchorB Anchor B.
    **/
  def Initialize(bA: b2Body, bB: b2Body, gaA: b2Vec2, gaB: b2Vec2, anchorA: b2Vec2, anchorB: b2Vec2): Unit
  
  /**
    * The first ground anchor in world coordinates. This point never moves.
    **/
  var groundAnchorA: b2Vec2
  
  /**
    * The second ground anchor in world coordinates. This point never moves.
    **/
  var groundAnchorB: b2Vec2
  
  /**
    * The a reference length for the segment attached to bodyA.
    **/
  var lengthA: Double
  
  /**
    * The a reference length for the segment attached to bodyB.
    **/
  var lengthB: Double
  
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2
  
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2
  
  /**
    * The maximum length of the segment attached to bodyA.
    **/
  var maxLengthA: Double
  
  /**
    * The maximum length of the segment attached to bodyB.
    **/
  var maxLengthB: Double
  
  /**
    * The pulley ratio, used to simulate a block-and-tackle.
    **/
  var ratio: Double
}
object b2PulleyJointDef {
  
  inline def apply(
    Initialize: (b2Body, b2Body, b2Vec2, b2Vec2, b2Vec2, b2Vec2) => Callback,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    groundAnchorA: b2Vec2,
    groundAnchorB: b2Vec2,
    lengthA: Double,
    lengthB: Double,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    maxLengthA: Double,
    maxLengthB: Double,
    ratio: Double,
    `type`: Double,
    userData: Any
  ): b2PulleyJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction6((t0: b2Body, t1: b2Body, t2: b2Vec2, t3: b2Vec2, t4: b2Vec2, t5: b2Vec2) => (Initialize(t0, t1, t2, t3, t4, t5)).runNow()), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], groundAnchorA = groundAnchorA.asInstanceOf[js.Any], groundAnchorB = groundAnchorB.asInstanceOf[js.Any], lengthA = lengthA.asInstanceOf[js.Any], lengthB = lengthB.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], maxLengthA = maxLengthA.asInstanceOf[js.Any], maxLengthB = maxLengthB.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2PulleyJointDef]
  }
  
  extension [Self <: b2PulleyJointDef](x: Self) {
    
    inline def setGroundAnchorA(value: b2Vec2): Self = StObject.set(x, "groundAnchorA", value.asInstanceOf[js.Any])
    
    inline def setGroundAnchorB(value: b2Vec2): Self = StObject.set(x, "groundAnchorB", value.asInstanceOf[js.Any])
    
    inline def setInitialize(value: (b2Body, b2Body, b2Vec2, b2Vec2, b2Vec2, b2Vec2) => Callback): Self = StObject.set(x, "Initialize", js.Any.fromFunction6((t0: b2Body, t1: b2Body, t2: b2Vec2, t3: b2Vec2, t4: b2Vec2, t5: b2Vec2) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setLengthA(value: Double): Self = StObject.set(x, "lengthA", value.asInstanceOf[js.Any])
    
    inline def setLengthB(value: Double): Self = StObject.set(x, "lengthB", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorA(value: b2Vec2): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorB(value: b2Vec2): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthA(value: Double): Self = StObject.set(x, "maxLengthA", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthB(value: Double): Self = StObject.set(x, "maxLengthB", value.asInstanceOf[js.Any])
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
  }
}
