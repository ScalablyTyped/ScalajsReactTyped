package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiTopBlockTypesMod {
  
  trait ITopBlock extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def hideContent(): Unit
    
    def hideLiveIndicator(): Unit
    
    def hideTitle(): Unit
    
    var isFocused: Boolean
    
    def show(): Unit
    
    def showContent(): Unit
    
    def showLiveIndicator(): Unit
    
    def showTitle(): Unit
  }
  object ITopBlock {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      hideContent: Callback,
      hideLiveIndicator: Callback,
      hideTitle: Callback,
      isFocused: Boolean,
      show: Callback,
      showContent: Callback,
      showLiveIndicator: Callback,
      showTitle: Callback
    ): ITopBlock = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, hideContent = hideContent.toJsFn, hideLiveIndicator = hideLiveIndicator.toJsFn, hideTitle = hideTitle.toJsFn, isFocused = isFocused.asInstanceOf[js.Any], show = show.toJsFn, showContent = showContent.toJsFn, showLiveIndicator = showLiveIndicator.toJsFn, showTitle = showTitle.toJsFn)
      __obj.asInstanceOf[ITopBlock]
    }
    
    extension [Self <: ITopBlock](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setHideContent(value: Callback): Self = StObject.set(x, "hideContent", value.toJsFn)
      
      inline def setHideLiveIndicator(value: Callback): Self = StObject.set(x, "hideLiveIndicator", value.toJsFn)
      
      inline def setHideTitle(value: Callback): Self = StObject.set(x, "hideTitle", value.toJsFn)
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setShowContent(value: Callback): Self = StObject.set(x, "showContent", value.toJsFn)
      
      inline def setShowLiveIndicator(value: Callback): Self = StObject.set(x, "showLiveIndicator", value.toJsFn)
      
      inline def setShowTitle(value: Callback): Self = StObject.set(x, "showTitle", value.toJsFn)
    }
  }
  
  trait ITopBlockAPI extends StObject {
    
    var hideLiveIndicator: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hideTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showLiveIndicator: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ITopBlockAPI {
    
    inline def apply(): ITopBlockAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITopBlockAPI]
    }
    
    extension [Self <: ITopBlockAPI](x: Self) {
      
      inline def setHideLiveIndicator(value: Callback): Self = StObject.set(x, "hideLiveIndicator", value.toJsFn)
      
      inline def setHideLiveIndicatorUndefined: Self = StObject.set(x, "hideLiveIndicator", js.undefined)
      
      inline def setHideTitle(value: Callback): Self = StObject.set(x, "hideTitle", value.toJsFn)
      
      inline def setHideTitleUndefined: Self = StObject.set(x, "hideTitle", js.undefined)
      
      inline def setShowLiveIndicator(value: Callback): Self = StObject.set(x, "showLiveIndicator", value.toJsFn)
      
      inline def setShowLiveIndicatorUndefined: Self = StObject.set(x, "showLiveIndicator", js.undefined)
      
      inline def setShowTitle(value: Callback): Self = StObject.set(x, "showTitle", value.toJsFn)
      
      inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    }
  }
  
  trait ITopBlockViewCallbacks extends StObject {
    
    var onBlockMouseMove: EventListenerOrEventListenerObject
    
    var onBlockMouseOut: EventListenerOrEventListenerObject
  }
  object ITopBlockViewCallbacks {
    
    inline def apply(
      onBlockMouseMove: EventListenerOrEventListenerObject,
      onBlockMouseOut: EventListenerOrEventListenerObject
    ): ITopBlockViewCallbacks = {
      val __obj = js.Dynamic.literal(onBlockMouseMove = onBlockMouseMove.asInstanceOf[js.Any], onBlockMouseOut = onBlockMouseOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewCallbacks]
    }
    
    extension [Self <: ITopBlockViewCallbacks](x: Self) {
      
      inline def setOnBlockMouseMove(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onBlockMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnBlockMouseMoveFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "onBlockMouseMove", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
      
      inline def setOnBlockMouseOut(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onBlockMouseOut", value.asInstanceOf[js.Any])
      
      inline def setOnBlockMouseOutFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "onBlockMouseOut", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    }
  }
  
  trait ITopBlockViewConfig extends StObject {
    
    var callbacks: ITopBlockViewCallbacks
    
    var elements: ITopBlockViewElements
  }
  object ITopBlockViewConfig {
    
    inline def apply(callbacks: ITopBlockViewCallbacks, elements: ITopBlockViewElements): ITopBlockViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewConfig]
    }
    
    extension [Self <: ITopBlockViewConfig](x: Self) {
      
      inline def setCallbacks(value: ITopBlockViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setElements(value: ITopBlockViewElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITopBlockViewElements extends StObject {
    
    var liveIndicator: HTMLElement
    
    var title: HTMLElement
  }
  object ITopBlockViewElements {
    
    inline def apply(liveIndicator: HTMLElement, title: HTMLElement): ITopBlockViewElements = {
      val __obj = js.Dynamic.literal(liveIndicator = liveIndicator.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewElements]
    }
    
    extension [Self <: ITopBlockViewElements](x: Self) {
      
      inline def setLiveIndicator(value: HTMLElement): Self = StObject.set(x, "liveIndicator", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: HTMLElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITopBlockViewStyles extends StObject {
    
    var activated: String
    
    var elementsContainer: String
    
    var hidden: String
    
    var liveIndicatorContainer: String
    
    var titleContainer: String
    
    var topBlock: String
  }
  object ITopBlockViewStyles {
    
    inline def apply(
      activated: String,
      elementsContainer: String,
      hidden: String,
      liveIndicatorContainer: String,
      titleContainer: String,
      topBlock: String
    ): ITopBlockViewStyles = {
      val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], elementsContainer = elementsContainer.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], liveIndicatorContainer = liveIndicatorContainer.asInstanceOf[js.Any], titleContainer = titleContainer.asInstanceOf[js.Any], topBlock = topBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewStyles]
    }
    
    extension [Self <: ITopBlockViewStyles](x: Self) {
      
      inline def setActivated(value: String): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      inline def setElementsContainer(value: String): Self = StObject.set(x, "elementsContainer", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLiveIndicatorContainer(value: String): Self = StObject.set(x, "liveIndicatorContainer", value.asInstanceOf[js.Any])
      
      inline def setTitleContainer(value: String): Self = StObject.set(x, "titleContainer", value.asInstanceOf[js.Any])
      
      inline def setTopBlock(value: String): Self = StObject.set(x, "topBlock", value.asInstanceOf[js.Any])
    }
  }
}
