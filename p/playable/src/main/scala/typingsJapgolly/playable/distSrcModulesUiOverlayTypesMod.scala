package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiOverlayTypesMod {
  
  trait IOverlay extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def setPoster(src: String): Unit
    
    def show(): Unit
  }
  object IOverlay {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      setPoster: String => Callback,
      show: Callback
    ): IOverlay = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, setPoster = js.Any.fromFunction1((t0: String) => setPoster(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[IOverlay]
    }
    
    extension [Self <: IOverlay](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setSetPoster(value: String => Callback): Self = StObject.set(x, "setPoster", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait IOverlayAPI extends StObject {
    
    var hideOverlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setPoster: js.UndefOr[js.Function1[/* src */ String, Unit]] = js.undefined
    
    var showOverlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IOverlayAPI {
    
    inline def apply(): IOverlayAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayAPI]
    }
    
    extension [Self <: IOverlayAPI](x: Self) {
      
      inline def setHideOverlay(value: Callback): Self = StObject.set(x, "hideOverlay", value.toJsFn)
      
      inline def setHideOverlayUndefined: Self = StObject.set(x, "hideOverlay", js.undefined)
      
      inline def setSetPoster(value: /* src */ String => Callback): Self = StObject.set(x, "setPoster", js.Any.fromFunction1((t0: /* src */ String) => value(t0).runNow()))
      
      inline def setSetPosterUndefined: Self = StObject.set(x, "setPoster", js.undefined)
      
      inline def setShowOverlay(value: Callback): Self = StObject.set(x, "showOverlay", value.toJsFn)
      
      inline def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
    }
  }
  
  trait IOverlayViewCallbacks extends StObject {
    
    var onPlayClick: EventListenerOrEventListenerObject
  }
  object IOverlayViewCallbacks {
    
    inline def apply(onPlayClick: EventListenerOrEventListenerObject): IOverlayViewCallbacks = {
      val __obj = js.Dynamic.literal(onPlayClick = onPlayClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayViewCallbacks]
    }
    
    extension [Self <: IOverlayViewCallbacks](x: Self) {
      
      inline def setOnPlayClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onPlayClick", value.asInstanceOf[js.Any])
      
      inline def setOnPlayClickFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "onPlayClick", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    }
  }
  
  trait IOverlayViewConfig extends StObject {
    
    var callbacks: IOverlayViewCallbacks
    
    var theme: IThemeService
  }
  object IOverlayViewConfig {
    
    inline def apply(callbacks: IOverlayViewCallbacks, theme: IThemeService): IOverlayViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayViewConfig]
    }
    
    extension [Self <: IOverlayViewConfig](x: Self) {
      
      inline def setCallbacks(value: IOverlayViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOverlayViewStyles extends StObject {
    
    var active: String
    
    var hidden: String
    
    var overlay: String
    
    var poster: String
    
    var transparency: String
  }
  object IOverlayViewStyles {
    
    inline def apply(active: String, hidden: String, overlay: String, poster: String, transparency: String): IOverlayViewStyles = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], poster = poster.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayViewStyles]
    }
    
    extension [Self <: IOverlayViewStyles](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setTransparency(value: String): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    }
  }
}
