package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MtfRenderer
  extends StObject
     with XMtfRenderer {
  
  def createWithBitmapCanvas(Canvas: XBitmapCanvas): Unit
}
object MtfRenderer {
  
  inline def apply(
    acquire: Callback,
    createWithBitmapCanvas: XBitmapCanvas => Callback,
    draw: (Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setMetafile: SeqEquiv[Double] => Callback
  ): MtfRenderer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createWithBitmapCanvas = js.Any.fromFunction1((t0: XBitmapCanvas) => createWithBitmapCanvas(t0).runNow()), draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setMetafile = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setMetafile(t0).runNow()))
    __obj.asInstanceOf[MtfRenderer]
  }
  
  extension [Self <: MtfRenderer](x: Self) {
    
    inline def setCreateWithBitmapCanvas(value: XBitmapCanvas => Callback): Self = StObject.set(x, "createWithBitmapCanvas", js.Any.fromFunction1((t0: XBitmapCanvas) => value(t0).runNow()))
  }
}
