package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationalEquation
  extends StObject
     with Equation {
  
  var invIi: Mat3
  
  var invIj: Mat3
  
  var ni: Vec3
  
  var nixnj: Vec3
  
  var nj: Vec3
  
  var njxni: Vec3
  
  var relForce: Vec3
  
  var relVel: Vec3
}
object RotationalEquation {
  
  inline def apply(
    a: Double,
    addToWlamda: Double => Double,
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
    invIi: Mat3,
    invIj: Mat3,
    jacobianElementA: JacobianElement,
    jacobianElementB: JacobianElement,
    maxForce: Double,
    minForce: Double,
    ni: Vec3,
    nixnj: Vec3,
    nj: Vec3,
    njxni: Vec3,
    relForce: Vec3,
    relVel: Vec3,
    setSpookParams: (Double, Double, Double) => Callback
  ): RotationalEquation = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], addToWlamda = js.Any.fromFunction1(addToWlamda), b = b.asInstanceOf[js.Any], bi = bi.asInstanceOf[js.Any], bj = bj.asInstanceOf[js.Any], computeB = js.Any.fromFunction3(computeB), computeC = computeC.toJsFn, computeGW = computeGW.toJsFn, computeGWlamda = computeGWlamda.toJsFn, computeGiMGt = computeGiMGt.toJsFn, computeGiMf = computeGiMf.toJsFn, computeGq = computeGq.toJsFn, enabled = enabled.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invIi = invIi.asInstanceOf[js.Any], invIj = invIj.asInstanceOf[js.Any], jacobianElementA = jacobianElementA.asInstanceOf[js.Any], jacobianElementB = jacobianElementB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], minForce = minForce.asInstanceOf[js.Any], ni = ni.asInstanceOf[js.Any], nixnj = nixnj.asInstanceOf[js.Any], nj = nj.asInstanceOf[js.Any], njxni = njxni.asInstanceOf[js.Any], relForce = relForce.asInstanceOf[js.Any], relVel = relVel.asInstanceOf[js.Any], setSpookParams = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setSpookParams(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[RotationalEquation]
  }
  
  extension [Self <: RotationalEquation](x: Self) {
    
    inline def setInvIi(value: Mat3): Self = StObject.set(x, "invIi", value.asInstanceOf[js.Any])
    
    inline def setInvIj(value: Mat3): Self = StObject.set(x, "invIj", value.asInstanceOf[js.Any])
    
    inline def setNi(value: Vec3): Self = StObject.set(x, "ni", value.asInstanceOf[js.Any])
    
    inline def setNixnj(value: Vec3): Self = StObject.set(x, "nixnj", value.asInstanceOf[js.Any])
    
    inline def setNj(value: Vec3): Self = StObject.set(x, "nj", value.asInstanceOf[js.Any])
    
    inline def setNjxni(value: Vec3): Self = StObject.set(x, "njxni", value.asInstanceOf[js.Any])
    
    inline def setRelForce(value: Vec3): Self = StObject.set(x, "relForce", value.asInstanceOf[js.Any])
    
    inline def setRelVel(value: Vec3): Self = StObject.set(x, "relVel", value.asInstanceOf[js.Any])
  }
}
