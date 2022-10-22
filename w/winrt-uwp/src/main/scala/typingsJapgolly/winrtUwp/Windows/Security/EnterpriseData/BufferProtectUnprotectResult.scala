package typingsJapgolly.winrtUwp.Windows.Security.EnterpriseData

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the result from protecting or unprotecting an enterprise protected buffer. */
trait BufferProtectUnprotectResult extends StObject {
  
  /** Gets the enterprise protected buffer that has been protected or unprotected. */
  var buffer: IBuffer
  
  /** Gets the DataProtectionInfo object concerning the enterprise protected buffer that has been protected or unprotected. */
  var protectionInfo: DataProtectionInfo
}
object BufferProtectUnprotectResult {
  
  inline def apply(buffer: IBuffer, protectionInfo: DataProtectionInfo): BufferProtectUnprotectResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], protectionInfo = protectionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferProtectUnprotectResult]
  }
  
  extension [Self <: BufferProtectUnprotectResult](x: Self) {
    
    inline def setBuffer(value: IBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setProtectionInfo(value: DataProtectionInfo): Self = StObject.set(x, "protectionInfo", value.asInstanceOf[js.Any])
  }
}
