package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GmailImageAdBuilder[GmailImageAd]
  extends StObject
     with AdBuilder[GmailImageAdBuilder[GmailImageAd]] {
  
  def withAdvertiser(advertiser: String): GmailImageAdBuilder[GmailImageAd]
  
  def withDescription(description: String): GmailImageAdBuilder[GmailImageAd]
  
  def withDisplayUrl(displayUrl: String): GmailImageAdBuilder[GmailImageAd]
  
  def withImage(image: Media): GmailImageAdBuilder[GmailImageAd]
  
  def withLogo(logo: Media): GmailImageAdBuilder[GmailImageAd]
  
  def withName(name: String): GmailImageAdBuilder[GmailImageAd]
  
  def withSubject(subject: String): GmailImageAdBuilder[GmailImageAd]
}
object GmailImageAdBuilder {
  
  inline def apply[GmailImageAd](
    build: CallbackTo[AdWordsOperation[GmailImageAdBuilder[GmailImageAd]]],
    withAdvertiser: String => GmailImageAdBuilder[GmailImageAd],
    withCustomParameters: js.Object => GmailImageAdBuilder[GmailImageAd],
    withDescription: String => GmailImageAdBuilder[GmailImageAd],
    withDisplayUrl: String => GmailImageAdBuilder[GmailImageAd],
    withFinalUrl: String => GmailImageAdBuilder[GmailImageAd],
    withImage: Media => GmailImageAdBuilder[GmailImageAd],
    withLogo: Media => GmailImageAdBuilder[GmailImageAd],
    withMobileFinalUrl: String => GmailImageAdBuilder[GmailImageAd],
    withName: String => GmailImageAdBuilder[GmailImageAd],
    withSubject: String => GmailImageAdBuilder[GmailImageAd],
    withTrackingTemplate: String => GmailImageAdBuilder[GmailImageAd]
  ): GmailImageAdBuilder[GmailImageAd] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withAdvertiser = js.Any.fromFunction1(withAdvertiser), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withImage = js.Any.fromFunction1(withImage), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[GmailImageAdBuilder[GmailImageAd]]
  }
  
  extension [Self <: GmailImageAdBuilder[?], GmailImageAd](x: Self & GmailImageAdBuilder[GmailImageAd]) {
    
    inline def setWithAdvertiser(value: String => GmailImageAdBuilder[GmailImageAd]): Self = StObject.set(x, "withAdvertiser", js.Any.fromFunction1(value))
    
    inline def setWithDescription(value: String => GmailImageAdBuilder[GmailImageAd]): Self = StObject.set(x, "withDescription", js.Any.fromFunction1(value))
    
    inline def setWithDisplayUrl(value: String => GmailImageAdBuilder[GmailImageAd]): Self = StObject.set(x, "withDisplayUrl", js.Any.fromFunction1(value))
    
    inline def setWithImage(value: Media => GmailImageAdBuilder[GmailImageAd]): Self = StObject.set(x, "withImage", js.Any.fromFunction1(value))
    
    inline def setWithLogo(value: Media => GmailImageAdBuilder[GmailImageAd]): Self = StObject.set(x, "withLogo", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => GmailImageAdBuilder[GmailImageAd]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithSubject(value: String => GmailImageAdBuilder[GmailImageAd]): Self = StObject.set(x, "withSubject", js.Any.fromFunction1(value))
  }
}
