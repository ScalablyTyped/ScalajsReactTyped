package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to ad URLs. See Using [Upgraded URLs](https://support.google.com/google-ads/answer/6080568) for more information.
  */
trait AdUrls extends StObject {
  
  def getCustomParameters(): Record[String, String]
  
  def getFinalUrl(): String
  
  def getFinalUrlSuffix(): String
  
  def getMobileFinalUrl(): String
  
  def getTrackingTemplate(): String
}
object AdUrls {
  
  inline def apply(
    getCustomParameters: CallbackTo[Record[String, String]],
    getFinalUrl: CallbackTo[String],
    getFinalUrlSuffix: CallbackTo[String],
    getMobileFinalUrl: CallbackTo[String],
    getTrackingTemplate: CallbackTo[String]
  ): AdUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = getCustomParameters.toJsFn, getFinalUrl = getFinalUrl.toJsFn, getFinalUrlSuffix = getFinalUrlSuffix.toJsFn, getMobileFinalUrl = getMobileFinalUrl.toJsFn, getTrackingTemplate = getTrackingTemplate.toJsFn)
    __obj.asInstanceOf[AdUrls]
  }
  
  extension [Self <: AdUrls](x: Self) {
    
    inline def setGetCustomParameters(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "getCustomParameters", value.toJsFn)
    
    inline def setGetFinalUrl(value: CallbackTo[String]): Self = StObject.set(x, "getFinalUrl", value.toJsFn)
    
    inline def setGetFinalUrlSuffix(value: CallbackTo[String]): Self = StObject.set(x, "getFinalUrlSuffix", value.toJsFn)
    
    inline def setGetMobileFinalUrl(value: CallbackTo[String]): Self = StObject.set(x, "getMobileFinalUrl", value.toJsFn)
    
    inline def setGetTrackingTemplate(value: CallbackTo[String]): Self = StObject.set(x, "getTrackingTemplate", value.toJsFn)
  }
}
