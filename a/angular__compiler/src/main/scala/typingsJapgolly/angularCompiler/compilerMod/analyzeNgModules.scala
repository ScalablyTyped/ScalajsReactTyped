package typingsJapgolly.angularCompiler.compilerMod

import typingsJapgolly.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler", "analyzeNgModules")
@js.native
object analyzeNgModules extends js.Object {
  def apply(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver
  ): NgAnalyzedModules = js.native
}

