package typingsJapgolly.stripe.anon

import typingsJapgolly.stripe.mod.Stripe.TestHelpers.Issuing.CardsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cards extends StObject {
  
  var cards: CardsResource
}
object Cards {
  
  inline def apply(cards: CardsResource): Cards = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cards]
  }
  
  extension [Self <: Cards](x: Self) {
    
    inline def setCards(value: CardsResource): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
  }
}
