package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcMigrationsMigrationMod.Migration
import typingsJapgolly.angularCompilerCli.ngccSrcMigrationsMigrationMod.MigrationHost
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcMigrationsUndecoratedParentMigrationMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/migrations/undecorated_parent_migration", "UndecoratedParentMigration")
  @js.native
  open class UndecoratedParentMigration ()
    extends StObject
       with Migration {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(clazz: ClassDeclaration[DeclarationNode], host: MigrationHost): Diagnostic | Null = js.native
  }
}
