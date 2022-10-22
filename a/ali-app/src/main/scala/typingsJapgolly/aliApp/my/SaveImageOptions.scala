package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveImageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_SaveImageOptions: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.undefined
  
  /**
    * 要保存的图片链接
    */
  var url: String
}
object SaveImageOptions {
  
  inline def apply(url: String): SaveImageOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveImageOptions]
  }
  
  extension [Self <: SaveImageOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ ErrMsg => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ ErrMsg) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
