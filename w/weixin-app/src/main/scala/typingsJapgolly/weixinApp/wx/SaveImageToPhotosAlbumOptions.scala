package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveImageToPhotosAlbumOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
    */
  var filePath: String
  
  @JSName("success")
  def success_MSaveImageToPhotosAlbumOptions(res: ErrMsg): Unit
}
object SaveImageToPhotosAlbumOptions {
  
  inline def apply(filePath: String, success: ErrMsg => Callback): SaveImageToPhotosAlbumOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: ErrMsg) => success(t0).runNow()))
    __obj.asInstanceOf[SaveImageToPhotosAlbumOptions]
  }
  
  extension [Self <: SaveImageToPhotosAlbumOptions](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: ErrMsg => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ErrMsg) => value(t0).runNow()))
  }
}
