package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'bad file descriptor': 无效的文件描述符;
    * - 'fail permission denied': 指定的 fd 路径没有写权限;
    * - 'fail sdcard not mounted': android sdcard 挂载失败; */
  var errMsg: String
}
object WriteFailCallbackResult {
  
  inline def apply(errMsg: String): WriteFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFailCallbackResult]
  }
  
  extension [Self <: WriteFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
