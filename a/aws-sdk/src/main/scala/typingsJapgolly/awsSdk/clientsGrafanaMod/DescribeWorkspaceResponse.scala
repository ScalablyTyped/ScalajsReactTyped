package typingsJapgolly.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceResponse extends StObject {
  
  /**
    * A structure containing information about the workspace.
    */
  var workspace: WorkspaceDescription
}
object DescribeWorkspaceResponse {
  
  inline def apply(workspace: WorkspaceDescription): DescribeWorkspaceResponse = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceResponse]
  }
  
  extension [Self <: DescribeWorkspaceResponse](x: Self) {
    
    inline def setWorkspace(value: WorkspaceDescription): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
