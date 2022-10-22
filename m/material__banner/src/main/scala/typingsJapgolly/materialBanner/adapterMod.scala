package typingsJapgolly.materialBanner

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialBanner.constantsMod.Action
import typingsJapgolly.materialBanner.constantsMod.CloseReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCBannerAdapter extends StObject {
    
    /**
      * Adds the given class to the banner root element.
      */
    def addClass(className: String): Unit
    
    /**
      * @return Returns the height of the banner content element.
      */
    def getContentHeight(): Double
    
    /**
      * Broadcasts an event denoting that a banner button was clicked without
      * changing the banner state.
      */
    def notifyActionClicked(action: Action): Unit
    
    /**
      * Broadcasts an event denoting that the banner has finished closing.
      */
    def notifyClosed(reason: CloseReason): Unit
    
    /**
      * Broadcasts an event denoting that the banner has just started closing.
      */
    def notifyClosing(reason: CloseReason): Unit
    
    /**
      * Broadcasts an event denoting that the banner has finished opening.
      */
    def notifyOpened(): Unit
    
    /**
      * Broadcasts an event denoting that the banner has just started opening.
      */
    def notifyOpening(): Unit
    
    /**
      * Releases focus from banner and restores focus to the previously focused
      * element.
      */
    def releaseFocus(): Unit
    
    /**
      * Removes the given class from the banner root element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets a style property of the banner root element to the passed value.
      */
    def setStyleProperty(propertyName: String, value: String): Unit
    
    /**
      * Traps focus in banner and focuses on the primary action button.
      */
    def trapFocus(): Unit
  }
  object MDCBannerAdapter {
    
    inline def apply(
      addClass: String => Callback,
      getContentHeight: CallbackTo[Double],
      notifyActionClicked: Action => Callback,
      notifyClosed: CloseReason => Callback,
      notifyClosing: CloseReason => Callback,
      notifyOpened: Callback,
      notifyOpening: Callback,
      releaseFocus: Callback,
      removeClass: String => Callback,
      setStyleProperty: (String, String) => Callback,
      trapFocus: Callback
    ): MDCBannerAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), getContentHeight = getContentHeight.toJsFn, notifyActionClicked = js.Any.fromFunction1((t0: Action) => notifyActionClicked(t0).runNow()), notifyClosed = js.Any.fromFunction1((t0: CloseReason) => notifyClosed(t0).runNow()), notifyClosing = js.Any.fromFunction1((t0: CloseReason) => notifyClosing(t0).runNow()), notifyOpened = notifyOpened.toJsFn, notifyOpening = notifyOpening.toJsFn, releaseFocus = releaseFocus.toJsFn, removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setStyleProperty = js.Any.fromFunction2((t0: String, t1: String) => (setStyleProperty(t0, t1)).runNow()), trapFocus = trapFocus.toJsFn)
      __obj.asInstanceOf[MDCBannerAdapter]
    }
    
    extension [Self <: MDCBannerAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetContentHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getContentHeight", value.toJsFn)
      
      inline def setNotifyActionClicked(value: Action => Callback): Self = StObject.set(x, "notifyActionClicked", js.Any.fromFunction1((t0: Action) => value(t0).runNow()))
      
      inline def setNotifyClosed(value: CloseReason => Callback): Self = StObject.set(x, "notifyClosed", js.Any.fromFunction1((t0: CloseReason) => value(t0).runNow()))
      
      inline def setNotifyClosing(value: CloseReason => Callback): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1((t0: CloseReason) => value(t0).runNow()))
      
      inline def setNotifyOpened(value: Callback): Self = StObject.set(x, "notifyOpened", value.toJsFn)
      
      inline def setNotifyOpening(value: Callback): Self = StObject.set(x, "notifyOpening", value.toJsFn)
      
      inline def setReleaseFocus(value: Callback): Self = StObject.set(x, "releaseFocus", value.toJsFn)
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetStyleProperty(value: (String, String) => Callback): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setTrapFocus(value: Callback): Self = StObject.set(x, "trapFocus", value.toJsFn)
    }
  }
}
