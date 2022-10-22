package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typingsJapgolly.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DialogSpec extends StObject {
  
  /**
    * Holds helper specific dialog specs if any. For example:
    * ConfirmationDialogSpec for confirmation helper.
    */
  var `extension`: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
}
object GoogleActionsV2DialogSpec {
  
  inline def apply(): GoogleActionsV2DialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DialogSpec]
  }
  
  extension [Self <: GoogleActionsV2DialogSpec](x: Self) {
    
    inline def setExtension(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
  }
}
