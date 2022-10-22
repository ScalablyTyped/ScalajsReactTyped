package typingsJapgolly.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015DeviceGpudetectorMod {
  
  @js.native
  sealed trait EGPUPrecision extends StObject
  @JSImport("wonder.js/dist/es2015/device/GPUDetector", "EGPUPrecision")
  @js.native
  object EGPUPrecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EGPUPrecision & Double] = js.native
    
    @js.native
    sealed trait HIGHP
      extends StObject
         with EGPUPrecision
    /* 0 */ val HIGHP: typingsJapgolly.wonderJs.distEs2015DeviceGpudetectorMod.EGPUPrecision.HIGHP & Double = js.native
    
    @js.native
    sealed trait LOWP
      extends StObject
         with EGPUPrecision
    /* 2 */ val LOWP: typingsJapgolly.wonderJs.distEs2015DeviceGpudetectorMod.EGPUPrecision.LOWP & Double = js.native
    
    @js.native
    sealed trait MEDIUMP
      extends StObject
         with EGPUPrecision
    /* 1 */ val MEDIUMP: typingsJapgolly.wonderJs.distEs2015DeviceGpudetectorMod.EGPUPrecision.MEDIUMP & Double = js.native
  }
  
  @JSImport("wonder.js/dist/es2015/device/GPUDetector", "GPUDetector")
  @js.native
  open class GPUDetector () extends StObject {
    
    def detect(): Unit = js.native
    
    var extensionCompressedTextureS3TC: Any = js.native
    
    var extensionDepthTexture: Boolean = js.native
    
    var extensionInstancedArrays: Any = js.native
    
    var extensionStandardDerivatives: Boolean = js.native
    
    var extensionTextureFilterAnisotropic: Any = js.native
    
    var extensionUintIndices: Boolean = js.native
    
    var extensionVAO: Any = js.native
    
    val gl: Any = js.native
    
    var maxAnisotropy: Double = js.native
    
    var maxBoneCount: Double = js.native
    
    var maxCubemapTextureSize: Double = js.native
    
    var maxTextureSize: Double = js.native
    
    var maxTextureUnit: Double = js.native
    
    var precision: Double = js.native
  }
  /* static members */
  object GPUDetector {
    
    @JSImport("wonder.js/dist/es2015/device/GPUDetector", "GPUDetector")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
}
