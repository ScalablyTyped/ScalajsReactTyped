package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for Card objects.
  */
trait CardBuilder extends js.Object {
  def addCardAction(cardAction: CardAction): CardBuilder
  def addSection(section: CardSection): CardBuilder
  def build(): Card
  def setHeader(cardHeader: CardHeader): CardBuilder
  def setName(name: String): CardBuilder
}

object CardBuilder {
  @scala.inline
  def apply(
    addCardAction: CardAction => CallbackTo[CardBuilder],
    addSection: CardSection => CallbackTo[CardBuilder],
    build: CallbackTo[Card],
    setHeader: CardHeader => CallbackTo[CardBuilder],
    setName: String => CallbackTo[CardBuilder]
  ): CardBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCardAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.CardAction) => addCardAction(t0).runNow()))
    __obj.updateDynamic("addSection")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.CardSection) => addSection(t0).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setHeader")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.CardHeader) => setHeader(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.asInstanceOf[CardBuilder]
  }
}

