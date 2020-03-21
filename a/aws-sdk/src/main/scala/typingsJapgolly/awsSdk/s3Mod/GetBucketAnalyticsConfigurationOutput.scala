package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAnalyticsConfigurationOutput extends js.Object {
  /**
    * The configuration and any analyses for the analytics filter.
    */
  var AnalyticsConfiguration: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.AnalyticsConfiguration] = js.native
}

object GetBucketAnalyticsConfigurationOutput {
  @scala.inline
  def apply(AnalyticsConfiguration: AnalyticsConfiguration = null): GetBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (AnalyticsConfiguration != null) __obj.updateDynamic("AnalyticsConfiguration")(AnalyticsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
  }
}

