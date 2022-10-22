package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.xRNativeNativeXRFrameMod.INativeXRFrame
import typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRNativeIndexMod {
  
  @JSImport("babylonjs/XR/native/index", "NativeXRFrame")
  @js.native
  open class NativeXRFrame protected ()
    extends typingsJapgolly.babylonjs.xRNativeNativeXRFrameMod.NativeXRFrame {
    def this(_nativeImpl: INativeXRFrame) = this()
  }
  
  @JSImport("babylonjs/XR/native/index", "NativeXRLayerRenderTargetTextureProvider")
  @js.native
  open class NativeXRLayerRenderTargetTextureProvider protected ()
    extends typingsJapgolly.babylonjs.xRNativeNativeXRRenderTargetMod.NativeXRLayerRenderTargetTextureProvider {
    def this(
      sessionManager: WebXRSessionManager,
      layerWrapper: typingsJapgolly.babylonjs.xRNativeNativeXRRenderTargetMod.NativeXRLayerWrapper
    ) = this()
  }
  
  @JSImport("babylonjs/XR/native/index", "NativeXRLayerWrapper")
  @js.native
  open class NativeXRLayerWrapper protected ()
    extends typingsJapgolly.babylonjs.xRNativeNativeXRRenderTargetMod.NativeXRLayerWrapper {
    def this(layer: XRWebGLLayer) = this()
  }
  
  @JSImport("babylonjs/XR/native/index", "NativeXRRenderTarget")
  @js.native
  open class NativeXRRenderTarget protected ()
    extends typingsJapgolly.babylonjs.xRNativeNativeXRRenderTargetMod.NativeXRRenderTarget {
    def this(_xrSessionManager: WebXRSessionManager) = this()
  }
}
