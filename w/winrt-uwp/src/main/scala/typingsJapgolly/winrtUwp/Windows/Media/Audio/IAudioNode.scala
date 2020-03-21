package typingsJapgolly.winrtUwp.Windows.Media.Audio

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import typingsJapgolly.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an audio node. */
trait IAudioNode extends IClosable {
  /** Gets or sets a value indicating if the audio node consumes input. */
  var consumeInput: Boolean
  /** Gets the list of effect definitions for the audio node. */
  var effectDefinitions: IVector[IAudioEffectDefinition]
  /** Gets the encoding properties for the audio node. */
  var encodingProperties: AudioEncodingProperties
  /** Gets or sets the outgoing gain for the audio node. */
  var outgoingGain: Double
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  /** Resets the audio node. */
  def reset(): Unit
  /** Starts the audio node. */
  def start(): Unit
  /** Stops the audio node. */
  def stop(): Unit
}

object IAudioNode {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(consumeInput = consumeInput.asInstanceOf[js.Any], effectDefinitions = effectDefinitions.asInstanceOf[js.Any], encodingProperties = encodingProperties.asInstanceOf[js.Any], outgoingGain = outgoingGain.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("disableEffectsByDefinition")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition) => disableEffectsByDefinition(t0).runNow()))
    __obj.updateDynamic("enableEffectsByDefinition")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition) => enableEffectsByDefinition(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[IAudioNode]
  }
}

