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

object distSrcModulesUiControlsFullScreenTypesMod {
  
  trait IFullScreenControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def show(): Unit
  }
  object IFullScreenControl {
    
    inline def apply(destroy: Callback, getElement: CallbackTo[HTMLElement], hide: Callback, show: Callback): IFullScreenControl = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[IFullScreenControl]
    }
    
    extension [Self <: IFullScreenControl](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait IFullScreenViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IFullScreenViewCallbacks {
    
    inline def apply(onButtonClick: Callback): IFullScreenViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = onButtonClick.toJsFn)
      __obj.asInstanceOf[IFullScreenViewCallbacks]
    }
    
    extension [Self <: IFullScreenViewCallbacks](x: Self) {
      
      inline def setOnButtonClick(value: Callback): Self = StObject.set(x, "onButtonClick", value.toJsFn)
    }
  }
  
  trait IFullScreenViewConfig extends StObject {
    
    var callbacks: IFullScreenViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IFullScreenViewConfig {
    
    inline def apply(
      callbacks: IFullScreenViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IFullScreenViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFullScreenViewConfig]
    }
    
    extension [Self <: IFullScreenViewConfig](x: Self) {
      
      inline def setCallbacks(value: IFullScreenViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFullScreenViewStyles extends StObject {
    
    var enterIcon: String
    
    var exitIcon: String
    
    var fullScreenControl: String
    
    var fullScreenToggle: String
    
    var hidden: String
    
    var icon: String
    
    var inFullScreen: String
  }
  object IFullScreenViewStyles {
    
    inline def apply(
      enterIcon: String,
      exitIcon: String,
      fullScreenControl: String,
      fullScreenToggle: String,
      hidden: String,
      icon: String,
      inFullScreen: String
    ): IFullScreenViewStyles = {
      val __obj = js.Dynamic.literal(enterIcon = enterIcon.asInstanceOf[js.Any], exitIcon = exitIcon.asInstanceOf[js.Any], fullScreenControl = fullScreenControl.asInstanceOf[js.Any], fullScreenToggle = fullScreenToggle.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], inFullScreen = inFullScreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFullScreenViewStyles]
    }
    
    extension [Self <: IFullScreenViewStyles](x: Self) {
      
      inline def setEnterIcon(value: String): Self = StObject.set(x, "enterIcon", value.asInstanceOf[js.Any])
      
      inline def setExitIcon(value: String): Self = StObject.set(x, "exitIcon", value.asInstanceOf[js.Any])
      
      inline def setFullScreenControl(value: String): Self = StObject.set(x, "fullScreenControl", value.asInstanceOf[js.Any])
      
      inline def setFullScreenToggle(value: String): Self = StObject.set(x, "fullScreenToggle", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInFullScreen(value: String): Self = StObject.set(x, "inFullScreen", value.asInstanceOf[js.Any])
    }
  }
}
