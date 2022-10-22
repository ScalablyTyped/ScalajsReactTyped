package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NodeMaterialOptimizer")
@js.native
open class NodeMaterialOptimizer ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.NodeMaterialOptimizer {
  
  /**
    * Function used to optimize a NodeMaterial graph
    * @param _vertexOutputNodes defines the list of output nodes for the vertex shader
    * @param _fragmentOutputNodes defines the list of output nodes for the fragment shader
    */
  /* CompleteClass */
  override def optimize(
    _vertexOutputNodes: js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock],
    _fragmentOutputNodes: js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock]
  ): Unit = js.native
}
