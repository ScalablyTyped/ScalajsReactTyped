package typingsJapgolly.atAngularCompiler.atAngularCompilerMod

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typingsJapgolly.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "JitCompiler")
@js.native
class JitCompiler protected ()
  extends typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod.JitCompiler {
  def this(
    _metadataResolver: typingsJapgolly.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    _templateParser: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParser,
    _styleCompiler: typingsJapgolly.atAngularCompiler.srcStyleUnderscoreCompilerMod.StyleCompiler,
    _viewCompiler: typingsJapgolly.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.ViewCompiler,
    _ngModuleCompiler: typingsJapgolly.atAngularCompiler.srcNgUnderscoreModuleUnderscoreCompilerMod.NgModuleCompiler,
    _summaryResolver: typingsJapgolly.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typingsJapgolly.atAngularCompiler.srcCoreMod.Type],
    _reflector: typingsJapgolly.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector,
    _jitEvaluator: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreJitMod.JitEvaluator,
    _compilerConfig: typingsJapgolly.atAngularCompiler.srcConfigMod.CompilerConfig,
    _console: Console,
    getExtraNgModuleProviders: js.Function1[/* ngModule */ js.Any, js.Array[CompileProviderMetadata]]
  ) = this()
}

