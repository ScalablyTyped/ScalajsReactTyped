package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisNgccTraitCompilerMod.NgccTraitCompiler
import typingsJapgolly.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typingsJapgolly.angularCompilerCli.ngccSrcMigrationsMigrationMod.MigrationHost
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcAnalysisMigrationHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/migration_host", "DefaultMigrationHost")
  @js.native
  open class DefaultMigrationHost protected ()
    extends StObject
       with MigrationHost {
    def this(
      reflectionHost: NgccReflectionHost,
      metadata: MetadataReader,
      evaluator: PartialEvaluator,
      compiler: NgccTraitCompiler,
      entryPointPath: AbsoluteFsPath
    ) = this()
    
    /* private */ var compiler: Any = js.native
    
    /* private */ var entryPointPath: Any = js.native
  }
}
