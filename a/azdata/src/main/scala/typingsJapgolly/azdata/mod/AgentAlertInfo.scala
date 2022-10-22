package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentAlertInfo extends StObject {
  
  var alertType: AlertType
  
  var categoryName: String
  
  var countResetDate: String
  
  var databaseName: String
  
  var delayBetweenResponses: Double
  
  var eventDescriptionKeyword: String
  
  var eventSource: String
  
  var hasNotification: Double
  
  var id: Double
  
  var includeEventDescription: NotifyMethods
  
  var isEnabled: Boolean
  
  var jobId: String
  
  var jobName: String
  
  var lastOccurrenceDate: String
  
  var lastResponseDate: String
  
  var messageId: Double
  
  var name: String
  
  var notificationMessage: String
  
  var occurrenceCount: Double
  
  var performanceCondition: String
  
  var severity: Double
  
  var wmiEventNamespace: String
  
  var wmiEventQuery: String
}
object AgentAlertInfo {
  
  inline def apply(
    alertType: AlertType,
    categoryName: String,
    countResetDate: String,
    databaseName: String,
    delayBetweenResponses: Double,
    eventDescriptionKeyword: String,
    eventSource: String,
    hasNotification: Double,
    id: Double,
    includeEventDescription: NotifyMethods,
    isEnabled: Boolean,
    jobId: String,
    jobName: String,
    lastOccurrenceDate: String,
    lastResponseDate: String,
    messageId: Double,
    name: String,
    notificationMessage: String,
    occurrenceCount: Double,
    performanceCondition: String,
    severity: Double,
    wmiEventNamespace: String,
    wmiEventQuery: String
  ): AgentAlertInfo = {
    val __obj = js.Dynamic.literal(alertType = alertType.asInstanceOf[js.Any], categoryName = categoryName.asInstanceOf[js.Any], countResetDate = countResetDate.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], delayBetweenResponses = delayBetweenResponses.asInstanceOf[js.Any], eventDescriptionKeyword = eventDescriptionKeyword.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], hasNotification = hasNotification.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includeEventDescription = includeEventDescription.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], lastOccurrenceDate = lastOccurrenceDate.asInstanceOf[js.Any], lastResponseDate = lastResponseDate.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notificationMessage = notificationMessage.asInstanceOf[js.Any], occurrenceCount = occurrenceCount.asInstanceOf[js.Any], performanceCondition = performanceCondition.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], wmiEventNamespace = wmiEventNamespace.asInstanceOf[js.Any], wmiEventQuery = wmiEventQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentAlertInfo]
  }
  
  extension [Self <: AgentAlertInfo](x: Self) {
    
    inline def setAlertType(value: AlertType): Self = StObject.set(x, "alertType", value.asInstanceOf[js.Any])
    
    inline def setCategoryName(value: String): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
    
    inline def setCountResetDate(value: String): Self = StObject.set(x, "countResetDate", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setDelayBetweenResponses(value: Double): Self = StObject.set(x, "delayBetweenResponses", value.asInstanceOf[js.Any])
    
    inline def setEventDescriptionKeyword(value: String): Self = StObject.set(x, "eventDescriptionKeyword", value.asInstanceOf[js.Any])
    
    inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setHasNotification(value: Double): Self = StObject.set(x, "hasNotification", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIncludeEventDescription(value: NotifyMethods): Self = StObject.set(x, "includeEventDescription", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setLastOccurrenceDate(value: String): Self = StObject.set(x, "lastOccurrenceDate", value.asInstanceOf[js.Any])
    
    inline def setLastResponseDate(value: String): Self = StObject.set(x, "lastResponseDate", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotificationMessage(value: String): Self = StObject.set(x, "notificationMessage", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceCount(value: Double): Self = StObject.set(x, "occurrenceCount", value.asInstanceOf[js.Any])
    
    inline def setPerformanceCondition(value: String): Self = StObject.set(x, "performanceCondition", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: Double): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setWmiEventNamespace(value: String): Self = StObject.set(x, "wmiEventNamespace", value.asInstanceOf[js.Any])
    
    inline def setWmiEventQuery(value: String): Self = StObject.set(x, "wmiEventQuery", value.asInstanceOf[js.Any])
  }
}
