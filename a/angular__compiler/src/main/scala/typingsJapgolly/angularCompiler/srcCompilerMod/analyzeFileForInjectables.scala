package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.compilerMod.NgAnalyzeModulesHost
import typingsJapgolly.angularCompiler.compilerMod.NgAnalyzedFileWithInjectables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "analyzeFileForInjectables")
@js.native
object analyzeFileForInjectables extends js.Object {
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsJapgolly.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFileWithInjectables = js.native
}

