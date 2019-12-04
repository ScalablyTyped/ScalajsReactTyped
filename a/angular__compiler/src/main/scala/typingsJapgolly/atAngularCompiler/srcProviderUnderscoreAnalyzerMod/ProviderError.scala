package typingsJapgolly.atAngularCompiler.srcProviderUnderscoreAnalyzerMod

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/provider_analyzer", "ProviderError")
@js.native
class ProviderError protected () extends ParseError {
  def this(message: String, span: ParseSourceSpan) = this()
}

