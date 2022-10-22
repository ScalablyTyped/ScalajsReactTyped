package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.buffersBufferMod.VertexBuffer
import typingsJapgolly.babylonjs.enginesWebGPUWebgpuCacheRenderPipelineMod.WebGPUCacheRenderPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuCacheRenderPipelineStringMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipelineString", "WebGPUCacheRenderPipelineString")
  @js.native
  open class WebGPUCacheRenderPipelineString protected () extends WebGPUCacheRenderPipeline {
    def this(device: GPUDevice, emptyVertexBuffer: VertexBuffer, useTextureStage: Boolean) = this()
  }
  /* static members */
  object WebGPUCacheRenderPipelineString {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipelineString", "WebGPUCacheRenderPipelineString")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipelineString", "WebGPUCacheRenderPipelineString._Cache")
    @js.native
    def _Cache: Any = js.native
    inline def _Cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Cache")(x.asInstanceOf[js.Any])
  }
}
