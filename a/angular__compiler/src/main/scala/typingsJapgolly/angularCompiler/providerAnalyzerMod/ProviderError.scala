package typingsJapgolly.angularCompiler.providerAnalyzerMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/provider_analyzer", "ProviderError")
@js.native
class ProviderError protected () extends ParseError {
  def this(message: String, span: ParseSourceSpan) = this()
}

