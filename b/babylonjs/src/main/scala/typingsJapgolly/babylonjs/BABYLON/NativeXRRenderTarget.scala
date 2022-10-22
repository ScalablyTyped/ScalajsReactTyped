package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.babylonjs.XRSession
import typingsJapgolly.babylonjs.XRWebGLLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeXRRenderTarget
  extends StObject
     with WebXRRenderTarget {
  
  /* private */ var _nativeRenderTarget: Any
}
object NativeXRRenderTarget {
  
  inline def apply(
    _nativeRenderTarget: Any,
    canvasContext: WebGLRenderingContext,
    dispose: Callback,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer]
  ): NativeXRRenderTarget = {
    val __obj = js.Dynamic.literal(_nativeRenderTarget = _nativeRenderTarget.asInstanceOf[js.Any], canvasContext = canvasContext.asInstanceOf[js.Any], dispose = dispose.toJsFn, initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync), xrLayer = null)
    __obj.asInstanceOf[NativeXRRenderTarget]
  }
  
  extension [Self <: NativeXRRenderTarget](x: Self) {
    
    inline def set_nativeRenderTarget(value: Any): Self = StObject.set(x, "_nativeRenderTarget", value.asInstanceOf[js.Any])
  }
}
