package typingsJapgolly.fabric.fabricImplMod

import typingsJapgolly.fabric.AnonFromObject
import typingsJapgolly.fabric.AnonInstantiable
import typingsJapgolly.fabric.AnonInstantiableFromObject
import typingsJapgolly.fabric.AnonInstantiableIBrightnessFilter
import typingsJapgolly.fabric.AnonInstantiableIColorMatrix
import typingsJapgolly.fabric.AnonInstantiableIContrastFilter
import typingsJapgolly.fabric.AnonInstantiableIConvoluteFilter
import typingsJapgolly.fabric.AnonInstantiableIGradientTransparencyFilter
import typingsJapgolly.fabric.AnonInstantiableIGrayscaleFilter
import typingsJapgolly.fabric.AnonInstantiableIInvertFilter
import typingsJapgolly.fabric.AnonInstantiableIMaskFilter
import typingsJapgolly.fabric.AnonInstantiableIMultiplyFilter
import typingsJapgolly.fabric.AnonInstantiableINoiseFilter
import typingsJapgolly.fabric.AnonInstantiableIPixelateFilter
import typingsJapgolly.fabric.AnonInstantiableIRemoveWhiteFilter
import typingsJapgolly.fabric.AnonInstantiableIResizeFilter
import typingsJapgolly.fabric.AnonInstantiableISaturationFilter
import typingsJapgolly.fabric.AnonInstantiableISepia2Filter
import typingsJapgolly.fabric.AnonInstantiableISepiaFilter
import typingsJapgolly.fabric.AnonInstantiableITintFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
trait IAllFilters extends js.Object {
  var BaseFilter: AnonInstantiable
  var BlendColor: AnonFromObject
  var BlendImage: AnonInstantiableFromObject
  var Brightness: AnonInstantiableIBrightnessFilter
  var ColorMatrix: AnonInstantiableIColorMatrix
  var Contrast: AnonInstantiableIContrastFilter
  var Convolute: AnonInstantiableIConvoluteFilter
  var GradientTransparency: AnonInstantiableIGradientTransparencyFilter
  var Grayscale: AnonInstantiableIGrayscaleFilter
  var Invert: AnonInstantiableIInvertFilter
  var Mask: AnonInstantiableIMaskFilter
  var Multiply: AnonInstantiableIMultiplyFilter
  var Noise: AnonInstantiableINoiseFilter
  var Pixelate: AnonInstantiableIPixelateFilter
  var RemoveWhite: AnonInstantiableIRemoveWhiteFilter
  var Resize: AnonInstantiableIResizeFilter
  var Saturation: AnonInstantiableISaturationFilter
  var Sepia: AnonInstantiableISepiaFilter
  var Sepia2: AnonInstantiableISepia2Filter
  var Tint: AnonInstantiableITintFilter
}

object IAllFilters {
  @scala.inline
  def apply(
    BaseFilter: AnonInstantiable,
    BlendColor: AnonFromObject,
    BlendImage: AnonInstantiableFromObject,
    Brightness: AnonInstantiableIBrightnessFilter,
    ColorMatrix: AnonInstantiableIColorMatrix,
    Contrast: AnonInstantiableIContrastFilter,
    Convolute: AnonInstantiableIConvoluteFilter,
    GradientTransparency: AnonInstantiableIGradientTransparencyFilter,
    Grayscale: AnonInstantiableIGrayscaleFilter,
    Invert: AnonInstantiableIInvertFilter,
    Mask: AnonInstantiableIMaskFilter,
    Multiply: AnonInstantiableIMultiplyFilter,
    Noise: AnonInstantiableINoiseFilter,
    Pixelate: AnonInstantiableIPixelateFilter,
    RemoveWhite: AnonInstantiableIRemoveWhiteFilter,
    Resize: AnonInstantiableIResizeFilter,
    Saturation: AnonInstantiableISaturationFilter,
    Sepia: AnonInstantiableISepiaFilter,
    Sepia2: AnonInstantiableISepia2Filter,
    Tint: AnonInstantiableITintFilter
  ): IAllFilters = {
    val __obj = js.Dynamic.literal(BaseFilter = BaseFilter.asInstanceOf[js.Any], BlendColor = BlendColor.asInstanceOf[js.Any], BlendImage = BlendImage.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorMatrix = ColorMatrix.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Convolute = Convolute.asInstanceOf[js.Any], GradientTransparency = GradientTransparency.asInstanceOf[js.Any], Grayscale = Grayscale.asInstanceOf[js.Any], Invert = Invert.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any], Multiply = Multiply.asInstanceOf[js.Any], Noise = Noise.asInstanceOf[js.Any], Pixelate = Pixelate.asInstanceOf[js.Any], RemoveWhite = RemoveWhite.asInstanceOf[js.Any], Resize = Resize.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], Sepia = Sepia.asInstanceOf[js.Any], Sepia2 = Sepia2.asInstanceOf[js.Any], Tint = Tint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAllFilters]
  }
}

