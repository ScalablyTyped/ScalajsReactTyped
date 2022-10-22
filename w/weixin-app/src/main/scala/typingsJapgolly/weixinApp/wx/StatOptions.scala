package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var path: String
  
  // 文件/目录路径
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  // 是否递归,默认false
  @JSName("success")
  var success_StatOptions: js.UndefOr[js.Function1[/* res */ Stats, Unit]] = js.undefined
}
object StatOptions {
  
  inline def apply(path: String): StatOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptions]
  }
  
  extension [Self <: StatOptions](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setSuccess(value: /* res */ Stats => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ Stats) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
