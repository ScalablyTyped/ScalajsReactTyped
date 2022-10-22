package typingsJapgolly.schematicsAngular

import typingsJapgolly.angularDevkitSchematics.mod.Tree
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typingsJapgolly.schematicsAngular.anon.Existing
import typingsJapgolly.schematicsAngular.utilityWorkspaceMod.WorkspaceDefinition
import typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityMod {
  
  @JSImport("@schematics/angular/utility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@schematics/angular/utility", "AngularBuilder")
  @js.native
  object AngularBuilder extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Builders & String] = js.native
    
    /* "@angular-devkit/build-angular:app-shell" */ val AppShell: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.AppShell & String = js.native
    
    /* "@angular-devkit/build-angular:browser" */ val Browser: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.Browser & String = js.native
    
    /* "@angular-devkit/build-ng-packagr:build" */ val DeprecatedNgPackagr: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.DeprecatedNgPackagr & String = js.native
    
    /* "@angular-devkit/build-angular:dev-server" */ val DevServer: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.DevServer & String = js.native
    
    /* "@angular-devkit/build-angular:extract-i18n" */ val ExtractI18n: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.ExtractI18n & String = js.native
    
    /* "@angular-devkit/build-angular:karma" */ val Karma: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.Karma & String = js.native
    
    /* "@angular-devkit/build-angular:ng-packagr" */ val NgPackagr: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.NgPackagr & String = js.native
    
    /* "@angular-devkit/build-angular:protractor" */ val Protractor: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.Protractor & String = js.native
    
    /* "@angular-devkit/build-angular:server" */ val Server: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.Server & String = js.native
    
    /* "@angular-devkit/build-angular:tslint" */ val TsLint: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.Builders.TsLint & String = js.native
  }
  
  @JSImport("@schematics/angular/utility", "DependencyType")
  @js.native
  object DependencyType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.schematicsAngular.utilityDependencyMod.DependencyType & String] = js.native
    
    /* "dependencies" */ val Default: typingsJapgolly.schematicsAngular.utilityDependencyMod.DependencyType.Default & String = js.native
    
    /* "devDependencies" */ val Dev: typingsJapgolly.schematicsAngular.utilityDependencyMod.DependencyType.Dev & String = js.native
    
    /* "peerDependencies" */ val Peer: typingsJapgolly.schematicsAngular.utilityDependencyMod.DependencyType.Peer & String = js.native
  }
  
  @JSImport("@schematics/angular/utility", "ExistingBehavior")
  @js.native
  object ExistingBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.schematicsAngular.utilityDependencyMod.ExistingBehavior & Double] = js.native
    
    /* 1 */ val Replace: typingsJapgolly.schematicsAngular.utilityDependencyMod.ExistingBehavior.Replace & Double = js.native
    
    /* 0 */ val Skip: typingsJapgolly.schematicsAngular.utilityDependencyMod.ExistingBehavior.Skip & Double = js.native
  }
  
  @JSImport("@schematics/angular/utility", "InstallBehavior")
  @js.native
  object InstallBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.schematicsAngular.utilityDependencyMod.InstallBehavior & Double] = js.native
    
    /* 2 */ val Always: typingsJapgolly.schematicsAngular.utilityDependencyMod.InstallBehavior.Always & Double = js.native
    
    /* 1 */ val Auto: typingsJapgolly.schematicsAngular.utilityDependencyMod.InstallBehavior.Auto & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.schematicsAngular.utilityDependencyMod.InstallBehavior.None & Double = js.native
  }
  
  inline def addDependency(name: String, specifier: String): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("addDependency")(name.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any])).asInstanceOf[Rule]
  inline def addDependency(name: String, specifier: String, options: Existing): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("addDependency")(name.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rule]
  
  inline def readWorkspace(tree: Tree): js.Promise[WorkspaceDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("readWorkspace")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WorkspaceDefinition]]
  inline def readWorkspace(tree: Tree, path: String): js.Promise[WorkspaceDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("readWorkspace")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WorkspaceDefinition]]
  
  inline def updateWorkspace(
    updater: js.Function1[/* workspace */ WorkspaceDefinition, Unit | Rule | (PromiseLike[Unit | Rule])]
  ): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("updateWorkspace")(updater.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def writeWorkspace(tree: Tree, workspace: WorkspaceDefinition): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(tree.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(tree: Tree, workspace: WorkspaceDefinition, path: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(tree.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
