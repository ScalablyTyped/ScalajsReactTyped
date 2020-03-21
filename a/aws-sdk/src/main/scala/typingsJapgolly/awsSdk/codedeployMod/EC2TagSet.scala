package typingsJapgolly.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2TagSet extends js.Object {
  /**
    * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
    */
  var ec2TagSetList: js.UndefOr[EC2TagSetList] = js.native
}

object EC2TagSet {
  @scala.inline
  def apply(ec2TagSetList: EC2TagSetList = null): EC2TagSet = {
    val __obj = js.Dynamic.literal()
    if (ec2TagSetList != null) __obj.updateDynamic("ec2TagSetList")(ec2TagSetList.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2TagSet]
  }
}

