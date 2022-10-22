package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaddirFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory ${dirPath}': 目录不存在;
    * - 'fail not a directory ${dirPath}': dirPath 不是目录;
    * - 'fail permission denied, open ${dirPath}': 指定的 filePath 路径没有读权限;
    * - 'fail sdcard not mounted': Android sdcard 挂载失败; */
  var errMsg: String
}
object ReaddirFailCallbackResult {
  
  inline def apply(errMsg: String): ReaddirFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirFailCallbackResult]
  }
  
  extension [Self <: ReaddirFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
