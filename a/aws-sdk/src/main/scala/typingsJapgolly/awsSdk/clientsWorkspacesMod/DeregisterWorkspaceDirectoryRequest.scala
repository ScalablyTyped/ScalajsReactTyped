package typingsJapgolly.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterWorkspaceDirectoryRequest extends StObject {
  
  /**
    * The identifier of the directory. If any WorkSpaces are registered to this directory, you must remove them before you deregister the directory, or you will receive an OperationNotSupportedException error.
    */
  var DirectoryId: typingsJapgolly.awsSdk.clientsWorkspacesMod.DirectoryId
}
object DeregisterWorkspaceDirectoryRequest {
  
  inline def apply(DirectoryId: DirectoryId): DeregisterWorkspaceDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterWorkspaceDirectoryRequest]
  }
  
  extension [Self <: DeregisterWorkspaceDirectoryRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
