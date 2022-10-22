package typingsJapgolly.chrome.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstalledDetails extends StObject {
  
  /**
    * Optional.
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
    * @since Chrome 29.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The reason that this event is being dispatched.
    */
  var reason: OnInstalledReason
}
object InstalledDetails {
  
  inline def apply(reason: OnInstalledReason): InstalledDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledDetails]
  }
  
  extension [Self <: InstalledDetails](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPreviousVersion(value: String): Self = StObject.set(x, "previousVersion", value.asInstanceOf[js.Any])
    
    inline def setPreviousVersionUndefined: Self = StObject.set(x, "previousVersion", js.undefined)
    
    inline def setReason(value: OnInstalledReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
