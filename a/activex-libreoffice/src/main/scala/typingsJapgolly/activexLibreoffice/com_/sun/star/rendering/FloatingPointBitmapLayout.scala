package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure describes the memory layout of a bitmap having floating point color channels.
  *
  * This structure collects all necessary information to describe the memory layout of a bitmap having floating point color channels
  * @since OOo 2.0
  */
trait FloatingPointBitmapLayout extends StObject {
  
  var ColorSpace: XColorSpace
  
  /**
    * Endianness of the pixel values.
    *
    * This value must be one of the Endianness constants
    */
  var Endianness: Double
  
  /**
    * Format type of this bitmap.
    *
    * This value must be one of the {@link FloatingPointBitmapFormat} constants.
    */
  var Format: Double
  
  /**
    * Number of color components per pixel.
    *
    * This value must not be negative
    */
  var NumComponents: Double
  
  /**
    * Byte offset between the start of two consecutive planes.
    *
    * This value is permitted to be negative. If this value is zero, the bitmap is assumed to be in chunky format, otherwise it is assumed to be planar. The
    * difference between chunky and planar layout lies in the way how color channels are interleaved. For a chunky format, all channel data for a single
    * pixel lies consecutively in memory. For a planar layout, the first channel of all pixel is stored consecutive, followed by the second channel, and so
    * forth.
    */
  var PlaneStride: Double
  
  /**
    * Number of data bytes per scanline.
    *
    * This value must not be negative
    */
  var ScanLineBytes: Double
  
  /**
    * Byte offset between the start of two consecutive scanlines.
    *
    * This value is permitted to be negative, denoting a bitmap whose content is flipped at the x axis.
    */
  var ScanLineStride: Double
  
  /**
    * Number of scanlines for this bitmap.
    *
    * This value must not be negative
    */
  var ScanLines: Double
}
object FloatingPointBitmapLayout {
  
  inline def apply(
    ColorSpace: XColorSpace,
    Endianness: Double,
    Format: Double,
    NumComponents: Double,
    PlaneStride: Double,
    ScanLineBytes: Double,
    ScanLineStride: Double,
    ScanLines: Double
  ): FloatingPointBitmapLayout = {
    val __obj = js.Dynamic.literal(ColorSpace = ColorSpace.asInstanceOf[js.Any], Endianness = Endianness.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], NumComponents = NumComponents.asInstanceOf[js.Any], PlaneStride = PlaneStride.asInstanceOf[js.Any], ScanLineBytes = ScanLineBytes.asInstanceOf[js.Any], ScanLineStride = ScanLineStride.asInstanceOf[js.Any], ScanLines = ScanLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingPointBitmapLayout]
  }
  
  extension [Self <: FloatingPointBitmapLayout](x: Self) {
    
    inline def setColorSpace(value: XColorSpace): Self = StObject.set(x, "ColorSpace", value.asInstanceOf[js.Any])
    
    inline def setEndianness(value: Double): Self = StObject.set(x, "Endianness", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Double): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setNumComponents(value: Double): Self = StObject.set(x, "NumComponents", value.asInstanceOf[js.Any])
    
    inline def setPlaneStride(value: Double): Self = StObject.set(x, "PlaneStride", value.asInstanceOf[js.Any])
    
    inline def setScanLineBytes(value: Double): Self = StObject.set(x, "ScanLineBytes", value.asInstanceOf[js.Any])
    
    inline def setScanLineStride(value: Double): Self = StObject.set(x, "ScanLineStride", value.asInstanceOf[js.Any])
    
    inline def setScanLines(value: Double): Self = StObject.set(x, "ScanLines", value.asInstanceOf[js.Any])
  }
}
