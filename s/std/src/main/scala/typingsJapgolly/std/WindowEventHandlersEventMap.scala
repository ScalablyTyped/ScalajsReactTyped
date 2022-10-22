package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEventHandlersEventMap extends StObject {
  
  /* standard dom */
  var afterprint: org.scalajs.dom.Event
  
  /* standard dom */
  var beforeprint: org.scalajs.dom.Event
  
  /* standard dom */
  var beforeunload: org.scalajs.dom.BeforeUnloadEvent
  
  /* standard dom */
  var gamepadconnected: org.scalajs.dom.GamepadEvent
  
  /* standard dom */
  var gamepaddisconnected: org.scalajs.dom.GamepadEvent
  
  /* standard dom */
  var hashchange: org.scalajs.dom.HashChangeEvent
  
  /* standard dom */
  var languagechange: org.scalajs.dom.Event
  
  /* standard dom */
  var message: org.scalajs.dom.MessageEvent
  
  /* standard dom */
  var messageerror: org.scalajs.dom.MessageEvent
  
  /* standard dom */
  var offline: org.scalajs.dom.Event
  
  /* standard dom */
  var online: org.scalajs.dom.Event
  
  /* standard dom */
  var pagehide: PageTransitionEvent
  
  /* standard dom */
  var pageshow: PageTransitionEvent
  
  /* standard dom */
  var popstate: org.scalajs.dom.PopStateEvent
  
  /* standard dom */
  var rejectionhandled: PromiseRejectionEvent
  
  /* standard dom */
  var storage: org.scalajs.dom.StorageEvent
  
  /* standard dom */
  var unhandledrejection: PromiseRejectionEvent
  
  /* standard dom */
  var unload: org.scalajs.dom.Event
}
object WindowEventHandlersEventMap {
  
  inline def apply(
    afterprint: org.scalajs.dom.Event,
    beforeprint: org.scalajs.dom.Event,
    beforeunload: org.scalajs.dom.BeforeUnloadEvent,
    gamepadconnected: org.scalajs.dom.GamepadEvent,
    gamepaddisconnected: org.scalajs.dom.GamepadEvent,
    hashchange: org.scalajs.dom.HashChangeEvent,
    languagechange: org.scalajs.dom.Event,
    message: org.scalajs.dom.MessageEvent,
    messageerror: org.scalajs.dom.MessageEvent,
    offline: org.scalajs.dom.Event,
    online: org.scalajs.dom.Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: org.scalajs.dom.PopStateEvent,
    rejectionhandled: PromiseRejectionEvent,
    storage: org.scalajs.dom.StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: org.scalajs.dom.Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], gamepadconnected = gamepadconnected.asInstanceOf[js.Any], gamepaddisconnected = gamepaddisconnected.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
  
  extension [Self <: WindowEventHandlersEventMap](x: Self) {
    
    inline def setAfterprint(value: org.scalajs.dom.Event): Self = StObject.set(x, "afterprint", value.asInstanceOf[js.Any])
    
    inline def setBeforeprint(value: org.scalajs.dom.Event): Self = StObject.set(x, "beforeprint", value.asInstanceOf[js.Any])
    
    inline def setBeforeunload(value: org.scalajs.dom.BeforeUnloadEvent): Self = StObject.set(x, "beforeunload", value.asInstanceOf[js.Any])
    
    inline def setGamepadconnected(value: org.scalajs.dom.GamepadEvent): Self = StObject.set(x, "gamepadconnected", value.asInstanceOf[js.Any])
    
    inline def setGamepaddisconnected(value: org.scalajs.dom.GamepadEvent): Self = StObject.set(x, "gamepaddisconnected", value.asInstanceOf[js.Any])
    
    inline def setHashchange(value: org.scalajs.dom.HashChangeEvent): Self = StObject.set(x, "hashchange", value.asInstanceOf[js.Any])
    
    inline def setLanguagechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "languagechange", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    
    inline def setOffline(value: org.scalajs.dom.Event): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    inline def setOnline(value: org.scalajs.dom.Event): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setPagehide(value: PageTransitionEvent): Self = StObject.set(x, "pagehide", value.asInstanceOf[js.Any])
    
    inline def setPageshow(value: PageTransitionEvent): Self = StObject.set(x, "pageshow", value.asInstanceOf[js.Any])
    
    inline def setPopstate(value: org.scalajs.dom.PopStateEvent): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
    
    inline def setRejectionhandled(value: PromiseRejectionEvent): Self = StObject.set(x, "rejectionhandled", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: org.scalajs.dom.StorageEvent): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setUnhandledrejection(value: PromiseRejectionEvent): Self = StObject.set(x, "unhandledrejection", value.asInstanceOf[js.Any])
    
    inline def setUnload(value: org.scalajs.dom.Event): Self = StObject.set(x, "unload", value.asInstanceOf[js.Any])
  }
}
