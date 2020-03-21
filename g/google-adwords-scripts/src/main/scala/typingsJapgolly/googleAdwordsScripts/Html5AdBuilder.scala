package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html5AdBuilder[Html5Ad]
  extends AdWordsBuilder[Html5AdBuilder[Html5Ad]]
     with hasFinalUrlBuilder[Html5AdBuilder[Html5Ad]]
     with hasTrackingTemplateBuilder[Html5AdBuilder[Html5Ad]] {
  def withDimensions(dimensions: String): Html5AdBuilder[Html5Ad]
  def withDisplayUrl(displayUrl: String): Html5AdBuilder[Html5Ad]
  def withEntryPoint(entryPoint: String): Html5AdBuilder[Html5Ad]
  def withMediaBundle(mediaBundle: Media): Html5AdBuilder[Html5Ad]
  def withName(name: String): Html5AdBuilder[Html5Ad]
}

object Html5AdBuilder {
  @scala.inline
  def apply[Html5Ad](
    build: CallbackTo[AdWordsOperation[Html5AdBuilder[Html5Ad]]],
    withCustomParameters: js.Object => CallbackTo[Html5AdBuilder[Html5Ad]],
    withDimensions: String => CallbackTo[Html5AdBuilder[Html5Ad]],
    withDisplayUrl: String => CallbackTo[Html5AdBuilder[Html5Ad]],
    withEntryPoint: String => CallbackTo[Html5AdBuilder[Html5Ad]],
    withFinalUrl: String => CallbackTo[Html5AdBuilder[Html5Ad]],
    withMediaBundle: Media => CallbackTo[Html5AdBuilder[Html5Ad]],
    withMobileFinalUrl: String => CallbackTo[Html5AdBuilder[Html5Ad]],
    withName: String => CallbackTo[Html5AdBuilder[Html5Ad]],
    withTrackingTemplate: String => CallbackTo[Html5AdBuilder[Html5Ad]]
  ): Html5AdBuilder[Html5Ad] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withCustomParameters")(js.Any.fromFunction1((t0: js.Object) => withCustomParameters(t0).runNow()))
    __obj.updateDynamic("withDimensions")(js.Any.fromFunction1((t0: java.lang.String) => withDimensions(t0).runNow()))
    __obj.updateDynamic("withDisplayUrl")(js.Any.fromFunction1((t0: java.lang.String) => withDisplayUrl(t0).runNow()))
    __obj.updateDynamic("withEntryPoint")(js.Any.fromFunction1((t0: java.lang.String) => withEntryPoint(t0).runNow()))
    __obj.updateDynamic("withFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withFinalUrl(t0).runNow()))
    __obj.updateDynamic("withMediaBundle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withMediaBundle(t0).runNow()))
    __obj.updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withMobileFinalUrl(t0).runNow()))
    __obj.updateDynamic("withName")(js.Any.fromFunction1((t0: java.lang.String) => withName(t0).runNow()))
    __obj.updateDynamic("withTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => withTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[Html5AdBuilder[Html5Ad]]
  }
}

