package typingsJapgolly.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an enterprise protected buffer or stream. */
@JSGlobal("Windows.Security.EnterpriseData.DataProtectionInfo")
@js.native
abstract class DataProtectionInfo () extends js.Object {
  /** The enterprise identity of the enterprise protected buffer or stream. */
  var identity: String = js.native
  /** The protection status of the enterprise protected buffer or stream. */
  var status: DataProtectionStatus = js.native
}

