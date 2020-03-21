package typingsJapgolly.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataSourceResponse extends js.Object {
  /**
    * The DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.native
}

object GetDataSourceResponse {
  @scala.inline
  def apply(dataSource: DataSource = null): GetDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSourceResponse]
  }
}

