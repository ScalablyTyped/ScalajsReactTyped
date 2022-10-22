package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceSearchHelper extends StObject {
  
  def dispose(): Unit
  
  def getState(): VoiceListeningState
  
  def isBrowserSupported(): Boolean
  
  def isListening(): Boolean
  
  def toggleListening(): Unit
}
object VoiceSearchHelper {
  
  inline def apply(
    dispose: Callback,
    getState: CallbackTo[VoiceListeningState],
    isBrowserSupported: CallbackTo[Boolean],
    isListening: CallbackTo[Boolean],
    toggleListening: Callback
  ): VoiceSearchHelper = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, getState = getState.toJsFn, isBrowserSupported = isBrowserSupported.toJsFn, isListening = isListening.toJsFn, toggleListening = toggleListening.toJsFn)
    __obj.asInstanceOf[VoiceSearchHelper]
  }
  
  extension [Self <: VoiceSearchHelper](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGetState(value: CallbackTo[VoiceListeningState]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setIsBrowserSupported(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBrowserSupported", value.toJsFn)
    
    inline def setIsListening(value: CallbackTo[Boolean]): Self = StObject.set(x, "isListening", value.toJsFn)
    
    inline def setToggleListening(value: Callback): Self = StObject.set(x, "toggleListening", value.toJsFn)
  }
}
