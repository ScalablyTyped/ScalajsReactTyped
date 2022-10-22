package typingsJapgolly.babylonjs.xRFeaturesIndexMod

import typingsJapgolly.babylonjs.XRCompositionLayer
import typingsJapgolly.babylonjs.xRWebXRLayerWrapperMod.WebXRLayerType
import typingsJapgolly.babylonjs.xRWebXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRCompositionLayerWrapper")
@js.native
open class WebXRCompositionLayerWrapper protected ()
  extends typingsJapgolly.babylonjs.xRFeaturesWebXRLayersMod.WebXRCompositionLayerWrapper {
  def this(
    getWidth: js.Function0[Double],
    getHeight: js.Function0[Double],
    layer: XRCompositionLayer,
    layerType: WebXRLayerType,
    isMultiview: Boolean,
    createRTTProvider: js.Function1[/* xrSessionManager */ WebXRSessionManager, WebXRLayerRenderTargetTextureProvider]
  ) = this()
}
