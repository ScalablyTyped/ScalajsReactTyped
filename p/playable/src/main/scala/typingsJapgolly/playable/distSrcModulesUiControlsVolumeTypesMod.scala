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

object distSrcModulesUiControlsVolumeTypesMod {
  
  trait IVolumeControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def show(): Unit
  }
  object IVolumeControl {
    
    inline def apply(destroy: Callback, getElement: CallbackTo[HTMLElement], hide: Callback, show: Callback): IVolumeControl = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[IVolumeControl]
    }
    
    extension [Self <: IVolumeControl](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait IVolumeViewCallbacks extends StObject {
    
    def onDragEnd(): Unit
    
    def onDragStart(): Unit
    
    def onToggleMuteClick(): Unit
    
    def onVolumeLevelChangeFromInput(level: Double): Unit
    
    def onVolumeLevelChangeFromWheel(delta: Double): Unit
  }
  object IVolumeViewCallbacks {
    
    inline def apply(
      onDragEnd: Callback,
      onDragStart: Callback,
      onToggleMuteClick: Callback,
      onVolumeLevelChangeFromInput: Double => Callback,
      onVolumeLevelChangeFromWheel: Double => Callback
    ): IVolumeViewCallbacks = {
      val __obj = js.Dynamic.literal(onDragEnd = onDragEnd.toJsFn, onDragStart = onDragStart.toJsFn, onToggleMuteClick = onToggleMuteClick.toJsFn, onVolumeLevelChangeFromInput = js.Any.fromFunction1((t0: Double) => onVolumeLevelChangeFromInput(t0).runNow()), onVolumeLevelChangeFromWheel = js.Any.fromFunction1((t0: Double) => onVolumeLevelChangeFromWheel(t0).runNow()))
      __obj.asInstanceOf[IVolumeViewCallbacks]
    }
    
    extension [Self <: IVolumeViewCallbacks](x: Self) {
      
      inline def setOnDragEnd(value: Callback): Self = StObject.set(x, "onDragEnd", value.toJsFn)
      
      inline def setOnDragStart(value: Callback): Self = StObject.set(x, "onDragStart", value.toJsFn)
      
      inline def setOnToggleMuteClick(value: Callback): Self = StObject.set(x, "onToggleMuteClick", value.toJsFn)
      
      inline def setOnVolumeLevelChangeFromInput(value: Double => Callback): Self = StObject.set(x, "onVolumeLevelChangeFromInput", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnVolumeLevelChangeFromWheel(value: Double => Callback): Self = StObject.set(x, "onVolumeLevelChangeFromWheel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait IVolumeViewConfig extends StObject {
    
    var callbacks: IVolumeViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IVolumeViewConfig {
    
    inline def apply(
      callbacks: IVolumeViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IVolumeViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVolumeViewConfig]
    }
    
    extension [Self <: IVolumeViewConfig](x: Self) {
      
      inline def setCallbacks(value: IVolumeViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait IVolumeViewStyles extends StObject {
    
    var background: String
    
    var hidden: String
    
    var hitbox: String
    
    var icon: String
    
    var isDragging: String
    
    var muteIcon: String
    
    var muteToggle: String
    
    var muted: String
    
    var progressBar: String
    
    var volume: String
    
    var volume0: String
    
    var volume0Icon: String
    
    var volume100: String
    
    var volume100Icon: String
    
    var volume50: String
    
    var volume50Icon: String
    
    var volumeControl: String
    
    var volumeInputBlock: String
  }
  object IVolumeViewStyles {
    
    inline def apply(
      background: String,
      hidden: String,
      hitbox: String,
      icon: String,
      isDragging: String,
      muteIcon: String,
      muteToggle: String,
      muted: String,
      progressBar: String,
      volume: String,
      volume0: String,
      volume0Icon: String,
      volume100: String,
      volume100Icon: String,
      volume50: String,
      volume50Icon: String,
      volumeControl: String,
      volumeInputBlock: String
    ): IVolumeViewStyles = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hitbox = hitbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], muteIcon = muteIcon.asInstanceOf[js.Any], muteToggle = muteToggle.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], progressBar = progressBar.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], volume0 = volume0.asInstanceOf[js.Any], volume0Icon = volume0Icon.asInstanceOf[js.Any], volume100 = volume100.asInstanceOf[js.Any], volume100Icon = volume100Icon.asInstanceOf[js.Any], volume50 = volume50.asInstanceOf[js.Any], volume50Icon = volume50Icon.asInstanceOf[js.Any], volumeControl = volumeControl.asInstanceOf[js.Any], volumeInputBlock = volumeInputBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVolumeViewStyles]
    }
    
    extension [Self <: IVolumeViewStyles](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHitbox(value: String): Self = StObject.set(x, "hitbox", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIsDragging(value: String): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setMuteIcon(value: String): Self = StObject.set(x, "muteIcon", value.asInstanceOf[js.Any])
      
      inline def setMuteToggle(value: String): Self = StObject.set(x, "muteToggle", value.asInstanceOf[js.Any])
      
      inline def setMuted(value: String): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setProgressBar(value: String): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolume0(value: String): Self = StObject.set(x, "volume0", value.asInstanceOf[js.Any])
      
      inline def setVolume0Icon(value: String): Self = StObject.set(x, "volume0Icon", value.asInstanceOf[js.Any])
      
      inline def setVolume100(value: String): Self = StObject.set(x, "volume100", value.asInstanceOf[js.Any])
      
      inline def setVolume100Icon(value: String): Self = StObject.set(x, "volume100Icon", value.asInstanceOf[js.Any])
      
      inline def setVolume50(value: String): Self = StObject.set(x, "volume50", value.asInstanceOf[js.Any])
      
      inline def setVolume50Icon(value: String): Self = StObject.set(x, "volume50Icon", value.asInstanceOf[js.Any])
      
      inline def setVolumeControl(value: String): Self = StObject.set(x, "volumeControl", value.asInstanceOf[js.Any])
      
      inline def setVolumeInputBlock(value: String): Self = StObject.set(x, "volumeInputBlock", value.asInstanceOf[js.Any])
    }
  }
}
