package typingsJapgolly.agGrid.xmlFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlAttributes extends js.Object {
  var prefixedAttributes: js.UndefOr[js.Array[PrefixedXmlAttributes]] = js.undefined
  var rawMap: js.UndefOr[js.Any] = js.undefined
}

object XmlAttributes {
  @scala.inline
  def apply(prefixedAttributes: js.Array[PrefixedXmlAttributes] = null, rawMap: js.Any = null): XmlAttributes = {
    val __obj = js.Dynamic.literal()
    if (prefixedAttributes != null) __obj.updateDynamic("prefixedAttributes")(prefixedAttributes.asInstanceOf[js.Any])
    if (rawMap != null) __obj.updateDynamic("rawMap")(rawMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlAttributes]
  }
}

