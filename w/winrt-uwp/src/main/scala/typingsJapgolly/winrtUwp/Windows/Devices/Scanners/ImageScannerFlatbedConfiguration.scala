package typingsJapgolly.winrtUwp.Windows.Devices.Scanners

import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Flatbed scan source of the scanner. */
trait ImageScannerFlatbedConfiguration extends StObject {
  
  /** Gets the actual horizontal and vertical scan resolution for the Flatbed scanner, in DPI. */
  var actualResolution: ImageScannerResolution
  
  /** Gets or sets the automatic crop mode. */
  var autoCroppingMode: ImageScannerAutoCroppingMode
  
  /** Gets or sets the current brightness level for capturing image data from the scanner's Flatbed. At the beginning of a new scan session, this property is set to the DefaultBrightness property. */
  var brightness: Double
  
  /** Gets the step size at which the brightness levels of the data source can be increased or decreased between the minimum and maximum values. */
  var brightnessStep: Double
  
  /** Gets or sets the color mode for the Flatbed scanner. */
  var colorMode: ImageScannerColorMode
  
  /** Sets or gets the current contrast level for capturing image data from the scan source. At the beginning of a new scan session this property is set to the DefaultContrast property. */
  var contrast: Double
  
  /** Gets the step size at which the contrast levels of the data source can increase or decrease between the minimum and maximum values. */
  var contrastStep: Double
  
  /** Gets the default brightness level for the scanner's Flatbed. */
  var defaultBrightness: Double
  
  /** Gets the default color mode for the scanner's Flatbed. */
  var defaultColorMode: ImageScannerColorMode
  
  /** Gets the default contrast level for the scanner's Flatbed. */
  var defaultContrast: Double
  
  /** Gets the default file format for the scanner's Flatbed at the beginning of a new scan session. */
  var defaultFormat: ImageScannerFormat
  
  /** Gets or sets the horizontal and vertical scan resolution for the scanner's Flatbed that the app requests, in DPI. */
  var desiredResolution: ImageScannerResolution
  
  /** Gets or sets the current file transfer format for image data acquisition from the scanner's Flatbed to the client app. */
  var format: ImageScannerFormat
  
  /**
    * Returns whether the scanner's Flatbed supports the specified ImageScannerAutoCroppingMode .
    * @param value The auto crop mode of the image to scan.
    * @return Indicates whether the device supports value mode.
    */
  def isAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode): Boolean
  
  /**
    * Returns whether the scanner's Flatbed can scan and transfer images in the specified color mode.
    * @param value The color mode.
    * @return Indicates whether the scanner can scan images in value mode.
    */
  def isColorModeSupported(value: ImageScannerColorMode): Boolean
  
  /**
    * Determines whether the scanner's Flatbed supports the specified file format or not.
    * @param value The file type.
    * @return Indicates whether the specified file type is supported.
    */
  def isFormatSupported(value: ImageScannerFormat): Boolean
  
  /** Gets the maximum brightness level supported by the scanner's Flatbed. */
  var maxBrightness: Double
  
  /** Gets the maximum contrast level supported by the scanner's Flatbed. */
  var maxContrast: Double
  
  /** Gets the maximum horizontal and vertical scan resolution of the scanner's Flatbed in DPI. */
  var maxResolution: ImageScannerResolution
  
  /** Gets the maximum scan area dimensions in inches. The maximum scan width is the widest a document can be in order for the scanner's Flatbed to scan it. */
  var maxScanArea: Size
  
  /** Gets the minimum brightness level supported by the scanner's Flatbed. */
  var minBrightness: Double
  
  /** Gets the minimum contrast level supported by the scanner's Flatbed. */
  var minContrast: Double
  
  /** Gets the minimum horizontal and vertical scan resolution of the scanner's Flatbed in DPI. */
  var minResolution: ImageScannerResolution
  
  /** Gets the minimum scan area in inches. The minimum scan area is the smallest size a document can have in order for a Flatbed to scan it. */
  var minScanArea: Size
  
  /** Gets the optical scan resolution of the Flatbed scanner in DPI. */
  var opticalResolution: ImageScannerResolution
  
  /** Gets or sets the origin coordinates (horizontal and vertical) and dimensions (width and height) of the selected scan area, in inches. This property is ignored when the AutoCroppingMode property is not Disabled. */
  var selectedScanRegion: Rect
}
object ImageScannerFlatbedConfiguration {
  
  inline def apply(
    actualResolution: ImageScannerResolution,
    autoCroppingMode: ImageScannerAutoCroppingMode,
    brightness: Double,
    brightnessStep: Double,
    colorMode: ImageScannerColorMode,
    contrast: Double,
    contrastStep: Double,
    defaultBrightness: Double,
    defaultColorMode: ImageScannerColorMode,
    defaultContrast: Double,
    defaultFormat: ImageScannerFormat,
    desiredResolution: ImageScannerResolution,
    format: ImageScannerFormat,
    isAutoCroppingModeSupported: ImageScannerAutoCroppingMode => Boolean,
    isColorModeSupported: ImageScannerColorMode => Boolean,
    isFormatSupported: ImageScannerFormat => Boolean,
    maxBrightness: Double,
    maxContrast: Double,
    maxResolution: ImageScannerResolution,
    maxScanArea: Size,
    minBrightness: Double,
    minContrast: Double,
    minResolution: ImageScannerResolution,
    minScanArea: Size,
    opticalResolution: ImageScannerResolution,
    selectedScanRegion: Rect
  ): ImageScannerFlatbedConfiguration = {
    val __obj = js.Dynamic.literal(actualResolution = actualResolution.asInstanceOf[js.Any], autoCroppingMode = autoCroppingMode.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], brightnessStep = brightnessStep.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], contrastStep = contrastStep.asInstanceOf[js.Any], defaultBrightness = defaultBrightness.asInstanceOf[js.Any], defaultColorMode = defaultColorMode.asInstanceOf[js.Any], defaultContrast = defaultContrast.asInstanceOf[js.Any], defaultFormat = defaultFormat.asInstanceOf[js.Any], desiredResolution = desiredResolution.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isAutoCroppingModeSupported = js.Any.fromFunction1(isAutoCroppingModeSupported), isColorModeSupported = js.Any.fromFunction1(isColorModeSupported), isFormatSupported = js.Any.fromFunction1(isFormatSupported), maxBrightness = maxBrightness.asInstanceOf[js.Any], maxContrast = maxContrast.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], maxScanArea = maxScanArea.asInstanceOf[js.Any], minBrightness = minBrightness.asInstanceOf[js.Any], minContrast = minContrast.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], minScanArea = minScanArea.asInstanceOf[js.Any], opticalResolution = opticalResolution.asInstanceOf[js.Any], selectedScanRegion = selectedScanRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerFlatbedConfiguration]
  }
  
  extension [Self <: ImageScannerFlatbedConfiguration](x: Self) {
    
    inline def setActualResolution(value: ImageScannerResolution): Self = StObject.set(x, "actualResolution", value.asInstanceOf[js.Any])
    
    inline def setAutoCroppingMode(value: ImageScannerAutoCroppingMode): Self = StObject.set(x, "autoCroppingMode", value.asInstanceOf[js.Any])
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessStep(value: Double): Self = StObject.set(x, "brightnessStep", value.asInstanceOf[js.Any])
    
    inline def setColorMode(value: ImageScannerColorMode): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastStep(value: Double): Self = StObject.set(x, "contrastStep", value.asInstanceOf[js.Any])
    
    inline def setDefaultBrightness(value: Double): Self = StObject.set(x, "defaultBrightness", value.asInstanceOf[js.Any])
    
    inline def setDefaultColorMode(value: ImageScannerColorMode): Self = StObject.set(x, "defaultColorMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultContrast(value: Double): Self = StObject.set(x, "defaultContrast", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormat(value: ImageScannerFormat): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
    
    inline def setDesiredResolution(value: ImageScannerResolution): Self = StObject.set(x, "desiredResolution", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ImageScannerFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setIsAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode => Boolean): Self = StObject.set(x, "isAutoCroppingModeSupported", js.Any.fromFunction1(value))
    
    inline def setIsColorModeSupported(value: ImageScannerColorMode => Boolean): Self = StObject.set(x, "isColorModeSupported", js.Any.fromFunction1(value))
    
    inline def setIsFormatSupported(value: ImageScannerFormat => Boolean): Self = StObject.set(x, "isFormatSupported", js.Any.fromFunction1(value))
    
    inline def setMaxBrightness(value: Double): Self = StObject.set(x, "maxBrightness", value.asInstanceOf[js.Any])
    
    inline def setMaxContrast(value: Double): Self = StObject.set(x, "maxContrast", value.asInstanceOf[js.Any])
    
    inline def setMaxResolution(value: ImageScannerResolution): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
    
    inline def setMaxScanArea(value: Size): Self = StObject.set(x, "maxScanArea", value.asInstanceOf[js.Any])
    
    inline def setMinBrightness(value: Double): Self = StObject.set(x, "minBrightness", value.asInstanceOf[js.Any])
    
    inline def setMinContrast(value: Double): Self = StObject.set(x, "minContrast", value.asInstanceOf[js.Any])
    
    inline def setMinResolution(value: ImageScannerResolution): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
    
    inline def setMinScanArea(value: Size): Self = StObject.set(x, "minScanArea", value.asInstanceOf[js.Any])
    
    inline def setOpticalResolution(value: ImageScannerResolution): Self = StObject.set(x, "opticalResolution", value.asInstanceOf[js.Any])
    
    inline def setSelectedScanRegion(value: Rect): Self = StObject.set(x, "selectedScanRegion", value.asInstanceOf[js.Any])
  }
}
