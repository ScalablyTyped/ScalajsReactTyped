package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableRadiusRequest extends StObject {
  
  /**
    * The identifier of the directory for which to disable MFA.
    */
  var DirectoryId: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.DirectoryId
}
object DisableRadiusRequest {
  
  inline def apply(DirectoryId: DirectoryId): DisableRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableRadiusRequest]
  }
  
  extension [Self <: DisableRadiusRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
