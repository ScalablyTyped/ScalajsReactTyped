package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2GearJoint
  extends StObject
     with b2Joint {
  
  /**
    * Get the gear ratio.
    * @return Gear ratio.
    **/
  def GetRatio(): Double
  
  /**
    * Set the gear ratio.
    * @param force New gear ratio.
    **/
  def SetRatio(ratio: Double): Unit
}
object b2GearJoint {
  
  inline def apply(
    GetAnchorA: CallbackTo[b2Vec2],
    GetAnchorB: CallbackTo[b2Vec2],
    GetBodyA: CallbackTo[b2Body],
    GetBodyB: CallbackTo[b2Body],
    GetNext: CallbackTo[b2Joint],
    GetRatio: CallbackTo[Double],
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: CallbackTo[Double],
    GetUserData: CallbackTo[Any],
    IsActive: CallbackTo[Boolean],
    SetRatio: Double => Callback,
    SetUserData: Any => Callback
  ): b2GearJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = GetAnchorA.toJsFn, GetAnchorB = GetAnchorB.toJsFn, GetBodyA = GetBodyA.toJsFn, GetBodyB = GetBodyB.toJsFn, GetNext = GetNext.toJsFn, GetRatio = GetRatio.toJsFn, GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = GetType.toJsFn, GetUserData = GetUserData.toJsFn, IsActive = IsActive.toJsFn, SetRatio = js.Any.fromFunction1((t0: Double) => SetRatio(t0).runNow()), SetUserData = js.Any.fromFunction1((t0: Any) => SetUserData(t0).runNow()))
    __obj.asInstanceOf[b2GearJoint]
  }
  
  extension [Self <: b2GearJoint](x: Self) {
    
    inline def setGetRatio(value: CallbackTo[Double]): Self = StObject.set(x, "GetRatio", value.toJsFn)
    
    inline def setSetRatio(value: Double => Callback): Self = StObject.set(x, "SetRatio", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
