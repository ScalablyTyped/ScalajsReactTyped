package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive paint events. */
trait XPaintListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a region of the window became invalid, e.g. when another window has been moved away. */
  def windowPaint(e: PaintEvent): Unit
}
object XPaintListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    windowPaint: PaintEvent => Callback
  ): XPaintListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, windowPaint = js.Any.fromFunction1((t0: PaintEvent) => windowPaint(t0).runNow()))
    __obj.asInstanceOf[XPaintListener]
  }
  
  extension [Self <: XPaintListener](x: Self) {
    
    inline def setWindowPaint(value: PaintEvent => Callback): Self = StObject.set(x, "windowPaint", js.Any.fromFunction1((t0: PaintEvent) => value(t0).runNow()))
  }
}
