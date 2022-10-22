package typingsJapgolly.aframe.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckHasPositionalTracking extends StObject {
  
  def PolyfillControls(object3D: Object3D[Event]): Unit
  
  def checkHasPositionalTracking(): Boolean
  
  def checkHeadsetConnected(): Boolean
  
  def isBrowserEnvironment(): Boolean
  
  def isGearVR(): Boolean
  
  def isIOS(): Boolean
  
  def isLandscape(): Boolean
  
  def isMobile(): Boolean
  
  def isNodeEnvironment(): Boolean
  
  def isOculusGo(): Boolean
  
  def isR7(): Boolean
  
  def isTablet(): Boolean
  
  var isWebXRAvailable: Boolean
}
object CheckHasPositionalTracking {
  
  inline def apply(
    PolyfillControls: Object3D[Event] => Callback,
    checkHasPositionalTracking: CallbackTo[Boolean],
    checkHeadsetConnected: CallbackTo[Boolean],
    isBrowserEnvironment: CallbackTo[Boolean],
    isGearVR: CallbackTo[Boolean],
    isIOS: CallbackTo[Boolean],
    isLandscape: CallbackTo[Boolean],
    isMobile: CallbackTo[Boolean],
    isNodeEnvironment: CallbackTo[Boolean],
    isOculusGo: CallbackTo[Boolean],
    isR7: CallbackTo[Boolean],
    isTablet: CallbackTo[Boolean],
    isWebXRAvailable: Boolean
  ): CheckHasPositionalTracking = {
    val __obj = js.Dynamic.literal(PolyfillControls = js.Any.fromFunction1((t0: Object3D[Event]) => PolyfillControls(t0).runNow()), checkHasPositionalTracking = checkHasPositionalTracking.toJsFn, checkHeadsetConnected = checkHeadsetConnected.toJsFn, isBrowserEnvironment = isBrowserEnvironment.toJsFn, isGearVR = isGearVR.toJsFn, isIOS = isIOS.toJsFn, isLandscape = isLandscape.toJsFn, isMobile = isMobile.toJsFn, isNodeEnvironment = isNodeEnvironment.toJsFn, isOculusGo = isOculusGo.toJsFn, isR7 = isR7.toJsFn, isTablet = isTablet.toJsFn, isWebXRAvailable = isWebXRAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckHasPositionalTracking]
  }
  
  extension [Self <: CheckHasPositionalTracking](x: Self) {
    
    inline def setCheckHasPositionalTracking(value: CallbackTo[Boolean]): Self = StObject.set(x, "checkHasPositionalTracking", value.toJsFn)
    
    inline def setCheckHeadsetConnected(value: CallbackTo[Boolean]): Self = StObject.set(x, "checkHeadsetConnected", value.toJsFn)
    
    inline def setIsBrowserEnvironment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBrowserEnvironment", value.toJsFn)
    
    inline def setIsGearVR(value: CallbackTo[Boolean]): Self = StObject.set(x, "isGearVR", value.toJsFn)
    
    inline def setIsIOS(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIOS", value.toJsFn)
    
    inline def setIsLandscape(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLandscape", value.toJsFn)
    
    inline def setIsMobile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMobile", value.toJsFn)
    
    inline def setIsNodeEnvironment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNodeEnvironment", value.toJsFn)
    
    inline def setIsOculusGo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOculusGo", value.toJsFn)
    
    inline def setIsR7(value: CallbackTo[Boolean]): Self = StObject.set(x, "isR7", value.toJsFn)
    
    inline def setIsTablet(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTablet", value.toJsFn)
    
    inline def setIsWebXRAvailable(value: Boolean): Self = StObject.set(x, "isWebXRAvailable", value.asInstanceOf[js.Any])
    
    inline def setPolyfillControls(value: Object3D[Event] => Callback): Self = StObject.set(x, "PolyfillControls", js.Any.fromFunction1((t0: Object3D[Event]) => value(t0).runNow()))
  }
}
