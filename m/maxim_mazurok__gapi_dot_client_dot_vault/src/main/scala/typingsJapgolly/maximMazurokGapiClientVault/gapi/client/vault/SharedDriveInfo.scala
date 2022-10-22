package typingsJapgolly.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedDriveInfo extends StObject {
  
  /** A list of shared drive IDs, as provided by the [Drive API](https://developers.google.com/drive). */
  var sharedDriveIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SharedDriveInfo {
  
  inline def apply(): SharedDriveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDriveInfo]
  }
  
  extension [Self <: SharedDriveInfo](x: Self) {
    
    inline def setSharedDriveIds(value: js.Array[String]): Self = StObject.set(x, "sharedDriveIds", value.asInstanceOf[js.Any])
    
    inline def setSharedDriveIdsUndefined: Self = StObject.set(x, "sharedDriveIds", js.undefined)
    
    inline def setSharedDriveIdsVarargs(value: String*): Self = StObject.set(x, "sharedDriveIds", js.Array(value*))
  }
}
