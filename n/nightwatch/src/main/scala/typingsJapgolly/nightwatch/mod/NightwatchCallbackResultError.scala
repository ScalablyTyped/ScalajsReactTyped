package typingsJapgolly.nightwatch.mod

import typingsJapgolly.nightwatch.anon.Class
import typingsJapgolly.nightwatch.nightwatchInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchCallbackResultError
  extends StObject
     with NightwatchCallbackResult[Any] {
  
  var state: js.Error | String
  
  var status: `1`
  
  // we cannot use `number` so giving it a "symbolic" value allows to disjoint the union
  var value: Class
}
object NightwatchCallbackResultError {
  
  inline def apply(state: js.Error | String, value: Class): NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = 1, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchCallbackResultError]
  }
  
  extension [Self <: NightwatchCallbackResultError](x: Self) {
    
    inline def setState(value: js.Error | String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Class): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
