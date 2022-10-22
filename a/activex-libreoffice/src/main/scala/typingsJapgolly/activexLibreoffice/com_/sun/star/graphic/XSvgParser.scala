package typingsJapgolly.activexLibreoffice.com_.sun.star.graphic

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link XSvgParser} interface
  *
  * This interface allows to parse a SVG stream in form of a sequence of bytes to be parsed into a sequence of XPrimitive2Ds
  */
trait XSvgParser
  extends StObject
     with XInterface {
  
  /**
    * Retrieve decomposed list of simpler primitives
    * @param xSvgStream The file containing the SVG XML data
    * @param aAbsolutePath The path containing the SVG XML data
    */
  def getDecomposition(xSvgStream: XInputStream, aAbsolutePath: String): SafeArray[XPrimitive2D]
}
object XSvgParser {
  
  inline def apply(
    acquire: Callback,
    getDecomposition: (XInputStream, String) => SafeArray[XPrimitive2D],
    queryInterface: `type` => Any,
    release: Callback
  ): XSvgParser = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getDecomposition = js.Any.fromFunction2(getDecomposition), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSvgParser]
  }
  
  extension [Self <: XSvgParser](x: Self) {
    
    inline def setGetDecomposition(value: (XInputStream, String) => SafeArray[XPrimitive2D]): Self = StObject.set(x, "getDecomposition", js.Any.fromFunction2(value))
  }
}
