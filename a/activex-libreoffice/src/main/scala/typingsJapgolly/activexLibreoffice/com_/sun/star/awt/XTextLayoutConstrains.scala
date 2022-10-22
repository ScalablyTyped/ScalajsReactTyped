package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the layout constraints for a text field. */
trait XTextLayoutConstrains
  extends StObject
     with XInterface {
  
  /** returns the ideal number of columns and lines for displaying this text. */
  def getColumnsAndLines(nCols: js.Array[Double], nLines: js.Array[Double]): Unit
  
  /** returns the minimum size for a given number of columns and lines. */
  def getMinimumSize(nCols: Double, nLines: Double): Size
}
object XTextLayoutConstrains {
  
  inline def apply(
    acquire: Callback,
    getColumnsAndLines: (js.Array[Double], js.Array[Double]) => Callback,
    getMinimumSize: (Double, Double) => Size,
    queryInterface: `type` => Any,
    release: Callback
  ): XTextLayoutConstrains = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getColumnsAndLines = js.Any.fromFunction2((t0: js.Array[Double], t1: js.Array[Double]) => (getColumnsAndLines(t0, t1)).runNow()), getMinimumSize = js.Any.fromFunction2(getMinimumSize), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextLayoutConstrains]
  }
  
  extension [Self <: XTextLayoutConstrains](x: Self) {
    
    inline def setGetColumnsAndLines(value: (js.Array[Double], js.Array[Double]) => Callback): Self = StObject.set(x, "getColumnsAndLines", js.Any.fromFunction2((t0: js.Array[Double], t1: js.Array[Double]) => (value(t0, t1)).runNow()))
    
    inline def setGetMinimumSize(value: (Double, Double) => Size): Self = StObject.set(x, "getMinimumSize", js.Any.fromFunction2(value))
  }
}
