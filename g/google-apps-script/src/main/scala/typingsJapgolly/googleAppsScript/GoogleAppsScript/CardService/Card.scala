package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A context card that represents a single view in the
  * UI.
  *
  *     var cardSection = CardService.newCardSection();
  *     // Finish building the card section ...
  *
  *     var card = CardService.newCardBuilder()
  *         .setName("Card name")
  *         .setHeader(CardService.newCardHeader().setTitle("Card title"))
  *         .addSection(cardSection)
  *         .build();
  */
trait Card extends StObject {
  
  def printJson(): String
}
object Card {
  
  inline def apply(printJson: CallbackTo[String]): Card = {
    val __obj = js.Dynamic.literal(printJson = printJson.toJsFn)
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
  }
}
