package typingsJapgolly.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod

import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ALL
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingBytes
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingRecords
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IteratorAgeMilliseconds
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingBytes
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingRecords
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ReadProvisionedThroughputExceeded
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.WriteProvisionedThroughputExceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEnhancedMetrics extends EnhancedMetrics {
  /**
    * <p>List of shard-level metrics.</p> <p>The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.</p> <ul> <li> <p> <code>IncomingBytes</code> </p> </li> <li> <p> <code>IncomingRecords</code> </p> </li> <li> <p> <code>OutgoingBytes</code> </p> </li> <li> <p> <code>OutgoingRecords</code> </p> </li> <li> <p> <code>WriteProvisionedThroughputExceeded</code> </p> </li> <li> <p> <code>ReadProvisionedThroughputExceeded</code> </p> </li> <li> <p> <code>IteratorAgeMilliseconds</code> </p> </li> <li> <p> <code>ALL</code> </p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.</p>
    */
  @JSName("ShardLevelMetrics")
  var ShardLevelMetrics_UnmarshalledEnhancedMetrics: js.UndefOr[
    js.Array[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ]
  ] = js.undefined
}

object UnmarshalledEnhancedMetrics {
  @scala.inline
  def apply(
    ShardLevelMetrics: js.Array[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ] = null
  ): UnmarshalledEnhancedMetrics = {
    val __obj = js.Dynamic.literal()
    if (ShardLevelMetrics != null) __obj.updateDynamic("ShardLevelMetrics")(ShardLevelMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEnhancedMetrics]
  }
}

