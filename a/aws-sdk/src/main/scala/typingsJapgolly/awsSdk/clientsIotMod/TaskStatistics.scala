package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskStatistics extends StObject {
  
  /**
    * The number of checks that did not run because the audit was canceled.
    */
  var canceledChecks: js.UndefOr[CanceledChecksCount] = js.undefined
  
  /**
    * The number of checks that found compliant resources.
    */
  var compliantChecks: js.UndefOr[CompliantChecksCount] = js.undefined
  
  /**
    * The number of checks.
    */
  var failedChecks: js.UndefOr[FailedChecksCount] = js.undefined
  
  /**
    * The number of checks in progress.
    */
  var inProgressChecks: js.UndefOr[InProgressChecksCount] = js.undefined
  
  /**
    * The number of checks that found noncompliant resources.
    */
  var nonCompliantChecks: js.UndefOr[NonCompliantChecksCount] = js.undefined
  
  /**
    * The number of checks in this audit.
    */
  var totalChecks: js.UndefOr[TotalChecksCount] = js.undefined
  
  /**
    * The number of checks waiting for data collection.
    */
  var waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount] = js.undefined
}
object TaskStatistics {
  
  inline def apply(): TaskStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskStatistics]
  }
  
  extension [Self <: TaskStatistics](x: Self) {
    
    inline def setCanceledChecks(value: CanceledChecksCount): Self = StObject.set(x, "canceledChecks", value.asInstanceOf[js.Any])
    
    inline def setCanceledChecksUndefined: Self = StObject.set(x, "canceledChecks", js.undefined)
    
    inline def setCompliantChecks(value: CompliantChecksCount): Self = StObject.set(x, "compliantChecks", value.asInstanceOf[js.Any])
    
    inline def setCompliantChecksUndefined: Self = StObject.set(x, "compliantChecks", js.undefined)
    
    inline def setFailedChecks(value: FailedChecksCount): Self = StObject.set(x, "failedChecks", value.asInstanceOf[js.Any])
    
    inline def setFailedChecksUndefined: Self = StObject.set(x, "failedChecks", js.undefined)
    
    inline def setInProgressChecks(value: InProgressChecksCount): Self = StObject.set(x, "inProgressChecks", value.asInstanceOf[js.Any])
    
    inline def setInProgressChecksUndefined: Self = StObject.set(x, "inProgressChecks", js.undefined)
    
    inline def setNonCompliantChecks(value: NonCompliantChecksCount): Self = StObject.set(x, "nonCompliantChecks", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantChecksUndefined: Self = StObject.set(x, "nonCompliantChecks", js.undefined)
    
    inline def setTotalChecks(value: TotalChecksCount): Self = StObject.set(x, "totalChecks", value.asInstanceOf[js.Any])
    
    inline def setTotalChecksUndefined: Self = StObject.set(x, "totalChecks", js.undefined)
    
    inline def setWaitingForDataCollectionChecks(value: WaitingForDataCollectionChecksCount): Self = StObject.set(x, "waitingForDataCollectionChecks", value.asInstanceOf[js.Any])
    
    inline def setWaitingForDataCollectionChecksUndefined: Self = StObject.set(x, "waitingForDataCollectionChecks", js.undefined)
  }
}
