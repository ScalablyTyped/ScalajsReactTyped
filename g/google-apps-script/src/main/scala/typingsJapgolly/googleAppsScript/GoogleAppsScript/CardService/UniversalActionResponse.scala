package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response object that may be returned from a method that creates universal action.
  *
  *     // A universal action that opens a link.
  *     var openLinkUniversalAction = CardService.newUniversalActionResponseBuilder()
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com"))
  *             .build();
  *
  *     var cardBuilder1 = CardService.newCardBuilder();
  *     var cardBuilder2 = CardService.newCardBuilder();
  *     // Finish building the cards ...
  *
  *     // A universal action that shows two static cards.
  *     var cardsUniversalAction = CardService.newUniversalActionResponseBuilder()
  *         .displayAddOnCards([
  *             cardBuilder1.build();
  *             cardBuilder2.build();
  *         ]).build();
  */
trait UniversalActionResponse extends StObject {
  
  def printJson(): String
}
object UniversalActionResponse {
  
  inline def apply(printJson: CallbackTo[String]): UniversalActionResponse = {
    val __obj = js.Dynamic.literal(printJson = printJson.toJsFn)
    __obj.asInstanceOf[UniversalActionResponse]
  }
  
  extension [Self <: UniversalActionResponse](x: Self) {
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
  }
}
