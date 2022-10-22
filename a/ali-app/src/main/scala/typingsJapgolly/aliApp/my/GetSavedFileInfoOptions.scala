package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavedFileInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 文件路径 */
  var apFilePath: String
  
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetSavedFileInfoOptions: js.UndefOr[js.Function1[/* res */ SavedFileInfoData, Unit]] = js.undefined
}
object GetSavedFileInfoOptions {
  
  inline def apply(apFilePath: String): GetSavedFileInfoOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfoOptions]
  }
  
  extension [Self <: GetSavedFileInfoOptions](x: Self) {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ SavedFileInfoData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ SavedFileInfoData) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
