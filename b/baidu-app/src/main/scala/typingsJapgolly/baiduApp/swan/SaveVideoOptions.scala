package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveVideoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var filePath: String
  
  // 视频文件路径，可以是临时文件路径也可以是永久文件路径
  @JSName("success")
  def success_MSaveVideoOptions(errMsg: String): Unit
}
object SaveVideoOptions {
  
  inline def apply(filePath: String, success: String => Callback): SaveVideoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: String) => success(t0).runNow()))
    __obj.asInstanceOf[SaveVideoOptions]
  }
  
  extension [Self <: SaveVideoOptions](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
