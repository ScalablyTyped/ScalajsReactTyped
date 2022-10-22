package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerCloseSessionInfo extends StObject {
  
  var sessionId: js.UndefOr[String] = js.undefined
}
object ObjectExplorerCloseSessionInfo {
  
  inline def apply(): ObjectExplorerCloseSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectExplorerCloseSessionInfo]
  }
  
  extension [Self <: ObjectExplorerCloseSessionInfo](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
