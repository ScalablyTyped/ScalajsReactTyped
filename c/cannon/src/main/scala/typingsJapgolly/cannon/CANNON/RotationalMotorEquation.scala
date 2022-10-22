package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationalMotorEquation
  extends StObject
     with Equation {
  
  var axisA: Vec3
  
  var axisB: Vec3
  
  var invIj: Mat3
  
  var invLi: Mat3
  
  var targetVelocity: Double
}
object RotationalMotorEquation {
  
  inline def apply(
    a: Double,
    addToWlamda: Double => Double,
    axisA: Vec3,
    axisB: Vec3,
    b: Double,
    bi: Body,
    bj: Body,
    computeB: (Double, Double, Double) => Double,
    computeC: CallbackTo[Double],
    computeGW: CallbackTo[Double],
    computeGWlamda: CallbackTo[Double],
    computeGiMGt: CallbackTo[Double],
    computeGiMf: CallbackTo[Double],
    computeGq: CallbackTo[Double],
    enabled: Boolean,
    eps: Double,
    id: Double,
    invIj: Mat3,
    invLi: Mat3,
    jacobianElementA: JacobianElement,
    jacobianElementB: JacobianElement,
    maxForce: Double,
    minForce: Double,
    setSpookParams: (Double, Double, Double) => Callback,
    targetVelocity: Double
  ): RotationalMotorEquation = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], addToWlamda = js.Any.fromFunction1(addToWlamda), axisA = axisA.asInstanceOf[js.Any], axisB = axisB.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], bi = bi.asInstanceOf[js.Any], bj = bj.asInstanceOf[js.Any], computeB = js.Any.fromFunction3(computeB), computeC = computeC.toJsFn, computeGW = computeGW.toJsFn, computeGWlamda = computeGWlamda.toJsFn, computeGiMGt = computeGiMGt.toJsFn, computeGiMf = computeGiMf.toJsFn, computeGq = computeGq.toJsFn, enabled = enabled.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invIj = invIj.asInstanceOf[js.Any], invLi = invLi.asInstanceOf[js.Any], jacobianElementA = jacobianElementA.asInstanceOf[js.Any], jacobianElementB = jacobianElementB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], minForce = minForce.asInstanceOf[js.Any], setSpookParams = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setSpookParams(t0, t1, t2)).runNow()), targetVelocity = targetVelocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationalMotorEquation]
  }
  
  extension [Self <: RotationalMotorEquation](x: Self) {
    
    inline def setAxisA(value: Vec3): Self = StObject.set(x, "axisA", value.asInstanceOf[js.Any])
    
    inline def setAxisB(value: Vec3): Self = StObject.set(x, "axisB", value.asInstanceOf[js.Any])
    
    inline def setInvIj(value: Mat3): Self = StObject.set(x, "invIj", value.asInstanceOf[js.Any])
    
    inline def setInvLi(value: Mat3): Self = StObject.set(x, "invLi", value.asInstanceOf[js.Any])
    
    inline def setTargetVelocity(value: Double): Self = StObject.set(x, "targetVelocity", value.asInstanceOf[js.Any])
  }
}
