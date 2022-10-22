package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduleResponse extends StObject {
  
  /**
    * The date and time that the schedule was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier (user name) of the user who created the schedule. 
    */
  var CreatedBy: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.CreatedBy] = js.undefined
  
  /**
    * The date or dates and time or times when the jobs are to be run for the schedule. For more information, see Cron expressions in the Glue DataBrew Developer Guide.
    */
  var CronExpression: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.CronExpression] = js.undefined
  
  /**
    * The name or names of one or more jobs to be run by using the schedule.
    */
  var JobNames: js.UndefOr[JobNameList] = js.undefined
  
  /**
    * The identifier (user name) of the user who last modified the schedule.
    */
  var LastModifiedBy: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The date and time that the schedule was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the schedule.
    */
  var Name: ScheduleName
  
  /**
    * The Amazon Resource Name (ARN) of the schedule.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Metadata tags associated with this schedule.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeScheduleResponse {
  
  inline def apply(Name: ScheduleName): DescribeScheduleResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduleResponse]
  }
  
  extension [Self <: DescribeScheduleResponse](x: Self) {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCronExpression(value: CronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    inline def setCronExpressionUndefined: Self = StObject.set(x, "CronExpression", js.undefined)
    
    inline def setJobNames(value: JobNameList): Self = StObject.set(x, "JobNames", value.asInstanceOf[js.Any])
    
    inline def setJobNamesUndefined: Self = StObject.set(x, "JobNames", js.undefined)
    
    inline def setJobNamesVarargs(value: JobName*): Self = StObject.set(x, "JobNames", js.Array(value*))
    
    inline def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
