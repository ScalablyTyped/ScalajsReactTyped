package typingsJapgolly.swiper

import japgolly.scalajs.react.Callback
import typingsJapgolly.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesKeyboardMod {
  
  trait KeyboardEvents extends StObject {
    
    /**
      * Event will be fired on key press
      */
    def keyPress(swiper: default, keyCode: String): Unit
  }
  object KeyboardEvents {
    
    inline def apply(keyPress: (default, String) => Callback): KeyboardEvents = {
      val __obj = js.Dynamic.literal(keyPress = js.Any.fromFunction2((t0: default, t1: String) => (keyPress(t0, t1)).runNow()))
      __obj.asInstanceOf[KeyboardEvents]
    }
    
    extension [Self <: KeyboardEvents](x: Self) {
      
      inline def setKeyPress(value: (default, String) => Callback): Self = StObject.set(x, "keyPress", js.Any.fromFunction2((t0: default, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  trait KeyboardMethods extends StObject {
    
    /**
      * Disable keyboard control
      */
    def disable(): Unit
    
    /**
      * Enable keyboard control
      */
    def enable(): Unit
    
    /**
      * Whether the keyboard control is enabled
      */
    var enabled: Boolean
  }
  object KeyboardMethods {
    
    inline def apply(disable: Callback, enable: Callback, enabled: Boolean): KeyboardMethods = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardMethods]
    }
    
    extension [Self <: KeyboardMethods](x: Self) {
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyboardOptions extends StObject {
    
    /**
      * Set to `true` to enable keyboard control
      *
      * @default false
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled it will control sliders that are currently in viewport
      *
      * @default true
      */
    var onlyInViewport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled it will enable keyboard navigation by Page Up and Page Down keys
      *
      * @default true
      */
    var pageUpDown: js.UndefOr[Boolean] = js.undefined
  }
  object KeyboardOptions {
    
    inline def apply(): KeyboardOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardOptions]
    }
    
    extension [Self <: KeyboardOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setOnlyInViewport(value: Boolean): Self = StObject.set(x, "onlyInViewport", value.asInstanceOf[js.Any])
      
      inline def setOnlyInViewportUndefined: Self = StObject.set(x, "onlyInViewport", js.undefined)
      
      inline def setPageUpDown(value: Boolean): Self = StObject.set(x, "pageUpDown", value.asInstanceOf[js.Any])
      
      inline def setPageUpDownUndefined: Self = StObject.set(x, "pageUpDown", js.undefined)
    }
  }
}
