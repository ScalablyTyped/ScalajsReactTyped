package typingsJapgolly.winrtUwp.Windows.Media.Audio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Media.AudioFrame
import typingsJapgolly.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio frame output node. */
trait AudioFrameOutputNode extends StObject {
  
  /** Closes the audio frame output node. */
  def close(): Unit
  
  /** Gets or sets a value indicating if the audio frame output node consumes input. */
  var consumeInput: Boolean
  
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  
  /** Gets the list of effect definitions for the audio frame output node. */
  var effectDefinitions: IVector[IAudioEffectDefinition]
  
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  
  /** Gets the encoding properties for the audio frame output node. */
  var encodingProperties: AudioEncodingProperties
  
  /**
    * Gets an audio frame containing all of the data accumulated by this node since the previous call to GetFrame. If GetFrame has not yet been called, the audio frame will contain all of the data accumulated since the node was created.
    * @return An AudioFrame object representing the frame.
    */
  def getFrame(): AudioFrame
  
  /** Gets or sets the outgoing gain for the audio frame output node. */
  var outgoingGain: Double
  
  /** Resets the audio frame output node. */
  def reset(): Unit
  
  /** Starts the audio frame output node. */
  def start(): Unit
  
  /** Stops the audio frame output node. */
  def stop(): Unit
}
object AudioFrameOutputNode {
  
  inline def apply(
    close: Callback,
    consumeInput: Boolean,
    disableEffectsByDefinition: IAudioEffectDefinition => Callback,
    effectDefinitions: IVector[IAudioEffectDefinition],
    enableEffectsByDefinition: IAudioEffectDefinition => Callback,
    encodingProperties: AudioEncodingProperties,
    getFrame: CallbackTo[AudioFrame],
    outgoingGain: Double,
    reset: Callback,
    start: Callback,
    stop: Callback
  ): AudioFrameOutputNode = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, consumeInput = consumeInput.asInstanceOf[js.Any], disableEffectsByDefinition = js.Any.fromFunction1((t0: IAudioEffectDefinition) => disableEffectsByDefinition(t0).runNow()), effectDefinitions = effectDefinitions.asInstanceOf[js.Any], enableEffectsByDefinition = js.Any.fromFunction1((t0: IAudioEffectDefinition) => enableEffectsByDefinition(t0).runNow()), encodingProperties = encodingProperties.asInstanceOf[js.Any], getFrame = getFrame.toJsFn, outgoingGain = outgoingGain.asInstanceOf[js.Any], reset = reset.toJsFn, start = start.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[AudioFrameOutputNode]
  }
  
  extension [Self <: AudioFrameOutputNode](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setConsumeInput(value: Boolean): Self = StObject.set(x, "consumeInput", value.asInstanceOf[js.Any])
    
    inline def setDisableEffectsByDefinition(value: IAudioEffectDefinition => Callback): Self = StObject.set(x, "disableEffectsByDefinition", js.Any.fromFunction1((t0: IAudioEffectDefinition) => value(t0).runNow()))
    
    inline def setEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = StObject.set(x, "effectDefinitions", value.asInstanceOf[js.Any])
    
    inline def setEnableEffectsByDefinition(value: IAudioEffectDefinition => Callback): Self = StObject.set(x, "enableEffectsByDefinition", js.Any.fromFunction1((t0: IAudioEffectDefinition) => value(t0).runNow()))
    
    inline def setEncodingProperties(value: AudioEncodingProperties): Self = StObject.set(x, "encodingProperties", value.asInstanceOf[js.Any])
    
    inline def setGetFrame(value: CallbackTo[AudioFrame]): Self = StObject.set(x, "getFrame", value.toJsFn)
    
    inline def setOutgoingGain(value: Double): Self = StObject.set(x, "outgoingGain", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
