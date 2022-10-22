package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMtfRenderer
  extends StObject
     with XInterface {
  
  def draw(fScaleX: Double, fScaleY: Double): Unit
  
  def setMetafile(aMtf: SeqEquiv[Double]): Unit
}
object XMtfRenderer {
  
  inline def apply(
    acquire: Callback,
    draw: (Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setMetafile: SeqEquiv[Double] => Callback
  ): XMtfRenderer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setMetafile = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setMetafile(t0).runNow()))
    __obj.asInstanceOf[XMtfRenderer]
  }
  
  extension [Self <: XMtfRenderer](x: Self) {
    
    inline def setDraw(value: (Double, Double) => Callback): Self = StObject.set(x, "draw", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetMetafile(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "setMetafile", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
  }
}
