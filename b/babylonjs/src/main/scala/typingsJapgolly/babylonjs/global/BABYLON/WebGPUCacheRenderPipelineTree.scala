package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.GPUDevice
import typingsJapgolly.babylonjs.anon.NodeCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUCacheRenderPipelineTree")
@js.native
open class WebGPUCacheRenderPipelineTree protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGPUCacheRenderPipelineTree {
  def this(
    device: GPUDevice,
    emptyVertexBuffer: typingsJapgolly.babylonjs.BABYLON.VertexBuffer,
    useTextureStage: Boolean
  ) = this()
}
/* static members */
object WebGPUCacheRenderPipelineTree {
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipelineTree")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetNodeCounts(): NodeCount = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNodeCounts")().asInstanceOf[NodeCount]
  
  inline def GetPipelines(): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPipelines")().asInstanceOf[js.Array[js.Array[Double]]]
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipelineTree._Cache")
  @js.native
  def _Cache: Any = js.native
  inline def _Cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Cache")(x.asInstanceOf[js.Any])
  
  inline def _GetPipelines(
    node: typingsJapgolly.babylonjs.BABYLON.NodeState,
    pipelines: js.Array[js.Array[Double]],
    curPath: js.Array[Double],
    curPathLen: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetPipelines")(node.asInstanceOf[js.Any], pipelines.asInstanceOf[js.Any], curPath.asInstanceOf[js.Any], curPathLen.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
