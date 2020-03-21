package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "StaticSymbolResolver")
@js.native
class StaticSymbolResolver protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.StaticSymbolResolver {
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbolCache,
    summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol]
  ) = this()
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbolCache,
    summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

