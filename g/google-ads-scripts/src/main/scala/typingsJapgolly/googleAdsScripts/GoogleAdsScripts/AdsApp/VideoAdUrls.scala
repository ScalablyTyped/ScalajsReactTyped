package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to ad URLs.
  */
trait VideoAdUrls extends StObject {
  
  /** Returns the custom parameters of the video ad. */
  def getCustomParameters(): Record[String, String]
  
  /** Returns the final URL of the video ad. */
  def getFinalUrl(): String
  
  /** Returns the tracking template of the video ad. */
  def getTrackingTemplate(): String
}
object VideoAdUrls {
  
  inline def apply(
    getCustomParameters: CallbackTo[Record[String, String]],
    getFinalUrl: CallbackTo[String],
    getTrackingTemplate: CallbackTo[String]
  ): VideoAdUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = getCustomParameters.toJsFn, getFinalUrl = getFinalUrl.toJsFn, getTrackingTemplate = getTrackingTemplate.toJsFn)
    __obj.asInstanceOf[VideoAdUrls]
  }
  
  extension [Self <: VideoAdUrls](x: Self) {
    
    inline def setGetCustomParameters(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "getCustomParameters", value.toJsFn)
    
    inline def setGetFinalUrl(value: CallbackTo[String]): Self = StObject.set(x, "getFinalUrl", value.toJsFn)
    
    inline def setGetTrackingTemplate(value: CallbackTo[String]): Self = StObject.set(x, "getTrackingTemplate", value.toJsFn)
  }
}
