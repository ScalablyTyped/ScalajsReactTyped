package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.BindingType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Range
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Table
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `binding.toJSON()`. */
trait BindingData extends js.Object {
  /**
    *
    * Represents binding identifier. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[BindingType | Range | Table | Text] = js.undefined
}

object BindingData {
  @scala.inline
  def apply(id: String = null, `type`: BindingType | Range | Table | Text = null): BindingData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
}

