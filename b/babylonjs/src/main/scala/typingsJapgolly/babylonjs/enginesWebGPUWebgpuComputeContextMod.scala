package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.computeIcomputecontextMod.IComputeContext
import typingsJapgolly.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingList
import typingsJapgolly.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingMapping
import typingsJapgolly.babylonjs.enginesWebGPUWebgpuCacheSamplerMod.WebGPUCacheSampler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuComputeContextMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuComputeContext", "WebGPUComputeContext")
  @js.native
  open class WebGPUComputeContext protected ()
    extends StObject
       with IComputeContext {
    def this(device: GPUDevice, cacheSampler: WebGPUCacheSampler) = this()
    
    /* private */ var _bindGroupEntries: Any = js.native
    
    /* private */ var _bindGroups: Any = js.native
    
    /* private */ var _cacheSampler: Any = js.native
    
    /* private */ var _device: Any = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    def getBindGroups(bindings: ComputeBindingList, computePipeline: GPUComputePipeline): js.Array[GPUBindGroup] = js.native
    def getBindGroups(
      bindings: ComputeBindingList,
      computePipeline: GPUComputePipeline,
      bindingsMapping: ComputeBindingMapping
    ): js.Array[GPUBindGroup] = js.native
    
    val uniqueId: Double = js.native
  }
  /* static members */
  object WebGPUComputeContext {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuComputeContext", "WebGPUComputeContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuComputeContext", "WebGPUComputeContext._Counter")
    @js.native
    def _Counter: Any = js.native
    inline def _Counter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
  }
}
