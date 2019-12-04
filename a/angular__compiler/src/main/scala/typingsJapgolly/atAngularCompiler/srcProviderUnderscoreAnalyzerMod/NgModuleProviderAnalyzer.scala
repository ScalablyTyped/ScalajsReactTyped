package typingsJapgolly.atAngularCompiler.srcProviderUnderscoreAnalyzerMod

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAst
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

