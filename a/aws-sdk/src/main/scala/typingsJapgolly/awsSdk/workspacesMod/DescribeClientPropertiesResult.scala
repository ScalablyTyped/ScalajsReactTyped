package typingsJapgolly.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClientPropertiesResult extends js.Object {
  /**
    * Information about the specified Amazon WorkSpaces clients.
    */
  var ClientPropertiesList: js.UndefOr[typingsJapgolly.awsSdk.workspacesMod.ClientPropertiesList] = js.native
}

object DescribeClientPropertiesResult {
  @scala.inline
  def apply(ClientPropertiesList: ClientPropertiesList = null): DescribeClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    if (ClientPropertiesList != null) __obj.updateDynamic("ClientPropertiesList")(ClientPropertiesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientPropertiesResult]
  }
}

