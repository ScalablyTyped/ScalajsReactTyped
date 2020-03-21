package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailMultiProductAdBuilder[GmailMultiProductAd]
  extends AdWordsBuilder[GmailMultiProductAdBuilder[GmailImageAd]]
     with hasFinalUrlBuilder[GmailMultiProductAdBuilder[GmailImageAd]]
     with hasTrackingTemplateBuilder[GmailMultiProductAdBuilder[GmailImageAd]] {
  def withAdvertiser(advertiser: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withContent(content: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withDescription(description: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeader(header: Media): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeadline(headline: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeadlineColor(headlineColor: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonCallsToAction(itemCallsToAction: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonFinalMobileUrls(itemButtonFinalMobileUrls: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonFinalUrls(itemButtonFinalUrls: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonTrackingTemplates(itemButtonTrackingTemplates: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemImages(itemImages: js.Array[Media]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemTitle(itemTitles: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withLogo(logo: Media): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withName(name: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withSubject(subject: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
}

object GmailMultiProductAdBuilder {
  @scala.inline
  def apply[GmailMultiProductAd](
    build: CallbackTo[AdWordsOperation[GmailMultiProductAdBuilder[GmailImageAd]]],
    withAdvertiser: String => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withContent: String => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withCustomParameters: js.Object => CallbackTo[GmailMultiProductAdBuilder[GmailImageAd]],
    withDescription: String => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withFinalUrl: String => CallbackTo[GmailMultiProductAdBuilder[GmailImageAd]],
    withHeader: Media => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withHeadline: String => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withHeadlineColor: String => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemButtonCallsToAction: js.Array[String] => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemButtonFinalMobileUrls: js.Array[String] => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemButtonFinalUrls: js.Array[String] => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemButtonTrackingTemplates: js.Array[String] => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemImages: js.Array[Media] => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemTitle: js.Array[String] => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withLogo: Media => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withMobileFinalUrl: String => CallbackTo[GmailMultiProductAdBuilder[GmailImageAd]],
    withName: String => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withSubject: String => CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withTrackingTemplate: String => CallbackTo[GmailMultiProductAdBuilder[GmailImageAd]]
  ): GmailMultiProductAdBuilder[GmailMultiProductAd] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withAdvertiser")(js.Any.fromFunction1((t0: java.lang.String) => withAdvertiser(t0).runNow()))
    __obj.updateDynamic("withContent")(js.Any.fromFunction1((t0: java.lang.String) => withContent(t0).runNow()))
    __obj.updateDynamic("withCustomParameters")(js.Any.fromFunction1((t0: js.Object) => withCustomParameters(t0).runNow()))
    __obj.updateDynamic("withDescription")(js.Any.fromFunction1((t0: java.lang.String) => withDescription(t0).runNow()))
    __obj.updateDynamic("withFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withFinalUrl(t0).runNow()))
    __obj.updateDynamic("withHeader")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withHeader(t0).runNow()))
    __obj.updateDynamic("withHeadline")(js.Any.fromFunction1((t0: java.lang.String) => withHeadline(t0).runNow()))
    __obj.updateDynamic("withHeadlineColor")(js.Any.fromFunction1((t0: java.lang.String) => withHeadlineColor(t0).runNow()))
    __obj.updateDynamic("withItemButtonCallsToAction")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => withItemButtonCallsToAction(t0).runNow()))
    __obj.updateDynamic("withItemButtonFinalMobileUrls")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => withItemButtonFinalMobileUrls(t0).runNow()))
    __obj.updateDynamic("withItemButtonFinalUrls")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => withItemButtonFinalUrls(t0).runNow()))
    __obj.updateDynamic("withItemButtonTrackingTemplates")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => withItemButtonTrackingTemplates(t0).runNow()))
    __obj.updateDynamic("withItemImages")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.googleAdwordsScripts.Media]) => withItemImages(t0).runNow()))
    __obj.updateDynamic("withItemTitle")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => withItemTitle(t0).runNow()))
    __obj.updateDynamic("withLogo")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withLogo(t0).runNow()))
    __obj.updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withMobileFinalUrl(t0).runNow()))
    __obj.updateDynamic("withName")(js.Any.fromFunction1((t0: java.lang.String) => withName(t0).runNow()))
    __obj.updateDynamic("withSubject")(js.Any.fromFunction1((t0: java.lang.String) => withSubject(t0).runNow()))
    __obj.updateDynamic("withTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => withTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[GmailMultiProductAdBuilder[GmailMultiProductAd]]
  }
}

