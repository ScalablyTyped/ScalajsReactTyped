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

object distSrcModulesUiControlsPictureInPictureTypesMod {
  
  trait IPictureInPictureControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def show(): Unit
  }
  object IPictureInPictureControl {
    
    inline def apply(destroy: Callback, getElement: CallbackTo[HTMLElement], hide: Callback, show: Callback): IPictureInPictureControl = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[IPictureInPictureControl]
    }
    
    extension [Self <: IPictureInPictureControl](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait IPictureInPictureViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IPictureInPictureViewCallbacks {
    
    inline def apply(onButtonClick: Callback): IPictureInPictureViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = onButtonClick.toJsFn)
      __obj.asInstanceOf[IPictureInPictureViewCallbacks]
    }
    
    extension [Self <: IPictureInPictureViewCallbacks](x: Self) {
      
      inline def setOnButtonClick(value: Callback): Self = StObject.set(x, "onButtonClick", value.toJsFn)
    }
  }
  
  trait IPictureInPictureViewConfig extends StObject {
    
    var callbacks: IPictureInPictureViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IPictureInPictureViewConfig {
    
    inline def apply(
      callbacks: IPictureInPictureViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IPictureInPictureViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPictureInPictureViewConfig]
    }
    
    extension [Self <: IPictureInPictureViewConfig](x: Self) {
      
      inline def setCallbacks(value: IPictureInPictureViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPictureInPictureViewStyles extends StObject {
    
    var hidden: String
    
    var icon: String
    
    var inPictureInPicture: String
    
    var pictureInPictureControl: String
    
    var pictureInPictureToggle: String
  }
  object IPictureInPictureViewStyles {
    
    inline def apply(
      hidden: String,
      icon: String,
      inPictureInPicture: String,
      pictureInPictureControl: String,
      pictureInPictureToggle: String
    ): IPictureInPictureViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], inPictureInPicture = inPictureInPicture.asInstanceOf[js.Any], pictureInPictureControl = pictureInPictureControl.asInstanceOf[js.Any], pictureInPictureToggle = pictureInPictureToggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPictureInPictureViewStyles]
    }
    
    extension [Self <: IPictureInPictureViewStyles](x: Self) {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInPictureInPicture(value: String): Self = StObject.set(x, "inPictureInPicture", value.asInstanceOf[js.Any])
      
      inline def setPictureInPictureControl(value: String): Self = StObject.set(x, "pictureInPictureControl", value.asInstanceOf[js.Any])
      
      inline def setPictureInPictureToggle(value: String): Self = StObject.set(x, "pictureInPictureToggle", value.asInstanceOf[js.Any])
    }
  }
}
