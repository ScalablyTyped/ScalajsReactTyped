package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotFilterCriteria extends js.Object {
  /** Values that should be included.  Values not listed here are excluded. */
  var visibleValues: js.UndefOr[js.Array[String]] = js.undefined
}

object PivotFilterCriteria {
  @scala.inline
  def apply(visibleValues: js.Array[String] = null): PivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (visibleValues != null) __obj.updateDynamic("visibleValues")(visibleValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotFilterCriteria]
  }
}

