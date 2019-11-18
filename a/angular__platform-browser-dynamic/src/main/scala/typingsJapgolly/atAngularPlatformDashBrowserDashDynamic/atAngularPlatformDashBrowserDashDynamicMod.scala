package typingsJapgolly.atAngularPlatformDashBrowserDashDynamic

import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.CompileMetadataResolver
import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.CompileReflector
import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.CompilerConfig
import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.JitEvaluator
import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.NgModuleCompiler
import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.StyleCompiler
import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.SummaryResolver
import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.TemplateParser
import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.ViewCompiler
import typingsJapgolly.atAngularCompiler.srcResourceUnderscoreLoaderMod.ResourceLoader
import typingsJapgolly.atAngularCore.atAngularCoreMod.Compiler
import typingsJapgolly.atAngularCore.atAngularCoreMod.CompilerFactory
import typingsJapgolly.atAngularCore.atAngularCoreMod.ComponentFactory
import typingsJapgolly.atAngularCore.atAngularCoreMod.Injector
import typingsJapgolly.atAngularCore.atAngularCoreMod.PlatformRef
import typingsJapgolly.atAngularCore.atAngularCoreMod.Provider
import typingsJapgolly.atAngularCore.atAngularCoreMod.StaticProvider
import typingsJapgolly.atAngularCore.atAngularCoreMod.Type
import typingsJapgolly.atAngularCore.atAngularCoreMod.Version
import typingsJapgolly.atAngularCore.atAngularCoreMod.ɵConsole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic", JSImport.Namespace)
@js.native
object atAngularPlatformDashBrowserDashDynamicMod extends js.Object {
  @js.native
  class JitCompilerFactory () extends CompilerFactory {
    var _defaultOptions: js.Any = js.native
  }
  
  @js.native
  class ɵCompilerImpl protected () extends Compiler {
    def this(
      injector: Injector,
      _metadataResolver: CompileMetadataResolver,
      templateParser: TemplateParser,
      styleCompiler: StyleCompiler,
      viewCompiler: ViewCompiler,
      ngModuleCompiler: NgModuleCompiler,
      summaryResolver: SummaryResolver[Type[_]],
      compileReflector: CompileReflector,
      jitEvaluator: JitEvaluator,
      compilerConfig: CompilerConfig,
      console: ɵConsole
    ) = this()
    var _delegate: js.Any = js.native
    var _metadataResolver: js.Any = js.native
    var getExtraNgModuleProviders: js.Any = js.native
    val injector: Injector = js.native
    def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
    def hasAotSummary(ref: Type[_]): Boolean = js.native
    def loadAotSummaries(summaries: js.Function0[js.Array[_]]): Unit = js.native
  }
  
  @js.native
  class ɵResourceLoaderImpl () extends ResourceLoader
  
  @js.native
  class ɵangular_packages_platform_browser_dynamic_platform_browser_dynamic_a () extends ResourceLoader {
    var _cache: js.Any = js.native
  }
  
  val RESOURCE_CACHE_PROVIDER: js.Array[Provider] = js.native
  val VERSION: Version = js.native
  val ɵINTERNAL_BROWSER_DYNAMIC_PLATFORM_PROVIDERS: js.Array[StaticProvider] = js.native
  def platformBrowserDynamic(): PlatformRef = js.native
  def platformBrowserDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def ɵplatformCoreDynamic(): PlatformRef = js.native
  def ɵplatformCoreDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
}

