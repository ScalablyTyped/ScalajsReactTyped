package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdBuilderSpace extends StObject {
  
  def expandedTextAdBuilder(): ExpandedTextAdBuilder[ExpandedTextAd]
  
  def gmailImageAdBuilder(): GmailImageAdBuilder[GmailImageAd]
  
  def gmailMultiProductAdBuilder(): GmailMultiProductAdBuilder[GmailMultiProductAd]
  
  def gmailSinglePromotionAdBuilder(): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  
  def html5AdBuilder(): Html5AdBuilder[Html5Ad]
  
  def imageAdBuilder(): ImageAdBuilder[ImageAd]
  
  def responsiveDisplayAdBuilder(): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
}
object AdBuilderSpace {
  
  inline def apply(
    expandedTextAdBuilder: CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    gmailImageAdBuilder: CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    gmailMultiProductAdBuilder: CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    gmailSinglePromotionAdBuilder: CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    html5AdBuilder: CallbackTo[Html5AdBuilder[Html5Ad]],
    imageAdBuilder: CallbackTo[ImageAdBuilder[ImageAd]],
    responsiveDisplayAdBuilder: CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  ): AdBuilderSpace = {
    val __obj = js.Dynamic.literal(expandedTextAdBuilder = expandedTextAdBuilder.toJsFn, gmailImageAdBuilder = gmailImageAdBuilder.toJsFn, gmailMultiProductAdBuilder = gmailMultiProductAdBuilder.toJsFn, gmailSinglePromotionAdBuilder = gmailSinglePromotionAdBuilder.toJsFn, html5AdBuilder = html5AdBuilder.toJsFn, imageAdBuilder = imageAdBuilder.toJsFn, responsiveDisplayAdBuilder = responsiveDisplayAdBuilder.toJsFn)
    __obj.asInstanceOf[AdBuilderSpace]
  }
  
  extension [Self <: AdBuilderSpace](x: Self) {
    
    inline def setExpandedTextAdBuilder(value: CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]]): Self = StObject.set(x, "expandedTextAdBuilder", value.toJsFn)
    
    inline def setGmailImageAdBuilder(value: CallbackTo[GmailImageAdBuilder[GmailImageAd]]): Self = StObject.set(x, "gmailImageAdBuilder", value.toJsFn)
    
    inline def setGmailMultiProductAdBuilder(value: CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]]): Self = StObject.set(x, "gmailMultiProductAdBuilder", value.toJsFn)
    
    inline def setGmailSinglePromotionAdBuilder(value: CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]): Self = StObject.set(x, "gmailSinglePromotionAdBuilder", value.toJsFn)
    
    inline def setHtml5AdBuilder(value: CallbackTo[Html5AdBuilder[Html5Ad]]): Self = StObject.set(x, "html5AdBuilder", value.toJsFn)
    
    inline def setImageAdBuilder(value: CallbackTo[ImageAdBuilder[ImageAd]]): Self = StObject.set(x, "imageAdBuilder", value.toJsFn)
    
    inline def setResponsiveDisplayAdBuilder(value: CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]): Self = StObject.set(x, "responsiveDisplayAdBuilder", value.toJsFn)
  }
}
