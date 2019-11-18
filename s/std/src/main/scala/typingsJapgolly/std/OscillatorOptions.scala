package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OscillatorOptions extends AudioNodeOptions {
  var detune: js.UndefOr[Double] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
  var periodicWave: js.UndefOr[org.scalajs.dom.raw.PeriodicWave] = js.undefined
  var `type`: js.UndefOr[OscillatorType] = js.undefined
}

object OscillatorOptions {
  @scala.inline
  def apply(
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    detune: Int | Double = null,
    frequency: Int | Double = null,
    periodicWave: org.scalajs.dom.raw.PeriodicWave = null,
    `type`: OscillatorType = null
  ): OscillatorOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (detune != null) __obj.updateDynamic("detune")(detune.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (periodicWave != null) __obj.updateDynamic("periodicWave")(periodicWave.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OscillatorOptions]
  }
}

