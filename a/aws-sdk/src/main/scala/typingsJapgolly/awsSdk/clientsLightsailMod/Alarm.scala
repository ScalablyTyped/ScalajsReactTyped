package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alarm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The arithmetic operation used when comparing the specified statistic and threshold.
    */
  var comparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
  
  /**
    * The contact protocols for the alarm, such as Email, SMS (text messaging), or both.
    */
  var contactProtocols: js.UndefOr[ContactProtocolsList] = js.undefined
  
  /**
    * The timestamp when the alarm was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of data points that must not within the specified threshold to trigger the alarm.
    */
  var datapointsToAlarm: js.UndefOr[integer] = js.undefined
  
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  var evaluationPeriods: js.UndefOr[integer] = js.undefined
  
  /**
    * An object that lists information about the location of the alarm.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the metric associated with the alarm.
    */
  var metricName: js.UndefOr[MetricName] = js.undefined
  
  /**
    * An object that lists information about the resource monitored by the alarm.
    */
  var monitoredResourceInfo: js.UndefOr[MonitoredResourceInfo] = js.undefined
  
  /**
    * The name of the alarm.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Indicates whether the alarm is enabled.
    */
  var notificationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The alarm states that trigger a notification.
    */
  var notificationTriggers: js.UndefOr[NotificationTriggerList] = js.undefined
  
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var period: js.UndefOr[MetricPeriod] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., Alarm).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The current state of the alarm. An alarm has the following possible states:    ALARM - The metric is outside of the defined threshold.    INSUFFICIENT_DATA - The alarm has just started, the metric is not available, or not enough data is available for the metric to determine the alarm state.    OK - The metric is within the defined threshold.  
    */
  var state: js.UndefOr[AlarmState] = js.undefined
  
  /**
    * The statistic for the metric associated with the alarm. The following statistics are available:    Minimum - The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum - The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum - All values submitted for the matching metric added together. You can use this statistic to determine the total volume of a metric.    Average - The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount - The count, or number, of data points used for the statistical calculation.  
    */
  var statistic: js.UndefOr[MetricStatistic] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail alarm. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The value against which the specified statistic is compared.
    */
  var threshold: js.UndefOr[double] = js.undefined
  
  /**
    * Specifies how the alarm handles missing data points. An alarm can treat missing data in the following ways:    breaching - Assume the missing data is not within the threshold. Missing data counts towards the number of times the metric is not within the threshold.    notBreaching - Assume the missing data is within the threshold. Missing data does not count towards the number of times the metric is not within the threshold.    ignore - Ignore the missing data. Maintains the current alarm state.    missing - Missing data is treated as missing.  
    */
  var treatMissingData: js.UndefOr[TreatMissingData] = js.undefined
  
  /**
    * The unit of the metric associated with the alarm.
    */
  var unit: js.UndefOr[MetricUnit] = js.undefined
}
object Alarm {
  
  inline def apply(): Alarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alarm]
  }
  
  extension [Self <: Alarm](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "comparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "comparisonOperator", js.undefined)
    
    inline def setContactProtocols(value: ContactProtocolsList): Self = StObject.set(x, "contactProtocols", value.asInstanceOf[js.Any])
    
    inline def setContactProtocolsUndefined: Self = StObject.set(x, "contactProtocols", js.undefined)
    
    inline def setContactProtocolsVarargs(value: ContactProtocol*): Self = StObject.set(x, "contactProtocols", js.Array(value*))
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDatapointsToAlarm(value: integer): Self = StObject.set(x, "datapointsToAlarm", value.asInstanceOf[js.Any])
    
    inline def setDatapointsToAlarmUndefined: Self = StObject.set(x, "datapointsToAlarm", js.undefined)
    
    inline def setEvaluationPeriods(value: integer): Self = StObject.set(x, "evaluationPeriods", value.asInstanceOf[js.Any])
    
    inline def setEvaluationPeriodsUndefined: Self = StObject.set(x, "evaluationPeriods", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setMonitoredResourceInfo(value: MonitoredResourceInfo): Self = StObject.set(x, "monitoredResourceInfo", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceInfoUndefined: Self = StObject.set(x, "monitoredResourceInfo", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationEnabled(value: Boolean): Self = StObject.set(x, "notificationEnabled", value.asInstanceOf[js.Any])
    
    inline def setNotificationEnabledUndefined: Self = StObject.set(x, "notificationEnabled", js.undefined)
    
    inline def setNotificationTriggers(value: NotificationTriggerList): Self = StObject.set(x, "notificationTriggers", value.asInstanceOf[js.Any])
    
    inline def setNotificationTriggersUndefined: Self = StObject.set(x, "notificationTriggers", js.undefined)
    
    inline def setNotificationTriggersVarargs(value: AlarmState*): Self = StObject.set(x, "notificationTriggers", js.Array(value*))
    
    inline def setPeriod(value: MetricPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setState(value: AlarmState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatistic(value: MetricStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setThreshold(value: double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTreatMissingData(value: TreatMissingData): Self = StObject.set(x, "treatMissingData", value.asInstanceOf[js.Any])
    
    inline def setTreatMissingDataUndefined: Self = StObject.set(x, "treatMissingData", js.undefined)
    
    inline def setUnit(value: MetricUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
