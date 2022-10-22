package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GmailMultiProductAdBuilder[GmailMultiProductAd]
  extends StObject
     with AdBuilder[GmailMultiProductAdBuilder[GmailImageAd]] {
  
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
  
  inline def apply[GmailMultiProductAd](
    build: CallbackTo[AdWordsOperation[GmailMultiProductAdBuilder[GmailImageAd]]],
    withAdvertiser: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withContent: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withCustomParameters: js.Object => GmailMultiProductAdBuilder[GmailImageAd],
    withDescription: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withFinalUrl: String => GmailMultiProductAdBuilder[GmailImageAd],
    withHeader: Media => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withHeadline: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withHeadlineColor: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonCallsToAction: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonFinalMobileUrls: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonFinalUrls: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonTrackingTemplates: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemImages: js.Array[Media] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemTitle: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withLogo: Media => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withMobileFinalUrl: String => GmailMultiProductAdBuilder[GmailImageAd],
    withName: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withSubject: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withTrackingTemplate: String => GmailMultiProductAdBuilder[GmailImageAd]
  ): GmailMultiProductAdBuilder[GmailMultiProductAd] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withAdvertiser = js.Any.fromFunction1(withAdvertiser), withContent = js.Any.fromFunction1(withContent), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeader = js.Any.fromFunction1(withHeader), withHeadline = js.Any.fromFunction1(withHeadline), withHeadlineColor = js.Any.fromFunction1(withHeadlineColor), withItemButtonCallsToAction = js.Any.fromFunction1(withItemButtonCallsToAction), withItemButtonFinalMobileUrls = js.Any.fromFunction1(withItemButtonFinalMobileUrls), withItemButtonFinalUrls = js.Any.fromFunction1(withItemButtonFinalUrls), withItemButtonTrackingTemplates = js.Any.fromFunction1(withItemButtonTrackingTemplates), withItemImages = js.Any.fromFunction1(withItemImages), withItemTitle = js.Any.fromFunction1(withItemTitle), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[GmailMultiProductAdBuilder[GmailMultiProductAd]]
  }
  
  extension [Self <: GmailMultiProductAdBuilder[?], GmailMultiProductAd](x: Self & GmailMultiProductAdBuilder[GmailMultiProductAd]) {
    
    inline def setWithAdvertiser(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withAdvertiser", js.Any.fromFunction1(value))
    
    inline def setWithContent(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withContent", js.Any.fromFunction1(value))
    
    inline def setWithDescription(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withDescription", js.Any.fromFunction1(value))
    
    inline def setWithHeader(value: Media => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withHeader", js.Any.fromFunction1(value))
    
    inline def setWithHeadline(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withHeadline", js.Any.fromFunction1(value))
    
    inline def setWithHeadlineColor(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withHeadlineColor", js.Any.fromFunction1(value))
    
    inline def setWithItemButtonCallsToAction(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withItemButtonCallsToAction", js.Any.fromFunction1(value))
    
    inline def setWithItemButtonFinalMobileUrls(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withItemButtonFinalMobileUrls", js.Any.fromFunction1(value))
    
    inline def setWithItemButtonFinalUrls(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withItemButtonFinalUrls", js.Any.fromFunction1(value))
    
    inline def setWithItemButtonTrackingTemplates(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withItemButtonTrackingTemplates", js.Any.fromFunction1(value))
    
    inline def setWithItemImages(value: js.Array[Media] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withItemImages", js.Any.fromFunction1(value))
    
    inline def setWithItemTitle(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withItemTitle", js.Any.fromFunction1(value))
    
    inline def setWithLogo(value: Media => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withLogo", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithSubject(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "withSubject", js.Any.fromFunction1(value))
  }
}
