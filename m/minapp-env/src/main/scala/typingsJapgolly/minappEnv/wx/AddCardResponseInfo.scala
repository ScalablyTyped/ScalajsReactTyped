package typingsJapgolly.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 卡券添加结果列表 */
trait AddCardResponseInfo extends StObject {
  
  /** 卡券的扩展参数，结构请参考前文 */
  var cardExt: String
  
  /** 用户领取到卡券的 ID */
  var cardId: String
  
  /** 加密 code，为用户领取到卡券的code加密后的字符串，解密请参照：[code 解码接口](https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1499332673_Unm7V) */
  var code: String
  
  /** 是否成功 */
  var isSuccess: Boolean
}
object AddCardResponseInfo {
  
  inline def apply(cardExt: String, cardId: String, code: String, isSuccess: Boolean): AddCardResponseInfo = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardResponseInfo]
  }
  
  extension [Self <: AddCardResponseInfo](x: Self) {
    
    inline def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
  }
}
