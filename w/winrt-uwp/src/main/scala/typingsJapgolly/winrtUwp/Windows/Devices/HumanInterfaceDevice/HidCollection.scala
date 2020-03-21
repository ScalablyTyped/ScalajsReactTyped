package typingsJapgolly.winrtUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves the collection information for a group of related controls. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidCollection")
@js.native
abstract class HidCollection () extends js.Object {
  /** Retrieves the identifier for a collection of HID controls. */
  var id: Double = js.native
  /** Retrieves the collection type. */
  var `type`: HidCollectionType = js.native
  /** Retrieves the usage identifier for the given control collection. */
  var usageId: Double = js.native
  /** Retrieves the usage page for the given control collection. */
  var usagePage: Double = js.native
}

