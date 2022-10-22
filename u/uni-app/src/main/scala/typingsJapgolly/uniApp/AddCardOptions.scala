package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCardOptions extends StObject {
  
  /**
    * 需要添加的卡券列表
    */
  var cardList: js.UndefOr[js.Array[AddCardData]] = js.undefined
  
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
  var success: js.UndefOr[js.Function1[/* result */ AddCardRes, Unit]] = js.undefined
}
object AddCardOptions {
  
  inline def apply(): AddCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCardOptions]
  }
  
  extension [Self <: AddCardOptions](x: Self) {
    
    inline def setCardList(value: js.Array[AddCardData]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListUndefined: Self = StObject.set(x, "cardList", js.undefined)
    
    inline def setCardListVarargs(value: AddCardData*): Self = StObject.set(x, "cardList", js.Array(value*))
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ AddCardRes => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ AddCardRes) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
