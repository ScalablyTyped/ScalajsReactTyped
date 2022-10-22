package typingsJapgolly.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleImageOptions extends StObject {
  
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
    *
    * Once the resize is complete, your promise must be fulfilled.
    * You may, of course, reject your returned `Promise` is the resize fails in some way.
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.undefined
  
  /**
    * @default `false`
    */
  var includeExif: js.UndefOr[Boolean] = js.undefined
  
  /**
    * required
    */
  var maxSize: Double
  
  /**
    * @default `true`
    */
  var orient: js.UndefOr[Boolean] = js.undefined
  
  /**
    * number between `0` and `100`
    *
    * @default `80`
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * defaults to the type of the reference image
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ScaleImageOptions {
  
  inline def apply(maxSize: Double): ScaleImageOptions = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleImageOptions]
  }
  
  extension [Self <: ScaleImageOptions](x: Self) {
    
    inline def setCustomResizer(value: /* resizeInfo */ ResizeInfo => PromiseOptions): Self = StObject.set(x, "customResizer", js.Any.fromFunction1(value))
    
    inline def setCustomResizerUndefined: Self = StObject.set(x, "customResizer", js.undefined)
    
    inline def setIncludeExif(value: Boolean): Self = StObject.set(x, "includeExif", value.asInstanceOf[js.Any])
    
    inline def setIncludeExifUndefined: Self = StObject.set(x, "includeExif", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setOrient(value: Boolean): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
