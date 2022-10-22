package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends the {@link XFont} interface and provides additional information for a font.
  * @since OOo 3.0
  */
trait XFont2
  extends StObject
     with XFont {
  
  /**
    * checks whether or not this font has all the glyphs for the text specified by aText.
    * @param aText The specified text for which glyphs are needed.
    * @returns Returns whether or not this font has all the glyphs for the specified text.
    */
  def hasGlyphs(aText: String): Boolean
}
object XFont2 {
  
  inline def apply(
    FontDescriptor: FontDescriptor,
    FontMetric: SimpleFontMetric,
    acquire: Callback,
    getCharWidth: String => Double,
    getCharWidths: (String, String) => SafeArray[Double],
    getFontDescriptor: CallbackTo[FontDescriptor],
    getFontMetric: CallbackTo[SimpleFontMetric],
    getKernPairs: (js.Array[SeqEquiv[String]], js.Array[SeqEquiv[String]], js.Array[SeqEquiv[Double]]) => Callback,
    getStringWidth: String => Double,
    getStringWidthArray: (String, js.Array[SeqEquiv[Double]]) => Double,
    hasGlyphs: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XFont2 = {
    val __obj = js.Dynamic.literal(FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontMetric = FontMetric.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCharWidth = js.Any.fromFunction1(getCharWidth), getCharWidths = js.Any.fromFunction2(getCharWidths), getFontDescriptor = getFontDescriptor.toJsFn, getFontMetric = getFontMetric.toJsFn, getKernPairs = js.Any.fromFunction3((t0: js.Array[SeqEquiv[String]], t1: js.Array[SeqEquiv[String]], t2: js.Array[SeqEquiv[Double]]) => (getKernPairs(t0, t1, t2)).runNow()), getStringWidth = js.Any.fromFunction1(getStringWidth), getStringWidthArray = js.Any.fromFunction2(getStringWidthArray), hasGlyphs = js.Any.fromFunction1(hasGlyphs), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFont2]
  }
  
  extension [Self <: XFont2](x: Self) {
    
    inline def setHasGlyphs(value: String => Boolean): Self = StObject.set(x, "hasGlyphs", js.Any.fromFunction1(value))
  }
}
