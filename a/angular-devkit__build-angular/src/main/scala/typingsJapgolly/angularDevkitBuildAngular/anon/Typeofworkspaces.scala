package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.angularDevkitCore.anon.Workspace
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typingsJapgolly.angularDevkitCore.srcWorkspaceCoreMod.WorkspaceFormat
import typingsJapgolly.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition
import typingsJapgolly.angularDevkitCore.srcWorkspaceHostMod.WorkspaceHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofworkspaces extends StObject {
  
  var ProjectDefinitionCollection: Instantiable0[typingsJapgolly.angularDevkitCore.mod.workspaces.ProjectDefinitionCollection] = js.native
  
  var TargetDefinitionCollection: Instantiable0[typingsJapgolly.angularDevkitCore.mod.workspaces.TargetDefinitionCollection] = js.native
  
  def createWorkspaceHost(host: Host[js.Object]): WorkspaceHost = js.native
  
  def readWorkspace(path: String, host: WorkspaceHost): js.Promise[Workspace] = js.native
  def readWorkspace(path: String, host: WorkspaceHost, format: WorkspaceFormat): js.Promise[Workspace] = js.native
  
  def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost): js.Promise[Unit] = js.native
  def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: String): js.Promise[Unit] = js.native
  def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: String, format: WorkspaceFormat): js.Promise[Unit] = js.native
  def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: Unit, format: WorkspaceFormat): js.Promise[Unit] = js.native
}
