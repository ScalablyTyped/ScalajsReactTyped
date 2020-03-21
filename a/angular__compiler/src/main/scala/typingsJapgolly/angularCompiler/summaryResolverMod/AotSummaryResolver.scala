package typingsJapgolly.angularCompiler.summaryResolverMod

import typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol
import typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbolCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/summary_resolver", "AotSummaryResolver")
@js.native
class AotSummaryResolver protected () extends SummaryResolver[StaticSymbol] {
  def this(host: AotSummaryResolverHost, staticSymbolCache: StaticSymbolCache) = this()
  var _loadSummaryFile: js.Any = js.native
  var host: js.Any = js.native
  var importAs: js.Any = js.native
  var knownFileNameToModuleNames: js.Any = js.native
  var loadedFilePaths: js.Any = js.native
  var staticSymbolCache: js.Any = js.native
  var summaryCache: js.Any = js.native
}

