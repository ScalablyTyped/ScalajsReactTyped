package typingsJapgolly.loopback.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  var cookies: js.UndefOr[js.Array[Any]] = js.undefined
  
  var currentUserLiteral: js.UndefOr[String] = js.undefined
  
  var enableDoublecheck: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Array[Any]] = js.undefined
  
  var model: js.UndefOr[js.Function0[Unit | String]] = js.undefined
  
  var overwriteExistingToken: js.UndefOr[Boolean] = js.undefined
  
  var params: js.UndefOr[js.Array[Any]] = js.undefined
  
  var searchDefaultTokenKeys: js.UndefOr[Boolean] = js.undefined
}
object Cookies {
  
  inline def apply(): Cookies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cookies]
  }
  
  extension [Self <: Cookies](x: Self) {
    
    inline def setCookies(value: js.Array[Any]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setCookiesVarargs(value: Any*): Self = StObject.set(x, "cookies", js.Array(value*))
    
    inline def setCurrentUserLiteral(value: String): Self = StObject.set(x, "currentUserLiteral", value.asInstanceOf[js.Any])
    
    inline def setCurrentUserLiteralUndefined: Self = StObject.set(x, "currentUserLiteral", js.undefined)
    
    inline def setEnableDoublecheck(value: Boolean): Self = StObject.set(x, "enableDoublecheck", value.asInstanceOf[js.Any])
    
    inline def setEnableDoublecheckUndefined: Self = StObject.set(x, "enableDoublecheck", js.undefined)
    
    inline def setHeaders(value: js.Array[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: Any*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setModel(value: CallbackTo[Unit | String]): Self = StObject.set(x, "model", value.toJsFn)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setOverwriteExistingToken(value: Boolean): Self = StObject.set(x, "overwriteExistingToken", value.asInstanceOf[js.Any])
    
    inline def setOverwriteExistingTokenUndefined: Self = StObject.set(x, "overwriteExistingToken", js.undefined)
    
    inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setSearchDefaultTokenKeys(value: Boolean): Self = StObject.set(x, "searchDefaultTokenKeys", value.asInstanceOf[js.Any])
    
    inline def setSearchDefaultTokenKeysUndefined: Self = StObject.set(x, "searchDefaultTokenKeys", js.undefined)
  }
}
