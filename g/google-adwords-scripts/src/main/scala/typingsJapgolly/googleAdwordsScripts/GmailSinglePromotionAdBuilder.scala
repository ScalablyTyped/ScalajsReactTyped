package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  extends AdWordsBuilder[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
     with hasFinalUrlBuilder[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
     with hasTrackingTemplateBuilder[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]] {
  def withAdvertiser(advertiser: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withCallToAction(callToAction: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withCallToActionButtonColor(callToActionButtonColor: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withCallToActionTextColor(callToActionTextColor: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withContent(content: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withDescription(description: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withDisplayUrl(displayUrl: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withHeader(header: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withHeadline(headline: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withHeadlineColor(headlineColor: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withImage(image: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withLogo(logo: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withName(name: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withSubject(subject: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
}

object GmailSinglePromotionAdBuilder {
  @scala.inline
  def apply[GmailSinglePromotionAd](
    build: CallbackTo[AdWordsOperation[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]],
    withAdvertiser: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withCallToAction: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withCallToActionButtonColor: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withCallToActionTextColor: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withContent: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withCustomParameters: js.Object => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withDescription: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withDisplayUrl: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withFinalUrl: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withHeader: Media => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withHeadline: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withHeadlineColor: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withImage: Media => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withLogo: Media => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withMobileFinalUrl: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withName: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withSubject: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withTrackingTemplate: String => CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
  ): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withAdvertiser")(js.Any.fromFunction1((t0: java.lang.String) => withAdvertiser(t0).runNow()))
    __obj.updateDynamic("withCallToAction")(js.Any.fromFunction1((t0: java.lang.String) => withCallToAction(t0).runNow()))
    __obj.updateDynamic("withCallToActionButtonColor")(js.Any.fromFunction1((t0: java.lang.String) => withCallToActionButtonColor(t0).runNow()))
    __obj.updateDynamic("withCallToActionTextColor")(js.Any.fromFunction1((t0: java.lang.String) => withCallToActionTextColor(t0).runNow()))
    __obj.updateDynamic("withContent")(js.Any.fromFunction1((t0: java.lang.String) => withContent(t0).runNow()))
    __obj.updateDynamic("withCustomParameters")(js.Any.fromFunction1((t0: js.Object) => withCustomParameters(t0).runNow()))
    __obj.updateDynamic("withDescription")(js.Any.fromFunction1((t0: java.lang.String) => withDescription(t0).runNow()))
    __obj.updateDynamic("withDisplayUrl")(js.Any.fromFunction1((t0: java.lang.String) => withDisplayUrl(t0).runNow()))
    __obj.updateDynamic("withFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withFinalUrl(t0).runNow()))
    __obj.updateDynamic("withHeader")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withHeader(t0).runNow()))
    __obj.updateDynamic("withHeadline")(js.Any.fromFunction1((t0: java.lang.String) => withHeadline(t0).runNow()))
    __obj.updateDynamic("withHeadlineColor")(js.Any.fromFunction1((t0: java.lang.String) => withHeadlineColor(t0).runNow()))
    __obj.updateDynamic("withImage")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withImage(t0).runNow()))
    __obj.updateDynamic("withLogo")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withLogo(t0).runNow()))
    __obj.updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withMobileFinalUrl(t0).runNow()))
    __obj.updateDynamic("withName")(js.Any.fromFunction1((t0: java.lang.String) => withName(t0).runNow()))
    __obj.updateDynamic("withSubject")(js.Any.fromFunction1((t0: java.lang.String) => withSubject(t0).runNow()))
    __obj.updateDynamic("withTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => withTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
  }
}

