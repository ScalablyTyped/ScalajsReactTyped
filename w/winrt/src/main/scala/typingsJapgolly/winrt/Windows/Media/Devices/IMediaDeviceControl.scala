package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonSucceededBoolean
import typingsJapgolly.winrt.AnonSucceededValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceControl extends js.Object {
  var capabilities: MediaDeviceControlCapabilities
  def tryGetAuto(): AnonSucceededBoolean
  def tryGetValue(): AnonSucceededValue
  def trySetAuto(value: Boolean): Boolean
  def trySetValue(value: Double): Boolean
}

object IMediaDeviceControl {
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: CallbackTo[AnonSucceededBoolean],
    tryGetValue: CallbackTo[AnonSucceededValue],
    trySetAuto: Boolean => CallbackTo[Boolean],
    trySetValue: Double => CallbackTo[Boolean]
  ): IMediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.updateDynamic("tryGetAuto")(tryGetAuto.toJsFn)
    __obj.updateDynamic("tryGetValue")(tryGetValue.toJsFn)
    __obj.updateDynamic("trySetAuto")(js.Any.fromFunction1((t0: scala.Boolean) => trySetAuto(t0).runNow()))
    __obj.updateDynamic("trySetValue")(js.Any.fromFunction1((t0: scala.Double) => trySetValue(t0).runNow()))
    __obj.asInstanceOf[IMediaDeviceControl]
  }
}

