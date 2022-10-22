package typingsJapgolly.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyWorkspacePropertiesRequest extends StObject {
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typingsJapgolly.awsSdk.clientsWorkspacesMod.WorkspaceId
  
  /**
    * The properties of the WorkSpace.
    */
  var WorkspaceProperties: typingsJapgolly.awsSdk.clientsWorkspacesMod.WorkspaceProperties
}
object ModifyWorkspacePropertiesRequest {
  
  inline def apply(WorkspaceId: WorkspaceId, WorkspaceProperties: WorkspaceProperties): ModifyWorkspacePropertiesRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any], WorkspaceProperties = WorkspaceProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspacePropertiesRequest]
  }
  
  extension [Self <: ModifyWorkspacePropertiesRequest](x: Self) {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceProperties(value: WorkspaceProperties): Self = StObject.set(x, "WorkspaceProperties", value.asInstanceOf[js.Any])
  }
}
