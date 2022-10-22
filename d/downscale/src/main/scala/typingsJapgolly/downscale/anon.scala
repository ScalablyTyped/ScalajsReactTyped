package typingsJapgolly.downscale

import typingsJapgolly.downscale.downscaleBooleans.`false`
import typingsJapgolly.downscale.downscaleBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined downscale.downscale.DownscaleOptions & {  returnBlob :true} */
  trait DownscaleOptionsreturnBlo extends StObject {
    
    var imageType: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var returnBlob: js.UndefOr[Boolean] & `true`
    
    var returnCanvas: js.UndefOr[Boolean] = js.undefined
    
    var sourceX: js.UndefOr[Double] = js.undefined
    
    var sourceY: js.UndefOr[Double] = js.undefined
  }
  object DownscaleOptionsreturnBlo {
    
    inline def apply(returnBlob: js.UndefOr[Boolean] & `true`): DownscaleOptionsreturnBlo = {
      val __obj = js.Dynamic.literal(returnBlob = returnBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownscaleOptionsreturnBlo]
    }
    
    extension [Self <: DownscaleOptionsreturnBlo](x: Self) {
      
      inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setReturnBlob(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "returnBlob", value.asInstanceOf[js.Any])
      
      inline def setReturnCanvas(value: Boolean): Self = StObject.set(x, "returnCanvas", value.asInstanceOf[js.Any])
      
      inline def setReturnCanvasUndefined: Self = StObject.set(x, "returnCanvas", js.undefined)
      
      inline def setSourceX(value: Double): Self = StObject.set(x, "sourceX", value.asInstanceOf[js.Any])
      
      inline def setSourceXUndefined: Self = StObject.set(x, "sourceX", js.undefined)
      
      inline def setSourceY(value: Double): Self = StObject.set(x, "sourceY", value.asInstanceOf[js.Any])
      
      inline def setSourceYUndefined: Self = StObject.set(x, "sourceY", js.undefined)
    }
  }
  
  /* Inlined downscale.downscale.DownscaleOptions & {  returnBlob :false | undefined,   returnCanvas :false | undefined} */
  trait DownscaleOptionsreturnBloImageType extends StObject {
    
    var imageType: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var returnBlob: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    var returnCanvas: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    var sourceX: js.UndefOr[Double] = js.undefined
    
    var sourceY: js.UndefOr[Double] = js.undefined
  }
  object DownscaleOptionsreturnBloImageType {
    
    inline def apply(
      returnBlob: js.UndefOr[Boolean] & js.UndefOr[`false`],
      returnCanvas: js.UndefOr[Boolean] & js.UndefOr[`false`]
    ): DownscaleOptionsreturnBloImageType = {
      val __obj = js.Dynamic.literal(returnBlob = returnBlob.asInstanceOf[js.Any], returnCanvas = returnCanvas.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownscaleOptionsreturnBloImageType]
    }
    
    extension [Self <: DownscaleOptionsreturnBloImageType](x: Self) {
      
      inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setReturnBlob(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "returnBlob", value.asInstanceOf[js.Any])
      
      inline def setReturnCanvas(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "returnCanvas", value.asInstanceOf[js.Any])
      
      inline def setSourceX(value: Double): Self = StObject.set(x, "sourceX", value.asInstanceOf[js.Any])
      
      inline def setSourceXUndefined: Self = StObject.set(x, "sourceX", js.undefined)
      
      inline def setSourceY(value: Double): Self = StObject.set(x, "sourceY", value.asInstanceOf[js.Any])
      
      inline def setSourceYUndefined: Self = StObject.set(x, "sourceY", js.undefined)
    }
  }
  
  /* Inlined downscale.downscale.DownscaleOptions & {  returnCanvas :true} */
  trait DownscaleOptionsreturnCan extends StObject {
    
    var imageType: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var returnBlob: js.UndefOr[Boolean] = js.undefined
    
    var returnCanvas: js.UndefOr[Boolean] & `true`
    
    var sourceX: js.UndefOr[Double] = js.undefined
    
    var sourceY: js.UndefOr[Double] = js.undefined
  }
  object DownscaleOptionsreturnCan {
    
    inline def apply(returnCanvas: js.UndefOr[Boolean] & `true`): DownscaleOptionsreturnCan = {
      val __obj = js.Dynamic.literal(returnCanvas = returnCanvas.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownscaleOptionsreturnCan]
    }
    
    extension [Self <: DownscaleOptionsreturnCan](x: Self) {
      
      inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setReturnBlob(value: Boolean): Self = StObject.set(x, "returnBlob", value.asInstanceOf[js.Any])
      
      inline def setReturnBlobUndefined: Self = StObject.set(x, "returnBlob", js.undefined)
      
      inline def setReturnCanvas(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "returnCanvas", value.asInstanceOf[js.Any])
      
      inline def setSourceX(value: Double): Self = StObject.set(x, "sourceX", value.asInstanceOf[js.Any])
      
      inline def setSourceXUndefined: Self = StObject.set(x, "sourceX", js.undefined)
      
      inline def setSourceY(value: Double): Self = StObject.set(x, "sourceY", value.asInstanceOf[js.Any])
      
      inline def setSourceYUndefined: Self = StObject.set(x, "sourceY", js.undefined)
    }
  }
}
