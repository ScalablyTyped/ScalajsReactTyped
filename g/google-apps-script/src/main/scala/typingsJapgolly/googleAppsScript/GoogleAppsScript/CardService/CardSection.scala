package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A card section holds groups of widgets and provides visual separation between them.
  *
  *     var image = CardService.newImage();
  *     // Build image ...
  *     var textParagraph = CardService.newTextParagraph();
  *     // Build text paragraph ...
  *
  *     var cardSection = CardService.newCardSection()
  *         .setHeader("Section header")
  *         .addWidget(image)
  *         .addWidget(textParagraph);
  */
trait CardSection extends js.Object {
  def addWidget(widget: Widget): CardSection
  def setCollapsible(collapsible: Boolean): CardSection
  def setHeader(header: String): CardSection
  def setNumUncollapsibleWidgets(numUncollapsibleWidgets: Integer): CardSection
}

object CardSection {
  @scala.inline
  def apply(
    addWidget: Widget => CallbackTo[CardSection],
    setCollapsible: Boolean => CallbackTo[CardSection],
    setHeader: String => CallbackTo[CardSection],
    setNumUncollapsibleWidgets: Integer => CallbackTo[CardSection]
  ): CardSection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addWidget")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Widget) => addWidget(t0).runNow()))
    __obj.updateDynamic("setCollapsible")(js.Any.fromFunction1((t0: scala.Boolean) => setCollapsible(t0).runNow()))
    __obj.updateDynamic("setHeader")(js.Any.fromFunction1((t0: java.lang.String) => setHeader(t0).runNow()))
    __obj.updateDynamic("setNumUncollapsibleWidgets")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setNumUncollapsibleWidgets(t0).runNow()))
    __obj.asInstanceOf[CardSection]
  }
}

