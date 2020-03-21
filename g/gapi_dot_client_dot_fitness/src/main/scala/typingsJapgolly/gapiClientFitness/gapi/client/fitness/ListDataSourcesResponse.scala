package typingsJapgolly.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataSourcesResponse extends js.Object {
  /** A previously created data source. */
  var dataSource: js.UndefOr[js.Array[DataSource]] = js.undefined
}

object ListDataSourcesResponse {
  @scala.inline
  def apply(dataSource: js.Array[DataSource] = null): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
}

