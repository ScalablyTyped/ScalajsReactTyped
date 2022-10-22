package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 本地缓存中的指定的 key */
  var key: String
  
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  @JSName("success")
  def success_MGetStorageOptions(res: DataResponse): Unit
}
object GetStorageOptions {
  
  inline def apply(key: String, success: DataResponse => Callback): GetStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: DataResponse) => success(t0).runNow()))
    __obj.asInstanceOf[GetStorageOptions]
  }
  
  extension [Self <: GetStorageOptions](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: DataResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: DataResponse) => value(t0).runNow()))
  }
}
