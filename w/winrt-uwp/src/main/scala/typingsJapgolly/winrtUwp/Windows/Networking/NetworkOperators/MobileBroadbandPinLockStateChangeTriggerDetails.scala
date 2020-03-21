package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network registration state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChangeTriggerDetails")
@js.native
abstract class MobileBroadbandPinLockStateChangeTriggerDetails () extends js.Object {
  /** Gets the collection of PIN lock state change details associated with a notification. */
  var pinLockStateChanges: IVectorView[MobileBroadbandPinLockStateChange] = js.native
}

