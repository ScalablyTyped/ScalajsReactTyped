package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2PulleyJoint
  extends StObject
     with b2Joint {
  
  /**
    * Get the first ground anchor.
    **/
  def GetGroundAnchorA(): b2Vec2
  
  /**
    * Get the second ground anchor.
    **/
  def GetGroundAnchorB(): b2Vec2
  
  /**
    * Get the current length of the segment attached to body1.
    **/
  def GetLength1(): Double
  
  /**
    * Get the current length of the segment attached to body2.
    **/
  def GetLength2(): Double
  
  /**
    * Get the pulley ratio.
    **/
  def GetRatio(): Double
}
object b2PulleyJoint {
  
  inline def apply(
    GetAnchorA: CallbackTo[b2Vec2],
    GetAnchorB: CallbackTo[b2Vec2],
    GetBodyA: CallbackTo[b2Body],
    GetBodyB: CallbackTo[b2Body],
    GetGroundAnchorA: CallbackTo[b2Vec2],
    GetGroundAnchorB: CallbackTo[b2Vec2],
    GetLength1: CallbackTo[Double],
    GetLength2: CallbackTo[Double],
    GetNext: CallbackTo[b2Joint],
    GetRatio: CallbackTo[Double],
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: CallbackTo[Double],
    GetUserData: CallbackTo[Any],
    IsActive: CallbackTo[Boolean],
    SetUserData: Any => Callback
  ): b2PulleyJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = GetAnchorA.toJsFn, GetAnchorB = GetAnchorB.toJsFn, GetBodyA = GetBodyA.toJsFn, GetBodyB = GetBodyB.toJsFn, GetGroundAnchorA = GetGroundAnchorA.toJsFn, GetGroundAnchorB = GetGroundAnchorB.toJsFn, GetLength1 = GetLength1.toJsFn, GetLength2 = GetLength2.toJsFn, GetNext = GetNext.toJsFn, GetRatio = GetRatio.toJsFn, GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = GetType.toJsFn, GetUserData = GetUserData.toJsFn, IsActive = IsActive.toJsFn, SetUserData = js.Any.fromFunction1((t0: Any) => SetUserData(t0).runNow()))
    __obj.asInstanceOf[b2PulleyJoint]
  }
  
  extension [Self <: b2PulleyJoint](x: Self) {
    
    inline def setGetGroundAnchorA(value: CallbackTo[b2Vec2]): Self = StObject.set(x, "GetGroundAnchorA", value.toJsFn)
    
    inline def setGetGroundAnchorB(value: CallbackTo[b2Vec2]): Self = StObject.set(x, "GetGroundAnchorB", value.toJsFn)
    
    inline def setGetLength1(value: CallbackTo[Double]): Self = StObject.set(x, "GetLength1", value.toJsFn)
    
    inline def setGetLength2(value: CallbackTo[Double]): Self = StObject.set(x, "GetLength2", value.toJsFn)
    
    inline def setGetRatio(value: CallbackTo[Double]): Self = StObject.set(x, "GetRatio", value.toJsFn)
  }
}
