package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to listen to border resize events of a controller. */
trait XBorderResizeListener
  extends StObject
     with XEventListener {
  
  /**
    * notifies the listener that the controller's border widths have been changed.
    * @param Object reference to the object representing the controller
    * @param NewSize the new widths of the controller's border
    */
  def borderWidthsChanged(Object: XInterface, NewSize: BorderWidths): Unit
}
object XBorderResizeListener {
  
  inline def apply(
    acquire: Callback,
    borderWidthsChanged: (XInterface, BorderWidths) => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XBorderResizeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, borderWidthsChanged = js.Any.fromFunction2((t0: XInterface, t1: BorderWidths) => (borderWidthsChanged(t0, t1)).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XBorderResizeListener]
  }
  
  extension [Self <: XBorderResizeListener](x: Self) {
    
    inline def setBorderWidthsChanged(value: (XInterface, BorderWidths) => Callback): Self = StObject.set(x, "borderWidthsChanged", js.Any.fromFunction2((t0: XInterface, t1: BorderWidths) => (value(t0, t1)).runNow()))
  }
}
