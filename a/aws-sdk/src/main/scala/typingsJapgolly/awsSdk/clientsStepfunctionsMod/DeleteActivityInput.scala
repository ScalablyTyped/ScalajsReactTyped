package typingsJapgolly.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteActivityInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the activity to delete.
    */
  var activityArn: Arn
}
object DeleteActivityInput {
  
  inline def apply(activityArn: Arn): DeleteActivityInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActivityInput]
  }
  
  extension [Self <: DeleteActivityInput](x: Self) {
    
    inline def setActivityArn(value: Arn): Self = StObject.set(x, "activityArn", value.asInstanceOf[js.Any])
  }
}
