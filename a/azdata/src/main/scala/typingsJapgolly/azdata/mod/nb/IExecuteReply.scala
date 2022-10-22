package typingsJapgolly.azdata.mod.nb

import typingsJapgolly.azdata.azdataStrings.abort
import typingsJapgolly.azdata.azdataStrings.error
import typingsJapgolly.azdata.azdataStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteReply extends StObject {
  
  var execution_count: js.UndefOr[Double | Null] = js.undefined
  
  var status: ok | error | abort
}
object IExecuteReply {
  
  inline def apply(status: ok | error | abort): IExecuteReply = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReply]
  }
  
  extension [Self <: IExecuteReply](x: Self) {
    
    inline def setExecution_count(value: Double): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
    
    inline def setExecution_countUndefined: Self = StObject.set(x, "execution_count", js.undefined)
    
    inline def setStatus(value: ok | error | abort): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
