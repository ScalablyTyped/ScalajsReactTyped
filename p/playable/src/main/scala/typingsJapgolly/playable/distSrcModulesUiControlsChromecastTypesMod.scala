package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesTextMapTypesMod.ITextMap
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typingsJapgolly.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsChromecastTypesMod {
  
  trait IChromecastButton extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def setChromecastButtonCallback(callback: js.Function): Unit
    
    def show(): Unit
  }
  object IChromecastButton {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      setChromecastButtonCallback: js.Function => Callback,
      show: Callback
    ): IChromecastButton = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, setChromecastButtonCallback = js.Any.fromFunction1((t0: js.Function) => setChromecastButtonCallback(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[IChromecastButton]
    }
    
    extension [Self <: IChromecastButton](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setSetChromecastButtonCallback(value: js.Function => Callback): Self = StObject.set(x, "setChromecastButtonCallback", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait IChromecastStyles extends StObject {
    
    var buttonWrapper: String
    
    var downloadButton: String
    
    var hidden: String
  }
  object IChromecastStyles {
    
    inline def apply(buttonWrapper: String, downloadButton: String, hidden: String): IChromecastStyles = {
      val __obj = js.Dynamic.literal(buttonWrapper = buttonWrapper.asInstanceOf[js.Any], downloadButton = downloadButton.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChromecastStyles]
    }
    
    extension [Self <: IChromecastStyles](x: Self) {
      
      inline def setButtonWrapper(value: String): Self = StObject.set(x, "buttonWrapper", value.asInstanceOf[js.Any])
      
      inline def setDownloadButton(value: String): Self = StObject.set(x, "downloadButton", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
  
  trait IChromecastViewCallbacks extends StObject {
    
    var onButtonClick: js.Function
  }
  object IChromecastViewCallbacks {
    
    inline def apply(onButtonClick: js.Function): IChromecastViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = onButtonClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChromecastViewCallbacks]
    }
    
    extension [Self <: IChromecastViewCallbacks](x: Self) {
      
      inline def setOnButtonClick(value: js.Function): Self = StObject.set(x, "onButtonClick", value.asInstanceOf[js.Any])
    }
  }
  
  trait IChromecastViewConfig extends StObject {
    
    var callbacks: IChromecastViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IChromecastViewConfig {
    
    inline def apply(
      callbacks: IChromecastViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IChromecastViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChromecastViewConfig]
    }
    
    extension [Self <: IChromecastViewConfig](x: Self) {
      
      inline def setCallbacks(value: IChromecastViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
}
