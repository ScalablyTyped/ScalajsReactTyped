package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetStorageInfoOptions(res: StorageInfo): Unit
}
object GetStorageInfoOptions {
  
  inline def apply(success: StorageInfo => Callback): GetStorageInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: StorageInfo) => success(t0).runNow()))
    __obj.asInstanceOf[GetStorageInfoOptions]
  }
  
  extension [Self <: GetStorageInfoOptions](x: Self) {
    
    inline def setSuccess(value: StorageInfo => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: StorageInfo) => value(t0).runNow()))
  }
}
