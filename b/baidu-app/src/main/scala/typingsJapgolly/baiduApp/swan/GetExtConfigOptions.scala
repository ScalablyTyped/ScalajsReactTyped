package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.errMsgstringExtConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtConfigOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetExtConfigOptions(res: errMsgstringExtConfig): Unit
}
object GetExtConfigOptions {
  
  inline def apply(success: errMsgstringExtConfig => Callback): GetExtConfigOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: errMsgstringExtConfig) => success(t0).runNow()))
    __obj.asInstanceOf[GetExtConfigOptions]
  }
  
  extension [Self <: GetExtConfigOptions](x: Self) {
    
    inline def setSuccess(value: errMsgstringExtConfig => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: errMsgstringExtConfig) => value(t0).runNow()))
  }
}
