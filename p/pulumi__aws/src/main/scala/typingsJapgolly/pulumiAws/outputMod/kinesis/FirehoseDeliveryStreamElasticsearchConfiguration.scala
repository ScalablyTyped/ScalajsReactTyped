package typingsJapgolly.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamElasticsearchConfiguration extends js.Object {
  /**
    * Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
    */
  var bufferingInterval: js.UndefOr[Double] = js.native
  /**
    * Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
    */
  var bufferingSize: js.UndefOr[Double] = js.native
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
    */
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions = js.native
  /**
    * The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`.
    */
  var domainArn: String = js.native
  /**
    * The Elasticsearch index name.
    */
  var indexName: String = js.native
  /**
    * The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
    */
  var indexRotationPeriod: js.UndefOr[String] = js.native
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration] = js.native
  /**
    * After an initial failure to deliver to Splunk, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
    */
  var retryDuration: js.UndefOr[Double] = js.native
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: String = js.native
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[String] = js.native
  /**
    * The Elasticsearch type name with maximum length of 100 characters.
    */
  var typeName: js.UndefOr[String] = js.native
}

object FirehoseDeliveryStreamElasticsearchConfiguration {
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions,
    domainArn: String,
    indexName: String,
    roleArn: String,
    bufferingInterval: Int | Double = null,
    bufferingSize: Int | Double = null,
    indexRotationPeriod: String = null,
    processingConfiguration: FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration = null,
    retryDuration: Int | Double = null,
    s3BackupMode: String = null,
    typeName: String = null
  ): FirehoseDeliveryStreamElasticsearchConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], domainArn = domainArn.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (bufferingInterval != null) __obj.updateDynamic("bufferingInterval")(bufferingInterval.asInstanceOf[js.Any])
    if (bufferingSize != null) __obj.updateDynamic("bufferingSize")(bufferingSize.asInstanceOf[js.Any])
    if (indexRotationPeriod != null) __obj.updateDynamic("indexRotationPeriod")(indexRotationPeriod.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfiguration]
  }
}

