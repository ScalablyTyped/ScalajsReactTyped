package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMaterialOptimizer extends StObject {
  
  /**
    * Function used to optimize a NodeMaterial graph
    * @param _vertexOutputNodes defines the list of output nodes for the vertex shader
    * @param _fragmentOutputNodes defines the list of output nodes for the fragment shader
    */
  def optimize(_vertexOutputNodes: js.Array[NodeMaterialBlock], _fragmentOutputNodes: js.Array[NodeMaterialBlock]): Unit
}
object NodeMaterialOptimizer {
  
  inline def apply(optimize: (js.Array[NodeMaterialBlock], js.Array[NodeMaterialBlock]) => Callback): NodeMaterialOptimizer = {
    val __obj = js.Dynamic.literal(optimize = js.Any.fromFunction2((t0: js.Array[NodeMaterialBlock], t1: js.Array[NodeMaterialBlock]) => (optimize(t0, t1)).runNow()))
    __obj.asInstanceOf[NodeMaterialOptimizer]
  }
  
  extension [Self <: NodeMaterialOptimizer](x: Self) {
    
    inline def setOptimize(value: (js.Array[NodeMaterialBlock], js.Array[NodeMaterialBlock]) => Callback): Self = StObject.set(x, "optimize", js.Any.fromFunction2((t0: js.Array[NodeMaterialBlock], t1: js.Array[NodeMaterialBlock]) => (value(t0, t1)).runNow()))
  }
}
