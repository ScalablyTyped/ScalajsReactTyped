package typingsJapgolly.winrtUwp.Windows.Devices.Adc.Provider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents properties and methods common to all ADC controllers. */
trait IAdcControllerProvider extends js.Object {
  /** Gets the number of channels available on for the controller. */
  var channelCount: Double
  /** Gets or sets the controller channel mode. */
  var channelMode: ProviderAdcChannelMode
  /** Gets the maximum value that the controller can return. */
  var maxValue: Double
  /** Gets the minimum value that the controller can return. */
  var minValue: Double
  /** Gets the resolution of the controller as number of bits it has. */
  var resolutionInBits: Double
  /**
    * Acquires a connection to the specified channel.
    * @param channel Which channel to connect to.
    */
  def acquireChannel(channel: Double): Unit
  /**
    * Determines if the specified channel mode is supported by the controller.
    * @param channelMode The channel mode in question.
    * @return True if the specified channel mode is supported, otherwise false.
    */
  def isChannelModeSupported(channelMode: ProviderAdcChannelMode): Boolean
  /**
    * Gets the digital representation of the analog value on the specified channel.
    * @param channelNumber Which channel to read from.
    * @return The digital representation of the analog value.
    */
  def readValue(channelNumber: Double): Double
  /**
    * Releases the channel connection, opening that channel for others to use.
    * @param channel Which channel to close the connection to.
    */
  def releaseChannel(channel: Double): Unit
}

object IAdcControllerProvider {
  @scala.inline
  def apply(
    acquireChannel: Double => Callback,
    channelCount: Double,
    channelMode: ProviderAdcChannelMode,
    isChannelModeSupported: ProviderAdcChannelMode => CallbackTo[Boolean],
    maxValue: Double,
    minValue: Double,
    readValue: Double => CallbackTo[Double],
    releaseChannel: Double => Callback,
    resolutionInBits: Double
  ): IAdcControllerProvider = {
    val __obj = js.Dynamic.literal(channelCount = channelCount.asInstanceOf[js.Any], channelMode = channelMode.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], resolutionInBits = resolutionInBits.asInstanceOf[js.Any])
    __obj.updateDynamic("acquireChannel")(js.Any.fromFunction1((t0: scala.Double) => acquireChannel(t0).runNow()))
    __obj.updateDynamic("isChannelModeSupported")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode) => isChannelModeSupported(t0).runNow()))
    __obj.updateDynamic("readValue")(js.Any.fromFunction1((t0: scala.Double) => readValue(t0).runNow()))
    __obj.updateDynamic("releaseChannel")(js.Any.fromFunction1((t0: scala.Double) => releaseChannel(t0).runNow()))
    __obj.asInstanceOf[IAdcControllerProvider]
  }
}

