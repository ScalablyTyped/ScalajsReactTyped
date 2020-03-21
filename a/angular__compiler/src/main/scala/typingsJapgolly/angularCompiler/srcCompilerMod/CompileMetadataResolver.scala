package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.metadataResolverMod.ErrorCollector
import typingsJapgolly.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "CompileMetadataResolver")
@js.native
class CompileMetadataResolver protected ()
  extends typingsJapgolly.angularCompiler.metadataResolverMod.CompileMetadataResolver {
  def this(
    _config: typingsJapgolly.angularCompiler.configMod.CompilerConfig,
    _htmlParser: typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser,
    _ngModuleResolver: typingsJapgolly.angularCompiler.ngModuleResolverMod.NgModuleResolver,
    _directiveResolver: typingsJapgolly.angularCompiler.directiveResolverMod.DirectiveResolver,
    _pipeResolver: typingsJapgolly.angularCompiler.pipeResolverMod.PipeResolver,
    _summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[_],
    _schemaRegistry: typingsJapgolly.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _directiveNormalizer: typingsJapgolly.angularCompiler.directiveNormalizerMod.DirectiveNormalizer,
    _console: Console,
    _staticSymbolCache: typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbolCache,
    _reflector: typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
  ) = this()
  def this(
    _config: typingsJapgolly.angularCompiler.configMod.CompilerConfig,
    _htmlParser: typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser,
    _ngModuleResolver: typingsJapgolly.angularCompiler.ngModuleResolverMod.NgModuleResolver,
    _directiveResolver: typingsJapgolly.angularCompiler.directiveResolverMod.DirectiveResolver,
    _pipeResolver: typingsJapgolly.angularCompiler.pipeResolverMod.PipeResolver,
    _summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[_],
    _schemaRegistry: typingsJapgolly.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _directiveNormalizer: typingsJapgolly.angularCompiler.directiveNormalizerMod.DirectiveNormalizer,
    _console: Console,
    _staticSymbolCache: typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbolCache,
    _reflector: typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector,
    _errorCollector: ErrorCollector
  ) = this()
}

