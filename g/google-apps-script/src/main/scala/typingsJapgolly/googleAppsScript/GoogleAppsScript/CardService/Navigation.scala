package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper object that controls card navigation. See the card navigation guide for more details.
  */
trait Navigation extends js.Object {
  def popCard(): Navigation
  def popToNamedCard(cardName: String): Navigation
  def popToRoot(): Navigation
  def printJson(): String
  def pushCard(card: Card): Navigation
  def updateCard(card: Card): Navigation
}

object Navigation {
  @scala.inline
  def apply(
    popCard: CallbackTo[Navigation],
    popToNamedCard: String => CallbackTo[Navigation],
    popToRoot: CallbackTo[Navigation],
    printJson: CallbackTo[String],
    pushCard: Card => CallbackTo[Navigation],
    updateCard: Card => CallbackTo[Navigation]
  ): Navigation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("popCard")(popCard.toJsFn)
    __obj.updateDynamic("popToNamedCard")(js.Any.fromFunction1((t0: java.lang.String) => popToNamedCard(t0).runNow()))
    __obj.updateDynamic("popToRoot")(popToRoot.toJsFn)
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.updateDynamic("pushCard")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Card) => pushCard(t0).runNow()))
    __obj.updateDynamic("updateCard")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Card) => updateCard(t0).runNow()))
    __obj.asInstanceOf[Navigation]
  }
}

