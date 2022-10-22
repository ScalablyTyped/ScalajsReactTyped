package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.wxJsSdkDt.anon.LocalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocalImgDataConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 图片的 localID
    */
  var localId: String
  
  /**
    * 成功后的回调, localData是图片的base64数据，可以用img标签显示
    */
  @JSName("success")
  def success_MGetLocalImgDataConfig(res: LocalData): Unit
}
object GetLocalImgDataConfig {
  
  inline def apply(localId: String, success: LocalData => Callback): GetLocalImgDataConfig = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: LocalData) => success(t0).runNow()))
    __obj.asInstanceOf[GetLocalImgDataConfig]
  }
  
  extension [Self <: GetLocalImgDataConfig](x: Self) {
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: LocalData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: LocalData) => value(t0).runNow()))
  }
}
