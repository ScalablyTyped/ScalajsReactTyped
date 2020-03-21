package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics3 extends js.Object {
  var badRecords: js.UndefOr[String] = js.undefined
  var inputFileBytes: js.UndefOr[String] = js.undefined
  var inputFiles: js.UndefOr[String] = js.undefined
  var outputBytes: js.UndefOr[String] = js.undefined
  var outputRows: js.UndefOr[String] = js.undefined
}

object JobStatistics3 {
  @scala.inline
  def apply(
    badRecords: String = null,
    inputFileBytes: String = null,
    inputFiles: String = null,
    outputBytes: String = null,
    outputRows: String = null
  ): JobStatistics3 = {
    val __obj = js.Dynamic.literal()
    if (badRecords != null) __obj.updateDynamic("badRecords")(badRecords.asInstanceOf[js.Any])
    if (inputFileBytes != null) __obj.updateDynamic("inputFileBytes")(inputFileBytes.asInstanceOf[js.Any])
    if (inputFiles != null) __obj.updateDynamic("inputFiles")(inputFiles.asInstanceOf[js.Any])
    if (outputBytes != null) __obj.updateDynamic("outputBytes")(outputBytes.asInstanceOf[js.Any])
    if (outputRows != null) __obj.updateDynamic("outputRows")(outputRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatistics3]
  }
}

