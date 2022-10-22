package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 计算文件摘要的算法，默认值 md5，有效值：md5，sha1 */
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  
  /** 本地文件路径 */
  var filePath: String
  
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, Unit]] = js.undefined
}
object GetFileInfoOptions {
  
  inline def apply(filePath: String): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoOptions]
  }
  
  extension [Self <: GetFileInfoOptions](x: Self) {
    
    inline def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* options */ GetFileInfoSuccess => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* options */ GetFileInfoSuccess) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
