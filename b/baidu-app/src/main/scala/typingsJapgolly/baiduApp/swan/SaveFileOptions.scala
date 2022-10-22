package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveFileOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'} */
  @JSName("success")
  var success_SaveFileOptions: js.UndefOr[js.Function1[/* res */ SavedFileData, Unit]] = js.undefined
  
  /** 需要保存的文件的临时路径 */
  var tempFilePath: String
}
object SaveFileOptions {
  
  inline def apply(tempFilePath: String): SaveFileOptions = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileOptions]
  }
  
  extension [Self <: SaveFileOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ SavedFileData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ SavedFileData) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
