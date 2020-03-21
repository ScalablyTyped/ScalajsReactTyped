package typingsJapgolly.shellQuote

import typingsJapgolly.shellQuote.mod._ParseEntry
import typingsJapgolly.shellQuote.shellQuoteStrings.glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPattern extends _ParseEntry {
  var op: glob
  var pattern: String
}

object AnonPattern {
  @scala.inline
  def apply(op: glob, pattern: String): AnonPattern = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPattern]
  }
}

