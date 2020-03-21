package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateResourceIdentifier extends js.Object {
  /**
    * The ID of the AWS resource.
    */
  var ResourceId: typingsJapgolly.awsSdk.configserviceMod.ResourceId = js.native
  /**
    * The name of the AWS resource.
    */
  var ResourceName: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.ResourceName] = js.native
  /**
    * The type of the AWS resource.
    */
  var ResourceType: typingsJapgolly.awsSdk.configserviceMod.ResourceType = js.native
  /**
    * The 12-digit account ID of the source account.
    */
  var SourceAccountId: AccountId = js.native
  /**
    * The source region where data is aggregated.
    */
  var SourceRegion: AwsRegion = js.native
}

object AggregateResourceIdentifier {
  @scala.inline
  def apply(
    ResourceId: ResourceId,
    ResourceType: ResourceType,
    SourceAccountId: AccountId,
    SourceRegion: AwsRegion,
    ResourceName: ResourceName = null
  ): AggregateResourceIdentifier = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SourceAccountId = SourceAccountId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateResourceIdentifier]
  }
}

