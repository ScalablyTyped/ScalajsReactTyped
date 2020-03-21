package typingsJapgolly.winrtUwp.Windows.Security.EnterpriseData

import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an enterprise protected file that has been imported from a container file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedContainerImportResult")
@js.native
abstract class ProtectedContainerImportResult () extends js.Object {
  /** The enterprise protected file that has been loaded from a container file. */
  var file: StorageFile = js.native
  /** The protection status after an enterprise protected file has been imported from a container file. */
  var status: ProtectedImportExportStatus = js.native
}

