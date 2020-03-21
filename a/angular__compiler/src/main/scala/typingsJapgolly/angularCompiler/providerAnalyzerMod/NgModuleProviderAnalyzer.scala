package typingsJapgolly.angularCompiler.providerAnalyzerMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typingsJapgolly.angularCompiler.templateAstMod.ProviderAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/provider_analyzer", "NgModuleProviderAnalyzer")
@js.native
class NgModuleProviderAnalyzer protected () extends js.Object {
  def this(
    reflector: CompileReflector,
    ngModule: CompileNgModuleMetadata,
    extraProviders: js.Array[CompileProviderMetadata],
    sourceSpan: ParseSourceSpan
  ) = this()
  var _allProviders: js.Any = js.native
  var _errors: js.Any = js.native
  var _getDependency: js.Any = js.native
  var _getOrCreateLocalProvider: js.Any = js.native
  var _seenProviders: js.Any = js.native
  var _transformedProviders: js.Any = js.native
  var reflector: js.Any = js.native
  def parse(): js.Array[ProviderAst] = js.native
}

