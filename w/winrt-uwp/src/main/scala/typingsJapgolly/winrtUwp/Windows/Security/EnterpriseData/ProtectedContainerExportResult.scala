package typingsJapgolly.winrtUwp.Windows.Security.EnterpriseData

import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of an enterprise protected file that has been exported to a container file. */
trait ProtectedContainerExportResult extends StObject {
  
  /** The container file that has been exported from an enterprise protected file. */
  var file: StorageFile
  
  /** The protection status after an enterprise protected file has been exported to a container file. */
  var status: ProtectedImportExportStatus
}
object ProtectedContainerExportResult {
  
  inline def apply(file: StorageFile, status: ProtectedImportExportStatus): ProtectedContainerExportResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedContainerExportResult]
  }
  
  extension [Self <: ProtectedContainerExportResult](x: Self) {
    
    inline def setFile(value: StorageFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ProtectedImportExportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
