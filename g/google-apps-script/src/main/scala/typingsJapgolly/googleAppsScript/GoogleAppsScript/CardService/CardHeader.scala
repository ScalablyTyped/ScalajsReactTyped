package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The header of a Card.
  *
  *     var cardHeader = CardService.newCardHeader()
  *         .setTitle("Card header title")
  *         .setSubtitle("Card header subtitle")
  *         .setImageStyle(CardService.ImageStyle.CIRCLE)
  *         .setImageUrl("https://image.png");
  */
trait CardHeader extends js.Object {
  def setImageAltText(imageAltText: String): CardHeader
  def setImageStyle(imageStyle: ImageStyle): CardHeader
  def setImageUrl(imageUrl: String): CardHeader
  def setSubtitle(subtitle: String): CardHeader
  def setTitle(title: String): CardHeader
}

object CardHeader {
  @scala.inline
  def apply(
    setImageAltText: String => CallbackTo[CardHeader],
    setImageStyle: ImageStyle => CallbackTo[CardHeader],
    setImageUrl: String => CallbackTo[CardHeader],
    setSubtitle: String => CallbackTo[CardHeader],
    setTitle: String => CallbackTo[CardHeader]
  ): CardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setImageAltText")(js.Any.fromFunction1((t0: java.lang.String) => setImageAltText(t0).runNow()))
    __obj.updateDynamic("setImageStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.ImageStyle) => setImageStyle(t0).runNow()))
    __obj.updateDynamic("setImageUrl")(js.Any.fromFunction1((t0: java.lang.String) => setImageUrl(t0).runNow()))
    __obj.updateDynamic("setSubtitle")(js.Any.fromFunction1((t0: java.lang.String) => setSubtitle(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[CardHeader]
  }
}

