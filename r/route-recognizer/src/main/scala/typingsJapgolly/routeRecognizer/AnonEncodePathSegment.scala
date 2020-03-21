package typingsJapgolly.routeRecognizer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodePathSegment extends js.Object {
  def encodePathSegment(str: String): String
  def normalizePath(path: String): String
  def normalizeSegment(segment: String): String
}

object AnonEncodePathSegment {
  @scala.inline
  def apply(
    encodePathSegment: String => CallbackTo[String],
    normalizePath: String => CallbackTo[String],
    normalizeSegment: String => CallbackTo[String]
  ): AnonEncodePathSegment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encodePathSegment")(js.Any.fromFunction1((t0: java.lang.String) => encodePathSegment(t0).runNow()))
    __obj.updateDynamic("normalizePath")(js.Any.fromFunction1((t0: java.lang.String) => normalizePath(t0).runNow()))
    __obj.updateDynamic("normalizeSegment")(js.Any.fromFunction1((t0: java.lang.String) => normalizeSegment(t0).runNow()))
    __obj.asInstanceOf[AnonEncodePathSegment]
  }
}

