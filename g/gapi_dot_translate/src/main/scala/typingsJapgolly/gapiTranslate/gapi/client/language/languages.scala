package typingsJapgolly.gapiTranslate.gapi.client.language

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiTranslate.AnonTarget
import typingsJapgolly.gapiTranslate.GoogleApiTranslateLanguageListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait languages extends js.Object {
  /**
  		 * List the source/target languages supported by the API
  		 */
  def list(`object`: AnonTarget): HttpRequest[GoogleApiTranslateLanguageListResponse]
}

object languages {
  @scala.inline
  def apply(list: AnonTarget => CallbackTo[HttpRequest[GoogleApiTranslateLanguageListResponse]]): languages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiTranslate.AnonTarget) => list(t0).runNow()))
    __obj.asInstanceOf[languages]
  }
}

