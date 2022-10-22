package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesTextMapTypesMod.ITextMap
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsPlayTypesMod {
  
  trait IPlayControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
  }
  object IPlayControl {
    
    inline def apply(destroy: Callback, getElement: CallbackTo[HTMLElement]): IPlayControl = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn)
      __obj.asInstanceOf[IPlayControl]
    }
    
    extension [Self <: IPlayControl](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
    }
  }
  
  trait IPlayViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IPlayViewCallbacks {
    
    inline def apply(onButtonClick: Callback): IPlayViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = onButtonClick.toJsFn)
      __obj.asInstanceOf[IPlayViewCallbacks]
    }
    
    extension [Self <: IPlayViewCallbacks](x: Self) {
      
      inline def setOnButtonClick(value: Callback): Self = StObject.set(x, "onButtonClick", value.toJsFn)
    }
  }
  
  trait IPlayViewConfig extends StObject {
    
    var callbacks: IPlayViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
  }
  object IPlayViewConfig {
    
    inline def apply(callbacks: IPlayViewCallbacks, textMap: ITextMap, theme: IThemeService): IPlayViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlayViewConfig]
    }
    
    extension [Self <: IPlayViewConfig](x: Self) {
      
      inline def setCallbacks(value: IPlayViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPlayViewStyles extends StObject {
    
    var hidden: String
    
    var icon: String
    
    var paused: String
    
    var playControl: String
    
    var playbackToggle: String
  }
  object IPlayViewStyles {
    
    inline def apply(hidden: String, icon: String, paused: String, playControl: String, playbackToggle: String): IPlayViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], playControl = playControl.asInstanceOf[js.Any], playbackToggle = playbackToggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlayViewStyles]
    }
    
    extension [Self <: IPlayViewStyles](x: Self) {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setPaused(value: String): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPlayControl(value: String): Self = StObject.set(x, "playControl", value.asInstanceOf[js.Any])
      
      inline def setPlaybackToggle(value: String): Self = StObject.set(x, "playbackToggle", value.asInstanceOf[js.Any])
    }
  }
}
