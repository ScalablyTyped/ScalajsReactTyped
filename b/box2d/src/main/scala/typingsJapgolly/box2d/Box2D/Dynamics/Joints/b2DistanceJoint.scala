package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DistanceJoint
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
    * Gets the length of distance between the two bodies.
    * @return Length.
    **/
  def GetLength(): Double
  
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
    * Sets the length of distance between the two bodies.
    * @param length New length.
    **/
  def SetLength(length: Double): Unit
}
object b2DistanceJoint {
  
  inline def apply(
    GetAnchorA: CallbackTo[b2Vec2],
    GetAnchorB: CallbackTo[b2Vec2],
    GetBodyA: CallbackTo[b2Body],
    GetBodyB: CallbackTo[b2Body],
    GetDampingRatio: CallbackTo[Double],
    GetFrequency: CallbackTo[Double],
    GetLength: CallbackTo[Double],
    GetNext: CallbackTo[b2Joint],
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: CallbackTo[Double],
    GetUserData: CallbackTo[Any],
    IsActive: CallbackTo[Boolean],
    SetDampingRatio: Double => Callback,
    SetFrequency: Double => Callback,
    SetLength: Double => Callback,
    SetUserData: Any => Callback
  ): b2DistanceJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = GetAnchorA.toJsFn, GetAnchorB = GetAnchorB.toJsFn, GetBodyA = GetBodyA.toJsFn, GetBodyB = GetBodyB.toJsFn, GetDampingRatio = GetDampingRatio.toJsFn, GetFrequency = GetFrequency.toJsFn, GetLength = GetLength.toJsFn, GetNext = GetNext.toJsFn, GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = GetType.toJsFn, GetUserData = GetUserData.toJsFn, IsActive = IsActive.toJsFn, SetDampingRatio = js.Any.fromFunction1((t0: Double) => SetDampingRatio(t0).runNow()), SetFrequency = js.Any.fromFunction1((t0: Double) => SetFrequency(t0).runNow()), SetLength = js.Any.fromFunction1((t0: Double) => SetLength(t0).runNow()), SetUserData = js.Any.fromFunction1((t0: Any) => SetUserData(t0).runNow()))
    __obj.asInstanceOf[b2DistanceJoint]
  }
  
  extension [Self <: b2DistanceJoint](x: Self) {
    
    inline def setGetDampingRatio(value: CallbackTo[Double]): Self = StObject.set(x, "GetDampingRatio", value.toJsFn)
    
    inline def setGetFrequency(value: CallbackTo[Double]): Self = StObject.set(x, "GetFrequency", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "GetLength", value.toJsFn)
    
    inline def setSetDampingRatio(value: Double => Callback): Self = StObject.set(x, "SetDampingRatio", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFrequency(value: Double => Callback): Self = StObject.set(x, "SetFrequency", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLength(value: Double => Callback): Self = StObject.set(x, "SetLength", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
