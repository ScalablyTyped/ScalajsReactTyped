package typingsJapgolly.pizzicato.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.AudioProcessingEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptSoundOptions
  extends StObject
     with SoundOptions {
  
  def audioFunction(e: AudioProcessingEvent): Unit
  @JSName("audioFunction")
  var audioFunction_Original: AudioFunction
  
  var bufferSize: js.UndefOr[Double] = js.undefined
}
object ScriptSoundOptions {
  
  inline def apply(audioFunction: /* e */ AudioProcessingEvent => Callback): ScriptSoundOptions = {
    val __obj = js.Dynamic.literal(audioFunction = js.Any.fromFunction1((t0: /* e */ AudioProcessingEvent) => audioFunction(t0).runNow()))
    __obj.asInstanceOf[ScriptSoundOptions]
  }
  
  extension [Self <: ScriptSoundOptions](x: Self) {
    
    inline def setAudioFunction(value: /* e */ AudioProcessingEvent => Callback): Self = StObject.set(x, "audioFunction", js.Any.fromFunction1((t0: /* e */ AudioProcessingEvent) => value(t0).runNow()))
    
    inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
  }
}
