package typingsJapgolly.winrtUwp.Windows.Devices.Perception.Provider

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object that can produce PerceptionFrames. */
trait IPerceptionFrameProvider extends IClosable {
  /** Gets a value indicating whether or not the device is ready to start producing PerceptionFrames. */
  var available: Boolean
  /** Gets the PerceptionFrameProviderInfo describing this device. */
  var frameProviderInfo: PerceptionFrameProviderInfo
  /** The properties describing the device and the frames produced by the device. */
  var properties: IPropertySet
  /**
    * The device is requested to update one of its Properties to a new value.
    * @param value Success or failure will be conveyed to the app.
    */
  def setProperty(value: PerceptionPropertyChangeRequest): Unit
  /** Tells the device to start producing frames. If success is returned, PerceptionFrameProviderManagerService::PublishFrameForProvider is expected to be called by this Provider. */
  def start(): Unit
  /** Tells the device to stop producing frames. Called only after Start is called and only if Start returns success. */
  def stop(): Unit
}

object IPerceptionFrameProvider {
  @scala.inline
  def apply(
    available: Boolean,
    close: Callback,
    frameProviderInfo: PerceptionFrameProviderInfo,
    properties: IPropertySet,
    setProperty: PerceptionPropertyChangeRequest => Callback,
    start: Callback,
    stop: Callback
  ): IPerceptionFrameProvider = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], frameProviderInfo = frameProviderInfo.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("setProperty")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Devices.Perception.Provider.PerceptionPropertyChangeRequest) => setProperty(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[IPerceptionFrameProvider]
  }
}

