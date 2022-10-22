package typingsJapgolly.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxiosInterceptorOptions extends StObject {
  
  var runWhen: js.UndefOr[js.Function1[/* config */ AxiosRequestConfig[Any], Boolean]] = js.undefined
  
  var synchronous: js.UndefOr[Boolean] = js.undefined
}
object AxiosInterceptorOptions {
  
  inline def apply(): AxiosInterceptorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxiosInterceptorOptions]
  }
  
  extension [Self <: AxiosInterceptorOptions](x: Self) {
    
    inline def setRunWhen(value: /* config */ AxiosRequestConfig[Any] => Boolean): Self = StObject.set(x, "runWhen", js.Any.fromFunction1(value))
    
    inline def setRunWhenUndefined: Self = StObject.set(x, "runWhen", js.undefined)
    
    inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
  }
}
