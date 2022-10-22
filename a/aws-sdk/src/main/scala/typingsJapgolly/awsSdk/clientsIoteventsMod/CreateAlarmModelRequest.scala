package typingsJapgolly.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAlarmModelRequest extends StObject {
  
  /**
    * Contains the configuration information of alarm state changes.
    */
  var alarmCapabilities: js.UndefOr[AlarmCapabilities] = js.undefined
  
  /**
    * Contains information about one or more alarm actions.
    */
  var alarmEventActions: js.UndefOr[AlarmEventActions] = js.undefined
  
  /**
    * A description that tells you what the alarm model detects.
    */
  var alarmModelDescription: js.UndefOr[AlarmModelDescription] = js.undefined
  
  /**
    * A unique name that helps you identify the alarm model. You can't change this name after you create the alarm model.
    */
  var alarmModelName: AlarmModelName
  
  /**
    * Contains information about one or more notification actions.
    */
  var alarmNotification: js.UndefOr[AlarmNotification] = js.undefined
  
  /**
    * Defines when your alarm is invoked.
    */
  var alarmRule: AlarmRule
  
  /**
    * An input attribute used as a key to create an alarm. AWS IoT Events routes inputs associated with this key to the alarm.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.undefined
  
  /**
    * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more information, see Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var roleArn: AmazonResourceName
  
  /**
    * A non-negative integer that reflects the severity level of the alarm.
    */
  var severity: js.UndefOr[Severity] = js.undefined
  
  /**
    * A list of key-value pairs that contain metadata for the alarm model. The tags help you manage the alarm model. For more information, see Tagging your AWS IoT Events resources in the AWS IoT Events Developer Guide. You can create up to 50 tags for one alarm model.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateAlarmModelRequest {
  
  inline def apply(alarmModelName: AlarmModelName, alarmRule: AlarmRule, roleArn: AmazonResourceName): CreateAlarmModelRequest = {
    val __obj = js.Dynamic.literal(alarmModelName = alarmModelName.asInstanceOf[js.Any], alarmRule = alarmRule.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlarmModelRequest]
  }
  
  extension [Self <: CreateAlarmModelRequest](x: Self) {
    
    inline def setAlarmCapabilities(value: AlarmCapabilities): Self = StObject.set(x, "alarmCapabilities", value.asInstanceOf[js.Any])
    
    inline def setAlarmCapabilitiesUndefined: Self = StObject.set(x, "alarmCapabilities", js.undefined)
    
    inline def setAlarmEventActions(value: AlarmEventActions): Self = StObject.set(x, "alarmEventActions", value.asInstanceOf[js.Any])
    
    inline def setAlarmEventActionsUndefined: Self = StObject.set(x, "alarmEventActions", js.undefined)
    
    inline def setAlarmModelDescription(value: AlarmModelDescription): Self = StObject.set(x, "alarmModelDescription", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelDescriptionUndefined: Self = StObject.set(x, "alarmModelDescription", js.undefined)
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setAlarmNotification(value: AlarmNotification): Self = StObject.set(x, "alarmNotification", value.asInstanceOf[js.Any])
    
    inline def setAlarmNotificationUndefined: Self = StObject.set(x, "alarmNotification", js.undefined)
    
    inline def setAlarmRule(value: AlarmRule): Self = StObject.set(x, "alarmRule", value.asInstanceOf[js.Any])
    
    inline def setKey(value: AttributeJsonPath): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
