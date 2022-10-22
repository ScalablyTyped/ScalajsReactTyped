package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcMigrationsMigrationMod.Migration
import typingsJapgolly.angularCompilerCli.ngccSrcMigrationsMigrationMod.MigrationHost
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcMigrationsMissingInjectableMigrationMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/migrations/missing_injectable_migration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/migrations/missing_injectable_migration", "MissingInjectableMigration")
  @js.native
  open class MissingInjectableMigration ()
    extends StObject
       with Migration {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(clazz: ClassDeclaration[DeclarationNode], host: MigrationHost): Diagnostic | Null = js.native
  }
  
  inline def getAngularCoreDecoratorName(decorator: Decorator): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngularCoreDecoratorName")(decorator.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
