package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRepositoryTaskStatus extends StObject {
  
  /**
    * A running total of the number of files that the task failed to process.
    */
  var FailedCount: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.FailedCount] = js.undefined
  
  /**
    * The time at which the task status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The total amount of data, in GiB, released by an Amazon File Cache AUTO_RELEASE_DATA task that automatically releases files from the cache.
    */
  var ReleasedCapacity: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.ReleasedCapacity] = js.undefined
  
  /**
    * A running total of the number of files that the task has successfully processed.
    */
  var SucceededCount: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.SucceededCount] = js.undefined
  
  /**
    * The total number of files that the task will process. While a task is executing, the sum of SucceededCount plus FailedCount may not equal TotalCount. When the task is complete, TotalCount equals the sum of SucceededCount plus FailedCount.
    */
  var TotalCount: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.TotalCount] = js.undefined
}
object DataRepositoryTaskStatus {
  
  inline def apply(): DataRepositoryTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryTaskStatus]
  }
  
  extension [Self <: DataRepositoryTaskStatus](x: Self) {
    
    inline def setFailedCount(value: FailedCount): Self = StObject.set(x, "FailedCount", value.asInstanceOf[js.Any])
    
    inline def setFailedCountUndefined: Self = StObject.set(x, "FailedCount", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setReleasedCapacity(value: ReleasedCapacity): Self = StObject.set(x, "ReleasedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReleasedCapacityUndefined: Self = StObject.set(x, "ReleasedCapacity", js.undefined)
    
    inline def setSucceededCount(value: SucceededCount): Self = StObject.set(x, "SucceededCount", value.asInstanceOf[js.Any])
    
    inline def setSucceededCountUndefined: Self = StObject.set(x, "SucceededCount", js.undefined)
    
    inline def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
