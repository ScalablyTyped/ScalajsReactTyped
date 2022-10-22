package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationsOutput extends StObject {
  
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  /**
    * List of lens notification summaries in a workload.
    */
  var NotificationSummaries: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.NotificationSummaries] = js.undefined
}
object ListNotificationsOutput {
  
  inline def apply(): ListNotificationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationsOutput]
  }
  
  extension [Self <: ListNotificationsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNotificationSummaries(value: NotificationSummaries): Self = StObject.set(x, "NotificationSummaries", value.asInstanceOf[js.Any])
    
    inline def setNotificationSummariesUndefined: Self = StObject.set(x, "NotificationSummaries", js.undefined)
    
    inline def setNotificationSummariesVarargs(value: NotificationSummary*): Self = StObject.set(x, "NotificationSummaries", js.Array(value*))
  }
}
