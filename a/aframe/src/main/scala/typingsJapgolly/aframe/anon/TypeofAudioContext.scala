package typingsJapgolly.aframe.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAudioContext extends StObject {
  
  def getContext(): AudioContext
  
  def setContext(context: AudioContext): Unit
}
object TypeofAudioContext {
  
  inline def apply(getContext: CallbackTo[AudioContext], setContext: AudioContext => Callback): TypeofAudioContext = {
    val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, setContext = js.Any.fromFunction1((t0: AudioContext) => setContext(t0).runNow()))
    __obj.asInstanceOf[TypeofAudioContext]
  }
  
  extension [Self <: TypeofAudioContext](x: Self) {
    
    inline def setGetContext(value: CallbackTo[AudioContext]): Self = StObject.set(x, "getContext", value.toJsFn)
    
    inline def setSetContext(value: AudioContext => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: AudioContext) => value(t0).runNow()))
  }
}
