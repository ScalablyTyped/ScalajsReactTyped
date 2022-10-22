package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.anon.ServerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IuploadImage
  extends StObject
     with BaseParams {
  
  // 需要上传的图片的本地ID，由chooseImage接口获得
  var isShowProgressTips: Double
  
  var localId: String
  
  // 默认为1，显示进度提示
  // 返回图片的服务器端ID
  @JSName("success")
  def success_MIuploadImage(res: ServerId): Unit
}
object IuploadImage {
  
  inline def apply(isShowProgressTips: Double, localId: String, success: ServerId => Callback): IuploadImage = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: ServerId) => success(t0).runNow()))
    __obj.asInstanceOf[IuploadImage]
  }
  
  extension [Self <: IuploadImage](x: Self) {
    
    inline def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: ServerId => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ServerId) => value(t0).runNow()))
  }
}
