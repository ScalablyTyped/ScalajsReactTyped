package typingsJapgolly.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkAsArchivedRequest extends StObject {
  
  /**
    * Mark as archived by Source Server ID.
    */
  var sourceServerID: SourceServerID
}
object MarkAsArchivedRequest {
  
  inline def apply(sourceServerID: SourceServerID): MarkAsArchivedRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkAsArchivedRequest]
  }
  
  extension [Self <: MarkAsArchivedRequest](x: Self) {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
