package typingsJapgolly.babylonjs.xRIndexMod

import typingsJapgolly.babylonjs.XRCompositionLayer
import typingsJapgolly.babylonjs.xRWebXRLayerWrapperMod.WebXRLayerType
import typingsJapgolly.babylonjs.xRWebXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRCompositionLayerWrapper")
@js.native
open class WebXRCompositionLayerWrapper protected ()
  extends typingsJapgolly.babylonjs.xRFeaturesIndexMod.WebXRCompositionLayerWrapper {
  def this(
    getWidth: js.Function0[Double],
    getHeight: js.Function0[Double],
    layer: XRCompositionLayer,
    layerType: WebXRLayerType,
    isMultiview: Boolean,
    createRTTProvider: js.Function1[
        /* xrSessionManager */ typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager, 
        WebXRLayerRenderTargetTextureProvider
      ]
  ) = this()
}
