package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.A
import typingsJapgolly.qlik.qlikStrings.CSV_C
import typingsJapgolly.qlik.qlikStrings.CSV_T
import typingsJapgolly.qlik.qlikStrings.OOXML
import typingsJapgolly.qlik.qlikStrings.P
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDataOptions extends js.Object {
  var download: Boolean
  var filename: js.UndefOr[String] = js.undefined
  var format: OOXML | CSV_C | CSV_T
  var state: A | P
}

object ExportDataOptions {
  @scala.inline
  def apply(download: Boolean, format: OOXML | CSV_C | CSV_T, state: A | P, filename: String = null): ExportDataOptions = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDataOptions]
  }
}

