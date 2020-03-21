package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationAggregatorRequest extends js.Object {
  /**
    * A list of AccountAggregationSource object. 
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.native
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typingsJapgolly.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * An OrganizationAggregationSource object.
    */
  var OrganizationAggregationSource: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.OrganizationAggregationSource] = js.native
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.native
}

object PutConfigurationAggregatorRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    AccountAggregationSources: AccountAggregationSourceList = null,
    OrganizationAggregationSource: OrganizationAggregationSource = null,
    Tags: TagsList = null
  ): PutConfigurationAggregatorRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    if (AccountAggregationSources != null) __obj.updateDynamic("AccountAggregationSources")(AccountAggregationSources.asInstanceOf[js.Any])
    if (OrganizationAggregationSource != null) __obj.updateDynamic("OrganizationAggregationSource")(OrganizationAggregationSource.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationAggregatorRequest]
  }
}

