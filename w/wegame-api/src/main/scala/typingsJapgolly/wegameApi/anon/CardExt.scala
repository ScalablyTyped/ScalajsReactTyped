package typingsJapgolly.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardExt extends StObject {
  
  /**
    * 卡券的扩展参数。需将 CardExt 对象 JSON 序列化为字符串传入
    */
  var cardExt: String
  
  /**
    * 卡券 ID
    */
  var cardId: String
}
object CardExt {
  
  inline def apply(cardExt: String, cardId: String): CardExt = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardExt]
  }
  
  extension [Self <: CardExt](x: Self) {
    
    inline def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
  }
}
