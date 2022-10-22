package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.anon.CardExt
import typingsJapgolly.jweixin.anon.CardList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IaddCard
  extends StObject
     with BaseParams {
  
  var cardList: js.Array[CardExt]
  
  // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: CardList): Unit
}
object IaddCard {
  
  inline def apply(cardList: js.Array[CardExt], success: CardList => Callback): IaddCard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: CardList) => success(t0).runNow()))
    __obj.asInstanceOf[IaddCard]
  }
  
  extension [Self <: IaddCard](x: Self) {
    
    inline def setCardList(value: js.Array[CardExt]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: CardExt*): Self = StObject.set(x, "cardList", js.Array(value*))
    
    inline def setSuccess(value: CardList => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: CardList) => value(t0).runNow()))
  }
}
