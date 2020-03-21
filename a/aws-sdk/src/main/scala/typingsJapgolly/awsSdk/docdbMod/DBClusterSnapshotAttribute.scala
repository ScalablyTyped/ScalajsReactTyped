package typingsJapgolly.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshotAttribute extends js.Object {
  /**
    * The name of the manual cluster snapshot attribute. The attribute named restore refers to the list of AWS accounts that have permission to copy or restore the manual cluster snapshot.
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * The values for the manual cluster snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the AWS accounts that are authorized to copy or restore the manual cluster snapshot. If a value of all is in the list, then the manual cluster snapshot is public and available for any AWS account to copy or restore.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
}

object DBClusterSnapshotAttribute {
  @scala.inline
  def apply(AttributeName: String = null, AttributeValues: AttributeValueList = null): DBClusterSnapshotAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (AttributeValues != null) __obj.updateDynamic("AttributeValues")(AttributeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterSnapshotAttribute]
  }
}

