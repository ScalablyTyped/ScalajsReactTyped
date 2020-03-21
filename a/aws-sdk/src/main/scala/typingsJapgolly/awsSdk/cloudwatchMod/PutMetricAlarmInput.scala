package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutMetricAlarmInput extends js.Object {
  /**
    * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
    */
  var ActionsEnabled: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.ActionsEnabled] = js.native
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:automate:region:ec2:stop | arn:aws:automate:region:ec2:terminate | arn:aws:automate:region:ec2:recover | arn:aws:automate:region:ec2:reboot | arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:autoscaling:region:account-id:scalingPolicy:policy-idautoScalingGroupName/group-friendly-name:policyName/policy-friendly-name   Valid Values (for use with IAM roles): arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Stop/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Terminate/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Reboot/1.0 
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.native
  /**
    * The description for the alarm.
    */
  var AlarmDescription: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.AlarmDescription] = js.native
  /**
    * The name for the alarm. This name must be unique within your AWS account.
    */
  var AlarmName: typingsJapgolly.awsSdk.cloudwatchMod.AlarmName = js.native
  /**
    *  The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic value is used as the first operand. The values LessThanLowerOrGreaterThanUpperThreshold, LessThanLowerThreshold, and GreaterThanUpperThreshold are used only for alarms based on anomaly detection models.
    */
  var ComparisonOperator: typingsJapgolly.awsSdk.cloudwatchMod.ComparisonOperator = js.native
  /**
    * The number of data points that must be breaching to trigger the alarm. This is used only if you are setting an "M out of N" alarm. In that case, this value is the M. For more information, see Evaluating an Alarm in the Amazon CloudWatch User Guide.
    */
  var DatapointsToAlarm: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.DatapointsToAlarm] = js.native
  /**
    * The dimensions for the metric specified in MetricName.
    */
  var Dimensions: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    *  Used only for alarms based on percentiles. If you specify ignore, the alarm state does not change during periods with too few data points to be statistically significant. If you specify evaluate or omit this parameter, the alarm is always evaluated and possibly changes state no matter how many data points are available. For more information, see Percentile-Based CloudWatch Alarms and Low Data Samples. Valid Values: evaluate | ignore 
    */
  var EvaluateLowSampleCountPercentile: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.EvaluateLowSampleCountPercentile] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold. If you are setting an alarm that requires that a number of consecutive data points be breaching to trigger the alarm, this value specifies that number. If you are setting an "M out of N" alarm, this value is the N. An alarm's total current evaluation period can be no longer than one day, so this number multiplied by Period cannot be more than 86,400 seconds.
    */
  var EvaluationPeriods: typingsJapgolly.awsSdk.cloudwatchMod.EvaluationPeriods = js.native
  /**
    * The percentile statistic for the metric specified in MetricName. Specify a value between p0.0 and p100. When you call PutMetricAlarm and specify a MetricName, you must specify either Statistic or ExtendedStatistic, but not both.
    */
  var ExtendedStatistic: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.ExtendedStatistic] = js.native
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:automate:region:ec2:stop | arn:aws:automate:region:ec2:terminate | arn:aws:automate:region:ec2:recover | arn:aws:automate:region:ec2:reboot | arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:autoscaling:region:account-id:scalingPolicy:policy-idautoScalingGroupName/group-friendly-name:policyName/policy-friendly-name   Valid Values (for use with IAM roles): &gt;arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Stop/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Terminate/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Reboot/1.0 
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.native
  /**
    * The name for the metric associated with the alarm. For each PutMetricAlarm operation, you must specify either MetricName or a Metrics array. If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the Dimensions, Period, Namespace, Statistic, or ExtendedStatistic parameters. Instead, you specify all this information in the Metrics array.
    */
  var MetricName: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.MetricName] = js.native
  /**
    * An array of MetricDataQuery structures that enable you to create an alarm based on the result of a metric math expression. For each PutMetricAlarm operation, you must specify either MetricName or a Metrics array. Each item in the Metrics array either retrieves a metric or performs a math expression. One item in the Metrics array is the expression that the alarm watches. You designate this expression by setting ReturnValue to true for this object in the array. For more information, see MetricDataQuery. If you use the Metrics parameter, you cannot include the MetricName, Dimensions, Period, Namespace, Statistic, or ExtendedStatistic parameters of PutMetricAlarm in the same operation. Instead, you retrieve the metrics you are using in your math expression as part of the Metrics array.
    */
  var Metrics: js.UndefOr[MetricDataQueries] = js.native
  /**
    * The namespace for the metric associated specified in MetricName.
    */
  var Namespace: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.Namespace] = js.native
  /**
    * The actions to execute when this alarm transitions to an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:automate:region:ec2:stop | arn:aws:automate:region:ec2:terminate | arn:aws:automate:region:ec2:recover | arn:aws:automate:region:ec2:reboot | arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:autoscaling:region:account-id:scalingPolicy:policy-idautoScalingGroupName/group-friendly-name:policyName/policy-friendly-name   Valid Values (for use with IAM roles): arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Stop/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Terminate/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Reboot/1.0 
    */
  var OKActions: js.UndefOr[ResourceList] = js.native
  /**
    * The length, in seconds, used each time the metric specified in MetricName is evaluated. Valid values are 10, 30, and any multiple of 60.  Period is required for alarms based on static thresholds. If you are creating an alarm based on a metric math expression, you specify the period for each metric within the objects in the Metrics array. Be sure to specify 10 or 30 only for metrics that are stored by a PutMetricData call with a StorageResolution of 1. If you specify a period of 10 or 30 for a metric that does not have sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In this case, it does not receive data for the attempts that do not correspond to a one-minute data resolution, and the alarm may often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets this alarm as a high-resolution alarm, which has a higher charge than other alarms. For more information about pricing, see Amazon CloudWatch Pricing. An alarm's total current evaluation period can be no longer than one day, so Period multiplied by EvaluationPeriods cannot be more than 86,400 seconds.
    */
  var Period: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.Period] = js.native
  /**
    * The statistic for the metric specified in MetricName, other than percentile. For percentile statistics, use ExtendedStatistic. When you call PutMetricAlarm and specify a MetricName, you must specify either Statistic or ExtendedStatistic, but not both.
    */
  var Statistic: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.Statistic] = js.native
  /**
    * A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an alarm. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
    */
  var Threshold: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.Threshold] = js.native
  /**
    * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function. For an example of how to use this parameter, see the Anomaly Detection Model Alarm example on this page. If your alarm uses this parameter, it cannot have Auto Scaling actions.
    */
  var ThresholdMetricId: js.UndefOr[MetricId] = js.native
  /**
    *  Sets how this alarm is to handle missing data points. If TreatMissingData is omitted, the default behavior of missing is used. For more information, see Configuring How CloudWatch Alarms Treats Missing Data. Valid Values: breaching | notBreaching | ignore | missing 
    */
  var TreatMissingData: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.TreatMissingData] = js.native
  /**
    * The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of bytes that an instance receives on all network interfaces. You can also specify a unit when you create a custom metric. Units help provide conceptual meaning to your data. Metric data points that specify a unit of measure, such as Percent, are aggregated separately. If you don't specify Unit, CloudWatch retrieves all unit types that have been published for the metric and attempts to evaluate the alarm. Usually metrics are published with only one unit, so the alarm will work as intended. However, if the metric is published with multiple types of units and you don't specify a unit, the alarm's behavior is not defined and will behave un-predictably. We recommend omitting Unit so that you don't inadvertently specify an incorrect unit that is not published for this metric. Doing so causes the alarm to be stuck in the INSUFFICIENT DATA state.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object PutMetricAlarmInput {
  @scala.inline
  def apply(
    AlarmName: AlarmName,
    ComparisonOperator: ComparisonOperator,
    EvaluationPeriods: EvaluationPeriods,
    ActionsEnabled: js.UndefOr[Boolean] = js.undefined,
    AlarmActions: ResourceList = null,
    AlarmDescription: AlarmDescription = null,
    DatapointsToAlarm: Int | Double = null,
    Dimensions: Dimensions = null,
    EvaluateLowSampleCountPercentile: EvaluateLowSampleCountPercentile = null,
    ExtendedStatistic: ExtendedStatistic = null,
    InsufficientDataActions: ResourceList = null,
    MetricName: MetricName = null,
    Metrics: MetricDataQueries = null,
    Namespace: Namespace = null,
    OKActions: ResourceList = null,
    Period: Int | Double = null,
    Statistic: Statistic = null,
    Tags: TagList = null,
    Threshold: Int | Double = null,
    ThresholdMetricId: MetricId = null,
    TreatMissingData: TreatMissingData = null,
    Unit: StandardUnit = null
  ): PutMetricAlarmInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName.asInstanceOf[js.Any], ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], EvaluationPeriods = EvaluationPeriods.asInstanceOf[js.Any])
    if (!js.isUndefined(ActionsEnabled)) __obj.updateDynamic("ActionsEnabled")(ActionsEnabled.asInstanceOf[js.Any])
    if (AlarmActions != null) __obj.updateDynamic("AlarmActions")(AlarmActions.asInstanceOf[js.Any])
    if (AlarmDescription != null) __obj.updateDynamic("AlarmDescription")(AlarmDescription.asInstanceOf[js.Any])
    if (DatapointsToAlarm != null) __obj.updateDynamic("DatapointsToAlarm")(DatapointsToAlarm.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (EvaluateLowSampleCountPercentile != null) __obj.updateDynamic("EvaluateLowSampleCountPercentile")(EvaluateLowSampleCountPercentile.asInstanceOf[js.Any])
    if (ExtendedStatistic != null) __obj.updateDynamic("ExtendedStatistic")(ExtendedStatistic.asInstanceOf[js.Any])
    if (InsufficientDataActions != null) __obj.updateDynamic("InsufficientDataActions")(InsufficientDataActions.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace.asInstanceOf[js.Any])
    if (OKActions != null) __obj.updateDynamic("OKActions")(OKActions.asInstanceOf[js.Any])
    if (Period != null) __obj.updateDynamic("Period")(Period.asInstanceOf[js.Any])
    if (Statistic != null) __obj.updateDynamic("Statistic")(Statistic.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Threshold != null) __obj.updateDynamic("Threshold")(Threshold.asInstanceOf[js.Any])
    if (ThresholdMetricId != null) __obj.updateDynamic("ThresholdMetricId")(ThresholdMetricId.asInstanceOf[js.Any])
    if (TreatMissingData != null) __obj.updateDynamic("TreatMissingData")(TreatMissingData.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetricAlarmInput]
  }
}

