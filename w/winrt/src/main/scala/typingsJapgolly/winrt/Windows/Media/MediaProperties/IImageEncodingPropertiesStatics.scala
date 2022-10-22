package typingsJapgolly.winrt.Windows.Media.MediaProperties

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImageEncodingPropertiesStatics extends StObject {
  
  def createJpeg(): ImageEncodingProperties
  
  def createJpegXR(): ImageEncodingProperties
  
  def createPng(): ImageEncodingProperties
}
object IImageEncodingPropertiesStatics {
  
  inline def apply(
    createJpeg: CallbackTo[ImageEncodingProperties],
    createJpegXR: CallbackTo[ImageEncodingProperties],
    createPng: CallbackTo[ImageEncodingProperties]
  ): IImageEncodingPropertiesStatics = {
    val __obj = js.Dynamic.literal(createJpeg = createJpeg.toJsFn, createJpegXR = createJpegXR.toJsFn, createPng = createPng.toJsFn)
    __obj.asInstanceOf[IImageEncodingPropertiesStatics]
  }
  
  extension [Self <: IImageEncodingPropertiesStatics](x: Self) {
    
    inline def setCreateJpeg(value: CallbackTo[ImageEncodingProperties]): Self = StObject.set(x, "createJpeg", value.toJsFn)
    
    inline def setCreateJpegXR(value: CallbackTo[ImageEncodingProperties]): Self = StObject.set(x, "createJpegXR", value.toJsFn)
    
    inline def setCreatePng(value: CallbackTo[ImageEncodingProperties]): Self = StObject.set(x, "createPng", value.toJsFn)
  }
}
