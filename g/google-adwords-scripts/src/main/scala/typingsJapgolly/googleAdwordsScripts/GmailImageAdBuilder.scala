package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailImageAdBuilder[GmailImageAd]
  extends AdWordsBuilder[GmailImageAdBuilder[GmailImageAd]]
     with hasFinalUrlBuilder[GmailImageAdBuilder[GmailImageAd]]
     with hasTrackingTemplateBuilder[GmailImageAdBuilder[GmailImageAd]] {
  def withAdvertiser(advertiser: String): GmailImageAdBuilder[GmailImageAd]
  def withDescription(description: String): GmailImageAdBuilder[GmailImageAd]
  def withDisplayUrl(displayUrl: String): GmailImageAdBuilder[GmailImageAd]
  def withImage(image: Media): GmailImageAdBuilder[GmailImageAd]
  def withLogo(logo: Media): GmailImageAdBuilder[GmailImageAd]
  def withName(name: String): GmailImageAdBuilder[GmailImageAd]
  def withSubject(subject: String): GmailImageAdBuilder[GmailImageAd]
}

object GmailImageAdBuilder {
  @scala.inline
  def apply[GmailImageAd](
    build: CallbackTo[AdWordsOperation[GmailImageAdBuilder[GmailImageAd]]],
    withAdvertiser: String => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withCustomParameters: js.Object => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withDescription: String => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withDisplayUrl: String => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withFinalUrl: String => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withImage: Media => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withLogo: Media => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withMobileFinalUrl: String => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withName: String => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withSubject: String => CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    withTrackingTemplate: String => CallbackTo[GmailImageAdBuilder[GmailImageAd]]
  ): GmailImageAdBuilder[GmailImageAd] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withAdvertiser")(js.Any.fromFunction1((t0: java.lang.String) => withAdvertiser(t0).runNow()))
    __obj.updateDynamic("withCustomParameters")(js.Any.fromFunction1((t0: js.Object) => withCustomParameters(t0).runNow()))
    __obj.updateDynamic("withDescription")(js.Any.fromFunction1((t0: java.lang.String) => withDescription(t0).runNow()))
    __obj.updateDynamic("withDisplayUrl")(js.Any.fromFunction1((t0: java.lang.String) => withDisplayUrl(t0).runNow()))
    __obj.updateDynamic("withFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withFinalUrl(t0).runNow()))
    __obj.updateDynamic("withImage")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withImage(t0).runNow()))
    __obj.updateDynamic("withLogo")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Media) => withLogo(t0).runNow()))
    __obj.updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withMobileFinalUrl(t0).runNow()))
    __obj.updateDynamic("withName")(js.Any.fromFunction1((t0: java.lang.String) => withName(t0).runNow()))
    __obj.updateDynamic("withSubject")(js.Any.fromFunction1((t0: java.lang.String) => withSubject(t0).runNow()))
    __obj.updateDynamic("withTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => withTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[GmailImageAdBuilder[GmailImageAd]]
  }
}

