package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedTextAdBuilder[ExpandedTextAd]
  extends AdWordsBuilder[ExpandedTextAdBuilder[ExpandedTextAd]]
     with hasFinalUrlBuilder[ExpandedTextAdBuilder[ExpandedTextAd]]
     with hasTrackingTemplateBuilder[ExpandedTextAdBuilder[ExpandedTextAd]] {
  def withDescription(descriptions: String): ExpandedTextAdBuilder[ExpandedTextAd]
  def withHeadlinePart1(headline1: String): ExpandedTextAdBuilder[ExpandedTextAd]
  def withHeadlinePart2(headline2: String): ExpandedTextAdBuilder[ExpandedTextAd]
  def withPath1(path1: String): ExpandedTextAdBuilder[ExpandedTextAd]
  def withPath2(path2: String): ExpandedTextAdBuilder[ExpandedTextAd]
}

object ExpandedTextAdBuilder {
  @scala.inline
  def apply[ExpandedTextAd](
    build: CallbackTo[AdWordsOperation[ExpandedTextAdBuilder[ExpandedTextAd]]],
    withCustomParameters: js.Object => CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    withDescription: String => CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    withFinalUrl: String => CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    withHeadlinePart1: String => CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    withHeadlinePart2: String => CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    withMobileFinalUrl: String => CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    withPath1: String => CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    withPath2: String => CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    withTrackingTemplate: String => CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]]
  ): ExpandedTextAdBuilder[ExpandedTextAd] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withCustomParameters")(js.Any.fromFunction1((t0: js.Object) => withCustomParameters(t0).runNow()))
    __obj.updateDynamic("withDescription")(js.Any.fromFunction1((t0: java.lang.String) => withDescription(t0).runNow()))
    __obj.updateDynamic("withFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withFinalUrl(t0).runNow()))
    __obj.updateDynamic("withHeadlinePart1")(js.Any.fromFunction1((t0: java.lang.String) => withHeadlinePart1(t0).runNow()))
    __obj.updateDynamic("withHeadlinePart2")(js.Any.fromFunction1((t0: java.lang.String) => withHeadlinePart2(t0).runNow()))
    __obj.updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withMobileFinalUrl(t0).runNow()))
    __obj.updateDynamic("withPath1")(js.Any.fromFunction1((t0: java.lang.String) => withPath1(t0).runNow()))
    __obj.updateDynamic("withPath2")(js.Any.fromFunction1((t0: java.lang.String) => withPath2(t0).runNow()))
    __obj.updateDynamic("withTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => withTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[ExpandedTextAdBuilder[ExpandedTextAd]]
  }
}

