package typingsJapgolly.naverWhale.whale.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureVisibleTabOptions extends StObject {
  
  /**
    * Optional. The format of an image.
    * One of: "jpeg", or "png"
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    * When format is "jpeg", controls the quality of the resulting image. This value is ignored for PNG images. As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed to store it will decrease.
    */
  var quality: js.UndefOr[Double] = js.undefined
}
object CaptureVisibleTabOptions {
  
  inline def apply(): CaptureVisibleTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureVisibleTabOptions]
  }
  
  extension [Self <: CaptureVisibleTabOptions](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
