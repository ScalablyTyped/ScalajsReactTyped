package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesTextMapTypesMod.ITextMap
import typingsJapgolly.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiLiveIndicatorTypesMod {
  
  trait ILiveIndicator extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    var isActive: Boolean
    
    var isHidden: Boolean
    
    def show(): Unit
  }
  object ILiveIndicator {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      isActive: Boolean,
      isHidden: Boolean,
      show: Callback
    ): ILiveIndicator = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, isActive = isActive.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], show = show.toJsFn)
      __obj.asInstanceOf[ILiveIndicator]
    }
    
    extension [Self <: ILiveIndicator](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait ILiveIndicatorViewCallbacks extends StObject {
    
    var onClick: EventListenerOrEventListenerObject
  }
  object ILiveIndicatorViewCallbacks {
    
    inline def apply(onClick: EventListenerOrEventListenerObject): ILiveIndicatorViewCallbacks = {
      val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveIndicatorViewCallbacks]
    }
    
    extension [Self <: ILiveIndicatorViewCallbacks](x: Self) {
      
      inline def setOnClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    }
  }
  
  trait ILiveIndicatorViewConfig extends StObject {
    
    var callbacks: ILiveIndicatorViewCallbacks
    
    var textMap: ITextMap
    
    var tooltipService: ITooltipService
  }
  object ILiveIndicatorViewConfig {
    
    inline def apply(callbacks: ILiveIndicatorViewCallbacks, textMap: ITextMap, tooltipService: ITooltipService): ILiveIndicatorViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveIndicatorViewConfig]
    }
    
    extension [Self <: ILiveIndicatorViewConfig](x: Self) {
      
      inline def setCallbacks(value: ILiveIndicatorViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILiveIndicatorViewStyles extends StObject {
    
    var active: String
    
    var clickable: String
    
    var ended: String
    
    var hidden: String
    
    var liveIndicator: String
    
    var liveIndicatorButton: String
  }
  object ILiveIndicatorViewStyles {
    
    inline def apply(
      active: String,
      clickable: String,
      ended: String,
      hidden: String,
      liveIndicator: String,
      liveIndicatorButton: String
    ): ILiveIndicatorViewStyles = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], liveIndicator = liveIndicator.asInstanceOf[js.Any], liveIndicatorButton = liveIndicatorButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveIndicatorViewStyles]
    }
    
    extension [Self <: ILiveIndicatorViewStyles](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClickable(value: String): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setEnded(value: String): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLiveIndicator(value: String): Self = StObject.set(x, "liveIndicator", value.asInstanceOf[js.Any])
      
      inline def setLiveIndicatorButton(value: String): Self = StObject.set(x, "liveIndicatorButton", value.asInstanceOf[js.Any])
    }
  }
}
