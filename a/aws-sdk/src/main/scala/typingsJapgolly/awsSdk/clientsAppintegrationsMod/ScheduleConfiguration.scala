package typingsJapgolly.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleConfiguration extends StObject {
  
  /**
    * The start date for objects to import in the first flow run.
    */
  var FirstExecutionFrom: js.UndefOr[NonBlankString] = js.undefined
  
  /**
    * The name of the object to pull from the data source.
    */
  var Object: js.UndefOr[typingsJapgolly.awsSdk.clientsAppintegrationsMod.Object] = js.undefined
  
  /**
    * How often the data should be pulled from data source.
    */
  var ScheduleExpression: js.UndefOr[Schedule] = js.undefined
}
object ScheduleConfiguration {
  
  inline def apply(): ScheduleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleConfiguration]
  }
  
  extension [Self <: ScheduleConfiguration](x: Self) {
    
    inline def setFirstExecutionFrom(value: NonBlankString): Self = StObject.set(x, "FirstExecutionFrom", value.asInstanceOf[js.Any])
    
    inline def setFirstExecutionFromUndefined: Self = StObject.set(x, "FirstExecutionFrom", js.undefined)
    
    inline def setObject(value: Object): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
    
    inline def setScheduleExpression(value: Schedule): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
  }
}
