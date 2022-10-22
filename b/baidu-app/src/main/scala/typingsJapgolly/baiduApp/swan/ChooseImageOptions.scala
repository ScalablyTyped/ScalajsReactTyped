package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 最多可以选择的图片张数，默认9 */
  var count: js.UndefOr[Double] = js.undefined
  
  /** original 原图，compressed 压缩图，默认二者都有 */
  var sizeType: js.UndefOr[js.Array[ImageSizeType]] = js.undefined
  
  /** album 从相册选图，camera 使用相机，默认二者都有 */
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.undefined
  
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MChooseImageOptions(res: TempFilesData): Unit
}
object ChooseImageOptions {
  
  inline def apply(success: TempFilesData => Callback): ChooseImageOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: TempFilesData) => success(t0).runNow()))
    __obj.asInstanceOf[ChooseImageOptions]
  }
  
  extension [Self <: ChooseImageOptions](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSizeType(value: js.Array[ImageSizeType]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    inline def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    inline def setSizeTypeVarargs(value: ImageSizeType*): Self = StObject.set(x, "sizeType", js.Array(value*))
    
    inline def setSourceType(value: js.Array[ImageSourceType]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setSourceTypeVarargs(value: ImageSourceType*): Self = StObject.set(x, "sourceType", js.Array(value*))
    
    inline def setSuccess(value: TempFilesData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: TempFilesData) => value(t0).runNow()))
  }
}
