package typingsJapgolly.babylonjs

import org.scalajs.dom.EventTarget
import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.babylonjs.xRWebXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRWebXRLayerWrapperMod {
  
  @JSImport("babylonjs/XR/webXRLayerWrapper", "WebXRLayerWrapper")
  @js.native
  open class WebXRLayerWrapper protected () extends StObject {
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
    createRenderTargetTextureProvider: js.Function1[/* xrSessionManager */ WebXRSessionManager, WebXRLayerRenderTargetTextureProvider]
    ) = this()
    
    /** Create a render target provider for the wrapped layer. */
    def createRenderTargetTextureProvider(xrSessionManager: WebXRSessionManager): WebXRLayerRenderTargetTextureProvider = js.native
    
    /**
      * Get the fixed foveation currently set, as specified by the webxr specs
      * If this returns null, then fixed foveation is not supported
      */
    def fixedFoveation: Nullable[Double] = js.native
    /**
      * Set the fixed foveation to the specified value, as specified by the webxr specs
      * This value will be normalized to be between 0 and 1, 1 being max foveation, 0 being no foveation
      */
    def fixedFoveation_=(value: Nullable[Double]): Unit = js.native
    
    /** The height of the layer's framebuffer. */
    def getHeight(): Double = js.native
    
    /** The width of the layer's framebuffer. */
    def getWidth(): Double = js.native
    
    /**
      * Check if fixed foveation is supported on this device
      */
    def isFixedFoveationSupported: Boolean = js.native
    
    /** The XR layer that this WebXRLayerWrapper wraps. */
    val layer: EventTarget = js.native
    
    /** The type of XR layer that is being wrapped. */
    val layerType: WebXRLayerType = js.native
  }
  
  type WebXRCompositionLayerType = typingsJapgolly.babylonjs.babylonjsStrings.XRProjectionLayer
  
  type WebXRLayerType = typingsJapgolly.babylonjs.babylonjsStrings.XRWebGLLayer | WebXRCompositionLayerType
}
