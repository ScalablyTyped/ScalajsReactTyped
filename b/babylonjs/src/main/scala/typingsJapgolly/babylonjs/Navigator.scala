package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.MediaStreamConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type definitions for non-npm package webxr 0.5
// Project: https://www.w3.org/TR/webxr/
// Definitions by: Rob Rohan <https://github.com/robrohan>
//                 Raanan Weber <https://github.com/RaananW>
//                 Sean T. McBeth <https://github.com/capnmidnight>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// Minimum TypeScript Version: 3.7
// Most of this was hand written and... more or less copied from the following
// sites:
//  https://www.w3.org/TR/webxr/
//  https://developer.mozilla.org/en-US/docs/Web/API/WebXR_Device_API
//  https://www.w3.org/immersive-web/
//  https://github.com/immersive-web
//
/**
  * ref: https://immersive-web.github.io/webxr/#navigator-xr-attribute
  */
trait Navigator extends StObject {
  
  val activeVRDisplays: js.Array[VRDisplay]
  
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]]
  
  val gpu: js.UndefOr[GPU] = js.undefined
  
  def mozGetUserMedia(constraints: MediaStreamConstraints, successCallback: Any, errorCallback: Any): Unit
  
  def mozGetVRDevices(any: Any): Any
  
  def msGetGamepads(): js.Array[Gamepad]
  
  def msGetUserMedia(constraints: MediaStreamConstraints, successCallback: Any, errorCallback: Any): Unit
  
  def webkitGamepads(): js.Array[Gamepad]
  
  def webkitGetGamepads(): js.Array[Gamepad]
  
  def webkitGetUserMedia(constraints: MediaStreamConstraints, successCallback: Any, errorCallback: Any): Unit
  
  /**
    * An XRSystem object is the entry point to the API, used to query for XR features
    * available to the user agent and initiate communication with XR hardware via the
    * creation of XRSessions.
    */
  var xr: js.UndefOr[XRSystem] = js.undefined
}
object Navigator {
  
  inline def apply(
    activeVRDisplays: js.Array[VRDisplay],
    getVRDisplays: CallbackTo[js.Promise[js.Array[VRDisplay]]],
    mozGetUserMedia: (MediaStreamConstraints, Any, Any) => Callback,
    mozGetVRDevices: Any => Any,
    msGetGamepads: CallbackTo[js.Array[Gamepad]],
    msGetUserMedia: (MediaStreamConstraints, Any, Any) => Callback,
    webkitGamepads: CallbackTo[js.Array[Gamepad]],
    webkitGetGamepads: CallbackTo[js.Array[Gamepad]],
    webkitGetUserMedia: (MediaStreamConstraints, Any, Any) => Callback
  ): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays.asInstanceOf[js.Any], getVRDisplays = getVRDisplays.toJsFn, mozGetUserMedia = js.Any.fromFunction3((t0: MediaStreamConstraints, t1: Any, t2: Any) => (mozGetUserMedia(t0, t1, t2)).runNow()), mozGetVRDevices = js.Any.fromFunction1(mozGetVRDevices), msGetGamepads = msGetGamepads.toJsFn, msGetUserMedia = js.Any.fromFunction3((t0: MediaStreamConstraints, t1: Any, t2: Any) => (msGetUserMedia(t0, t1, t2)).runNow()), webkitGamepads = webkitGamepads.toJsFn, webkitGetGamepads = webkitGetGamepads.toJsFn, webkitGetUserMedia = js.Any.fromFunction3((t0: MediaStreamConstraints, t1: Any, t2: Any) => (webkitGetUserMedia(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setActiveVRDisplays(value: js.Array[VRDisplay]): Self = StObject.set(x, "activeVRDisplays", value.asInstanceOf[js.Any])
    
    inline def setActiveVRDisplaysVarargs(value: VRDisplay*): Self = StObject.set(x, "activeVRDisplays", js.Array(value*))
    
    inline def setGetVRDisplays(value: CallbackTo[js.Promise[js.Array[VRDisplay]]]): Self = StObject.set(x, "getVRDisplays", value.toJsFn)
    
    inline def setGpu(value: GPU): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
    
    inline def setGpuUndefined: Self = StObject.set(x, "gpu", js.undefined)
    
    inline def setMozGetUserMedia(value: (MediaStreamConstraints, Any, Any) => Callback): Self = StObject.set(x, "mozGetUserMedia", js.Any.fromFunction3((t0: MediaStreamConstraints, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setMozGetVRDevices(value: Any => Any): Self = StObject.set(x, "mozGetVRDevices", js.Any.fromFunction1(value))
    
    inline def setMsGetGamepads(value: CallbackTo[js.Array[Gamepad]]): Self = StObject.set(x, "msGetGamepads", value.toJsFn)
    
    inline def setMsGetUserMedia(value: (MediaStreamConstraints, Any, Any) => Callback): Self = StObject.set(x, "msGetUserMedia", js.Any.fromFunction3((t0: MediaStreamConstraints, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setWebkitGamepads(value: CallbackTo[js.Array[Gamepad]]): Self = StObject.set(x, "webkitGamepads", value.toJsFn)
    
    inline def setWebkitGetGamepads(value: CallbackTo[js.Array[Gamepad]]): Self = StObject.set(x, "webkitGetGamepads", value.toJsFn)
    
    inline def setWebkitGetUserMedia(value: (MediaStreamConstraints, Any, Any) => Callback): Self = StObject.set(x, "webkitGetUserMedia", js.Any.fromFunction3((t0: MediaStreamConstraints, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setXr(value: XRSystem): Self = StObject.set(x, "xr", value.asInstanceOf[js.Any])
    
    inline def setXrUndefined: Self = StObject.set(x, "xr", js.undefined)
  }
}
