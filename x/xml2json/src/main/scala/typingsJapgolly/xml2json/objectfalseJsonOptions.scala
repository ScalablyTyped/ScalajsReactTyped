package typingsJapgolly.xml2json

import typingsJapgolly.xml2json.xml2jsonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  object ? :false} & xml2json.xml2json.JsonOptions */
trait objectfalseJsonOptions extends js.Object {
  /**
    * Changes the default textNode property from $t to _t when option is set to true.
    * Alternatively a string can be specified which will override $t to what ever the string is.
    */
  var alternateTextNode: js.UndefOr[Boolean] = js.undefined
  /**
    * XML child nodes are always treated as arrays.
    * You can specify a selective array of nodes for this to apply to instead of the whole document.
    */
  var arrayNotation: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Makes type coercion.
    * i.e.: numbers and booleans present in attributes and element values are converted from string to its correspondent data types.
    * Coerce can be optionally defined as an object with specific methods of coercion based on attribute name or tag name, with fallback to default coercion.
    */
  var coerce: js.UndefOr[Boolean] = js.undefined
  var `object`: js.UndefOr[`false`] = js.undefined
  /**
    * Returns a Javascript object instead of a JSON string.
    */
  // object?: boolean; // This is now overloaded in the toJson method
  /**
    * Makes the JSON reversible to XML.
    * xml2json tranforms CDATA content to JSON, but it doesn't generate a reversible structure.
    */
  var reversible: js.UndefOr[Boolean] = js.undefined
  /**
    * Sanitizes the following characters present in element values (default true):
    * @example
    * var chars =  {
    * '<': '&lt;',
    * '>': '&gt;',
    * '(': '&#40;',
    * ')': '&#41;',
    * '#': '&#35;',
    * '&': '&amp;',
    * '"': '&quot;',
    * "'": '&apos;'
    * };
    * @example
    */
  var sanitize: js.UndefOr[Boolean] = js.undefined
  /**
    * Removes leading and trailing whitespaces as well as line terminators in element values.
    * Defaults to true.
    */
  var trim: js.UndefOr[Boolean] = js.undefined
}

object objectfalseJsonOptions {
  @scala.inline
  def apply(
    alternateTextNode: js.UndefOr[Boolean] = js.undefined,
    arrayNotation: Boolean | js.Array[String] = null,
    coerce: js.UndefOr[Boolean] = js.undefined,
    `object`: `false` = null,
    reversible: js.UndefOr[Boolean] = js.undefined,
    sanitize: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): objectfalseJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alternateTextNode)) __obj.updateDynamic("alternateTextNode")(alternateTextNode.asInstanceOf[js.Any])
    if (arrayNotation != null) __obj.updateDynamic("arrayNotation")(arrayNotation.asInstanceOf[js.Any])
    if (!js.isUndefined(coerce)) __obj.updateDynamic("coerce")(coerce.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(reversible)) __obj.updateDynamic("reversible")(reversible.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[objectfalseJsonOptions]
  }
}

