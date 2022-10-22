package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppStrings.md5
import typingsJapgolly.aliApp.aliAppStrings.sha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 文件路径 */
  var apFilePath: String
  
  /** 摘要算法，支持md5和sha1，默认为md5 */
  var digestAlgorithm: js.UndefOr[md5 | sha1] = js.undefined
  
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, Unit]] = js.undefined
}
object GetFileInfoOptions {
  
  inline def apply(apFilePath: String): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoOptions]
  }
  
  extension [Self <: GetFileInfoOptions](x: Self) {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithm(value: md5 | sha1): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    inline def setSuccess(value: /* options */ GetFileInfoSuccess => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* options */ GetFileInfoSuccess) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
