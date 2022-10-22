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

object distSrcModulesUiControlsDownloadTypesMod {
  
  trait IDownloadButton extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def setDownloadClickCallback(callback: js.Function0[Unit]): Unit
    
    def show(): Unit
  }
  object IDownloadButton {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      setDownloadClickCallback: js.Function0[Unit] => Callback,
      show: Callback
    ): IDownloadButton = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, setDownloadClickCallback = js.Any.fromFunction1((t0: js.Function0[Unit]) => setDownloadClickCallback(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[IDownloadButton]
    }
    
    extension [Self <: IDownloadButton](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setSetDownloadClickCallback(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "setDownloadClickCallback", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait IDownloadButtonAPI extends StObject {
    
    var setDownloadClickCallback: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.undefined
  }
  object IDownloadButtonAPI {
    
    inline def apply(): IDownloadButtonAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDownloadButtonAPI]
    }
    
    extension [Self <: IDownloadButtonAPI](x: Self) {
      
      inline def setSetDownloadClickCallback(value: /* callback */ js.Function0[Unit] => Callback): Self = StObject.set(x, "setDownloadClickCallback", js.Any.fromFunction1((t0: /* callback */ js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setSetDownloadClickCallbackUndefined: Self = StObject.set(x, "setDownloadClickCallback", js.undefined)
    }
  }
  
  trait IDownloadViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IDownloadViewCallbacks {
    
    inline def apply(onButtonClick: Callback): IDownloadViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = onButtonClick.toJsFn)
      __obj.asInstanceOf[IDownloadViewCallbacks]
    }
    
    extension [Self <: IDownloadViewCallbacks](x: Self) {
      
      inline def setOnButtonClick(value: Callback): Self = StObject.set(x, "onButtonClick", value.toJsFn)
    }
  }
  
  trait IDownloadViewConfig extends StObject {
    
    var callbacks: IDownloadViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IDownloadViewConfig {
    
    inline def apply(
      callbacks: IDownloadViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IDownloadViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDownloadViewConfig]
    }
    
    extension [Self <: IDownloadViewConfig](x: Self) {
      
      inline def setCallbacks(value: IDownloadViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDownloadViewStyles extends StObject {
    
    var buttonWrapper: String
    
    var downloadButton: String
    
    var hidden: String
  }
  object IDownloadViewStyles {
    
    inline def apply(buttonWrapper: String, downloadButton: String, hidden: String): IDownloadViewStyles = {
      val __obj = js.Dynamic.literal(buttonWrapper = buttonWrapper.asInstanceOf[js.Any], downloadButton = downloadButton.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDownloadViewStyles]
    }
    
    extension [Self <: IDownloadViewStyles](x: Self) {
      
      inline def setButtonWrapper(value: String): Self = StObject.set(x, "buttonWrapper", value.asInstanceOf[js.Any])
      
      inline def setDownloadButton(value: String): Self = StObject.set(x, "downloadButton", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
}
