package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageData
import typingsJapgolly.std.ImageBitmap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.PixelData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromPixelsInputs extends StObject {
  
  var pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap
}
object FromPixelsInputs {
  
  inline def apply(
    pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap
  ): FromPixelsInputs = {
    val __obj = js.Dynamic.literal(pixels = pixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsInputs]
  }
  
  extension [Self <: FromPixelsInputs](x: Self) {
    
    inline def setPixels(
      value: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap
    ): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
  }
}
