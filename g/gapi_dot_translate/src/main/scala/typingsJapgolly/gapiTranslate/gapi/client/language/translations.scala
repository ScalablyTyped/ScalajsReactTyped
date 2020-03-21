package typingsJapgolly.gapiTranslate.gapi.client.language

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiTranslate.AnonCid
import typingsJapgolly.gapiTranslate.GoogleApiTranslateTranslationListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait translations extends js.Object {
  /**
  		 * Returns text translations from one language to another.
  		 */
  def list(`object`: AnonCid): HttpRequest[GoogleApiTranslateTranslationListResponse]
}

object translations {
  @scala.inline
  def apply(list: AnonCid => CallbackTo[HttpRequest[GoogleApiTranslateTranslationListResponse]]): translations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiTranslate.AnonCid) => list(t0).runNow()))
    __obj.asInstanceOf[translations]
  }
}

