package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.GPUDevice
import typingsJapgolly.babylonjs.anon.NodeCount
import typingsJapgolly.babylonjs.enginesWebGPUWebgpuCacheRenderPipelineTreeMod.NodeState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebGPUCacheRenderPipelineTree")
@js.native
open class WebGPUCacheRenderPipelineTree protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.WebGPUCacheRenderPipelineTree {
  def this(
    device: GPUDevice,
    emptyVertexBuffer: typingsJapgolly.babylonjs.buffersBufferMod.VertexBuffer,
    useTextureStage: Boolean
  ) = this()
}
/* static members */
object WebGPUCacheRenderPipelineTree {
  
  @JSImport("babylonjs", "WebGPUCacheRenderPipelineTree")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetNodeCounts(): NodeCount = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNodeCounts")().asInstanceOf[NodeCount]
  
  inline def GetPipelines(): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPipelines")().asInstanceOf[js.Array[js.Array[Double]]]
  
  @JSImport("babylonjs", "WebGPUCacheRenderPipelineTree._Cache")
  @js.native
  def _Cache: Any = js.native
  inline def _Cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Cache")(x.asInstanceOf[js.Any])
  
  inline def _GetPipelines(
    node: NodeState,
    pipelines: js.Array[js.Array[Double]],
    curPath: js.Array[Double],
    curPathLen: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetPipelines")(node.asInstanceOf[js.Any], pipelines.asInstanceOf[js.Any], curPath.asInstanceOf[js.Any], curPathLen.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
