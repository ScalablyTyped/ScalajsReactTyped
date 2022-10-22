package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsTimeTypesMod {
  
  trait ITimeControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def reset(): Unit
    
    def show(): Unit
  }
  object ITimeControl {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      reset: Callback,
      show: Callback
    ): ITimeControl = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, reset = reset.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[ITimeControl]
    }
    
    extension [Self <: ITimeControl](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait ITimeViewConfig extends StObject {
    
    var theme: IThemeService
  }
  object ITimeViewConfig {
    
    inline def apply(theme: IThemeService): ITimeViewConfig = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimeViewConfig]
    }
    
    extension [Self <: ITimeViewConfig](x: Self) {
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimeViewStyles extends StObject {
    
    var current: String
    
    var duration: String
    
    var hidden: String
    
    var separator: String
    
    var time: String
    
    var timeWrapper: String
  }
  object ITimeViewStyles {
    
    inline def apply(
      current: String,
      duration: String,
      hidden: String,
      separator: String,
      time: String,
      timeWrapper: String
    ): ITimeViewStyles = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeWrapper = timeWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimeViewStyles]
    }
    
    extension [Self <: ITimeViewStyles](x: Self) {
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeWrapper(value: String): Self = StObject.set(x, "timeWrapper", value.asInstanceOf[js.Any])
    }
  }
}
