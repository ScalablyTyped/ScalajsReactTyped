package typingsJapgolly.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlSchemaItemParser extends js.Object {
  /**
    * Xml parser for item
    *
    * @type {*}
    * @memberOf XmlSchemaItemParser
    */
  var parser: js.UndefOr[IXmlSerializableConstructor] = js.undefined
}

object XmlSchemaItemParser {
  @scala.inline
  def apply(parser: IXmlSerializableConstructor = null): XmlSchemaItemParser = {
    val __obj = js.Dynamic.literal()
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlSchemaItemParser]
  }
}

