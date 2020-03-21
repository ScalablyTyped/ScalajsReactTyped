package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsJapgolly.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "JitCompiler")
@js.native
class JitCompiler protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.JitCompiler {
  def this(
    _metadataResolver: typingsJapgolly.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    _templateParser: typingsJapgolly.angularCompiler.templateParserMod.TemplateParser,
    _styleCompiler: typingsJapgolly.angularCompiler.styleCompilerMod.StyleCompiler,
    _viewCompiler: typingsJapgolly.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler,
    _ngModuleCompiler: typingsJapgolly.angularCompiler.ngModuleCompilerMod.NgModuleCompiler,
    _summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsJapgolly.angularCompiler.coreMod.Type],
    _reflector: typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector,
    _jitEvaluator: typingsJapgolly.angularCompiler.outputJitMod.JitEvaluator,
    _compilerConfig: typingsJapgolly.angularCompiler.configMod.CompilerConfig,
    _console: Console,
    getExtraNgModuleProviders: js.Function1[/* ngModule */ js.Any, js.Array[CompileProviderMetadata]]
  ) = this()
}

