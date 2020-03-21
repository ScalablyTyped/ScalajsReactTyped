package typingsJapgolly.parse5SaxParser.mod

import typingsJapgolly.parse5.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoctypeToken extends js.Object {
  /**
    * Document type name.
    */
  var name: String
  /**
    * Document type public identifier.
    */
  var publicId: String
  /**
    * Document type declaration source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  /**
    * Document type system identifier.
    */
  var systemId: String
}

object DoctypeToken {
  @scala.inline
  def apply(name: String, publicId: String, systemId: String, sourceCodeLocation: Location = null): DoctypeToken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoctypeToken]
  }
}

