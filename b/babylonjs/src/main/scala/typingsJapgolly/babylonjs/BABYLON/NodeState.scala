package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.babylonjs.GPURenderPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait NodeState extends StObject {
  
  def count(): js.Tuple2[Double, Double]
  
  var pipeline: GPURenderPipeline
  
  var values: NumberDictionary[NodeState]
}
object NodeState {
  
  inline def apply(
    count: CallbackTo[js.Tuple2[Double, Double]],
    pipeline: GPURenderPipeline,
    values: NumberDictionary[NodeState]
  ): NodeState = {
    val __obj = js.Dynamic.literal(count = count.toJsFn, pipeline = pipeline.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeState]
  }
  
  extension [Self <: NodeState](x: Self) {
    
    inline def setCount(value: CallbackTo[js.Tuple2[Double, Double]]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setPipeline(value: GPURenderPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setValues(value: NumberDictionary[NodeState]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
