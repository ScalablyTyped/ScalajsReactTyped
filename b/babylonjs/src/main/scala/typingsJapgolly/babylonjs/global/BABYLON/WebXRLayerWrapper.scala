package typingsJapgolly.babylonjs.global.BABYLON

import org.scalajs.dom.EventTarget
import typingsJapgolly.babylonjs.BABYLON.WebXRLayerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRLayerWrapper")
@js.native
open class WebXRLayerWrapper protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRLayerWrapper {
  /* protected */ def this(
    /** The width of the layer's framebuffer. */
  getWidth: js.Function0[Double],
    /** The height of the layer's framebuffer. */
  getHeight: js.Function0[Double],
    /** The XR layer that this WebXRLayerWrapper wraps. */
  layer: EventTarget,
    /** The type of XR layer that is being wrapped. */
  layerType: WebXRLayerType,
    /** Create a render target provider for the wrapped layer. */
  createRenderTargetTextureProvider: js.Function1[
        /* xrSessionManager */ typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager, 
        typingsJapgolly.babylonjs.BABYLON.WebXRLayerRenderTargetTextureProvider
      ]
  ) = this()
}
