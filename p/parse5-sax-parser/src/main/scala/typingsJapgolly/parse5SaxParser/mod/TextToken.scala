package typingsJapgolly.parse5SaxParser.mod

import typingsJapgolly.parse5.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextToken extends js.Object {
  /**
    * Text content source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  /**
    * Text content.
    */
  var text: String
}

object TextToken {
  @scala.inline
  def apply(text: String, sourceCodeLocation: Location = null): TextToken = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextToken]
  }
}

