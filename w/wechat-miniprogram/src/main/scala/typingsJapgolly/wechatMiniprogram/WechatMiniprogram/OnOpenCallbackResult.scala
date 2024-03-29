package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnOpenCallbackResult extends StObject {
  
  /** 连接成功的 HTTP 响应 Header
    *
    * 最低基础库： `2.0.0` */
  var header: IAnyObject
  
  /** 网络请求过程中一些调试信息
    *
    * 最低基础库： `2.10.4` */
  var profile: SocketProfile
}
object OnOpenCallbackResult {
  
  inline def apply(header: IAnyObject, profile: SocketProfile): OnOpenCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOpenCallbackResult]
  }
  
  extension [Self <: OnOpenCallbackResult](x: Self) {
    
    inline def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: SocketProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
