package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.DocumentPropertyType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Boolean
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Date
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Float
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `customProperty.toJSON()`. */
trait CustomPropertyData extends js.Object {
  /**
    *
    * Gets the key of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the value type of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    DocumentPropertyType | Number | Boolean | Date | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.String | Float
  ] = js.undefined
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object CustomPropertyData {
  @scala.inline
  def apply(
    key: String = null,
    `type`: DocumentPropertyType | Number | Boolean | Date | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.String | Float = null,
    value: js.Any = null
  ): CustomPropertyData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyData]
  }
}

