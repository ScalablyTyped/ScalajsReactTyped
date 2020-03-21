package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageAdBuilder[ImageAd]
  extends AdWordsBuilder[ImageAdBuilder[ImageAd]]
     with hasFinalUrlBuilder[ImageAdBuilder[ImageAd]]
     with hasTrackingTemplateBuilder[ImageAdBuilder[ImageAd]] {
  def withDisplayUrl(displayUrl: String): ImageAdBuilder[ImageAd]
  def withImage(image: Media): ImageAdBuilder[ImageAd]
  def withName(name: String): ImageAdBuilder[ImageAd]
}

object ImageAdBuilder {
  @scala.inline
  def apply[ImageAd](
    build: CallbackTo[AdWordsOperation[ImageAdBuilder[ImageAd]]],
    withCustomParameters: js.Object => CallbackTo[ImageAdBuilder[ImageAd]],
    withDisplayUrl: String => CallbackTo[ImageAdBuilder[ImageAd]],
    withFinalUrl: String => CallbackTo[ImageAdBuilder[ImageAd]],
    withImage: Media => CallbackTo[ImageAdBuilder[ImageAd]],
    withMobileFinalUrl: String => CallbackTo[ImageAdBuilder[ImageAd]],
    withName: String => CallbackTo[ImageAdBuilder[ImageAd]],
    withTrackingTemplate: String => CallbackTo[ImageAdBuilder[ImageAd]]
  ): ImageAdBuilder[ImageAd] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withCustomParameters")(js.Any.fromFunction1((t0: js.Object) => withCustomParameters(t0).runNow()))
    __obj.updateDynamic("withDisplayUrl")(js.Any.fromFunction1((t0: java.lang.String) => withDisplayUrl(t0).runNow()))
    __obj.updateDynamic("withFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withFinalUrl(t0).runNow()))
    __obj.updateDynamic("withImage")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withImage(t0).runNow()))
    __obj.updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withMobileFinalUrl(t0).runNow()))
    __obj.updateDynamic("withName")(js.Any.fromFunction1((t0: java.lang.String) => withName(t0).runNow()))
    __obj.updateDynamic("withTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => withTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[ImageAdBuilder[ImageAd]]
  }
}

