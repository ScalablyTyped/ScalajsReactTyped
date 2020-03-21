package typingsJapgolly.puppeteer.mod

import typingsJapgolly.puppeteer.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageEntry extends js.Object {
  var ranges: js.Array[AnonEnd]
  var text: String
  var url: String
}

object CoverageEntry {
  @scala.inline
  def apply(ranges: js.Array[AnonEnd], text: String, url: String): CoverageEntry = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CoverageEntry]
  }
}

