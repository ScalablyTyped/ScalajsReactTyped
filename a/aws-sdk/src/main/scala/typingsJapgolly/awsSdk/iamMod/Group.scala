package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the group. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the group was created.
    */
  var CreateDate: js.Date = js.native
  /**
    *  The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var GroupId: idType = js.native
  /**
    * The friendly name that identifies the group.
    */
  var GroupName: groupNameType = js.native
  /**
    * The path to the group. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
}

object Group {
  @scala.inline
  def apply(Arn: arnType, CreateDate: js.Date, GroupId: idType, GroupName: groupNameType, Path: pathType): Group = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Group]
  }
}

