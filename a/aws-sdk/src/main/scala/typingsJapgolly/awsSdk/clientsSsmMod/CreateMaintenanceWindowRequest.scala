package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMaintenanceWindowRequest extends StObject {
  
  /**
    * Enables a maintenance window task to run on managed nodes, even if you haven't registered those nodes as targets. If enabled, then you must specify the unregistered managed nodes (by node ID) when you register a task with the maintenance window. If you don't enable this option, then you must specify previously-registered targets when you register a task with the maintenance window.
    */
  var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets
  
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.ClientToken] = js.undefined
  
  /**
    * The number of hours before the end of the maintenance window that Amazon Web Services Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: MaintenanceWindowCutoff
  
  /**
    * An optional description for the maintenance window. We recommend specifying a description to help you organize your maintenance windows. 
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: MaintenanceWindowDurationHours
  
  /**
    * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  
  /**
    * The name of the maintenance window.
    */
  var Name: MaintenanceWindowName
  
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: MaintenanceWindowSchedule
  
  /**
    * The number of days to wait after the date and time specified by a cron expression before running the maintenance window. For example, the following cron expression schedules a maintenance window to run on the third Tuesday of every month at 11:30 PM.  cron(30 23 ? * TUE#3 *)  If the schedule offset is 2, the maintenance window won't run until two days later.
    */
  var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.undefined
  
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
  
  /**
    * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become active. StartDate allows you to delay activation of the maintenance window until the specified future date.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a maintenance window to identify the type of tasks it will run, the types of targets, and the environment it will run in. In this case, you could specify the following key-value pairs:    Key=TaskType,Value=AgentUpdate     Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing maintenance window, use the AddTagsToResource operation. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateMaintenanceWindowRequest {
  
  inline def apply(
    AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets,
    Cutoff: MaintenanceWindowCutoff,
    Duration: MaintenanceWindowDurationHours,
    Name: MaintenanceWindowName,
    Schedule: MaintenanceWindowSchedule
  ): CreateMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(AllowUnassociatedTargets = AllowUnassociatedTargets.asInstanceOf[js.Any], Cutoff = Cutoff.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMaintenanceWindowRequest]
  }
  
  extension [Self <: CreateMaintenanceWindowRequest](x: Self) {
    
    inline def setAllowUnassociatedTargets(value: MaintenanceWindowAllowUnassociatedTargets): Self = StObject.set(x, "AllowUnassociatedTargets", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCutoff(value: MaintenanceWindowCutoff): Self = StObject.set(x, "Cutoff", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDuration(value: MaintenanceWindowDurationHours): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: MaintenanceWindowStringDateTime): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: MaintenanceWindowSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleOffset(value: MaintenanceWindowOffset): Self = StObject.set(x, "ScheduleOffset", value.asInstanceOf[js.Any])
    
    inline def setScheduleOffsetUndefined: Self = StObject.set(x, "ScheduleOffset", js.undefined)
    
    inline def setScheduleTimezone(value: MaintenanceWindowTimezone): Self = StObject.set(x, "ScheduleTimezone", value.asInstanceOf[js.Any])
    
    inline def setScheduleTimezoneUndefined: Self = StObject.set(x, "ScheduleTimezone", js.undefined)
    
    inline def setStartDate(value: MaintenanceWindowStringDateTime): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
