package typingsJapgolly.sentryNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushTimeout extends StObject {
  
  var flushTimeout: js.UndefOr[Double] = js.undefined
}
object FlushTimeout {
  
  inline def apply(): FlushTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlushTimeout]
  }
  
  extension [Self <: FlushTimeout](x: Self) {
    
    inline def setFlushTimeout(value: Double): Self = StObject.set(x, "flushTimeout", value.asInstanceOf[js.Any])
    
    inline def setFlushTimeoutUndefined: Self = StObject.set(x, "flushTimeout", js.undefined)
  }
}
