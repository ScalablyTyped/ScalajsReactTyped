package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.WebXRLayerType
import typingsJapgolly.babylonjs.XRCompositionLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRCompositionLayerWrapper")
@js.native
open class WebXRCompositionLayerWrapper protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRCompositionLayerWrapper {
  def this(
    getWidth: js.Function0[Double],
    getHeight: js.Function0[Double],
    layer: XRCompositionLayer,
    layerType: WebXRLayerType,
    isMultiview: Boolean,
    createRTTProvider: js.Function1[
        /* xrSessionManager */ typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager, 
        typingsJapgolly.babylonjs.BABYLON.WebXRLayerRenderTargetTextureProvider
      ]
  ) = this()
}
