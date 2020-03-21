package typingsJapgolly.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatObjectOptions extends js.Object {
  /** Pass the decimal places in cell
    */
  var decimalPlaces: js.UndefOr[String] = js.undefined
  /** Pass the format str in cell
    */
  var formatStr: js.UndefOr[String] = js.undefined
  /** Pass the style object in a cell
    */
  var style: js.UndefOr[js.Any] = js.undefined
  /** Pass the thousand separator in cell
    */
  var thousandSeparator: js.UndefOr[String] = js.undefined
  /** Pass the type of cell
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object FormatObjectOptions {
  @scala.inline
  def apply(
    decimalPlaces: String = null,
    formatStr: String = null,
    style: js.Any = null,
    thousandSeparator: String = null,
    `type`: String = null
  ): FormatObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (formatStr != null) __obj.updateDynamic("formatStr")(formatStr.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thousandSeparator != null) __obj.updateDynamic("thousandSeparator")(thousandSeparator.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatObjectOptions]
  }
}

