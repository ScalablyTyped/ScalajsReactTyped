package typingsJapgolly.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActivityTaskInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the activity to retrieve tasks from (assigned when you create the task using CreateActivity.)
    */
  var activityArn: Arn
  
  /**
    * You can provide an arbitrary name in order to identify the worker that the task is assigned to. This name is used when it is logged in the execution history.
    */
  var workerName: js.UndefOr[Name] = js.undefined
}
object GetActivityTaskInput {
  
  inline def apply(activityArn: Arn): GetActivityTaskInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActivityTaskInput]
  }
  
  extension [Self <: GetActivityTaskInput](x: Self) {
    
    inline def setActivityArn(value: Arn): Self = StObject.set(x, "activityArn", value.asInstanceOf[js.Any])
    
    inline def setWorkerName(value: Name): Self = StObject.set(x, "workerName", value.asInstanceOf[js.Any])
    
    inline def setWorkerNameUndefined: Self = StObject.set(x, "workerName", js.undefined)
  }
}
