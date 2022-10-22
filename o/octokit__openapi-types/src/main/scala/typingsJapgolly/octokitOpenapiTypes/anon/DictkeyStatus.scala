package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkeyStatus
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /** @enum {undefined} */
  var status: js.UndefOr[queued_ | in_progress] = js.undefined
}
object DictkeyStatus {
  
  inline def apply(): DictkeyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictkeyStatus]
  }
  
  extension [Self <: DictkeyStatus](x: Self) {
    
    inline def setStatus(value: queued_ | in_progress): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
