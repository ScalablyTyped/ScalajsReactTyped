package typingsJapgolly.log4js.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recording_ extends StObject {
  
  def configure(): AppenderFunction
  
  def erase(): Unit
  
  def playback(): js.Array[LoggingEvent]
  
  def replay(): js.Array[LoggingEvent]
  
  def reset(): Unit
}
object Recording_ {
  
  inline def apply(
    configure: CallbackTo[AppenderFunction],
    erase: Callback,
    playback: CallbackTo[js.Array[LoggingEvent]],
    replay: CallbackTo[js.Array[LoggingEvent]],
    reset: Callback
  ): Recording_ = {
    val __obj = js.Dynamic.literal(configure = configure.toJsFn, erase = erase.toJsFn, playback = playback.toJsFn, replay = replay.toJsFn, reset = reset.toJsFn)
    __obj.asInstanceOf[Recording_]
  }
  
  extension [Self <: Recording_](x: Self) {
    
    inline def setConfigure(value: CallbackTo[AppenderFunction]): Self = StObject.set(x, "configure", value.toJsFn)
    
    inline def setErase(value: Callback): Self = StObject.set(x, "erase", value.toJsFn)
    
    inline def setPlayback(value: CallbackTo[js.Array[LoggingEvent]]): Self = StObject.set(x, "playback", value.toJsFn)
    
    inline def setReplay(value: CallbackTo[js.Array[LoggingEvent]]): Self = StObject.set(x, "replay", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
