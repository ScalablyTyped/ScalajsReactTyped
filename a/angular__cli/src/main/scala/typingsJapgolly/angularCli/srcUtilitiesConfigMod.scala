package typingsJapgolly.angularCli

import typingsJapgolly.angularCli.angularCliStrings.global
import typingsJapgolly.angularCli.angularCliStrings.local
import typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.PackageManager
import typingsJapgolly.angularCli.srcUtilitiesJsonFileMod.JSONFile
import typingsJapgolly.angularDevkitCore.mod.workspaces.ProjectDefinitionCollection
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesConfigMod {
  
  @JSImport("@angular/cli/src/utilities/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/cli/src/utilities/config", "AngularWorkspace")
  @js.native
  open class AngularWorkspace protected () extends StObject {
    def this(workspace: WorkspaceDefinition, filePath: String) = this()
    
    val basePath: String = js.native
    
    def extensions: Record[String, js.UndefOr[JsonValue]] = js.native
    
    val filePath: String = js.native
    
    def getCli(): js.UndefOr[Record[String, Any]] = js.native
    
    def getProjectCli(projectName: String): js.UndefOr[Record[String, Any]] = js.native
    
    def projects: ProjectDefinitionCollection = js.native
    
    def save(): js.Promise[Unit] = js.native
    
    /* private */ val workspace: Any = js.native
  }
  /* static members */
  object AngularWorkspace {
    
    @JSImport("@angular/cli/src/utilities/config", "AngularWorkspace")
    @js.native
    val ^ : js.Any = js.native
    
    inline def load(workspaceFilePath: String): js.Promise[AngularWorkspace] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(workspaceFilePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AngularWorkspace]]
  }
  
  inline def getConfiguredPackageManager(): js.Promise[PackageManager | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguredPackageManager")().asInstanceOf[js.Promise[PackageManager | Null]]
  
  inline def getProjectByCwd(workspace: AngularWorkspace): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectByCwd")(workspace.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getSchematicDefaults(collection: String, schematic: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchematicDefaults")(collection.asInstanceOf[js.Any], schematic.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  inline def getSchematicDefaults(collection: String, schematic: String, project: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchematicDefaults")(collection.asInstanceOf[js.Any], schematic.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  inline def getWorkspace(level: local | global): js.Promise[js.UndefOr[AngularWorkspace]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(level.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[AngularWorkspace]]]
  
  inline def getWorkspaceRaw(): js.Promise[js.Tuple2[JSONFile | Null, String | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspaceRaw")().asInstanceOf[js.Promise[js.Tuple2[JSONFile | Null, String | Null]]]
  inline def getWorkspaceRaw(level: local | global): js.Promise[js.Tuple2[JSONFile | Null, String | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspaceRaw")(level.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[JSONFile | Null, String | Null]]]
  
  inline def getWorkspace_global(level: global): js.Promise[AngularWorkspace] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(level.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AngularWorkspace]]
  
  inline def getWorkspace_local(level: local): js.Promise[js.UndefOr[AngularWorkspace]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(level.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[AngularWorkspace]]]
  
  inline def isWarningEnabled(warning: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isWarningEnabled")(warning.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def validateWorkspace(data: JsonObject, isGlobal: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateWorkspace")(data.asInstanceOf[js.Any], isGlobal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@angular/cli/src/utilities/config", "workspaceSchemaPath")
  @js.native
  val workspaceSchemaPath: String = js.native
}
