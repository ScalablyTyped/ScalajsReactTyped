package typingsJapgolly.vueRuntimeCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseProps extends StObject {
  
  var onFallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPending: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onResolve: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var timeout: js.UndefOr[String | Double] = js.undefined
}
object SuspenseProps {
  
  inline def apply(): SuspenseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspenseProps]
  }
  
  extension [Self <: SuspenseProps](x: Self) {
    
    inline def setOnFallback(value: Callback): Self = StObject.set(x, "onFallback", value.toJsFn)
    
    inline def setOnFallbackUndefined: Self = StObject.set(x, "onFallback", js.undefined)
    
    inline def setOnPending(value: Callback): Self = StObject.set(x, "onPending", value.toJsFn)
    
    inline def setOnPendingUndefined: Self = StObject.set(x, "onPending", js.undefined)
    
    inline def setOnResolve(value: Callback): Self = StObject.set(x, "onResolve", value.toJsFn)
    
    inline def setOnResolveUndefined: Self = StObject.set(x, "onResolve", js.undefined)
    
    inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
