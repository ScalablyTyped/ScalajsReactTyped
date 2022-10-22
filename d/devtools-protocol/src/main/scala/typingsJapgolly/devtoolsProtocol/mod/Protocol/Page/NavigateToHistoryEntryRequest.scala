package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateToHistoryEntryRequest extends StObject {
  
  /**
    * Unique id of the entry to navigate to.
    */
  var entryId: integer
}
object NavigateToHistoryEntryRequest {
  
  inline def apply(entryId: integer): NavigateToHistoryEntryRequest = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToHistoryEntryRequest]
  }
  
  extension [Self <: NavigateToHistoryEntryRequest](x: Self) {
    
    inline def setEntryId(value: integer): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
  }
}
