package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedFormat extends js.Object {
  var columnDelimiter: js.UndefOr[String] = js.undefined
  var fileEncoding: js.UndefOr[String] = js.undefined
  var quotingMode: js.UndefOr[String] = js.undefined
}

object DatafeedFormat {
  @scala.inline
  def apply(columnDelimiter: String = null, fileEncoding: String = null, quotingMode: String = null): DatafeedFormat = {
    val __obj = js.Dynamic.literal()
    if (columnDelimiter != null) __obj.updateDynamic("columnDelimiter")(columnDelimiter.asInstanceOf[js.Any])
    if (fileEncoding != null) __obj.updateDynamic("fileEncoding")(fileEncoding.asInstanceOf[js.Any])
    if (quotingMode != null) __obj.updateDynamic("quotingMode")(quotingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedFormat]
  }
}

