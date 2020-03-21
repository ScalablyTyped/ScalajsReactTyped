package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.compilerMod.NgAnalyzeModulesHost
import typingsJapgolly.angularCompiler.compilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "analyzeAndValidateNgModules")
@js.native
object analyzeAndValidateNgModules extends js.Object {
  def apply(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsJapgolly.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ): NgAnalyzedModules = js.native
}

