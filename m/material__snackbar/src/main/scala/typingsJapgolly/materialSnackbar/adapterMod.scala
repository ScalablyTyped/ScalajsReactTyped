package typingsJapgolly.materialSnackbar

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCSnackbarAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def announce(): Unit
    
    def notifyClosed(reason: String): Unit
    
    def notifyClosing(reason: String): Unit
    
    def notifyOpened(): Unit
    
    def notifyOpening(): Unit
    
    def removeClass(className: String): Unit
  }
  object MDCSnackbarAdapter {
    
    inline def apply(
      addClass: String => Callback,
      announce: Callback,
      notifyClosed: String => Callback,
      notifyClosing: String => Callback,
      notifyOpened: Callback,
      notifyOpening: Callback,
      removeClass: String => Callback
    ): MDCSnackbarAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), announce = announce.toJsFn, notifyClosed = js.Any.fromFunction1((t0: String) => notifyClosed(t0).runNow()), notifyClosing = js.Any.fromFunction1((t0: String) => notifyClosing(t0).runNow()), notifyOpened = notifyOpened.toJsFn, notifyOpening = notifyOpening.toJsFn, removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()))
      __obj.asInstanceOf[MDCSnackbarAdapter]
    }
    
    extension [Self <: MDCSnackbarAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAnnounce(value: Callback): Self = StObject.set(x, "announce", value.toJsFn)
      
      inline def setNotifyClosed(value: String => Callback): Self = StObject.set(x, "notifyClosed", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setNotifyClosing(value: String => Callback): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setNotifyOpened(value: Callback): Self = StObject.set(x, "notifyOpened", value.toJsFn)
      
      inline def setNotifyOpening(value: Callback): Self = StObject.set(x, "notifyOpening", value.toJsFn)
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
