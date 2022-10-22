package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.Compute
import typingsJapgolly.babylonjs.computeIcomputepipelinecontextMod.IComputePipelineContext
import typingsJapgolly.babylonjs.enginesWebgpuEngineMod.WebGPUEngine
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuComputePipelineContextMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuComputePipelineContext", "WebGPUComputePipelineContext")
  @js.native
  open class WebGPUComputePipelineContext protected ()
    extends StObject
       with IComputePipelineContext {
    def this(engine: WebGPUEngine) = this()
    
    /** @internal */
    /* CompleteClass */
    override def _getComputeShaderCode(): String | Null = js.native
    
    /** @internal */
    @JSName("_name")
    var _name_WebGPUComputePipelineContext: String = js.native
    
    var computePipeline: GPUComputePipeline = js.native
    
    /** Releases the resources associated with the pipeline. */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    var engine: WebGPUEngine = js.native
    
    /**
      * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
      */
    /* CompleteClass */
    var isAsync: Boolean = js.native
    @JSName("isAsync")
    def isAsync_MWebGPUComputePipelineContext: Boolean = js.native
    
    /**
      * Gets a boolean indicating that the context is ready to be used (like shader / pipeline are compiled and ready for instance)
      */
    /* CompleteClass */
    var isReady: Boolean = js.native
    @JSName("isReady")
    def isReady_MWebGPUComputePipelineContext: Boolean = js.native
    
    var sources: Compute = js.native
    
    var stage: Nullable[GPUProgrammableStage] = js.native
  }
}
