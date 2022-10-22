package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.XBitmap
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transition interface to render custom transitions over time.
  * @since OOo 2.4
  */
trait XTransition
  extends StObject
     with XInterface {
  
  /**
    * Update transition on screen to given time state.
    * @param t Time on the transition timeline to display. Must be in the [0,1] range.
    */
  def update(t: Double): Unit
  
  def viewChanged(view: XSlideShowView, leavingBitmap: XBitmap, enteringBitmap: XBitmap): Unit
}
object XTransition {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    update: Double => Callback,
    viewChanged: (XSlideShowView, XBitmap, XBitmap) => Callback
  ): XTransition = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, update = js.Any.fromFunction1((t0: Double) => update(t0).runNow()), viewChanged = js.Any.fromFunction3((t0: XSlideShowView, t1: XBitmap, t2: XBitmap) => (viewChanged(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XTransition]
  }
  
  extension [Self <: XTransition](x: Self) {
    
    inline def setUpdate(value: Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setViewChanged(value: (XSlideShowView, XBitmap, XBitmap) => Callback): Self = StObject.set(x, "viewChanged", js.Any.fromFunction3((t0: XSlideShowView, t1: XBitmap, t2: XBitmap) => (value(t0, t1, t2)).runNow()))
  }
}
