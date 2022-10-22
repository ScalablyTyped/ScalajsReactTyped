package typingsJapgolly.fabric.fabricImplMod

import typingsJapgolly.fabric.anon.FromObject
import typingsJapgolly.fabric.anon.Instantiable
import typingsJapgolly.fabric.anon.InstantiableFromObject
import typingsJapgolly.fabric.anon.InstantiableIBrightnessFilter
import typingsJapgolly.fabric.anon.InstantiableIColorMatrix
import typingsJapgolly.fabric.anon.InstantiableIContrastFilter
import typingsJapgolly.fabric.anon.InstantiableIConvoluteFilter
import typingsJapgolly.fabric.anon.InstantiableIGradientTransparencyFilter
import typingsJapgolly.fabric.anon.InstantiableIGrayscaleFilter
import typingsJapgolly.fabric.anon.InstantiableIInvertFilter
import typingsJapgolly.fabric.anon.InstantiableIMaskFilter
import typingsJapgolly.fabric.anon.InstantiableIMultiplyFilter
import typingsJapgolly.fabric.anon.InstantiableINoiseFilter
import typingsJapgolly.fabric.anon.InstantiableIPixelateFilter
import typingsJapgolly.fabric.anon.InstantiableIRemoveWhiteFilter
import typingsJapgolly.fabric.anon.InstantiableIResizeFilter
import typingsJapgolly.fabric.anon.InstantiableISaturationFilter
import typingsJapgolly.fabric.anon.InstantiableISepia2Filter
import typingsJapgolly.fabric.anon.InstantiableISepiaFilter
import typingsJapgolly.fabric.anon.InstantiableITintFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
trait IAllFilters extends StObject {
  
  var BaseFilter: Instantiable
  
  var BlendColor: FromObject
  
  var BlendImage: InstantiableFromObject
  
  var Brightness: InstantiableIBrightnessFilter
  
  var ColorMatrix: InstantiableIColorMatrix
  
  var Contrast: InstantiableIContrastFilter
  
  var Convolute: InstantiableIConvoluteFilter
  
  var GradientTransparency: InstantiableIGradientTransparencyFilter
  
  var Grayscale: InstantiableIGrayscaleFilter
  
  var Invert: InstantiableIInvertFilter
  
  var Mask: InstantiableIMaskFilter
  
  var Multiply: InstantiableIMultiplyFilter
  
  var Noise: InstantiableINoiseFilter
  
  var Pixelate: InstantiableIPixelateFilter
  
  var RemoveWhite: InstantiableIRemoveWhiteFilter
  
  var Resize: InstantiableIResizeFilter
  
  var Saturation: InstantiableISaturationFilter
  
  var Sepia: InstantiableISepiaFilter
  
  var Sepia2: InstantiableISepia2Filter
  
  var Tint: InstantiableITintFilter
}
object IAllFilters {
  
  inline def apply(
    BaseFilter: Instantiable,
    BlendColor: FromObject,
    BlendImage: InstantiableFromObject,
    Brightness: InstantiableIBrightnessFilter,
    ColorMatrix: InstantiableIColorMatrix,
    Contrast: InstantiableIContrastFilter,
    Convolute: InstantiableIConvoluteFilter,
    GradientTransparency: InstantiableIGradientTransparencyFilter,
    Grayscale: InstantiableIGrayscaleFilter,
    Invert: InstantiableIInvertFilter,
    Mask: InstantiableIMaskFilter,
    Multiply: InstantiableIMultiplyFilter,
    Noise: InstantiableINoiseFilter,
    Pixelate: InstantiableIPixelateFilter,
    RemoveWhite: InstantiableIRemoveWhiteFilter,
    Resize: InstantiableIResizeFilter,
    Saturation: InstantiableISaturationFilter,
    Sepia: InstantiableISepiaFilter,
    Sepia2: InstantiableISepia2Filter,
    Tint: InstantiableITintFilter
  ): IAllFilters = {
    val __obj = js.Dynamic.literal(BaseFilter = BaseFilter.asInstanceOf[js.Any], BlendColor = BlendColor.asInstanceOf[js.Any], BlendImage = BlendImage.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorMatrix = ColorMatrix.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Convolute = Convolute.asInstanceOf[js.Any], GradientTransparency = GradientTransparency.asInstanceOf[js.Any], Grayscale = Grayscale.asInstanceOf[js.Any], Invert = Invert.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any], Multiply = Multiply.asInstanceOf[js.Any], Noise = Noise.asInstanceOf[js.Any], Pixelate = Pixelate.asInstanceOf[js.Any], RemoveWhite = RemoveWhite.asInstanceOf[js.Any], Resize = Resize.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], Sepia = Sepia.asInstanceOf[js.Any], Sepia2 = Sepia2.asInstanceOf[js.Any], Tint = Tint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAllFilters]
  }
  
  extension [Self <: IAllFilters](x: Self) {
    
    inline def setBaseFilter(value: Instantiable): Self = StObject.set(x, "BaseFilter", value.asInstanceOf[js.Any])
    
    inline def setBlendColor(value: FromObject): Self = StObject.set(x, "BlendColor", value.asInstanceOf[js.Any])
    
    inline def setBlendImage(value: InstantiableFromObject): Self = StObject.set(x, "BlendImage", value.asInstanceOf[js.Any])
    
    inline def setBrightness(value: InstantiableIBrightnessFilter): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    inline def setColorMatrix(value: InstantiableIColorMatrix): Self = StObject.set(x, "ColorMatrix", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: InstantiableIContrastFilter): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    inline def setConvolute(value: InstantiableIConvoluteFilter): Self = StObject.set(x, "Convolute", value.asInstanceOf[js.Any])
    
    inline def setGradientTransparency(value: InstantiableIGradientTransparencyFilter): Self = StObject.set(x, "GradientTransparency", value.asInstanceOf[js.Any])
    
    inline def setGrayscale(value: InstantiableIGrayscaleFilter): Self = StObject.set(x, "Grayscale", value.asInstanceOf[js.Any])
    
    inline def setInvert(value: InstantiableIInvertFilter): Self = StObject.set(x, "Invert", value.asInstanceOf[js.Any])
    
    inline def setMask(value: InstantiableIMaskFilter): Self = StObject.set(x, "Mask", value.asInstanceOf[js.Any])
    
    inline def setMultiply(value: InstantiableIMultiplyFilter): Self = StObject.set(x, "Multiply", value.asInstanceOf[js.Any])
    
    inline def setNoise(value: InstantiableINoiseFilter): Self = StObject.set(x, "Noise", value.asInstanceOf[js.Any])
    
    inline def setPixelate(value: InstantiableIPixelateFilter): Self = StObject.set(x, "Pixelate", value.asInstanceOf[js.Any])
    
    inline def setRemoveWhite(value: InstantiableIRemoveWhiteFilter): Self = StObject.set(x, "RemoveWhite", value.asInstanceOf[js.Any])
    
    inline def setResize(value: InstantiableIResizeFilter): Self = StObject.set(x, "Resize", value.asInstanceOf[js.Any])
    
    inline def setSaturation(value: InstantiableISaturationFilter): Self = StObject.set(x, "Saturation", value.asInstanceOf[js.Any])
    
    inline def setSepia(value: InstantiableISepiaFilter): Self = StObject.set(x, "Sepia", value.asInstanceOf[js.Any])
    
    inline def setSepia2(value: InstantiableISepia2Filter): Self = StObject.set(x, "Sepia2", value.asInstanceOf[js.Any])
    
    inline def setTint(value: InstantiableITintFilter): Self = StObject.set(x, "Tint", value.asInstanceOf[js.Any])
  }
}
