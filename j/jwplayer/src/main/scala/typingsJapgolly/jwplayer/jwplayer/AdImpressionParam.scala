package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerStrings.googima
import typingsJapgolly.jwplayer.jwplayerStrings.mid
import typingsJapgolly.jwplayer.jwplayerStrings.post
import typingsJapgolly.jwplayer.jwplayerStrings.pre
import typingsJapgolly.jwplayer.jwplayerStrings.vast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdImpressionParam extends StObject {
  
  var adposition: pre | mid | post
  
  var adsystem: String
  
  var adtitle: String
  
  var clickThroughUrl: String
  
  var client: vast | googima
  
  var creativetype: String
  
  var linear: String
  
  var mediafile: Any
  
  var tag: String
  
  var vastversion: Double
  
  var wrapper: js.Array[Any]
}
object AdImpressionParam {
  
  inline def apply(
    adposition: pre | mid | post,
    adsystem: String,
    adtitle: String,
    clickThroughUrl: String,
    client: vast | googima,
    creativetype: String,
    linear: String,
    mediafile: Any,
    tag: String,
    vastversion: Double,
    wrapper: js.Array[Any]
  ): AdImpressionParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], adsystem = adsystem.asInstanceOf[js.Any], adtitle = adtitle.asInstanceOf[js.Any], clickThroughUrl = clickThroughUrl.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], mediafile = mediafile.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], vastversion = vastversion.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdImpressionParam]
  }
  
  extension [Self <: AdImpressionParam](x: Self) {
    
    inline def setAdposition(value: pre | mid | post): Self = StObject.set(x, "adposition", value.asInstanceOf[js.Any])
    
    inline def setAdsystem(value: String): Self = StObject.set(x, "adsystem", value.asInstanceOf[js.Any])
    
    inline def setAdtitle(value: String): Self = StObject.set(x, "adtitle", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrl(value: String): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClient(value: vast | googima): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCreativetype(value: String): Self = StObject.set(x, "creativetype", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: String): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setMediafile(value: Any): Self = StObject.set(x, "mediafile", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setVastversion(value: Double): Self = StObject.set(x, "vastversion", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: js.Array[Any]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperVarargs(value: Any*): Self = StObject.set(x, "wrapper", js.Array(value*))
  }
}
