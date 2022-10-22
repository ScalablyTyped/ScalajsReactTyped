package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Starting point for determining the type of an ad.
  * For types that are not fully supported, use Ad.getType instead.
  *
  * Typical usage:
  *
  *      if (ad.isType().expandedTextAd()) {
  *        var expandedTextAd = ad.asType().expandedTextAd();
  *        var headlinePart1 = expandedTextAd.getHeadlinePart1();
  *      }
  */
trait AdTypeSpace extends StObject {
  
  /** Returns whether the ad is an ExpandedTextAd. */
  def expandedTextAd(): Boolean
  
  /** Returns whether the ad is a GmailImageAd. */
  def gmailImageAd(): Boolean
  
  /** Returns whether the ad is a GmailMultiProductAd. */
  def gmailMultiProductAd(): Boolean
  
  /** Returns whether the ad is a GmailSinglePromotionAd. */
  def gmailSinglePromotionAd(): Boolean
  
  /** Returns whether the ad is a Html5Ad. */
  def html5Ad(): Boolean
  
  /** Returns whether the ad is an ImageAd. */
  def imageAd(): Boolean
  
  /** Returns whether the ad is a ResponsiveDisplayAd. */
  def responsiveDisplayAd(): Boolean
  
  /** Returns whether the ad is a ResponsiveSearchAd. */
  def responsiveSearchAd(): Boolean
}
object AdTypeSpace {
  
  inline def apply(
    expandedTextAd: CallbackTo[Boolean],
    gmailImageAd: CallbackTo[Boolean],
    gmailMultiProductAd: CallbackTo[Boolean],
    gmailSinglePromotionAd: CallbackTo[Boolean],
    html5Ad: CallbackTo[Boolean],
    imageAd: CallbackTo[Boolean],
    responsiveDisplayAd: CallbackTo[Boolean],
    responsiveSearchAd: CallbackTo[Boolean]
  ): AdTypeSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = expandedTextAd.toJsFn, gmailImageAd = gmailImageAd.toJsFn, gmailMultiProductAd = gmailMultiProductAd.toJsFn, gmailSinglePromotionAd = gmailSinglePromotionAd.toJsFn, html5Ad = html5Ad.toJsFn, imageAd = imageAd.toJsFn, responsiveDisplayAd = responsiveDisplayAd.toJsFn, responsiveSearchAd = responsiveSearchAd.toJsFn)
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
    
    inline def setResponsiveSearchAd(value: CallbackTo[Boolean]): Self = StObject.set(x, "responsiveSearchAd", value.toJsFn)
  }
}
