package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiScreenTypesMod {
  
  @js.native
  sealed trait VideoViewMode extends StObject
  @JSImport("playable/dist/src/modules/ui/screen/types", "VideoViewMode")
  @js.native
  object VideoViewMode extends StObject {
    
    @js.native
    sealed trait BLUR
      extends StObject
         with VideoViewMode
    
    @js.native
    sealed trait FILL
      extends StObject
         with VideoViewMode
    
    @js.native
    sealed trait REGULAR
      extends StObject
         with VideoViewMode
  }
  
  trait IScreen extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def hideCursor(): Unit
    
    def setVideoViewMode(viewMode: VideoViewMode): Unit
    
    def show(): Unit
    
    def showCursor(): Unit
  }
  object IScreen {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      hideCursor: Callback,
      setVideoViewMode: VideoViewMode => Callback,
      show: Callback,
      showCursor: Callback
    ): IScreen = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, hideCursor = hideCursor.toJsFn, setVideoViewMode = js.Any.fromFunction1((t0: VideoViewMode) => setVideoViewMode(t0).runNow()), show = show.toJsFn, showCursor = showCursor.toJsFn)
      __obj.asInstanceOf[IScreen]
    }
    
    extension [Self <: IScreen](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setHideCursor(value: Callback): Self = StObject.set(x, "hideCursor", value.toJsFn)
      
      inline def setSetVideoViewMode(value: VideoViewMode => Callback): Self = StObject.set(x, "setVideoViewMode", js.Any.fromFunction1((t0: VideoViewMode) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setShowCursor(value: Callback): Self = StObject.set(x, "showCursor", value.toJsFn)
    }
  }
  
  trait IScreenAPI extends StObject {
    
    var setVideoViewMode: js.UndefOr[js.Function1[/* viewMode */ VideoViewMode, Unit]] = js.undefined
  }
  object IScreenAPI {
    
    inline def apply(): IScreenAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScreenAPI]
    }
    
    extension [Self <: IScreenAPI](x: Self) {
      
      inline def setSetVideoViewMode(value: /* viewMode */ VideoViewMode => Callback): Self = StObject.set(x, "setVideoViewMode", js.Any.fromFunction1((t0: /* viewMode */ VideoViewMode) => value(t0).runNow()))
      
      inline def setSetVideoViewModeUndefined: Self = StObject.set(x, "setVideoViewMode", js.undefined)
    }
  }
  
  trait IScreenViewCallbacks extends StObject {
    
    var onWrapperMouseClick: EventListenerOrEventListenerObject
    
    var onWrapperMouseDblClick: EventListenerOrEventListenerObject
  }
  object IScreenViewCallbacks {
    
    inline def apply(
      onWrapperMouseClick: EventListenerOrEventListenerObject,
      onWrapperMouseDblClick: EventListenerOrEventListenerObject
    ): IScreenViewCallbacks = {
      val __obj = js.Dynamic.literal(onWrapperMouseClick = onWrapperMouseClick.asInstanceOf[js.Any], onWrapperMouseDblClick = onWrapperMouseDblClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScreenViewCallbacks]
    }
    
    extension [Self <: IScreenViewCallbacks](x: Self) {
      
      inline def setOnWrapperMouseClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onWrapperMouseClick", value.asInstanceOf[js.Any])
      
      inline def setOnWrapperMouseClickFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "onWrapperMouseClick", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
      
      inline def setOnWrapperMouseDblClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onWrapperMouseDblClick", value.asInstanceOf[js.Any])
      
      inline def setOnWrapperMouseDblClickFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "onWrapperMouseDblClick", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    }
  }
  
  trait IScreenViewConfig extends StObject {
    
    var callbacks: IScreenViewCallbacks
    
    var nativeControls: Boolean
    
    var playbackViewElement: HTMLElement
  }
  object IScreenViewConfig {
    
    inline def apply(callbacks: IScreenViewCallbacks, nativeControls: Boolean, playbackViewElement: HTMLElement): IScreenViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], nativeControls = nativeControls.asInstanceOf[js.Any], playbackViewElement = playbackViewElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScreenViewConfig]
    }
    
    extension [Self <: IScreenViewConfig](x: Self) {
      
      inline def setCallbacks(value: IScreenViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setNativeControls(value: Boolean): Self = StObject.set(x, "nativeControls", value.asInstanceOf[js.Any])
      
      inline def setPlaybackViewElement(value: HTMLElement): Self = StObject.set(x, "playbackViewElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScreenViewStyles extends StObject {
    
    var blurMode: String
    
    var fillMode: String
    
    var hidden: String
    
    var hiddenCursor: String
    
    var horizontalStripes: String
    
    var regularMode: String
    
    var screen: String
    
    var screenBottomBackground: String
    
    var screenTopBackground: String
    
    var verticalStripes: String
    
    var visible: String
  }
  object IScreenViewStyles {
    
    inline def apply(
      blurMode: String,
      fillMode: String,
      hidden: String,
      hiddenCursor: String,
      horizontalStripes: String,
      regularMode: String,
      screen: String,
      screenBottomBackground: String,
      screenTopBackground: String,
      verticalStripes: String,
      visible: String
    ): IScreenViewStyles = {
      val __obj = js.Dynamic.literal(blurMode = blurMode.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hiddenCursor = hiddenCursor.asInstanceOf[js.Any], horizontalStripes = horizontalStripes.asInstanceOf[js.Any], regularMode = regularMode.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], screenBottomBackground = screenBottomBackground.asInstanceOf[js.Any], screenTopBackground = screenTopBackground.asInstanceOf[js.Any], verticalStripes = verticalStripes.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScreenViewStyles]
    }
    
    extension [Self <: IScreenViewStyles](x: Self) {
      
      inline def setBlurMode(value: String): Self = StObject.set(x, "blurMode", value.asInstanceOf[js.Any])
      
      inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenCursor(value: String): Self = StObject.set(x, "hiddenCursor", value.asInstanceOf[js.Any])
      
      inline def setHorizontalStripes(value: String): Self = StObject.set(x, "horizontalStripes", value.asInstanceOf[js.Any])
      
      inline def setRegularMode(value: String): Self = StObject.set(x, "regularMode", value.asInstanceOf[js.Any])
      
      inline def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenBottomBackground(value: String): Self = StObject.set(x, "screenBottomBackground", value.asInstanceOf[js.Any])
      
      inline def setScreenTopBackground(value: String): Self = StObject.set(x, "screenTopBackground", value.asInstanceOf[js.Any])
      
      inline def setVerticalStripes(value: String): Self = StObject.set(x, "verticalStripes", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
