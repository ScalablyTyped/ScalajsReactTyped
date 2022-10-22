package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2Joint extends StObject {
  
  /**
    * Get the anchor point on bodyA in world coordinates.
    * @return Anchor A point.
    **/
  def GetAnchorA(): b2Vec2
  
  /**
    * Get the anchor point on bodyB in world coordinates.
    * @return Anchor B point.
    **/
  def GetAnchorB(): b2Vec2
  
  /**
    * Get the first body attached to this joint.
    * @return Body A.
    **/
  def GetBodyA(): b2Body
  
  /**
    * Get the second body attached to this joint.
    * @return Body B.
    **/
  def GetBodyB(): b2Body
  
  /**
    * Get the next joint the world joint list.
    * @return Next joint.
    **/
  def GetNext(): b2Joint
  
  /**
    * Get the reaction force on body2 at the joint anchor in Newtons.
    * @param inv_dt
    * @return Reaction force (N)
    **/
  def GetReactionForce(inv_dt: Double): b2Vec2
  
  /**
    * Get the reaction torque on body2 in N.
    * @param inv_dt
    * @return Reaction torque (N).
    **/
  def GetReactionTorque(inv_dt: Double): Double
  
  /**
    * Get the type of the concrete joint.
    * @return Joint type.
    **/
  def GetType(): Double
  
  /**
    * Get the user data pointer.
    * @return User data.  Cast to your data type.
    **/
  def GetUserData(): Any
  
  /**
    * Short-cut function to determine if either body is inactive.
    * @return True if active, otherwise false.
    **/
  def IsActive(): Boolean
  
  /**
    * Set the user data pointer.
    * @param data Your custom data.
    **/
  def SetUserData(data: Any): Unit
}
object b2Joint {
  
  inline def apply(
    GetAnchorA: CallbackTo[b2Vec2],
    GetAnchorB: CallbackTo[b2Vec2],
    GetBodyA: CallbackTo[b2Body],
    GetBodyB: CallbackTo[b2Body],
    GetNext: CallbackTo[b2Joint],
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: CallbackTo[Double],
    GetUserData: CallbackTo[Any],
    IsActive: CallbackTo[Boolean],
    SetUserData: Any => Callback
  ): b2Joint = {
    val __obj = js.Dynamic.literal(GetAnchorA = GetAnchorA.toJsFn, GetAnchorB = GetAnchorB.toJsFn, GetBodyA = GetBodyA.toJsFn, GetBodyB = GetBodyB.toJsFn, GetNext = GetNext.toJsFn, GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = GetType.toJsFn, GetUserData = GetUserData.toJsFn, IsActive = IsActive.toJsFn, SetUserData = js.Any.fromFunction1((t0: Any) => SetUserData(t0).runNow()))
    __obj.asInstanceOf[b2Joint]
  }
  
  extension [Self <: b2Joint](x: Self) {
    
    inline def setGetAnchorA(value: CallbackTo[b2Vec2]): Self = StObject.set(x, "GetAnchorA", value.toJsFn)
    
    inline def setGetAnchorB(value: CallbackTo[b2Vec2]): Self = StObject.set(x, "GetAnchorB", value.toJsFn)
    
    inline def setGetBodyA(value: CallbackTo[b2Body]): Self = StObject.set(x, "GetBodyA", value.toJsFn)
    
    inline def setGetBodyB(value: CallbackTo[b2Body]): Self = StObject.set(x, "GetBodyB", value.toJsFn)
    
    inline def setGetNext(value: CallbackTo[b2Joint]): Self = StObject.set(x, "GetNext", value.toJsFn)
    
    inline def setGetReactionForce(value: Double => b2Vec2): Self = StObject.set(x, "GetReactionForce", js.Any.fromFunction1(value))
    
    inline def setGetReactionTorque(value: Double => Double): Self = StObject.set(x, "GetReactionTorque", js.Any.fromFunction1(value))
    
    inline def setGetType(value: CallbackTo[Double]): Self = StObject.set(x, "GetType", value.toJsFn)
    
    inline def setGetUserData(value: CallbackTo[Any]): Self = StObject.set(x, "GetUserData", value.toJsFn)
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsActive", value.toJsFn)
    
    inline def setSetUserData(value: Any => Callback): Self = StObject.set(x, "SetUserData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
