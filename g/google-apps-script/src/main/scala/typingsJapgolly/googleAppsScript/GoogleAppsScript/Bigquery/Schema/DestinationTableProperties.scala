package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationTableProperties extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var friendlyName: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[js.Object] = js.undefined
}

object DestinationTableProperties {
  @scala.inline
  def apply(description: String = null, friendlyName: String = null, labels: js.Object = null): DestinationTableProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationTableProperties]
  }
}

