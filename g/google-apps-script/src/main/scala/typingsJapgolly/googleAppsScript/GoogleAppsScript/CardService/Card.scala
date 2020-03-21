package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Card extends js.Object {
  def printJson(): String
}

object Card {
  @scala.inline
  def apply(printJson: CallbackTo[String]): Card = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.asInstanceOf[Card]
  }
}

