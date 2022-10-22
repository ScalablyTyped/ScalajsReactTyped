package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenCardOptions extends StObject {
  
  /**
    * 需要打开的卡券列表
    */
  var cardList: js.UndefOr[js.Array[OpenCardData]] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object OpenCardOptions {
  
  inline def apply(): OpenCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenCardOptions]
  }
  
  extension [Self <: OpenCardOptions](x: Self) {
    
    inline def setCardList(value: js.Array[OpenCardData]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListUndefined: Self = StObject.set(x, "cardList", js.undefined)
    
    inline def setCardListVarargs(value: OpenCardData*): Self = StObject.set(x, "cardList", js.Array(value*))
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
