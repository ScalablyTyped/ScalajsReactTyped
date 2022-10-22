package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.anon.Workspace
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typingsJapgolly.angularDevkitCore.srcWorkspaceCoreMod.WorkspaceFormat
import typingsJapgolly.angularDevkitCore.srcWorkspaceDefinitionsMod.DefinitionCollectionListener
import typingsJapgolly.angularDevkitCore.srcWorkspaceDefinitionsMod.ProjectDefinition
import typingsJapgolly.angularDevkitCore.srcWorkspaceDefinitionsMod.TargetDefinition
import typingsJapgolly.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition
import typingsJapgolly.angularDevkitCore.srcWorkspaceHostMod.WorkspaceHost
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkspaceMod {
  
  @JSImport("@angular-devkit/core/src/workspace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core/src/workspace", "ProjectDefinitionCollection")
  @js.native
  open class ProjectDefinitionCollection ()
    extends typingsJapgolly.angularDevkitCore.srcWorkspaceDefinitionsMod.ProjectDefinitionCollection {
    def this(initial: Record[String, ProjectDefinition]) = this()
    def this(initial: Unit, listener: DefinitionCollectionListener[ProjectDefinition]) = this()
    def this(
      initial: Record[String, ProjectDefinition],
      listener: DefinitionCollectionListener[ProjectDefinition]
    ) = this()
  }
  
  @JSImport("@angular-devkit/core/src/workspace", "TargetDefinitionCollection")
  @js.native
  open class TargetDefinitionCollection ()
    extends typingsJapgolly.angularDevkitCore.srcWorkspaceDefinitionsMod.TargetDefinitionCollection {
    def this(initial: Record[String, TargetDefinition]) = this()
    def this(initial: Unit, listener: DefinitionCollectionListener[TargetDefinition]) = this()
    def this(
      initial: Record[String, TargetDefinition],
      listener: DefinitionCollectionListener[TargetDefinition]
    ) = this()
  }
  
  @JSImport("@angular-devkit/core/src/workspace", "WorkspaceFormat")
  @js.native
  object WorkspaceFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularDevkitCore.srcWorkspaceCoreMod.WorkspaceFormat & Double] = js.native
    
    /* 0 */ val JSON: typingsJapgolly.angularDevkitCore.srcWorkspaceCoreMod.WorkspaceFormat.JSON & Double = js.native
  }
  
  inline def createWorkspaceHost(host: Host[js.Object]): WorkspaceHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorkspaceHost")(host.asInstanceOf[js.Any]).asInstanceOf[WorkspaceHost]
  
  inline def readWorkspace(path: String, host: WorkspaceHost): js.Promise[Workspace] = (^.asInstanceOf[js.Dynamic].applyDynamic("readWorkspace")(path.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Workspace]]
  inline def readWorkspace(path: String, host: WorkspaceHost, format: WorkspaceFormat): js.Promise[Workspace] = (^.asInstanceOf[js.Dynamic].applyDynamic("readWorkspace")(path.asInstanceOf[js.Any], host.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Workspace]]
  
  inline def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: String, format: WorkspaceFormat): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: Unit, format: WorkspaceFormat): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
