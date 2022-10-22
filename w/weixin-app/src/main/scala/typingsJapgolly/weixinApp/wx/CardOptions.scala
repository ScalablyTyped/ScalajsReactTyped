package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var cardList: js.Array[Card]
  
  @JSName("complete")
  var complete_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("fail")
  var fail_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("success")
  var success_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CardOptions {
  
  inline def apply(cardList: js.Array[Card]): CardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardOptions]
  }
  
  extension [Self <: CardOptions](x: Self) {
    
    inline def setCardList(value: js.Array[Card]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: Card*): Self = StObject.set(x, "cardList", js.Array(value*))
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
