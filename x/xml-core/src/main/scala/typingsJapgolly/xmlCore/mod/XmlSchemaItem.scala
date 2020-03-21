package typingsJapgolly.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlSchemaItem[T] extends XmlSchemaItemBase {
  /**
    * Custom converter for item value
    *
    * @type {IConverter<T>}
    * @memberOf XmlAttributeType
    */
  var converter: js.UndefOr[IConverter[T]] = js.undefined
  /**
    * Default value for item
    *
    * @type {(T |)}
    * @memberOf XmlSchemaItem
    */
  var defaultValue: js.UndefOr[T | Null] = js.undefined
  /**
    * Determine where item is required
    *
    * @type {boolean}
    * @memberOf XmlSchemaItem
    */
  var required: js.UndefOr[Boolean] = js.undefined
}

object XmlSchemaItem {
  @scala.inline
  def apply[T](
    converter: IConverter[T] = null,
    defaultValue: T = null,
    localName: String = null,
    namespaceURI: String = null,
    prefix: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): XmlSchemaItem[T] = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlSchemaItem[T]]
  }
}

