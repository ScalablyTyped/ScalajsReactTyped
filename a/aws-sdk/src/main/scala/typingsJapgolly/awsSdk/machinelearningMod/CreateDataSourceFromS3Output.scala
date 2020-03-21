package typingsJapgolly.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceFromS3Output extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the DataSource. This value should be identical to the value of the DataSourceID in the request. 
    */
  var DataSourceId: js.UndefOr[EntityId] = js.native
}

object CreateDataSourceFromS3Output {
  @scala.inline
  def apply(DataSourceId: EntityId = null): CreateDataSourceFromS3Output = {
    val __obj = js.Dynamic.literal()
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceFromS3Output]
  }
}

