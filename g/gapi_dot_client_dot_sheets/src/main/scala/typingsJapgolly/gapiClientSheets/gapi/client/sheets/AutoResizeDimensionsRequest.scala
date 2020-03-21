package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoResizeDimensionsRequest extends js.Object {
  /** The dimensions to automatically resize. */
  var dimensions: js.UndefOr[DimensionRange] = js.undefined
}

object AutoResizeDimensionsRequest {
  @scala.inline
  def apply(dimensions: DimensionRange = null): AutoResizeDimensionsRequest = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoResizeDimensionsRequest]
  }
}

