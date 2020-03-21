package typingsJapgolly.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration extends js.Object {
  /**
    * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    js.Array[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor]
  ] = js.native
}

object FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    processors: js.Array[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor] = null
  ): FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration]
  }
}

