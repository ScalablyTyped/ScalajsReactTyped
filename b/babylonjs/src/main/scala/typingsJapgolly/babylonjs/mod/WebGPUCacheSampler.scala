package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.GPUCompareFunction
import typingsJapgolly.babylonjs.GPUDevice
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebGPUCacheSampler")
@js.native
open class WebGPUCacheSampler protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.WebGPUCacheSampler {
  def this(device: GPUDevice) = this()
}
/* static members */
object WebGPUCacheSampler {
  
  @JSImport("babylonjs", "WebGPUCacheSampler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetCompareFunction(compareFunction: Nullable[Double]): GPUCompareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCompareFunction")(compareFunction.asInstanceOf[js.Any]).asInstanceOf[GPUCompareFunction]
  
  inline def GetSamplerHashCode(sampler: typingsJapgolly.babylonjs.materialsTexturesTextureSamplerMod.TextureSampler): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSamplerHashCode")(sampler.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("babylonjs", "WebGPUCacheSampler._GetSamplerDescriptor")
  @js.native
  def _GetSamplerDescriptor: Any = js.native
  inline def _GetSamplerDescriptor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetSamplerDescriptor")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheSampler._GetSamplerFilterDescriptor")
  @js.native
  def _GetSamplerFilterDescriptor: Any = js.native
  inline def _GetSamplerFilterDescriptor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetSamplerFilterDescriptor")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheSampler._GetSamplerWrappingDescriptor")
  @js.native
  def _GetSamplerWrappingDescriptor: Any = js.native
  inline def _GetSamplerWrappingDescriptor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetSamplerWrappingDescriptor")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheSampler._GetWrappingMode")
  @js.native
  def _GetWrappingMode: Any = js.native
  inline def _GetWrappingMode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetWrappingMode")(x.asInstanceOf[js.Any])
}
