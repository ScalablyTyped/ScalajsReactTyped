package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  extends AdWordsBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
     with hasFinalUrlBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
     with hasTrackingTemplateBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]] {
  def withBusinessName(businessName: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withDescription(description: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withLogoImage(logo: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withLongHeadline(longHeadline: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withMarketingImage(marketingImage: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withShortHeadline(shortHeadline: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
}

object ResponsiveDisplayAdBuilder {
  @scala.inline
  def apply[ResponsiveDisplayAd](
    build: CallbackTo[AdWordsOperation[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]],
    withBusinessName: String => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withCustomParameters: js.Object => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withDescription: String => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withFinalUrl: String => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withLogoImage: Media => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withLongHeadline: String => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withMarketingImage: Media => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withMobileFinalUrl: String => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withShortHeadline: String => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withTrackingTemplate: String => CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  ): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withBusinessName")(js.Any.fromFunction1((t0: java.lang.String) => withBusinessName(t0).runNow()))
    __obj.updateDynamic("withCustomParameters")(js.Any.fromFunction1((t0: js.Object) => withCustomParameters(t0).runNow()))
    __obj.updateDynamic("withDescription")(js.Any.fromFunction1((t0: java.lang.String) => withDescription(t0).runNow()))
    __obj.updateDynamic("withFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withFinalUrl(t0).runNow()))
    __obj.updateDynamic("withLogoImage")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withLogoImage(t0).runNow()))
    __obj.updateDynamic("withLongHeadline")(js.Any.fromFunction1((t0: java.lang.String) => withLongHeadline(t0).runNow()))
    __obj.updateDynamic("withMarketingImage")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withMarketingImage(t0).runNow()))
    __obj.updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withMobileFinalUrl(t0).runNow()))
    __obj.updateDynamic("withShortHeadline")(js.Any.fromFunction1((t0: java.lang.String) => withShortHeadline(t0).runNow()))
    __obj.updateDynamic("withTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => withTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  }
}

