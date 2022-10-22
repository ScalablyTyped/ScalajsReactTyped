package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.anon.ApFilePaths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 最大可选照片数，默认1张 */
  var count: Double
  
  /** 相册选取或者拍照，默认 [‘camera’,‘album’] */
  var sourceType: js.Array[ImageSourceType]
  
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MChooseImageOptions(res: ApFilePaths): Unit
}
object ChooseImageOptions {
  
  inline def apply(count: Double, sourceType: js.Array[ImageSourceType], success: ApFilePaths => Callback): ChooseImageOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: ApFilePaths) => success(t0).runNow()))
    __obj.asInstanceOf[ChooseImageOptions]
  }
  
  extension [Self <: ChooseImageOptions](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: js.Array[ImageSourceType]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeVarargs(value: ImageSourceType*): Self = StObject.set(x, "sourceType", js.Array(value*))
    
    inline def setSuccess(value: ApFilePaths => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ApFilePaths) => value(t0).runNow()))
  }
}
