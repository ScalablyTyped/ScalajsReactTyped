package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveFileOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 文件路径 */
  var apFilePath: String
  
  @JSName("success")
  var success_SaveFileOptions: js.UndefOr[js.Function1[/* res */ SavedFileData, Unit]] = js.undefined
}
object SaveFileOptions {
  
  inline def apply(apFilePath: String): SaveFileOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileOptions]
  }
  
  extension [Self <: SaveFileOptions](x: Self) {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ SavedFileData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ SavedFileData) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
