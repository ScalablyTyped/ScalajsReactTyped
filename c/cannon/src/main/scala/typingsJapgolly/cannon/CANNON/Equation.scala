package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Equation extends StObject {
  
  var a: Double
  
  def addToWlamda(deltalambda: Double): Double
  
  var b: Double
  
  var bi: Body
  
  var bj: Body
  
  def computeB(a: Double, b: Double, h: Double): Double
  
  def computeC(): Double
  
  def computeGW(): Double
  
  def computeGWlamda(): Double
  
  def computeGiMGt(): Double
  
  def computeGiMf(): Double
  
  def computeGq(): Double
  
  var enabled: Boolean
  
  var eps: Double
  
  var id: Double
  
  var jacobianElementA: JacobianElement
  
  var jacobianElementB: JacobianElement
  
  var maxForce: Double
  
  var minForce: Double
  
  def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit
}
object Equation {
  
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
    jacobianElementA: JacobianElement,
    jacobianElementB: JacobianElement,
    maxForce: Double,
    minForce: Double,
    setSpookParams: (Double, Double, Double) => Callback
  ): Equation = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], addToWlamda = js.Any.fromFunction1(addToWlamda), b = b.asInstanceOf[js.Any], bi = bi.asInstanceOf[js.Any], bj = bj.asInstanceOf[js.Any], computeB = js.Any.fromFunction3(computeB), computeC = computeC.toJsFn, computeGW = computeGW.toJsFn, computeGWlamda = computeGWlamda.toJsFn, computeGiMGt = computeGiMGt.toJsFn, computeGiMf = computeGiMf.toJsFn, computeGq = computeGq.toJsFn, enabled = enabled.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jacobianElementA = jacobianElementA.asInstanceOf[js.Any], jacobianElementB = jacobianElementB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], minForce = minForce.asInstanceOf[js.Any], setSpookParams = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setSpookParams(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Equation]
  }
  
  extension [Self <: Equation](x: Self) {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAddToWlamda(value: Double => Double): Self = StObject.set(x, "addToWlamda", js.Any.fromFunction1(value))
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBi(value: Body): Self = StObject.set(x, "bi", value.asInstanceOf[js.Any])
    
    inline def setBj(value: Body): Self = StObject.set(x, "bj", value.asInstanceOf[js.Any])
    
    inline def setComputeB(value: (Double, Double, Double) => Double): Self = StObject.set(x, "computeB", js.Any.fromFunction3(value))
    
    inline def setComputeC(value: CallbackTo[Double]): Self = StObject.set(x, "computeC", value.toJsFn)
    
    inline def setComputeGW(value: CallbackTo[Double]): Self = StObject.set(x, "computeGW", value.toJsFn)
    
    inline def setComputeGWlamda(value: CallbackTo[Double]): Self = StObject.set(x, "computeGWlamda", value.toJsFn)
    
    inline def setComputeGiMGt(value: CallbackTo[Double]): Self = StObject.set(x, "computeGiMGt", value.toJsFn)
    
    inline def setComputeGiMf(value: CallbackTo[Double]): Self = StObject.set(x, "computeGiMf", value.toJsFn)
    
    inline def setComputeGq(value: CallbackTo[Double]): Self = StObject.set(x, "computeGq", value.toJsFn)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEps(value: Double): Self = StObject.set(x, "eps", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJacobianElementA(value: JacobianElement): Self = StObject.set(x, "jacobianElementA", value.asInstanceOf[js.Any])
    
    inline def setJacobianElementB(value: JacobianElement): Self = StObject.set(x, "jacobianElementB", value.asInstanceOf[js.Any])
    
    inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    inline def setMinForce(value: Double): Self = StObject.set(x, "minForce", value.asInstanceOf[js.Any])
    
    inline def setSetSpookParams(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setSpookParams", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
