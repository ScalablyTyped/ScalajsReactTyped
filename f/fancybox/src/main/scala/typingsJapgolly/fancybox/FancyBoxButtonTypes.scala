package typingsJapgolly.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxButtonTypes extends StObject {
  
  var close: String
  
  var download: String
  
  var fullScreen: String
  
  var share: String
  
  var slideShow: String
  
  var thumbs: String
  
  var zoom: String
}
object FancyBoxButtonTypes {
  
  inline def apply(
    close: String,
    download: String,
    fullScreen: String,
    share: String,
    slideShow: String,
    thumbs: String,
    zoom: String
  ): FancyBoxButtonTypes = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], slideShow = slideShow.asInstanceOf[js.Any], thumbs = thumbs.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxButtonTypes]
  }
  
  extension [Self <: FancyBoxButtonTypes](x: Self) {
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setFullScreen(value: String): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setShare(value: String): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
    
    inline def setSlideShow(value: String): Self = StObject.set(x, "slideShow", value.asInstanceOf[js.Any])
    
    inline def setThumbs(value: String): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
