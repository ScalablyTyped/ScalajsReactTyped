package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesFullScreenManagerTypesMod {
  
  trait IFullScreenAPI extends StObject {
    
    var disableEnterFullScreenOnPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disableExitFullScreenOnEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disableExitFullScreenOnPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disablePauseVideoOnFullScreenExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enableEnterFullScreenOnPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enableExitFullScreenOnEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enableExitFullScreenOnPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enablePauseVideoOnFullScreenExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enterFullScreen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var exitFullScreen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var isInFullScreen: js.UndefOr[Boolean] = js.undefined
  }
  object IFullScreenAPI {
    
    inline def apply(): IFullScreenAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFullScreenAPI]
    }
    
    extension [Self <: IFullScreenAPI](x: Self) {
      
      inline def setDisableEnterFullScreenOnPlay(value: Callback): Self = StObject.set(x, "disableEnterFullScreenOnPlay", value.toJsFn)
      
      inline def setDisableEnterFullScreenOnPlayUndefined: Self = StObject.set(x, "disableEnterFullScreenOnPlay", js.undefined)
      
      inline def setDisableExitFullScreenOnEnd(value: Callback): Self = StObject.set(x, "disableExitFullScreenOnEnd", value.toJsFn)
      
      inline def setDisableExitFullScreenOnEndUndefined: Self = StObject.set(x, "disableExitFullScreenOnEnd", js.undefined)
      
      inline def setDisableExitFullScreenOnPause(value: Callback): Self = StObject.set(x, "disableExitFullScreenOnPause", value.toJsFn)
      
      inline def setDisableExitFullScreenOnPauseUndefined: Self = StObject.set(x, "disableExitFullScreenOnPause", js.undefined)
      
      inline def setDisablePauseVideoOnFullScreenExit(value: Callback): Self = StObject.set(x, "disablePauseVideoOnFullScreenExit", value.toJsFn)
      
      inline def setDisablePauseVideoOnFullScreenExitUndefined: Self = StObject.set(x, "disablePauseVideoOnFullScreenExit", js.undefined)
      
      inline def setEnableEnterFullScreenOnPlay(value: Callback): Self = StObject.set(x, "enableEnterFullScreenOnPlay", value.toJsFn)
      
      inline def setEnableEnterFullScreenOnPlayUndefined: Self = StObject.set(x, "enableEnterFullScreenOnPlay", js.undefined)
      
      inline def setEnableExitFullScreenOnEnd(value: Callback): Self = StObject.set(x, "enableExitFullScreenOnEnd", value.toJsFn)
      
      inline def setEnableExitFullScreenOnEndUndefined: Self = StObject.set(x, "enableExitFullScreenOnEnd", js.undefined)
      
      inline def setEnableExitFullScreenOnPause(value: Callback): Self = StObject.set(x, "enableExitFullScreenOnPause", value.toJsFn)
      
      inline def setEnableExitFullScreenOnPauseUndefined: Self = StObject.set(x, "enableExitFullScreenOnPause", js.undefined)
      
      inline def setEnablePauseVideoOnFullScreenExit(value: Callback): Self = StObject.set(x, "enablePauseVideoOnFullScreenExit", value.toJsFn)
      
      inline def setEnablePauseVideoOnFullScreenExitUndefined: Self = StObject.set(x, "enablePauseVideoOnFullScreenExit", js.undefined)
      
      inline def setEnterFullScreen(value: Callback): Self = StObject.set(x, "enterFullScreen", value.toJsFn)
      
      inline def setEnterFullScreenUndefined: Self = StObject.set(x, "enterFullScreen", js.undefined)
      
      inline def setExitFullScreen(value: Callback): Self = StObject.set(x, "exitFullScreen", value.toJsFn)
      
      inline def setExitFullScreenUndefined: Self = StObject.set(x, "exitFullScreen", js.undefined)
      
      inline def setIsInFullScreen(value: Boolean): Self = StObject.set(x, "isInFullScreen", value.asInstanceOf[js.Any])
      
      inline def setIsInFullScreenUndefined: Self = StObject.set(x, "isInFullScreen", js.undefined)
    }
  }
  
  trait IFullScreenConfig extends StObject {
    
    var enterFullScreenOnPlay: js.UndefOr[Boolean] = js.undefined
    
    var exitFullScreenOnEnd: js.UndefOr[Boolean] = js.undefined
    
    var exitFullScreenOnPause: js.UndefOr[Boolean] = js.undefined
    
    var pauseVideoOnFullScreenExit: js.UndefOr[Boolean] = js.undefined
  }
  object IFullScreenConfig {
    
    inline def apply(): IFullScreenConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFullScreenConfig]
    }
    
    extension [Self <: IFullScreenConfig](x: Self) {
      
      inline def setEnterFullScreenOnPlay(value: Boolean): Self = StObject.set(x, "enterFullScreenOnPlay", value.asInstanceOf[js.Any])
      
      inline def setEnterFullScreenOnPlayUndefined: Self = StObject.set(x, "enterFullScreenOnPlay", js.undefined)
      
      inline def setExitFullScreenOnEnd(value: Boolean): Self = StObject.set(x, "exitFullScreenOnEnd", value.asInstanceOf[js.Any])
      
      inline def setExitFullScreenOnEndUndefined: Self = StObject.set(x, "exitFullScreenOnEnd", js.undefined)
      
      inline def setExitFullScreenOnPause(value: Boolean): Self = StObject.set(x, "exitFullScreenOnPause", value.asInstanceOf[js.Any])
      
      inline def setExitFullScreenOnPauseUndefined: Self = StObject.set(x, "exitFullScreenOnPause", js.undefined)
      
      inline def setPauseVideoOnFullScreenExit(value: Boolean): Self = StObject.set(x, "pauseVideoOnFullScreenExit", value.asInstanceOf[js.Any])
      
      inline def setPauseVideoOnFullScreenExitUndefined: Self = StObject.set(x, "pauseVideoOnFullScreenExit", js.undefined)
    }
  }
  
  trait IFullScreenHelper extends StObject {
    
    def destroy(): Unit
    
    def exit(): Unit
    
    var isAPIExist: Boolean
    
    var isEnabled: Boolean
    
    var isInFullScreen: Boolean
    
    def request(): Unit
  }
  object IFullScreenHelper {
    
    inline def apply(
      destroy: Callback,
      exit: Callback,
      isAPIExist: Boolean,
      isEnabled: Boolean,
      isInFullScreen: Boolean,
      request: Callback
    ): IFullScreenHelper = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, exit = exit.toJsFn, isAPIExist = isAPIExist.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isInFullScreen = isInFullScreen.asInstanceOf[js.Any], request = request.toJsFn)
      __obj.asInstanceOf[IFullScreenHelper]
    }
    
    extension [Self <: IFullScreenHelper](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setExit(value: Callback): Self = StObject.set(x, "exit", value.toJsFn)
      
      inline def setIsAPIExist(value: Boolean): Self = StObject.set(x, "isAPIExist", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsInFullScreen(value: Boolean): Self = StObject.set(x, "isInFullScreen", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Callback): Self = StObject.set(x, "request", value.toJsFn)
    }
  }
  
  trait IFullScreenManager extends StObject {
    
    def destroy(): Unit
    
    def disableEnterFullScreenOnPlay(): Unit
    
    def disableExitFullScreenOnEnd(): Unit
    
    def disableExitFullScreenOnPause(): Unit
    
    def disablePauseVideoOnFullScreenExit(): Unit
    
    def enableEnterFullScreenOnPlay(): Unit
    
    def enableExitFullScreenOnEnd(): Unit
    
    def enableExitFullScreenOnPause(): Unit
    
    def enablePauseVideoOnFullScreenExit(): Unit
    
    def enterFullScreen(): Unit
    
    def exitFullScreen(): Unit
    
    var isEnabled: Boolean
    
    var isInFullScreen: Boolean
  }
  object IFullScreenManager {
    
    inline def apply(
      destroy: Callback,
      disableEnterFullScreenOnPlay: Callback,
      disableExitFullScreenOnEnd: Callback,
      disableExitFullScreenOnPause: Callback,
      disablePauseVideoOnFullScreenExit: Callback,
      enableEnterFullScreenOnPlay: Callback,
      enableExitFullScreenOnEnd: Callback,
      enableExitFullScreenOnPause: Callback,
      enablePauseVideoOnFullScreenExit: Callback,
      enterFullScreen: Callback,
      exitFullScreen: Callback,
      isEnabled: Boolean,
      isInFullScreen: Boolean
    ): IFullScreenManager = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, disableEnterFullScreenOnPlay = disableEnterFullScreenOnPlay.toJsFn, disableExitFullScreenOnEnd = disableExitFullScreenOnEnd.toJsFn, disableExitFullScreenOnPause = disableExitFullScreenOnPause.toJsFn, disablePauseVideoOnFullScreenExit = disablePauseVideoOnFullScreenExit.toJsFn, enableEnterFullScreenOnPlay = enableEnterFullScreenOnPlay.toJsFn, enableExitFullScreenOnEnd = enableExitFullScreenOnEnd.toJsFn, enableExitFullScreenOnPause = enableExitFullScreenOnPause.toJsFn, enablePauseVideoOnFullScreenExit = enablePauseVideoOnFullScreenExit.toJsFn, enterFullScreen = enterFullScreen.toJsFn, exitFullScreen = exitFullScreen.toJsFn, isEnabled = isEnabled.asInstanceOf[js.Any], isInFullScreen = isInFullScreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFullScreenManager]
    }
    
    extension [Self <: IFullScreenManager](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisableEnterFullScreenOnPlay(value: Callback): Self = StObject.set(x, "disableEnterFullScreenOnPlay", value.toJsFn)
      
      inline def setDisableExitFullScreenOnEnd(value: Callback): Self = StObject.set(x, "disableExitFullScreenOnEnd", value.toJsFn)
      
      inline def setDisableExitFullScreenOnPause(value: Callback): Self = StObject.set(x, "disableExitFullScreenOnPause", value.toJsFn)
      
      inline def setDisablePauseVideoOnFullScreenExit(value: Callback): Self = StObject.set(x, "disablePauseVideoOnFullScreenExit", value.toJsFn)
      
      inline def setEnableEnterFullScreenOnPlay(value: Callback): Self = StObject.set(x, "enableEnterFullScreenOnPlay", value.toJsFn)
      
      inline def setEnableExitFullScreenOnEnd(value: Callback): Self = StObject.set(x, "enableExitFullScreenOnEnd", value.toJsFn)
      
      inline def setEnableExitFullScreenOnPause(value: Callback): Self = StObject.set(x, "enableExitFullScreenOnPause", value.toJsFn)
      
      inline def setEnablePauseVideoOnFullScreenExit(value: Callback): Self = StObject.set(x, "enablePauseVideoOnFullScreenExit", value.toJsFn)
      
      inline def setEnterFullScreen(value: Callback): Self = StObject.set(x, "enterFullScreen", value.toJsFn)
      
      inline def setExitFullScreen(value: Callback): Self = StObject.set(x, "exitFullScreen", value.toJsFn)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsInFullScreen(value: Boolean): Self = StObject.set(x, "isInFullScreen", value.asInstanceOf[js.Any])
    }
  }
}
