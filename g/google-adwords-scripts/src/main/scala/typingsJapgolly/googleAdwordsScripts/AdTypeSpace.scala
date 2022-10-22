package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdTypeSpace extends StObject {
  
  def expandedTextAd(): Boolean
  
  def gmailImageAd(): Boolean
  
  def gmailMultiProductAd(): Boolean
  
  def gmailSinglePromotionAd(): Boolean
  
  def html5Ad(): Boolean
  
  def imageAd(): Boolean
  
  def responsiveDisplayAd(): Boolean
}
object AdTypeSpace {
  
  inline def apply(
    expandedTextAd: CallbackTo[Boolean],
    gmailImageAd: CallbackTo[Boolean],
    gmailMultiProductAd: CallbackTo[Boolean],
    gmailSinglePromotionAd: CallbackTo[Boolean],
    html5Ad: CallbackTo[Boolean],
    imageAd: CallbackTo[Boolean],
    responsiveDisplayAd: CallbackTo[Boolean]
  ): AdTypeSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = expandedTextAd.toJsFn, gmailImageAd = gmailImageAd.toJsFn, gmailMultiProductAd = gmailMultiProductAd.toJsFn, gmailSinglePromotionAd = gmailSinglePromotionAd.toJsFn, html5Ad = html5Ad.toJsFn, imageAd = imageAd.toJsFn, responsiveDisplayAd = responsiveDisplayAd.toJsFn)
    __obj.asInstanceOf[AdTypeSpace]
  }
  
  extension [Self <: AdTypeSpace](x: Self) {
    
    inline def setExpandedTextAd(value: CallbackTo[Boolean]): Self = StObject.set(x, "expandedTextAd", value.toJsFn)
    
    inline def setGmailImageAd(value: CallbackTo[Boolean]): Self = StObject.set(x, "gmailImageAd", value.toJsFn)
    
    inline def setGmailMultiProductAd(value: CallbackTo[Boolean]): Self = StObject.set(x, "gmailMultiProductAd", value.toJsFn)
    
    inline def setGmailSinglePromotionAd(value: CallbackTo[Boolean]): Self = StObject.set(x, "gmailSinglePromotionAd", value.toJsFn)
    
    inline def setHtml5Ad(value: CallbackTo[Boolean]): Self = StObject.set(x, "html5Ad", value.toJsFn)
    
    inline def setImageAd(value: CallbackTo[Boolean]): Self = StObject.set(x, "imageAd", value.toJsFn)
    
    inline def setResponsiveDisplayAd(value: CallbackTo[Boolean]): Self = StObject.set(x, "responsiveDisplayAd", value.toJsFn)
  }
}
