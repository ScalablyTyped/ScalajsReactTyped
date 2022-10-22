package typingsJapgolly.rollup.anon

import typingsJapgolly.rollup.mod.RollupBuild
import typingsJapgolly.rollup.mod.RollupError
import typingsJapgolly.rollup.mod.RollupWatcherEvent
import typingsJapgolly.rollup.rollupStrings.ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with RollupWatcherEvent {
  
  var code: ERROR
  
  var error: RollupError
  
  var result: RollupBuild | Null
}
object Error {
  
  inline def apply(error: RollupError): Error = {
    val __obj = js.Dynamic.literal(code = "ERROR", error = error.asInstanceOf[js.Any], result = null)
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setCode(value: ERROR): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setError(value: RollupError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setResult(value: RollupBuild): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
  }
}
