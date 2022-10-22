package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides access to a specific, XCanvas-dependent font incarnation. This font is not universally usable, but belongs to the {@link
  * XCanvas} it was queried from.
  */
trait XCanvasFont
  extends StObject
     with XInterface {
  
  /**
    * Query the list of available font sizes.
    *
    * This method queries the list of available font sizes (in device units) for this font. For scalable fonts that are not restricted to discrete sizes,
    * this list is **empty** , meaning that every size is possible. Fonts that **do** restrict the device size to certain discrete values, setting an
    * overall transformation that scales the {@link FontRequest.CellSize} to something not contained in the list returned by this method can lead to visible
    * disturbances.
    */
  val AvailableSizes: SafeArray[Double]
  
  /** Query the list of additional font properties. */
  val ExtraFontProperties: SafeArray[PropertyValue]
  
  /**
    * Query metric information about the font, that is generic to all its glyphs.
    *
    * Note that the metric values in the returned result are in the font coordinate system, i.e. relative to the corresponding size of this font. That is,
    * when this font was created with a cell size of 20 units, the metrics returned are calculated relative to this size.
    */
  val FontMetrics: typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.FontMetrics
  
  /** Query the {@link FontRequest} that was used to generate this object. */
  val FontRequest: typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.FontRequest
  
  /**
    * Create a text layout interface.
    *
    * Create a text layout interface for the given string, using this font to generate the glyphs from.
    * @param aText The text to layout.
    * @param nDirection Main text direction for the string specified. The main text direction is e.g. important for characters that are not strong, i.e. that
    * @param nRandomSeed Optional random seed for OpenType glyph variations.
    */
  def createTextLayout(aText: StringContext, nDirection: Double, nRandomSeed: Double): XTextLayout
  
  /**
    * Query the list of available font sizes.
    *
    * This method queries the list of available font sizes (in device units) for this font. For scalable fonts that are not restricted to discrete sizes,
    * this list is **empty** , meaning that every size is possible. Fonts that **do** restrict the device size to certain discrete values, setting an
    * overall transformation that scales the {@link FontRequest.CellSize} to something not contained in the list returned by this method can lead to visible
    * disturbances.
    */
  def getAvailableSizes(): SafeArray[Double]
  
  /** Query the list of additional font properties. */
  def getExtraFontProperties(): SafeArray[PropertyValue]
  
  /**
    * Query metric information about the font, that is generic to all its glyphs.
    *
    * Note that the metric values in the returned result are in the font coordinate system, i.e. relative to the corresponding size of this font. That is,
    * when this font was created with a cell size of 20 units, the metrics returned are calculated relative to this size.
    */
  def getFontMetrics(): typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.FontMetrics
  
  /** Query the {@link FontRequest} that was used to generate this object. */
  def getFontRequest(): typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.FontRequest
}
object XCanvasFont {
  
  inline def apply(
    AvailableSizes: SafeArray[Double],
    ExtraFontProperties: SafeArray[PropertyValue],
    FontMetrics: FontMetrics,
    FontRequest: FontRequest,
    acquire: Callback,
    createTextLayout: (StringContext, Double, Double) => XTextLayout,
    getAvailableSizes: CallbackTo[SafeArray[Double]],
    getExtraFontProperties: CallbackTo[SafeArray[PropertyValue]],
    getFontMetrics: CallbackTo[FontMetrics],
    getFontRequest: CallbackTo[FontRequest],
    queryInterface: `type` => Any,
    release: Callback
  ): XCanvasFont = {
    val __obj = js.Dynamic.literal(AvailableSizes = AvailableSizes.asInstanceOf[js.Any], ExtraFontProperties = ExtraFontProperties.asInstanceOf[js.Any], FontMetrics = FontMetrics.asInstanceOf[js.Any], FontRequest = FontRequest.asInstanceOf[js.Any], acquire = acquire.toJsFn, createTextLayout = js.Any.fromFunction3(createTextLayout), getAvailableSizes = getAvailableSizes.toJsFn, getExtraFontProperties = getExtraFontProperties.toJsFn, getFontMetrics = getFontMetrics.toJsFn, getFontRequest = getFontRequest.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCanvasFont]
  }
  
  extension [Self <: XCanvasFont](x: Self) {
    
    inline def setAvailableSizes(value: SafeArray[Double]): Self = StObject.set(x, "AvailableSizes", value.asInstanceOf[js.Any])
    
    inline def setCreateTextLayout(value: (StringContext, Double, Double) => XTextLayout): Self = StObject.set(x, "createTextLayout", js.Any.fromFunction3(value))
    
    inline def setExtraFontProperties(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ExtraFontProperties", value.asInstanceOf[js.Any])
    
    inline def setFontMetrics(value: FontMetrics): Self = StObject.set(x, "FontMetrics", value.asInstanceOf[js.Any])
    
    inline def setFontRequest(value: FontRequest): Self = StObject.set(x, "FontRequest", value.asInstanceOf[js.Any])
    
    inline def setGetAvailableSizes(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getAvailableSizes", value.toJsFn)
    
    inline def setGetExtraFontProperties(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getExtraFontProperties", value.toJsFn)
    
    inline def setGetFontMetrics(value: CallbackTo[FontMetrics]): Self = StObject.set(x, "getFontMetrics", value.toJsFn)
    
    inline def setGetFontRequest(value: CallbackTo[FontRequest]): Self = StObject.set(x, "getFontRequest", value.toJsFn)
  }
}
