package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScheduleRequest extends StObject {
  
  /**
    * The date or dates and time or times when the jobs are to be run. For more information, see Cron expressions in the Glue DataBrew Developer Guide.
    */
  var CronExpression: typingsJapgolly.awsSdk.clientsDatabrewMod.CronExpression
  
  /**
    * The name or names of one or more jobs to be run.
    */
  var JobNames: js.UndefOr[JobNameList] = js.undefined
  
  /**
    * A unique name for the schedule. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and space.
    */
  var Name: ScheduleName
  
  /**
    * Metadata tags to apply to this schedule.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateScheduleRequest {
  
  inline def apply(CronExpression: CronExpression, Name: ScheduleName): CreateScheduleRequest = {
    val __obj = js.Dynamic.literal(CronExpression = CronExpression.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduleRequest]
  }
  
  extension [Self <: CreateScheduleRequest](x: Self) {
    
    inline def setCronExpression(value: CronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    inline def setJobNames(value: JobNameList): Self = StObject.set(x, "JobNames", value.asInstanceOf[js.Any])
    
    inline def setJobNamesUndefined: Self = StObject.set(x, "JobNames", js.undefined)
    
    inline def setJobNamesVarargs(value: JobName*): Self = StObject.set(x, "JobNames", js.Array(value*))
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
