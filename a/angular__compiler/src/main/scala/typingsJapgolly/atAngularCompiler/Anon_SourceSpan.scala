package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceSpan extends js.Object {
  var sourceSpan: ParseSourceSpan | Null
}

object Anon_SourceSpan {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan = null): Anon_SourceSpan = {
    val __obj = js.Dynamic.literal()
    if (sourceSpan != null) __obj.updateDynamic("sourceSpan")(sourceSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SourceSpan]
  }
}

