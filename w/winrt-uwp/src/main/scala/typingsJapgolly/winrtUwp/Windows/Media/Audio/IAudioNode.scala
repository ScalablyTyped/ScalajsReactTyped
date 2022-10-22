package typingsJapgolly.winrtUwp.Windows.Media.Audio

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import typingsJapgolly.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* unmapped type */
/** Defines an audio node. */
trait IAudioNode
  extends StObject
     with IClosable {
  
  /** Gets or sets a value indicating if the audio node consumes input. */
  var consumeInput: Boolean
  
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  
  /** Gets the list of effect definitions for the audio node. */
  var effectDefinitions: IVector[IAudioEffectDefinition]
  
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  
  /** Gets the encoding properties for the audio node. */
  var encodingProperties: AudioEncodingProperties
  
  /** Gets or sets the outgoing gain for the audio node. */
  var outgoingGain: Double
  
  /** Resets the audio node. */
  def reset(): Unit
  
  /** Starts the audio node. */
  def start(): Unit
  
  /** Stops the audio node. */
  def stop(): Unit
}
object IAudioNode {
  
  inline def apply(
    close: Callback,
    consumeInput: Boolean,
    disableEffectsByDefinition: IAudioEffectDefinition => Callback,
    effectDefinitions: IVector[IAudioEffectDefinition],
    enableEffectsByDefinition: IAudioEffectDefinition => Callback,
    encodingProperties: AudioEncodingProperties,
    outgoingGain: Double,
    reset: Callback,
    start: Callback,
    stop: Callback
  ): IAudioNode = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, consumeInput = consumeInput.asInstanceOf[js.Any], disableEffectsByDefinition = js.Any.fromFunction1((t0: IAudioEffectDefinition) => disableEffectsByDefinition(t0).runNow()), effectDefinitions = effectDefinitions.asInstanceOf[js.Any], enableEffectsByDefinition = js.Any.fromFunction1((t0: IAudioEffectDefinition) => enableEffectsByDefinition(t0).runNow()), encodingProperties = encodingProperties.asInstanceOf[js.Any], outgoingGain = outgoingGain.asInstanceOf[js.Any], reset = reset.toJsFn, start = start.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[IAudioNode]
  }
  
  extension [Self <: IAudioNode](x: Self) {
    
    inline def setConsumeInput(value: Boolean): Self = StObject.set(x, "consumeInput", value.asInstanceOf[js.Any])
    
    inline def setDisableEffectsByDefinition(value: IAudioEffectDefinition => Callback): Self = StObject.set(x, "disableEffectsByDefinition", js.Any.fromFunction1((t0: IAudioEffectDefinition) => value(t0).runNow()))
    
    inline def setEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = StObject.set(x, "effectDefinitions", value.asInstanceOf[js.Any])
    
    inline def setEnableEffectsByDefinition(value: IAudioEffectDefinition => Callback): Self = StObject.set(x, "enableEffectsByDefinition", js.Any.fromFunction1((t0: IAudioEffectDefinition) => value(t0).runNow()))
    
    inline def setEncodingProperties(value: AudioEncodingProperties): Self = StObject.set(x, "encodingProperties", value.asInstanceOf[js.Any])
    
    inline def setOutgoingGain(value: Double): Self = StObject.set(x, "outgoingGain", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
