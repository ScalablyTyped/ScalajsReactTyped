package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for the UniversalActionResponse objects.
  */
trait UniversalActionResponseBuilder extends js.Object {
  def build(): UniversalActionResponse
  def displayAddOnCards(cardObjects: js.Array[Card]): UniversalActionResponseBuilder
  def setOpenLink(openLink: OpenLink): UniversalActionResponseBuilder
}

object UniversalActionResponseBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[UniversalActionResponse],
    displayAddOnCards: js.Array[Card] => CallbackTo[UniversalActionResponseBuilder],
    setOpenLink: OpenLink => CallbackTo[UniversalActionResponseBuilder]
  ): UniversalActionResponseBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("displayAddOnCards")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Card]) => displayAddOnCards(t0).runNow()))
    __obj.updateDynamic("setOpenLink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OpenLink) => setOpenLink(t0).runNow()))
    __obj.asInstanceOf[UniversalActionResponseBuilder]
  }
}

