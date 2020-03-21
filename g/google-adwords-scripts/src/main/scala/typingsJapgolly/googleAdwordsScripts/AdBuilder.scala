package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBuilder[T]
  extends AdWordsBuilder[T]
     with hasFinalUrlBuilder[T]
     with hasTrackingTemplateBuilder[T]

object AdBuilder {
  @scala.inline
  def apply[T](
    build: CallbackTo[AdWordsOperation[T]],
    withCustomParameters: js.Object => CallbackTo[T],
    withFinalUrl: String => CallbackTo[T],
    withMobileFinalUrl: String => CallbackTo[T],
    withTrackingTemplate: String => CallbackTo[T]
  ): AdBuilder[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withCustomParameters")(js.Any.fromFunction1((t0: js.Object) => withCustomParameters(t0).runNow()))
    __obj.updateDynamic("withFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withFinalUrl(t0).runNow()))
    __obj.updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withMobileFinalUrl(t0).runNow()))
    __obj.updateDynamic("withTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => withTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[AdBuilder[T]]
  }
}

