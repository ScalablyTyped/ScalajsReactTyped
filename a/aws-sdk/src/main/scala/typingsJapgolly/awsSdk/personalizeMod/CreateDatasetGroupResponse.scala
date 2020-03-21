package typingsJapgolly.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetGroupResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
}

object CreateDatasetGroupResponse {
  @scala.inline
  def apply(datasetGroupArn: Arn = null): CreateDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetGroupResponse]
  }
}

