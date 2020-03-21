package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.summaryResolverMod.AotSummaryResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "AotSummaryResolver")
@js.native
class AotSummaryResolver protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.AotSummaryResolver {
  def this(
    host: AotSummaryResolverHost,
    staticSymbolCache: typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbolCache
  ) = this()
}

