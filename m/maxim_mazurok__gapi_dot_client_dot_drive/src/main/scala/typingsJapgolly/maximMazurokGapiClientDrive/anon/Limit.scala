package typingsJapgolly.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  /** The usage limit, if applicable. This will not be present if the user has unlimited storage. */
  var limit: js.UndefOr[String] = js.undefined
  
  /** The total usage across all services. */
  var usage: js.UndefOr[String] = js.undefined
  
  /** The usage by all files in Google Drive. */
  var usageInDrive: js.UndefOr[String] = js.undefined
  
  /** The usage by trashed files in Google Drive. */
  var usageInDriveTrash: js.UndefOr[String] = js.undefined
}
object Limit {
  
  inline def apply(): Limit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limit]
  }
  
  extension [Self <: Limit](x: Self) {
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageInDrive(value: String): Self = StObject.set(x, "usageInDrive", value.asInstanceOf[js.Any])
    
    inline def setUsageInDriveTrash(value: String): Self = StObject.set(x, "usageInDriveTrash", value.asInstanceOf[js.Any])
    
    inline def setUsageInDriveTrashUndefined: Self = StObject.set(x, "usageInDriveTrash", js.undefined)
    
    inline def setUsageInDriveUndefined: Self = StObject.set(x, "usageInDrive", js.undefined)
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
