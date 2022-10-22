package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanLoopConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the human task user interface. You can use standard HTML and Crowd HTML Elements to create a custom worker task template. You use this template to create a human task UI. To learn how to create a custom HTML template, see Create Custom Worker Task Template. To learn how to create a human task UI, which is a worker task template that can be used in a flow definition, see Create and Delete a Worker Task Templates.
    */
  var HumanTaskUiArn: typingsJapgolly.awsSdk.clientsSagemakerMod.HumanTaskUiArn
  
  var PublicWorkforceTaskPrice: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.PublicWorkforceTaskPrice] = js.undefined
  
  /**
    * The length of time that a task remains available for review by human workers.
    */
  var TaskAvailabilityLifetimeInSeconds: js.UndefOr[FlowDefinitionTaskAvailabilityLifetimeInSeconds] = js.undefined
  
  /**
    * The number of distinct workers who will perform the same task on each object. For example, if TaskCount is set to 3 for an image classification labeling job, three workers will classify each input image. Increasing TaskCount can improve label accuracy.
    */
  var TaskCount: FlowDefinitionTaskCount
  
  /**
    * A description for the human worker task.
    */
  var TaskDescription: FlowDefinitionTaskDescription
  
  /**
    * Keywords used to describe the task so that workers can discover the task.
    */
  var TaskKeywords: js.UndefOr[FlowDefinitionTaskKeywords] = js.undefined
  
  /**
    * The amount of time that a worker has to complete a task. The default value is 3,600 seconds (1 hour).
    */
  var TaskTimeLimitInSeconds: js.UndefOr[FlowDefinitionTaskTimeLimitInSeconds] = js.undefined
  
  /**
    * A title for the human worker task.
    */
  var TaskTitle: FlowDefinitionTaskTitle
  
  /**
    * Amazon Resource Name (ARN) of a team of workers. To learn more about the types of workforces and work teams you can create and use with Amazon A2I, see Create and Manage Workforces.
    */
  var WorkteamArn: typingsJapgolly.awsSdk.clientsSagemakerMod.WorkteamArn
}
object HumanLoopConfig {
  
  inline def apply(
    HumanTaskUiArn: HumanTaskUiArn,
    TaskCount: FlowDefinitionTaskCount,
    TaskDescription: FlowDefinitionTaskDescription,
    TaskTitle: FlowDefinitionTaskTitle,
    WorkteamArn: WorkteamArn
  ): HumanLoopConfig = {
    val __obj = js.Dynamic.literal(HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], TaskCount = TaskCount.asInstanceOf[js.Any], TaskDescription = TaskDescription.asInstanceOf[js.Any], TaskTitle = TaskTitle.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopConfig]
  }
  
  extension [Self <: HumanLoopConfig](x: Self) {
    
    inline def setHumanTaskUiArn(value: HumanTaskUiArn): Self = StObject.set(x, "HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    inline def setPublicWorkforceTaskPrice(value: PublicWorkforceTaskPrice): Self = StObject.set(x, "PublicWorkforceTaskPrice", value.asInstanceOf[js.Any])
    
    inline def setPublicWorkforceTaskPriceUndefined: Self = StObject.set(x, "PublicWorkforceTaskPrice", js.undefined)
    
    inline def setTaskAvailabilityLifetimeInSeconds(value: FlowDefinitionTaskAvailabilityLifetimeInSeconds): Self = StObject.set(x, "TaskAvailabilityLifetimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTaskAvailabilityLifetimeInSecondsUndefined: Self = StObject.set(x, "TaskAvailabilityLifetimeInSeconds", js.undefined)
    
    inline def setTaskCount(value: FlowDefinitionTaskCount): Self = StObject.set(x, "TaskCount", value.asInstanceOf[js.Any])
    
    inline def setTaskDescription(value: FlowDefinitionTaskDescription): Self = StObject.set(x, "TaskDescription", value.asInstanceOf[js.Any])
    
    inline def setTaskKeywords(value: FlowDefinitionTaskKeywords): Self = StObject.set(x, "TaskKeywords", value.asInstanceOf[js.Any])
    
    inline def setTaskKeywordsUndefined: Self = StObject.set(x, "TaskKeywords", js.undefined)
    
    inline def setTaskKeywordsVarargs(value: FlowDefinitionTaskKeyword*): Self = StObject.set(x, "TaskKeywords", js.Array(value*))
    
    inline def setTaskTimeLimitInSeconds(value: FlowDefinitionTaskTimeLimitInSeconds): Self = StObject.set(x, "TaskTimeLimitInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTaskTimeLimitInSecondsUndefined: Self = StObject.set(x, "TaskTimeLimitInSeconds", js.undefined)
    
    inline def setTaskTitle(value: FlowDefinitionTaskTitle): Self = StObject.set(x, "TaskTitle", value.asInstanceOf[js.Any])
    
    inline def setWorkteamArn(value: WorkteamArn): Self = StObject.set(x, "WorkteamArn", value.asInstanceOf[js.Any])
  }
}
