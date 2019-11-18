package typingsJapgolly.atAngularCompiler.atAngularCompilerMod

import typingsJapgolly.atAngularCompiler.srcAotCompilerUnderscoreHostMod.AotCompilerHost
import typingsJapgolly.atAngularCompiler.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions
import typingsJapgolly.atAngularCompiler.srcInjectableUnderscoreCompilerMod.InjectableCompiler
import typingsJapgolly.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.OutputEmitter
import typingsJapgolly.atAngularCompiler.srcViewUnderscoreCompilerTypeUnderscoreCheckUnderscoreCompilerMod.TypeCheckCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "AotCompiler")
@js.native
class AotCompiler protected ()
  extends typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod.AotCompiler {
  def this(
    _config: typingsJapgolly.atAngularCompiler.srcConfigMod.CompilerConfig,
    _options: AotCompilerOptions,
    _host: AotCompilerHost,
    reflector: typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreReflectorMod.StaticReflector,
    _metadataResolver: typingsJapgolly.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    _templateParser: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParser,
    _styleCompiler: typingsJapgolly.atAngularCompiler.srcStyleUnderscoreCompilerMod.StyleCompiler,
    _viewCompiler: typingsJapgolly.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.ViewCompiler,
    _typeCheckCompiler: TypeCheckCompiler,
    _ngModuleCompiler: typingsJapgolly.atAngularCompiler.srcNgUnderscoreModuleUnderscoreCompilerMod.NgModuleCompiler,
    _injectableCompiler: InjectableCompiler,
    _outputEmitter: OutputEmitter,
    _summaryResolver: typingsJapgolly.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol],
    _symbolResolver: typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
  ) = this()
}

