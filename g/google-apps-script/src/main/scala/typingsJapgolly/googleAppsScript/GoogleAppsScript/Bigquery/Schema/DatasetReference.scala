package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetReference extends js.Object {
  var datasetId: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
}

object DatasetReference {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null): DatasetReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetReference]
  }
}

