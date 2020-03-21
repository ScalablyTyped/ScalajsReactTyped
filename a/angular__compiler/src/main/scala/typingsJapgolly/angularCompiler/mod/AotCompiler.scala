package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.abstractEmitterMod.OutputEmitter
import typingsJapgolly.angularCompiler.compilerHostMod.AotCompilerHost
import typingsJapgolly.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typingsJapgolly.angularCompiler.injectableCompilerMod.InjectableCompiler
import typingsJapgolly.angularCompiler.typeCheckCompilerMod.TypeCheckCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "AotCompiler")
@js.native
class AotCompiler protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.AotCompiler {
  def this(
    _config: typingsJapgolly.angularCompiler.configMod.CompilerConfig,
    _options: AotCompilerOptions,
    _host: AotCompilerHost,
    reflector: typingsJapgolly.angularCompiler.staticReflectorMod.StaticReflector,
    _metadataResolver: typingsJapgolly.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    _templateParser: typingsJapgolly.angularCompiler.templateParserMod.TemplateParser,
    _styleCompiler: typingsJapgolly.angularCompiler.styleCompilerMod.StyleCompiler,
    _viewCompiler: typingsJapgolly.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler,
    _typeCheckCompiler: TypeCheckCompiler,
    _ngModuleCompiler: typingsJapgolly.angularCompiler.ngModuleCompilerMod.NgModuleCompiler,
    _injectableCompiler: InjectableCompiler,
    _outputEmitter: OutputEmitter,
    _summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol],
    _symbolResolver: typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
  ) = this()
}

