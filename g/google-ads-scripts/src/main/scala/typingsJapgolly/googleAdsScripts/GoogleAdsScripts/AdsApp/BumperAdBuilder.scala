package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for a bumper video ad under construction. */
trait BumperAdBuilder
  extends StObject
     with Builder[VideoAdOperation] {
  
  /** Sets the video ad name. */
  def withAdName(adName: String): this.type
  
  /** Sets the image that will be used as customized companion banner. */
  def withCompanionBanner(imageMedia: Media): this.type
  
  /** Sets the custom parameters of the new video ad to the specified value. */
  def withCustomParameters(customParameters: Record[String, String]): this.type
  
  /** Sets the website address that appears on the ad. */
  def withDisplayUrl(displayUrl: String): this.type
  
  /** Sets the final URL of the new video ad to the specified value. */
  def withFinalUrl(finalUrl: String): this.type
  
  /** Sets the tracking template of the new video ad to the specified value. */
  def withTrackingTemplate(trackingTemplate: String): this.type
  
  /** Sets the YouTube video that this ad will be built on. */
  def withVideo(videoMedia: Media): this.type
}
object BumperAdBuilder {
  
  inline def apply(
    build: CallbackTo[VideoAdOperation],
    withAdName: String => BumperAdBuilder,
    withCompanionBanner: Media => BumperAdBuilder,
    withCustomParameters: Record[String, String] => BumperAdBuilder,
    withDisplayUrl: String => BumperAdBuilder,
    withFinalUrl: String => BumperAdBuilder,
    withTrackingTemplate: String => BumperAdBuilder,
    withVideo: Media => BumperAdBuilder
  ): BumperAdBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withAdName = js.Any.fromFunction1(withAdName), withCompanionBanner = js.Any.fromFunction1(withCompanionBanner), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate), withVideo = js.Any.fromFunction1(withVideo))
    __obj.asInstanceOf[BumperAdBuilder]
  }
  
  extension [Self <: BumperAdBuilder](x: Self) {
    
    inline def setWithAdName(value: String => BumperAdBuilder): Self = StObject.set(x, "withAdName", js.Any.fromFunction1(value))
    
    inline def setWithCompanionBanner(value: Media => BumperAdBuilder): Self = StObject.set(x, "withCompanionBanner", js.Any.fromFunction1(value))
    
    inline def setWithCustomParameters(value: Record[String, String] => BumperAdBuilder): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    inline def setWithDisplayUrl(value: String => BumperAdBuilder): Self = StObject.set(x, "withDisplayUrl", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrl(value: String => BumperAdBuilder): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithTrackingTemplate(value: String => BumperAdBuilder): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
    
    inline def setWithVideo(value: Media => BumperAdBuilder): Self = StObject.set(x, "withVideo", js.Any.fromFunction1(value))
  }
}
