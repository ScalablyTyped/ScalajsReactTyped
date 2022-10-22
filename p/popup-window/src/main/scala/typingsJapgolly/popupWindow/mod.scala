package typingsJapgolly.popupWindow

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("popup-window", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PopupWindow {
    def this(url: String) = this()
    def this(url: String, config: PopupWindowConfig) = this()
    def this(url: Unit, config: PopupWindowConfig) = this()
    
    /**
      * Accepts a callback - the callback is called when the window is closed.
      */
    /* CompleteClass */
    override def blocked(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow = js.native
    
    /**
      * Close the browser window.
      */
    /* CompleteClass */
    override def close(): PopupWindow = js.native
    
    /**
      * Accepts a callback - the callback is called when the window is blocked from opening.
      */
    /* CompleteClass */
    override def closed(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    /**
      * Open a new browser window.
      */
    /* CompleteClass */
    override def open(): PopupWindow = js.native
    
    /**
      * Accepts a callback - the callback is called when the window is opened.
      */
    /* CompleteClass */
    override def opened(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow = js.native
    
    /* CompleteClass */
    override val url: String = js.native
  }
  
  trait PopupWindow extends StObject {
    
    /**
      * Accepts a callback - the callback is called when the window is closed.
      */
    def blocked(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow
    
    /**
      * Close the browser window.
      */
    def close(): PopupWindow
    
    /**
      * Accepts a callback - the callback is called when the window is blocked from opening.
      */
    def closed(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow
    
    val name: String
    
    /**
      * Open a new browser window.
      */
    def open(): PopupWindow
    
    /**
      * Accepts a callback - the callback is called when the window is opened.
      */
    def opened(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow
    
    val url: String
  }
  object PopupWindow {
    
    inline def apply(
      blocked: js.Function1[PopupWindow, Unit] => PopupWindow,
      close: CallbackTo[PopupWindow],
      closed: js.Function1[PopupWindow, Unit] => PopupWindow,
      name: String,
      open: CallbackTo[PopupWindow],
      opened: js.Function1[PopupWindow, Unit] => PopupWindow,
      url: String
    ): PopupWindow = {
      val __obj = js.Dynamic.literal(blocked = js.Any.fromFunction1(blocked), close = close.toJsFn, closed = js.Any.fromFunction1(closed), name = name.asInstanceOf[js.Any], open = open.toJsFn, opened = js.Any.fromFunction1(opened), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupWindow]
    }
    
    extension [Self <: PopupWindow](x: Self) {
      
      inline def setBlocked(value: js.Function1[PopupWindow, Unit] => PopupWindow): Self = StObject.set(x, "blocked", js.Any.fromFunction1(value))
      
      inline def setClose(value: CallbackTo[PopupWindow]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setClosed(value: js.Function1[PopupWindow, Unit] => PopupWindow): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: CallbackTo[PopupWindow]): Self = StObject.set(x, "open", value.toJsFn)
      
      inline def setOpened(value: js.Function1[PopupWindow, Unit] => PopupWindow): Self = StObject.set(x, "opened", js.Any.fromFunction1(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopupWindowConfig extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var location: js.UndefOr[Boolean] = js.undefined
    
    var menubar: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var scrollbars: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[Boolean] = js.undefined
    
    var toolbar: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PopupWindowConfig {
    
    inline def apply(): PopupWindowConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupWindowConfig]
    }
    
    extension [Self <: PopupWindowConfig](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMenubar(value: Boolean): Self = StObject.set(x, "menubar", value.asInstanceOf[js.Any])
      
      inline def setMenubarUndefined: Self = StObject.set(x, "menubar", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setScrollbars(value: Boolean): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
      
      inline def setScrollbarsUndefined: Self = StObject.set(x, "scrollbars", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setToolbar(value: Boolean): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
