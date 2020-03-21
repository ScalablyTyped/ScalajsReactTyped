package typingsJapgolly.angularPlatformBrowserDynamic.mod

import typingsJapgolly.angularCompiler.mod.CompileMetadataResolver
import typingsJapgolly.angularCompiler.mod.CompileReflector
import typingsJapgolly.angularCompiler.mod.CompilerConfig
import typingsJapgolly.angularCompiler.mod.JitEvaluator
import typingsJapgolly.angularCompiler.mod.NgModuleCompiler
import typingsJapgolly.angularCompiler.mod.StyleCompiler
import typingsJapgolly.angularCompiler.mod.SummaryResolver
import typingsJapgolly.angularCompiler.mod.TemplateParser
import typingsJapgolly.angularCompiler.mod.ViewCompiler
import typingsJapgolly.angularCore.mod.Compiler
import typingsJapgolly.angularCore.mod.ComponentFactory
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.Type
import typingsJapgolly.angularCore.mod.ɵConsole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic", "\u0275CompilerImpl")
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

