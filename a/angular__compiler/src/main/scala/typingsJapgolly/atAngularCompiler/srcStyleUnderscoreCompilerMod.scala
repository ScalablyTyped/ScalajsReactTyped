package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata
import typingsJapgolly.atAngularCompiler.srcStyleUnderscoreCompilerMod.CompiledStylesheet
import typingsJapgolly.atAngularCompiler.srcStyleUnderscoreCompilerMod.StylesCompileDependency
import typingsJapgolly.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolver
import typingsJapgolly.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/style_compiler", JSImport.Namespace)
@js.native
object srcStyleUnderscoreCompilerMod extends js.Object {
  @js.native
  class CompiledStylesheet protected () extends js.Object {
    def this(
      outputCtx: OutputContext,
      stylesVar: String,
      dependencies: js.Array[StylesCompileDependency],
      isShimmed: Boolean,
      meta: CompileStylesheetMetadata
    ) = this()
    var dependencies: js.Array[StylesCompileDependency] = js.native
    var isShimmed: Boolean = js.native
    var meta: CompileStylesheetMetadata = js.native
    var outputCtx: OutputContext = js.native
    var stylesVar: String = js.native
  }
  
  @js.native
  class StyleCompiler protected () extends js.Object {
    def this(_urlResolver: UrlResolver) = this()
    var _compileStyles: js.Any = js.native
    var _shadowCss: js.Any = js.native
    var _shimIfNeeded: js.Any = js.native
    var _urlResolver: js.Any = js.native
    def compileComponent(outputCtx: OutputContext, comp: CompileDirectiveMetadata): CompiledStylesheet = js.native
    def compileStyles(outputCtx: OutputContext, comp: CompileDirectiveMetadata, stylesheet: CompileStylesheetMetadata): CompiledStylesheet = js.native
    def compileStyles(
      outputCtx: OutputContext,
      comp: CompileDirectiveMetadata,
      stylesheet: CompileStylesheetMetadata,
      shim: Boolean
    ): CompiledStylesheet = js.native
    def needsStyleShim(comp: CompileDirectiveMetadata): Boolean = js.native
  }
  
  @js.native
  class StylesCompileDependency protected () extends js.Object {
    def this(name: String, moduleUrl: String, setValue: js.Function1[/* value */ js.Any, Unit]) = this()
    var moduleUrl: String = js.native
    var name: String = js.native
    def setValue(value: js.Any): Unit = js.native
  }
  
  val CONTENT_ATTR: String = js.native
  val HOST_ATTR: String = js.native
}

