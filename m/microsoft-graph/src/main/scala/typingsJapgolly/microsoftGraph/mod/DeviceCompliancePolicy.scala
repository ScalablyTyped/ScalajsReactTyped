package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCompliancePolicy
  extends StObject
     with Entity {
  
  // The collection of assignments for this compliance policy.
  var assignments: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicyAssignment]]] = js.undefined
  
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Compliance Setting State Device Summary
  var deviceSettingStateSummaries: js.UndefOr[NullableOption[js.Array[SettingStateDeviceSummary]]] = js.undefined
  
  // Device compliance devices status overview
  var deviceStatusOverview: js.UndefOr[NullableOption[DeviceComplianceDeviceOverview]] = js.undefined
  
  // List of DeviceComplianceDeviceStatus.
  var deviceStatuses: js.UndefOr[NullableOption[js.Array[DeviceComplianceDeviceStatus]]] = js.undefined
  
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.undefined
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The list of scheduled action per rule for this compliance policy. This is a required property when creating any
    * individual per-platform compliance policies.
    */
  var scheduledActionsForRule: js.UndefOr[NullableOption[js.Array[DeviceComplianceScheduledActionForRule]]] = js.undefined
  
  // Device compliance users status overview
  var userStatusOverview: js.UndefOr[NullableOption[DeviceComplianceUserOverview]] = js.undefined
  
  // List of DeviceComplianceUserStatus.
  var userStatuses: js.UndefOr[NullableOption[js.Array[DeviceComplianceUserStatus]]] = js.undefined
  
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.undefined
}
object DeviceCompliancePolicy {
  
  inline def apply(): DeviceCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicy]
  }
  
  extension [Self <: DeviceCompliancePolicy](x: Self) {
    
    inline def setAssignments(value: NullableOption[js.Array[DeviceCompliancePolicyAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: DeviceCompliancePolicyAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeviceSettingStateSummaries(value: NullableOption[js.Array[SettingStateDeviceSummary]]): Self = StObject.set(x, "deviceSettingStateSummaries", value.asInstanceOf[js.Any])
    
    inline def setDeviceSettingStateSummariesNull: Self = StObject.set(x, "deviceSettingStateSummaries", null)
    
    inline def setDeviceSettingStateSummariesUndefined: Self = StObject.set(x, "deviceSettingStateSummaries", js.undefined)
    
    inline def setDeviceSettingStateSummariesVarargs(value: SettingStateDeviceSummary*): Self = StObject.set(x, "deviceSettingStateSummaries", js.Array(value*))
    
    inline def setDeviceStatusOverview(value: NullableOption[DeviceComplianceDeviceOverview]): Self = StObject.set(x, "deviceStatusOverview", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusOverviewNull: Self = StObject.set(x, "deviceStatusOverview", null)
    
    inline def setDeviceStatusOverviewUndefined: Self = StObject.set(x, "deviceStatusOverview", js.undefined)
    
    inline def setDeviceStatuses(value: NullableOption[js.Array[DeviceComplianceDeviceStatus]]): Self = StObject.set(x, "deviceStatuses", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusesNull: Self = StObject.set(x, "deviceStatuses", null)
    
    inline def setDeviceStatusesUndefined: Self = StObject.set(x, "deviceStatuses", js.undefined)
    
    inline def setDeviceStatusesVarargs(value: DeviceComplianceDeviceStatus*): Self = StObject.set(x, "deviceStatuses", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setScheduledActionsForRule(value: NullableOption[js.Array[DeviceComplianceScheduledActionForRule]]): Self = StObject.set(x, "scheduledActionsForRule", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionsForRuleNull: Self = StObject.set(x, "scheduledActionsForRule", null)
    
    inline def setScheduledActionsForRuleUndefined: Self = StObject.set(x, "scheduledActionsForRule", js.undefined)
    
    inline def setScheduledActionsForRuleVarargs(value: DeviceComplianceScheduledActionForRule*): Self = StObject.set(x, "scheduledActionsForRule", js.Array(value*))
    
    inline def setUserStatusOverview(value: NullableOption[DeviceComplianceUserOverview]): Self = StObject.set(x, "userStatusOverview", value.asInstanceOf[js.Any])
    
    inline def setUserStatusOverviewNull: Self = StObject.set(x, "userStatusOverview", null)
    
    inline def setUserStatusOverviewUndefined: Self = StObject.set(x, "userStatusOverview", js.undefined)
    
    inline def setUserStatuses(value: NullableOption[js.Array[DeviceComplianceUserStatus]]): Self = StObject.set(x, "userStatuses", value.asInstanceOf[js.Any])
    
    inline def setUserStatusesNull: Self = StObject.set(x, "userStatuses", null)
    
    inline def setUserStatusesUndefined: Self = StObject.set(x, "userStatuses", js.undefined)
    
    inline def setUserStatusesVarargs(value: DeviceComplianceUserStatus*): Self = StObject.set(x, "userStatuses", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
