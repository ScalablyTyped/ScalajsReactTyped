package typingsJapgolly.wxJsSdkBrowser.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.wxJsSdkBrowser.anon.CardList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCardConfig extends StObject {
  
  var cardList: js.Array[Card]
  
  var success: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.undefined
}
object AddCardConfig {
  
  inline def apply(cardList: js.Array[Card]): AddCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardConfig]
  }
  
  extension [Self <: AddCardConfig](x: Self) {
    
    inline def setCardList(value: js.Array[Card]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: Card*): Self = StObject.set(x, "cardList", js.Array(value*))
    
    inline def setSuccess(value: /* res */ CardList => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ CardList) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
