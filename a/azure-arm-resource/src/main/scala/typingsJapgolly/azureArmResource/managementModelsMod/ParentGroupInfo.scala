package typingsJapgolly.azureArmResource.managementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentGroupInfo extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var parentId: js.UndefOr[String] = js.undefined
}

object ParentGroupInfo {
  @scala.inline
  def apply(displayName: String = null, parentId: String = null): ParentGroupInfo = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentGroupInfo]
  }
}

