package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiInteractionIndicatorTypesMod {
  
  trait IInteractionIndicator extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def hideIcons(): Unit
    
    def show(): Unit
    
    def showDecreaseVolume(): Unit
    
    def showForward(): Unit
    
    def showIncreaseVolume(): Unit
    
    def showMute(): Unit
    
    def showPause(): Unit
    
    def showPlay(): Unit
    
    def showRewind(): Unit
  }
  object IInteractionIndicator {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      hideIcons: Callback,
      show: Callback,
      showDecreaseVolume: Callback,
      showForward: Callback,
      showIncreaseVolume: Callback,
      showMute: Callback,
      showPause: Callback,
      showPlay: Callback,
      showRewind: Callback
    ): IInteractionIndicator = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, hideIcons = hideIcons.toJsFn, show = show.toJsFn, showDecreaseVolume = showDecreaseVolume.toJsFn, showForward = showForward.toJsFn, showIncreaseVolume = showIncreaseVolume.toJsFn, showMute = showMute.toJsFn, showPause = showPause.toJsFn, showPlay = showPlay.toJsFn, showRewind = showRewind.toJsFn)
      __obj.asInstanceOf[IInteractionIndicator]
    }
    
    extension [Self <: IInteractionIndicator](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setHideIcons(value: Callback): Self = StObject.set(x, "hideIcons", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setShowDecreaseVolume(value: Callback): Self = StObject.set(x, "showDecreaseVolume", value.toJsFn)
      
      inline def setShowForward(value: Callback): Self = StObject.set(x, "showForward", value.toJsFn)
      
      inline def setShowIncreaseVolume(value: Callback): Self = StObject.set(x, "showIncreaseVolume", value.toJsFn)
      
      inline def setShowMute(value: Callback): Self = StObject.set(x, "showMute", value.toJsFn)
      
      inline def setShowPause(value: Callback): Self = StObject.set(x, "showPause", value.toJsFn)
      
      inline def setShowPlay(value: Callback): Self = StObject.set(x, "showPlay", value.toJsFn)
      
      inline def setShowRewind(value: Callback): Self = StObject.set(x, "showRewind", value.toJsFn)
    }
  }
  
  trait IInteractionIndicatorViewStyles extends StObject {
    
    var animatedIcon: String
    
    var hidden: String
    
    var icon: String
    
    var iconContainer: String
    
    var pauseIcon: String
    
    var playIcon: String
    
    var seconds: String
  }
  object IInteractionIndicatorViewStyles {
    
    inline def apply(
      animatedIcon: String,
      hidden: String,
      icon: String,
      iconContainer: String,
      pauseIcon: String,
      playIcon: String,
      seconds: String
    ): IInteractionIndicatorViewStyles = {
      val __obj = js.Dynamic.literal(animatedIcon = animatedIcon.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconContainer = iconContainer.asInstanceOf[js.Any], pauseIcon = pauseIcon.asInstanceOf[js.Any], playIcon = playIcon.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInteractionIndicatorViewStyles]
    }
    
    extension [Self <: IInteractionIndicatorViewStyles](x: Self) {
      
      inline def setAnimatedIcon(value: String): Self = StObject.set(x, "animatedIcon", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainer(value: String): Self = StObject.set(x, "iconContainer", value.asInstanceOf[js.Any])
      
      inline def setPauseIcon(value: String): Self = StObject.set(x, "pauseIcon", value.asInstanceOf[js.Any])
      
      inline def setPlayIcon(value: String): Self = StObject.set(x, "playIcon", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
