package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesTextMapTypesMod.ITextMap
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typingsJapgolly.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsProgressTypesMod {
  
  trait IProgressControl extends StObject {
    
    def addTimeIndicator(time: Double): Unit
    
    def addTimeIndicators(times: js.Array[Double]): Unit
    
    def clearTimeIndicators(): Unit
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def seekOnProgressDrag(): Unit
    
    def show(): Unit
    
    def showPreviewOnProgressDrag(): Unit
  }
  object IProgressControl {
    
    inline def apply(
      addTimeIndicator: Double => Callback,
      addTimeIndicators: js.Array[Double] => Callback,
      clearTimeIndicators: Callback,
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      seekOnProgressDrag: Callback,
      show: Callback,
      showPreviewOnProgressDrag: Callback
    ): IProgressControl = {
      val __obj = js.Dynamic.literal(addTimeIndicator = js.Any.fromFunction1((t0: Double) => addTimeIndicator(t0).runNow()), addTimeIndicators = js.Any.fromFunction1((t0: js.Array[Double]) => addTimeIndicators(t0).runNow()), clearTimeIndicators = clearTimeIndicators.toJsFn, destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, seekOnProgressDrag = seekOnProgressDrag.toJsFn, show = show.toJsFn, showPreviewOnProgressDrag = showPreviewOnProgressDrag.toJsFn)
      __obj.asInstanceOf[IProgressControl]
    }
    
    extension [Self <: IProgressControl](x: Self) {
      
      inline def setAddTimeIndicator(value: Double => Callback): Self = StObject.set(x, "addTimeIndicator", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setAddTimeIndicators(value: js.Array[Double] => Callback): Self = StObject.set(x, "addTimeIndicators", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
      
      inline def setClearTimeIndicators(value: Callback): Self = StObject.set(x, "clearTimeIndicators", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setSeekOnProgressDrag(value: Callback): Self = StObject.set(x, "seekOnProgressDrag", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setShowPreviewOnProgressDrag(value: Callback): Self = StObject.set(x, "showPreviewOnProgressDrag", value.toJsFn)
    }
  }
  
  trait IProgressControlAPI extends StObject {
    
    var addTimeIndicator: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.undefined
    
    var addTimeIndicators: js.UndefOr[js.Function1[/* times */ js.Array[Double], Unit]] = js.undefined
    
    var clearTimeIndicators: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var seekOnProgressDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showPreviewOnProgressDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IProgressControlAPI {
    
    inline def apply(): IProgressControlAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProgressControlAPI]
    }
    
    extension [Self <: IProgressControlAPI](x: Self) {
      
      inline def setAddTimeIndicator(value: /* time */ Double => Callback): Self = StObject.set(x, "addTimeIndicator", js.Any.fromFunction1((t0: /* time */ Double) => value(t0).runNow()))
      
      inline def setAddTimeIndicatorUndefined: Self = StObject.set(x, "addTimeIndicator", js.undefined)
      
      inline def setAddTimeIndicators(value: /* times */ js.Array[Double] => Callback): Self = StObject.set(x, "addTimeIndicators", js.Any.fromFunction1((t0: /* times */ js.Array[Double]) => value(t0).runNow()))
      
      inline def setAddTimeIndicatorsUndefined: Self = StObject.set(x, "addTimeIndicators", js.undefined)
      
      inline def setClearTimeIndicators(value: Callback): Self = StObject.set(x, "clearTimeIndicators", value.toJsFn)
      
      inline def setClearTimeIndicatorsUndefined: Self = StObject.set(x, "clearTimeIndicators", js.undefined)
      
      inline def setSeekOnProgressDrag(value: Callback): Self = StObject.set(x, "seekOnProgressDrag", value.toJsFn)
      
      inline def setSeekOnProgressDragUndefined: Self = StObject.set(x, "seekOnProgressDrag", js.undefined)
      
      inline def setShowPreviewOnProgressDrag(value: Callback): Self = StObject.set(x, "showPreviewOnProgressDrag", value.toJsFn)
      
      inline def setShowPreviewOnProgressDragUndefined: Self = StObject.set(x, "showPreviewOnProgressDrag", js.undefined)
    }
  }
  
  trait IProgressViewCallbacks extends StObject {
    
    def onChangePlayedPercent(percent: Double): Unit
    
    def onDragEnd(): Unit
    
    def onDragStart(): Unit
    
    def onSeekToByMouseEnd(): Unit
    
    def onSeekToByMouseStart(percent: Double): Unit
    
    def onSyncWithLiveClick(): Unit
    
    var onSyncWithLiveMouseEnter: EventListenerOrEventListenerObject
    
    var onSyncWithLiveMouseLeave: EventListenerOrEventListenerObject
  }
  object IProgressViewCallbacks {
    
    inline def apply(
      onChangePlayedPercent: Double => Callback,
      onDragEnd: Callback,
      onDragStart: Callback,
      onSeekToByMouseEnd: Callback,
      onSeekToByMouseStart: Double => Callback,
      onSyncWithLiveClick: Callback,
      onSyncWithLiveMouseEnter: EventListenerOrEventListenerObject,
      onSyncWithLiveMouseLeave: EventListenerOrEventListenerObject
    ): IProgressViewCallbacks = {
      val __obj = js.Dynamic.literal(onChangePlayedPercent = js.Any.fromFunction1((t0: Double) => onChangePlayedPercent(t0).runNow()), onDragEnd = onDragEnd.toJsFn, onDragStart = onDragStart.toJsFn, onSeekToByMouseEnd = onSeekToByMouseEnd.toJsFn, onSeekToByMouseStart = js.Any.fromFunction1((t0: Double) => onSeekToByMouseStart(t0).runNow()), onSyncWithLiveClick = onSyncWithLiveClick.toJsFn, onSyncWithLiveMouseEnter = onSyncWithLiveMouseEnter.asInstanceOf[js.Any], onSyncWithLiveMouseLeave = onSyncWithLiveMouseLeave.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressViewCallbacks]
    }
    
    extension [Self <: IProgressViewCallbacks](x: Self) {
      
      inline def setOnChangePlayedPercent(value: Double => Callback): Self = StObject.set(x, "onChangePlayedPercent", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnDragEnd(value: Callback): Self = StObject.set(x, "onDragEnd", value.toJsFn)
      
      inline def setOnDragStart(value: Callback): Self = StObject.set(x, "onDragStart", value.toJsFn)
      
      inline def setOnSeekToByMouseEnd(value: Callback): Self = StObject.set(x, "onSeekToByMouseEnd", value.toJsFn)
      
      inline def setOnSeekToByMouseStart(value: Double => Callback): Self = StObject.set(x, "onSeekToByMouseStart", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnSyncWithLiveClick(value: Callback): Self = StObject.set(x, "onSyncWithLiveClick", value.toJsFn)
      
      inline def setOnSyncWithLiveMouseEnter(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onSyncWithLiveMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnSyncWithLiveMouseEnterFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "onSyncWithLiveMouseEnter", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
      
      inline def setOnSyncWithLiveMouseLeave(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onSyncWithLiveMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setOnSyncWithLiveMouseLeaveFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "onSyncWithLiveMouseLeave", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    }
  }
  
  trait IProgressViewConfig extends StObject {
    
    var callbacks: IProgressViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IProgressViewConfig {
    
    inline def apply(
      callbacks: IProgressViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IProgressViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressViewConfig]
    }
    
    extension [Self <: IProgressViewConfig](x: Self) {
      
      inline def setCallbacks(value: IProgressViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProgressViewStyles extends StObject {
    
    var background: String
    
    var buffered: String
    
    var hidden: String
    
    var hitbox: String
    
    var inLive: String
    
    var isDragging: String
    
    var liveSync: String
    
    var played: String
    
    var progressBar: String
    
    var progressBarsWrapper: String
    
    var seekBlock: String
    
    var seekTo: String
    
    var syncButton: String
    
    var timeIndicators: String
  }
  object IProgressViewStyles {
    
    inline def apply(
      background: String,
      buffered: String,
      hidden: String,
      hitbox: String,
      inLive: String,
      isDragging: String,
      liveSync: String,
      played: String,
      progressBar: String,
      progressBarsWrapper: String,
      seekBlock: String,
      seekTo: String,
      syncButton: String,
      timeIndicators: String
    ): IProgressViewStyles = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hitbox = hitbox.asInstanceOf[js.Any], inLive = inLive.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], liveSync = liveSync.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], progressBar = progressBar.asInstanceOf[js.Any], progressBarsWrapper = progressBarsWrapper.asInstanceOf[js.Any], seekBlock = seekBlock.asInstanceOf[js.Any], seekTo = seekTo.asInstanceOf[js.Any], syncButton = syncButton.asInstanceOf[js.Any], timeIndicators = timeIndicators.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressViewStyles]
    }
    
    extension [Self <: IProgressViewStyles](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBuffered(value: String): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHitbox(value: String): Self = StObject.set(x, "hitbox", value.asInstanceOf[js.Any])
      
      inline def setInLive(value: String): Self = StObject.set(x, "inLive", value.asInstanceOf[js.Any])
      
      inline def setIsDragging(value: String): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setLiveSync(value: String): Self = StObject.set(x, "liveSync", value.asInstanceOf[js.Any])
      
      inline def setPlayed(value: String): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      inline def setProgressBar(value: String): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarsWrapper(value: String): Self = StObject.set(x, "progressBarsWrapper", value.asInstanceOf[js.Any])
      
      inline def setSeekBlock(value: String): Self = StObject.set(x, "seekBlock", value.asInstanceOf[js.Any])
      
      inline def setSeekTo(value: String): Self = StObject.set(x, "seekTo", value.asInstanceOf[js.Any])
      
      inline def setSyncButton(value: String): Self = StObject.set(x, "syncButton", value.asInstanceOf[js.Any])
      
      inline def setTimeIndicators(value: String): Self = StObject.set(x, "timeIndicators", value.asInstanceOf[js.Any])
    }
  }
}
