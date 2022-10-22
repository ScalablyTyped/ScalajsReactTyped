package typingsJapgolly.angularDevkitCore.anon

import typingsJapgolly.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workspace extends StObject {
  
  var workspace: WorkspaceDefinition
}
object Workspace {
  
  inline def apply(workspace: WorkspaceDefinition): Workspace = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workspace]
  }
  
  extension [Self <: Workspace](x: Self) {
    
    inline def setWorkspace(value: WorkspaceDefinition): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
