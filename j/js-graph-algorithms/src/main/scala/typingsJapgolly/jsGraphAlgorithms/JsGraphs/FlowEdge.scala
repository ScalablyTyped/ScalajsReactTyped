package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowEdge extends StObject {
  
  def addResidualFlowTo(x: Double, deltaFlow: Double): Unit
  
  /* private */ var capacity: Any
  
  /* private */ var flow: Any
  
  def from(): Double
  
  var label: js.UndefOr[String] = js.undefined
  
  def other(x: Double): Double
  
  def residualCapacityTo(x: Double): Double
  
  def to(): Double
  
  /* private */ var v: Any
  
  /* private */ var w: Any
}
object FlowEdge {
  
  inline def apply(
    addResidualFlowTo: (Double, Double) => Callback,
    capacity: Any,
    flow: Any,
    from: CallbackTo[Double],
    other: Double => Double,
    residualCapacityTo: Double => Double,
    to: CallbackTo[Double],
    v: Any,
    w: Any
  ): FlowEdge = {
    val __obj = js.Dynamic.literal(addResidualFlowTo = js.Any.fromFunction2((t0: Double, t1: Double) => (addResidualFlowTo(t0, t1)).runNow()), capacity = capacity.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], from = from.toJsFn, other = js.Any.fromFunction1(other), residualCapacityTo = js.Any.fromFunction1(residualCapacityTo), to = to.toJsFn, v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEdge]
  }
  
  extension [Self <: FlowEdge](x: Self) {
    
    inline def setAddResidualFlowTo(value: (Double, Double) => Callback): Self = StObject.set(x, "addResidualFlowTo", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setCapacity(value: Any): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: Any): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: CallbackTo[Double]): Self = StObject.set(x, "from", value.toJsFn)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOther(value: Double => Double): Self = StObject.set(x, "other", js.Any.fromFunction1(value))
    
    inline def setResidualCapacityTo(value: Double => Double): Self = StObject.set(x, "residualCapacityTo", js.Any.fromFunction1(value))
    
    inline def setTo(value: CallbackTo[Double]): Self = StObject.set(x, "to", value.toJsFn)
    
    inline def setV(value: Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setW(value: Any): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
