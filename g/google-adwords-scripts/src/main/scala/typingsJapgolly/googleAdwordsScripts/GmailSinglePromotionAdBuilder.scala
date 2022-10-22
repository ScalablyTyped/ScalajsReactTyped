package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  extends StObject
     with AdBuilder[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]] {
  
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
  
  inline def apply[GmailSinglePromotionAd](
    build: CallbackTo[AdWordsOperation[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]],
    withAdvertiser: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToAction: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToActionButtonColor: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToActionTextColor: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withContent: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCustomParameters: js.Object => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withDescription: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withDisplayUrl: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withFinalUrl: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeader: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeadline: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeadlineColor: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withImage: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withLogo: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withMobileFinalUrl: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withName: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withSubject: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withTrackingTemplate: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  ): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withAdvertiser = js.Any.fromFunction1(withAdvertiser), withCallToAction = js.Any.fromFunction1(withCallToAction), withCallToActionButtonColor = js.Any.fromFunction1(withCallToActionButtonColor), withCallToActionTextColor = js.Any.fromFunction1(withCallToActionTextColor), withContent = js.Any.fromFunction1(withContent), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeader = js.Any.fromFunction1(withHeader), withHeadline = js.Any.fromFunction1(withHeadline), withHeadlineColor = js.Any.fromFunction1(withHeadlineColor), withImage = js.Any.fromFunction1(withImage), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
  }
  
  extension [Self <: GmailSinglePromotionAdBuilder[?], GmailSinglePromotionAd](x: Self & GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]) {
    
    inline def setWithAdvertiser(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withAdvertiser", js.Any.fromFunction1(value))
    
    inline def setWithCallToAction(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withCallToAction", js.Any.fromFunction1(value))
    
    inline def setWithCallToActionButtonColor(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withCallToActionButtonColor", js.Any.fromFunction1(value))
    
    inline def setWithCallToActionTextColor(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withCallToActionTextColor", js.Any.fromFunction1(value))
    
    inline def setWithContent(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withContent", js.Any.fromFunction1(value))
    
    inline def setWithDescription(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withDescription", js.Any.fromFunction1(value))
    
    inline def setWithDisplayUrl(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withDisplayUrl", js.Any.fromFunction1(value))
    
    inline def setWithHeader(value: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withHeader", js.Any.fromFunction1(value))
    
    inline def setWithHeadline(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withHeadline", js.Any.fromFunction1(value))
    
    inline def setWithHeadlineColor(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withHeadlineColor", js.Any.fromFunction1(value))
    
    inline def setWithImage(value: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withImage", js.Any.fromFunction1(value))
    
    inline def setWithLogo(value: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withLogo", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithSubject(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withSubject", js.Any.fromFunction1(value))
  }
}
