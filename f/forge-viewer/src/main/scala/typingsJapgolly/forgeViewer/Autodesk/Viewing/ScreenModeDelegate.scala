package typingsJapgolly.forgeViewer.Autodesk.Viewing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenModeDelegate extends StObject {
  
  def doScreenModeChange(oldMode: ScreenMode, newMode: ScreenMode): Unit
  
  def fullscreenEventListener(): Unit
  
  def getEscapeMode(): js.UndefOr[ScreenMode]
  
  def getMode(): ScreenMode
  
  def getNextMode(): js.UndefOr[ScreenMode]
  
  def isModeSupported(mode: ScreenMode): Boolean
  
  def onScreenModeChanged(oldMode: ScreenMode, newMode: ScreenMode): Unit
  
  def setMode(mode: ScreenMode): Boolean
  
  def uninitialize(): Unit
}
object ScreenModeDelegate {
  
  inline def apply(
    doScreenModeChange: (ScreenMode, ScreenMode) => Callback,
    fullscreenEventListener: Callback,
    getEscapeMode: CallbackTo[js.UndefOr[ScreenMode]],
    getMode: CallbackTo[ScreenMode],
    getNextMode: CallbackTo[js.UndefOr[ScreenMode]],
    isModeSupported: ScreenMode => Boolean,
    onScreenModeChanged: (ScreenMode, ScreenMode) => Callback,
    setMode: ScreenMode => Boolean,
    uninitialize: Callback
  ): ScreenModeDelegate = {
    val __obj = js.Dynamic.literal(doScreenModeChange = js.Any.fromFunction2((t0: ScreenMode, t1: ScreenMode) => (doScreenModeChange(t0, t1)).runNow()), fullscreenEventListener = fullscreenEventListener.toJsFn, getEscapeMode = getEscapeMode.toJsFn, getMode = getMode.toJsFn, getNextMode = getNextMode.toJsFn, isModeSupported = js.Any.fromFunction1(isModeSupported), onScreenModeChanged = js.Any.fromFunction2((t0: ScreenMode, t1: ScreenMode) => (onScreenModeChanged(t0, t1)).runNow()), setMode = js.Any.fromFunction1(setMode), uninitialize = uninitialize.toJsFn)
    __obj.asInstanceOf[ScreenModeDelegate]
  }
  
  extension [Self <: ScreenModeDelegate](x: Self) {
    
    inline def setDoScreenModeChange(value: (ScreenMode, ScreenMode) => Callback): Self = StObject.set(x, "doScreenModeChange", js.Any.fromFunction2((t0: ScreenMode, t1: ScreenMode) => (value(t0, t1)).runNow()))
    
    inline def setFullscreenEventListener(value: Callback): Self = StObject.set(x, "fullscreenEventListener", value.toJsFn)
    
    inline def setGetEscapeMode(value: CallbackTo[js.UndefOr[ScreenMode]]): Self = StObject.set(x, "getEscapeMode", value.toJsFn)
    
    inline def setGetMode(value: CallbackTo[ScreenMode]): Self = StObject.set(x, "getMode", value.toJsFn)
    
    inline def setGetNextMode(value: CallbackTo[js.UndefOr[ScreenMode]]): Self = StObject.set(x, "getNextMode", value.toJsFn)
    
    inline def setIsModeSupported(value: ScreenMode => Boolean): Self = StObject.set(x, "isModeSupported", js.Any.fromFunction1(value))
    
    inline def setOnScreenModeChanged(value: (ScreenMode, ScreenMode) => Callback): Self = StObject.set(x, "onScreenModeChanged", js.Any.fromFunction2((t0: ScreenMode, t1: ScreenMode) => (value(t0, t1)).runNow()))
    
    inline def setSetMode(value: ScreenMode => Boolean): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
    
    inline def setUninitialize(value: Callback): Self = StObject.set(x, "uninitialize", value.toJsFn)
  }
}
