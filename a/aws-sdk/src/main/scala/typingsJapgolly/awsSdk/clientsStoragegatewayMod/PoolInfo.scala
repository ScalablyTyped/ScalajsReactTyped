package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom tape pool. Use the ListTapePools operation to return a list of custom tape pools for your account and Amazon Web Services Region.
    */
  var PoolARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.PoolARN] = js.undefined
  
  /**
    * The name of the custom tape pool. PoolName can use all ASCII characters, except '/' and '\'.
    */
  var PoolName: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.PoolName] = js.undefined
  
  /**
    * Status of the custom tape pool. Pool can be ACTIVE or DELETED.
    */
  var PoolStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.PoolStatus] = js.undefined
  
  /**
    * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days).
    */
  var RetentionLockTimeInDays: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.RetentionLockTimeInDays] = js.undefined
  
  /**
    * Tape retention lock type, which can be configured in two modes. When configured in governance mode, Amazon Web Services accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root Amazon Web Services account.
    */
  var RetentionLockType: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.RetentionLockType] = js.undefined
  
  /**
    * The storage class that is associated with the custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
    */
  var StorageClass: js.UndefOr[TapeStorageClass] = js.undefined
}
object PoolInfo {
  
  inline def apply(): PoolInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolInfo]
  }
  
  extension [Self <: PoolInfo](x: Self) {
    
    inline def setPoolARN(value: PoolARN): Self = StObject.set(x, "PoolARN", value.asInstanceOf[js.Any])
    
    inline def setPoolARNUndefined: Self = StObject.set(x, "PoolARN", js.undefined)
    
    inline def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    inline def setPoolNameUndefined: Self = StObject.set(x, "PoolName", js.undefined)
    
    inline def setPoolStatus(value: PoolStatus): Self = StObject.set(x, "PoolStatus", value.asInstanceOf[js.Any])
    
    inline def setPoolStatusUndefined: Self = StObject.set(x, "PoolStatus", js.undefined)
    
    inline def setRetentionLockTimeInDays(value: RetentionLockTimeInDays): Self = StObject.set(x, "RetentionLockTimeInDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionLockTimeInDaysUndefined: Self = StObject.set(x, "RetentionLockTimeInDays", js.undefined)
    
    inline def setRetentionLockType(value: RetentionLockType): Self = StObject.set(x, "RetentionLockType", value.asInstanceOf[js.Any])
    
    inline def setRetentionLockTypeUndefined: Self = StObject.set(x, "RetentionLockType", js.undefined)
    
    inline def setStorageClass(value: TapeStorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
