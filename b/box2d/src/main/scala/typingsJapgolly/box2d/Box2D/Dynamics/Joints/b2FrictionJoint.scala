package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2FrictionJoint
  extends StObject
     with b2Joint {
  
  /**
    * Gets the max force.
    * @return Max force.
    **/
  def GetMaxForce(): Double
  
  /**
    * Gets the max torque.
    * @return Max torque.
    **/
  def GetMaxTorque(): Double
  
  /**
    * Sets the max force.
    * @param force New max force.
    **/
  def SetMaxForce(force: Double): Unit
  
  /**
    * Sets the max torque.
    * @param torque New max torque.
    **/
  def SetMaxTorque(torque: Double): Unit
  
  /**
    * Angular mass.
    **/
  var m_angularMass: Double
  
  /**
    * Linear mass.
    **/
  var m_linearMass: b2Mat22
}
object b2FrictionJoint {
  
  inline def apply(
    GetAnchorA: CallbackTo[b2Vec2],
    GetAnchorB: CallbackTo[b2Vec2],
    GetBodyA: CallbackTo[b2Body],
    GetBodyB: CallbackTo[b2Body],
    GetMaxForce: CallbackTo[Double],
    GetMaxTorque: CallbackTo[Double],
    GetNext: CallbackTo[b2Joint],
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: CallbackTo[Double],
    GetUserData: CallbackTo[Any],
    IsActive: CallbackTo[Boolean],
    SetMaxForce: Double => Callback,
    SetMaxTorque: Double => Callback,
    SetUserData: Any => Callback,
    m_angularMass: Double,
    m_linearMass: b2Mat22
  ): b2FrictionJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = GetAnchorA.toJsFn, GetAnchorB = GetAnchorB.toJsFn, GetBodyA = GetBodyA.toJsFn, GetBodyB = GetBodyB.toJsFn, GetMaxForce = GetMaxForce.toJsFn, GetMaxTorque = GetMaxTorque.toJsFn, GetNext = GetNext.toJsFn, GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = GetType.toJsFn, GetUserData = GetUserData.toJsFn, IsActive = IsActive.toJsFn, SetMaxForce = js.Any.fromFunction1((t0: Double) => SetMaxForce(t0).runNow()), SetMaxTorque = js.Any.fromFunction1((t0: Double) => SetMaxTorque(t0).runNow()), SetUserData = js.Any.fromFunction1((t0: Any) => SetUserData(t0).runNow()), m_angularMass = m_angularMass.asInstanceOf[js.Any], m_linearMass = m_linearMass.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FrictionJoint]
  }
  
  extension [Self <: b2FrictionJoint](x: Self) {
    
    inline def setGetMaxForce(value: CallbackTo[Double]): Self = StObject.set(x, "GetMaxForce", value.toJsFn)
    
    inline def setGetMaxTorque(value: CallbackTo[Double]): Self = StObject.set(x, "GetMaxTorque", value.toJsFn)
    
    inline def setM_angularMass(value: Double): Self = StObject.set(x, "m_angularMass", value.asInstanceOf[js.Any])
    
    inline def setM_linearMass(value: b2Mat22): Self = StObject.set(x, "m_linearMass", value.asInstanceOf[js.Any])
    
    inline def setSetMaxForce(value: Double => Callback): Self = StObject.set(x, "SetMaxForce", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMaxTorque(value: Double => Callback): Self = StObject.set(x, "SetMaxTorque", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
