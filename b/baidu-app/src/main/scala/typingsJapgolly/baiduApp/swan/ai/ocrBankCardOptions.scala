package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 识别银行卡并返回卡号、发卡行和卡片类型。
  */
trait ocrBankCardOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var image: String
  
  // 图片资源地址
  @JSName("success")
  var success_ocrBankCardOptions: js.UndefOr[js.Function1[/* res */ ocrBankCardResponse, Unit]] = js.undefined
}
object ocrBankCardOptions {
  
  inline def apply(image: String): ocrBankCardOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrBankCardOptions]
  }
  
  extension [Self <: ocrBankCardOptions](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ ocrBankCardResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ ocrBankCardResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
