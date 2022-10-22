package typingsJapgolly.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceRequest extends StObject {
  
  /**
    * The ID of the workspace to delete.
    */
  var workspaceId: WorkspaceId
}
object DeleteWorkspaceRequest {
  
  inline def apply(workspaceId: WorkspaceId): DeleteWorkspaceRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceRequest]
  }
  
  extension [Self <: DeleteWorkspaceRequest](x: Self) {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
