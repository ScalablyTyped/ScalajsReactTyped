package typingsJapgolly.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitOptions extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var waitFor: js.UndefOr[typingsJapgolly.rethinkdb.mod.waitFor] = js.undefined
}
object WaitOptions {
  
  inline def apply(): WaitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitOptions]
  }
  
  extension [Self <: WaitOptions](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitFor(value: waitFor): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
  }
}
