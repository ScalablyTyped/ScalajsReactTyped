package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.babylonjs.XRSession
import typingsJapgolly.babylonjs.XRWebGLLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXRRenderTarget
  extends StObject
     with IDisposable {
  
  /**
    * xrpresent context of the canvas which can be used to display/mirror xr content
    */
  var canvasContext: WebGLRenderingContext
  
  /**
    * Initializes a XRWebGLLayer to be used as the session's baseLayer.
    * @param xrSession xr session
    * @returns a promise that will resolve once the XR Layer has been created
    */
  def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer]
  
  /**
    * xr layer for the canvas
    */
  var xrLayer: Nullable[XRWebGLLayer]
}
object WebXRRenderTarget {
  
  inline def apply(
    canvasContext: WebGLRenderingContext,
    dispose: Callback,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer]
  ): WebXRRenderTarget = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any], dispose = dispose.toJsFn, initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync), xrLayer = null)
    __obj.asInstanceOf[WebXRRenderTarget]
  }
  
  extension [Self <: WebXRRenderTarget](x: Self) {
    
    inline def setCanvasContext(value: WebGLRenderingContext): Self = StObject.set(x, "canvasContext", value.asInstanceOf[js.Any])
    
    inline def setInitializeXRLayerAsync(value: XRSession => js.Promise[XRWebGLLayer]): Self = StObject.set(x, "initializeXRLayerAsync", js.Any.fromFunction1(value))
    
    inline def setXrLayer(value: Nullable[XRWebGLLayer]): Self = StObject.set(x, "xrLayer", value.asInstanceOf[js.Any])
    
    inline def setXrLayerNull: Self = StObject.set(x, "xrLayer", null)
  }
}
