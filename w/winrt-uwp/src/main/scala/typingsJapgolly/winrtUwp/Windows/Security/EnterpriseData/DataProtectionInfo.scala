package typingsJapgolly.winrtUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an enterprise protected buffer or stream. */
trait DataProtectionInfo extends StObject {
  
  /** The enterprise identity of the enterprise protected buffer or stream. */
  var identity: String
  
  /** The protection status of the enterprise protected buffer or stream. */
  var status: DataProtectionStatus
}
object DataProtectionInfo {
  
  inline def apply(identity: String, status: DataProtectionStatus): DataProtectionInfo = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProtectionInfo]
  }
  
  extension [Self <: DataProtectionInfo](x: Self) {
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DataProtectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
