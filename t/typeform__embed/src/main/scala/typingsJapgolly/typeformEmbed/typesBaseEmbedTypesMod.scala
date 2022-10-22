package typingsJapgolly.typeformEmbed

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaseEmbedTypesMod {
  
  trait EmbedPopup
    extends StObject
       with EmbedWidget {
    
    def close(): Unit
    
    def open(): Unit
    
    def toggle(): Unit
  }
  object EmbedPopup {
    
    inline def apply(
      close: Callback,
      focus: Callback,
      open: Callback,
      refresh: Callback,
      toggle: Callback,
      unmount: Callback
    ): EmbedPopup = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, focus = focus.toJsFn, open = open.toJsFn, refresh = refresh.toJsFn, toggle = toggle.toJsFn, unmount = unmount.toJsFn)
      __obj.asInstanceOf[EmbedPopup]
    }
    
    extension [Self <: EmbedPopup](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.widget
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.popup
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.slider
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.popover
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.`side-tab`
  */
  trait EmbedType extends StObject
  object EmbedType {
    
    inline def popover: typingsJapgolly.typeformEmbed.typeformEmbedStrings.popover = "popover".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.popover]
    
    inline def popup: typingsJapgolly.typeformEmbed.typeformEmbedStrings.popup = "popup".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.popup]
    
    inline def `side-tab`: typingsJapgolly.typeformEmbed.typeformEmbedStrings.`side-tab` = "side-tab".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.`side-tab`]
    
    inline def slider: typingsJapgolly.typeformEmbed.typeformEmbedStrings.slider = "slider".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.slider]
    
    inline def widget: typingsJapgolly.typeformEmbed.typeformEmbedStrings.widget = "widget".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.widget]
  }
  
  trait EmbedWidget extends StObject {
    
    def focus(): Unit
    
    def refresh(): Unit
    
    def unmount(): Unit
  }
  object EmbedWidget {
    
    inline def apply(focus: Callback, refresh: Callback, unmount: Callback): EmbedWidget = {
      val __obj = js.Dynamic.literal(focus = focus.toJsFn, refresh = refresh.toJsFn, unmount = unmount.toJsFn)
      __obj.asInstanceOf[EmbedWidget]
    }
    
    extension [Self <: EmbedWidget](x: Self) {
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
      
      inline def setUnmount(value: Callback): Self = StObject.set(x, "unmount", value.toJsFn)
    }
  }
}
