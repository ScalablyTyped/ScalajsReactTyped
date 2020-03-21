package typingsJapgolly.gapiTranslate.gapi.client.language

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiTranslate.AnonFields
import typingsJapgolly.gapiTranslate.GoogleApiTranslateDetectionListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detections extends js.Object {
  /**
  		 * Detect the language of text.
  		 */
  def list(`object`: AnonFields): HttpRequest[GoogleApiTranslateDetectionListResponse]
}

object detections {
  @scala.inline
  def apply(list: AnonFields => CallbackTo[HttpRequest[GoogleApiTranslateDetectionListResponse]]): detections = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiTranslate.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[detections]
  }
}

