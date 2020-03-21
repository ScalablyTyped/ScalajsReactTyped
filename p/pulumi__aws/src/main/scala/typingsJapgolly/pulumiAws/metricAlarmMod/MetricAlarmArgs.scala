package typingsJapgolly.pulumiAws.metricAlarmMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.cloudwatch.MetricAlarmMetricQuery
import typingsJapgolly.pulumiAws.topicMod.Topic
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricAlarmArgs extends js.Object {
  /**
    * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
    */
  val actionsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val alarmActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.native
  /**
    * The description for the alarm.
    */
  val alarmDescription: js.UndefOr[Input[String]] = js.native
  /**
    * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
    */
  val comparisonOperator: Input[String] = js.native
  /**
    * The number of datapoints that must be breaching to trigger the alarm.
    */
  val datapointsToAlarm: js.UndefOr[Input[Double]] = js.native
  /**
    * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val dimensions: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Used only for alarms
    * based on percentiles. If you specify `ignore`, the alarm state will not
    * change during periods with too few data points to be statistically significant.
    * If you specify `evaluate` or omit this parameter, the alarm will always be
    * evaluated and possibly change state no matter how many data points are available.
    * The following values are supported: `ignore`, and `evaluate`.
    */
  val evaluateLowSampleCountPercentiles: js.UndefOr[Input[String]] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  val evaluationPeriods: Input[Double] = js.native
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  val extendedStatistic: js.UndefOr[Input[String]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val insufficientDataActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.native
  /**
    * The name for this metric.
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val metricName: js.UndefOr[Input[String]] = js.native
  /**
    * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
    */
  val metricQueries: js.UndefOr[Input[js.Array[Input[MetricAlarmMetricQuery]]]] = js.native
  /**
    * The descriptive name for the alarm. This name must be unique within the user's AWS account
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val namespace: js.UndefOr[Input[String]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val okActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.native
  /**
    * The period in seconds over which the specified `stat` is applied.
    */
  val period: js.UndefOr[Input[Double]] = js.native
  /**
    * The statistic to apply to the alarm's associated metric.
    * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
    */
  val statistic: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
    */
  val threshold: js.UndefOr[Input[Double]] = js.native
  /**
    * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
    */
  val thresholdMetricId: js.UndefOr[Input[String]] = js.native
  /**
    * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
    */
  val treatMissingData: js.UndefOr[Input[String]] = js.native
  /**
    * The unit for this metric.
    */
  val unit: js.UndefOr[Input[String]] = js.native
}

object MetricAlarmArgs {
  @scala.inline
  def apply(
    comparisonOperator: Input[String],
    evaluationPeriods: Input[Double],
    actionsEnabled: Input[Boolean] = null,
    alarmActions: Input[js.Array[Input[String | Topic]]] = null,
    alarmDescription: Input[String] = null,
    datapointsToAlarm: Input[Double] = null,
    dimensions: Input[StringDictionary[_]] = null,
    evaluateLowSampleCountPercentiles: Input[String] = null,
    extendedStatistic: Input[String] = null,
    insufficientDataActions: Input[js.Array[Input[String | Topic]]] = null,
    metricName: Input[String] = null,
    metricQueries: Input[js.Array[Input[MetricAlarmMetricQuery]]] = null,
    name: Input[String] = null,
    namespace: Input[String] = null,
    okActions: Input[js.Array[Input[String | Topic]]] = null,
    period: Input[Double] = null,
    statistic: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    threshold: Input[Double] = null,
    thresholdMetricId: Input[String] = null,
    treatMissingData: Input[String] = null,
    unit: Input[String] = null
  ): MetricAlarmArgs = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], evaluationPeriods = evaluationPeriods.asInstanceOf[js.Any])
    if (actionsEnabled != null) __obj.updateDynamic("actionsEnabled")(actionsEnabled.asInstanceOf[js.Any])
    if (alarmActions != null) __obj.updateDynamic("alarmActions")(alarmActions.asInstanceOf[js.Any])
    if (alarmDescription != null) __obj.updateDynamic("alarmDescription")(alarmDescription.asInstanceOf[js.Any])
    if (datapointsToAlarm != null) __obj.updateDynamic("datapointsToAlarm")(datapointsToAlarm.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (evaluateLowSampleCountPercentiles != null) __obj.updateDynamic("evaluateLowSampleCountPercentiles")(evaluateLowSampleCountPercentiles.asInstanceOf[js.Any])
    if (extendedStatistic != null) __obj.updateDynamic("extendedStatistic")(extendedStatistic.asInstanceOf[js.Any])
    if (insufficientDataActions != null) __obj.updateDynamic("insufficientDataActions")(insufficientDataActions.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (metricQueries != null) __obj.updateDynamic("metricQueries")(metricQueries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (okActions != null) __obj.updateDynamic("okActions")(okActions.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (statistic != null) __obj.updateDynamic("statistic")(statistic.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (thresholdMetricId != null) __obj.updateDynamic("thresholdMetricId")(thresholdMetricId.asInstanceOf[js.Any])
    if (treatMissingData != null) __obj.updateDynamic("treatMissingData")(treatMissingData.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAlarmArgs]
  }
}

