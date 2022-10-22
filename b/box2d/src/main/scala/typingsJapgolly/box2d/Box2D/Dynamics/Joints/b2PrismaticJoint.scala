package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2PrismaticJoint
  extends StObject
     with b2Joint {
  
  /**
    * Enable/disable the joint limit.
    * @param flag True to enable, false to disable.
    **/
  def EnableLimit(flag: Boolean): Unit
  
  /**
    * Enable/disable the joint motor.
    * @param flag True to enable, false to disable.
    **/
  def EnableMotor(flag: Boolean): Unit
  
  /**
    * Get the current joint translation speed, usually in meters per second.
    * @return Joint speed.
    **/
  def GetJointSpeed(): Double
  
  /**
    * Get the current joint translation, usually in meters.
    * @return Joint translation.
    **/
  def GetJointTranslation(): Double
  
  /**
    * Get the lower joint limit, usually in meters.
    * @return Lower limit.
    **/
  def GetLowerLimit(): Double
  
  /**
    * Get the current motor force, usually in N.
    * @return Motor force.
    **/
  def GetMotorForce(): Double
  
  /**
    * Get the motor speed, usually in meters per second.
    * @return Motor speed.
    **/
  def GetMotorSpeed(): Double
  
  /**
    * Get the upper joint limit, usually in meters.
    * @return Upper limit.
    **/
  def GetUpperLimit(): Double
  
  /**
    * Is the joint limit enabled?
    * @return True if enabled otherwise false.
    **/
  def IsLimitEnabled(): Boolean
  
  /**
    * Is the joint motor enabled?
    * @return True if enabled, otherwise false.
    **/
  def IsMotorEnabled(): Boolean
  
  /**
    * Set the joint limits, usually in meters.
    * @param lower Lower limit.
    * @param upper Upper limit.
    **/
  def SetLimits(lower: Double, upper: Double): Unit
  
  /**
    * Set the maximum motor force, usually in N.
    * @param force New max force.
    **/
  def SetMaxMotorForce(force: Double): Unit
  
  /**
    * Set the motor speed, usually in meters per second.
    * @param speed New motor speed.
    **/
  def SetMotorSpeed(speed: Double): Unit
}
object b2PrismaticJoint {
  
  inline def apply(
    EnableLimit: Boolean => Callback,
    EnableMotor: Boolean => Callback,
    GetAnchorA: CallbackTo[b2Vec2],
    GetAnchorB: CallbackTo[b2Vec2],
    GetBodyA: CallbackTo[b2Body],
    GetBodyB: CallbackTo[b2Body],
    GetJointSpeed: CallbackTo[Double],
    GetJointTranslation: CallbackTo[Double],
    GetLowerLimit: CallbackTo[Double],
    GetMotorForce: CallbackTo[Double],
    GetMotorSpeed: CallbackTo[Double],
    GetNext: CallbackTo[b2Joint],
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: CallbackTo[Double],
    GetUpperLimit: CallbackTo[Double],
    GetUserData: CallbackTo[Any],
    IsActive: CallbackTo[Boolean],
    IsLimitEnabled: CallbackTo[Boolean],
    IsMotorEnabled: CallbackTo[Boolean],
    SetLimits: (Double, Double) => Callback,
    SetMaxMotorForce: Double => Callback,
    SetMotorSpeed: Double => Callback,
    SetUserData: Any => Callback
  ): b2PrismaticJoint = {
    val __obj = js.Dynamic.literal(EnableLimit = js.Any.fromFunction1((t0: Boolean) => EnableLimit(t0).runNow()), EnableMotor = js.Any.fromFunction1((t0: Boolean) => EnableMotor(t0).runNow()), GetAnchorA = GetAnchorA.toJsFn, GetAnchorB = GetAnchorB.toJsFn, GetBodyA = GetBodyA.toJsFn, GetBodyB = GetBodyB.toJsFn, GetJointSpeed = GetJointSpeed.toJsFn, GetJointTranslation = GetJointTranslation.toJsFn, GetLowerLimit = GetLowerLimit.toJsFn, GetMotorForce = GetMotorForce.toJsFn, GetMotorSpeed = GetMotorSpeed.toJsFn, GetNext = GetNext.toJsFn, GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = GetType.toJsFn, GetUpperLimit = GetUpperLimit.toJsFn, GetUserData = GetUserData.toJsFn, IsActive = IsActive.toJsFn, IsLimitEnabled = IsLimitEnabled.toJsFn, IsMotorEnabled = IsMotorEnabled.toJsFn, SetLimits = js.Any.fromFunction2((t0: Double, t1: Double) => (SetLimits(t0, t1)).runNow()), SetMaxMotorForce = js.Any.fromFunction1((t0: Double) => SetMaxMotorForce(t0).runNow()), SetMotorSpeed = js.Any.fromFunction1((t0: Double) => SetMotorSpeed(t0).runNow()), SetUserData = js.Any.fromFunction1((t0: Any) => SetUserData(t0).runNow()))
    __obj.asInstanceOf[b2PrismaticJoint]
  }
  
  extension [Self <: b2PrismaticJoint](x: Self) {
    
    inline def setEnableLimit(value: Boolean => Callback): Self = StObject.set(x, "EnableLimit", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setEnableMotor(value: Boolean => Callback): Self = StObject.set(x, "EnableMotor", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGetJointSpeed(value: CallbackTo[Double]): Self = StObject.set(x, "GetJointSpeed", value.toJsFn)
    
    inline def setGetJointTranslation(value: CallbackTo[Double]): Self = StObject.set(x, "GetJointTranslation", value.toJsFn)
    
    inline def setGetLowerLimit(value: CallbackTo[Double]): Self = StObject.set(x, "GetLowerLimit", value.toJsFn)
    
    inline def setGetMotorForce(value: CallbackTo[Double]): Self = StObject.set(x, "GetMotorForce", value.toJsFn)
    
    inline def setGetMotorSpeed(value: CallbackTo[Double]): Self = StObject.set(x, "GetMotorSpeed", value.toJsFn)
    
    inline def setGetUpperLimit(value: CallbackTo[Double]): Self = StObject.set(x, "GetUpperLimit", value.toJsFn)
    
    inline def setIsLimitEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsLimitEnabled", value.toJsFn)
    
    inline def setIsMotorEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsMotorEnabled", value.toJsFn)
    
    inline def setSetLimits(value: (Double, Double) => Callback): Self = StObject.set(x, "SetLimits", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetMaxMotorForce(value: Double => Callback): Self = StObject.set(x, "SetMaxMotorForce", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMotorSpeed(value: Double => Callback): Self = StObject.set(x, "SetMotorSpeed", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
