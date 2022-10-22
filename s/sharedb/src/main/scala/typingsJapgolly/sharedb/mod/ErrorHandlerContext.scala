package typingsJapgolly.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorHandlerContext extends StObject {
  
  var agent: js.UndefOr[typingsJapgolly.sharedb.libAgentMod.^[Any]] = js.undefined
}
object ErrorHandlerContext {
  
  inline def apply(): ErrorHandlerContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlerContext]
  }
  
  extension [Self <: ErrorHandlerContext](x: Self) {
    
    inline def setAgent(value: typingsJapgolly.sharedb.libAgentMod.^[Any]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
  }
}
