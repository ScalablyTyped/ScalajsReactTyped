package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quota extends StObject {
  
  // Total space consumed by files in the recycle bin, in bytes. Read-only.
  var deleted: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Total space remaining before reaching the quota limit, in bytes. Read-only.
  var remaining: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Enumeration value that indicates the state of the storage space. Read-only.
  var state: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Information about the drive's storage quota plans. Only in Personal OneDrive.
  var storagePlanInformation: js.UndefOr[NullableOption[StoragePlanInformation]] = js.undefined
  
  // Total allowed storage space, in bytes. Read-only.
  var total: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Total space used, in bytes. Read-only.
  var used: js.UndefOr[NullableOption[Double]] = js.undefined
}
object Quota {
  
  inline def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  
  extension [Self <: Quota](x: Self) {
    
    inline def setDeleted(value: NullableOption[Double]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setRemaining(value: NullableOption[Double]): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setRemainingNull: Self = StObject.set(x, "remaining", null)
    
    inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
    
    inline def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStoragePlanInformation(value: NullableOption[StoragePlanInformation]): Self = StObject.set(x, "storagePlanInformation", value.asInstanceOf[js.Any])
    
    inline def setStoragePlanInformationNull: Self = StObject.set(x, "storagePlanInformation", null)
    
    inline def setStoragePlanInformationUndefined: Self = StObject.set(x, "storagePlanInformation", js.undefined)
    
    inline def setTotal(value: NullableOption[Double]): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalNull: Self = StObject.set(x, "total", null)
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setUsed(value: NullableOption[Double]): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedNull: Self = StObject.set(x, "used", null)
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
