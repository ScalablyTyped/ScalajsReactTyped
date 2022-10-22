package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2MouseJoint
  extends StObject
     with b2Joint {
  
  /**
    * Gets the damping ratio.
    * @return Damping ratio.
    **/
  def GetDampingRatio(): Double
  
  /**
    * Gets the frequency.
    * @return Frequency.
    **/
  def GetFrequency(): Double
  
  /**
    * Gets the max force.
    * @return Max force.
    **/
  def GetMaxForce(): Double
  
  /**
    * Gets the target.
    * @return Target.
    **/
  def GetTarget(): b2Vec2
  
  /**
    * Sets the damping ratio.
    * @param ratio New damping ratio.
    **/
  def SetDampingRatio(ratio: Double): Unit
  
  /**
    * Sets the frequency.
    * @param hz New frequency (hertz).
    **/
  def SetFrequency(hz: Double): Unit
  
  /**
    * Sets the max force.
    * @param maxForce New max force.
    **/
  def SetMaxForce(maxForce: Double): Unit
  
  /**
    * Use this to update the target point.
    * @param target New target.
    **/
  def SetTarget(target: b2Vec2): Unit
}
object b2MouseJoint {
  
  inline def apply(
    GetAnchorA: CallbackTo[b2Vec2],
    GetAnchorB: CallbackTo[b2Vec2],
    GetBodyA: CallbackTo[b2Body],
    GetBodyB: CallbackTo[b2Body],
    GetDampingRatio: CallbackTo[Double],
    GetFrequency: CallbackTo[Double],
    GetMaxForce: CallbackTo[Double],
    GetNext: CallbackTo[b2Joint],
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetTarget: CallbackTo[b2Vec2],
    GetType: CallbackTo[Double],
    GetUserData: CallbackTo[Any],
    IsActive: CallbackTo[Boolean],
    SetDampingRatio: Double => Callback,
    SetFrequency: Double => Callback,
    SetMaxForce: Double => Callback,
    SetTarget: b2Vec2 => Callback,
    SetUserData: Any => Callback
  ): b2MouseJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = GetAnchorA.toJsFn, GetAnchorB = GetAnchorB.toJsFn, GetBodyA = GetBodyA.toJsFn, GetBodyB = GetBodyB.toJsFn, GetDampingRatio = GetDampingRatio.toJsFn, GetFrequency = GetFrequency.toJsFn, GetMaxForce = GetMaxForce.toJsFn, GetNext = GetNext.toJsFn, GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetTarget = GetTarget.toJsFn, GetType = GetType.toJsFn, GetUserData = GetUserData.toJsFn, IsActive = IsActive.toJsFn, SetDampingRatio = js.Any.fromFunction1((t0: Double) => SetDampingRatio(t0).runNow()), SetFrequency = js.Any.fromFunction1((t0: Double) => SetFrequency(t0).runNow()), SetMaxForce = js.Any.fromFunction1((t0: Double) => SetMaxForce(t0).runNow()), SetTarget = js.Any.fromFunction1((t0: b2Vec2) => SetTarget(t0).runNow()), SetUserData = js.Any.fromFunction1((t0: Any) => SetUserData(t0).runNow()))
    __obj.asInstanceOf[b2MouseJoint]
  }
  
  extension [Self <: b2MouseJoint](x: Self) {
    
    inline def setGetDampingRatio(value: CallbackTo[Double]): Self = StObject.set(x, "GetDampingRatio", value.toJsFn)
    
    inline def setGetFrequency(value: CallbackTo[Double]): Self = StObject.set(x, "GetFrequency", value.toJsFn)
    
    inline def setGetMaxForce(value: CallbackTo[Double]): Self = StObject.set(x, "GetMaxForce", value.toJsFn)
    
    inline def setGetTarget(value: CallbackTo[b2Vec2]): Self = StObject.set(x, "GetTarget", value.toJsFn)
    
    inline def setSetDampingRatio(value: Double => Callback): Self = StObject.set(x, "SetDampingRatio", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFrequency(value: Double => Callback): Self = StObject.set(x, "SetFrequency", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMaxForce(value: Double => Callback): Self = StObject.set(x, "SetMaxForce", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTarget(value: b2Vec2 => Callback): Self = StObject.set(x, "SetTarget", js.Any.fromFunction1((t0: b2Vec2) => value(t0).runNow()))
  }
}
