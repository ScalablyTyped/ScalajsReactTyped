package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`-1`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`10001`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`10002`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`10003`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`10004`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerAudioContextOnErrorCallbackResult extends StObject {
  
  /**
    *
    * 可选值：
    * - 10001: 系统错误;
    * - 10002: 网络错误;
    * - 10003: 文件错误;
    * - 10004: 格式错误;
    * - -1: 未知错误; */
  var errCode: `10001` | `10002` | `10003` | `10004` | `-1`
  
  var errMsg: String
}
object InnerAudioContextOnErrorCallbackResult {
  
  inline def apply(errCode: `10001` | `10002` | `10003` | `10004` | `-1`, errMsg: String): InnerAudioContextOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContextOnErrorCallbackResult]
  }
  
  extension [Self <: InnerAudioContextOnErrorCallbackResult](x: Self) {
    
    inline def setErrCode(value: `10001` | `10002` | `10003` | `10004` | `-1`): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
