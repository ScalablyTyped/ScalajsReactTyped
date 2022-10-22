package typingsJapgolly.cordovaIonic

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ionic {
  
  trait Keyboard extends StObject {
    
    /**
      * Close the keyboard if it is open.
      */
    def close(): Unit
    
    /**
      * Disable native scrolling, useful if you are using JavaScript to scroll
      *
      * @param disbale
      */
    def disableScroll(disbale: Boolean): Unit
    
    /**
      * Hide the keyboard accessory bar with the next, previous and done buttons.
      *
      * @param hide
      */
    def hideKeyboardAccessoryBar(hide: Boolean): Unit
    
    /**
      * Whether or not the keyboard is currently visible.
      */
    var isVisible: Boolean
    
    /**
      * Force keyboard to be shown on Android.
      * This typically helps if autofocus on a text element does not pop up the keyboard automatically
      *
      * Supported Platforms: Android, Blackberry 10
      */
    def show(): Unit
  }
  object Keyboard {
    
    inline def apply(
      close: Callback,
      disableScroll: Boolean => Callback,
      hideKeyboardAccessoryBar: Boolean => Callback,
      isVisible: Boolean,
      show: Callback
    ): Keyboard = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, disableScroll = js.Any.fromFunction1((t0: Boolean) => disableScroll(t0).runNow()), hideKeyboardAccessoryBar = js.Any.fromFunction1((t0: Boolean) => hideKeyboardAccessoryBar(t0).runNow()), isVisible = isVisible.asInstanceOf[js.Any], show = show.toJsFn)
      __obj.asInstanceOf[Keyboard]
    }
    
    extension [Self <: Keyboard](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setDisableScroll(value: Boolean => Callback): Self = StObject.set(x, "disableScroll", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setHideKeyboardAccessoryBar(value: Boolean => Callback): Self = StObject.set(x, "hideKeyboardAccessoryBar", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
}
