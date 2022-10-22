package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables a {@link SpreadsheetView} to freeze columns and rows of the view. */
trait XViewFreezable
  extends StObject
     with XInterface {
  
  /**
    * freezes panes with the specified number of columns and rows.
    *
    * To freeze only horizontally, specify nRows as 0. To freeze only vertically, specify nColumns as 0.
    */
  def freezeAtPosition(nColumns: Double, nRows: Double): Unit
  
  /**
    * returns `TRUE` if the view has frozen panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  def hasFrozenPanes(): Boolean
}
object XViewFreezable {
  
  inline def apply(
    acquire: Callback,
    freezeAtPosition: (Double, Double) => Callback,
    hasFrozenPanes: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XViewFreezable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, freezeAtPosition = js.Any.fromFunction2((t0: Double, t1: Double) => (freezeAtPosition(t0, t1)).runNow()), hasFrozenPanes = hasFrozenPanes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XViewFreezable]
  }
  
  extension [Self <: XViewFreezable](x: Self) {
    
    inline def setFreezeAtPosition(value: (Double, Double) => Callback): Self = StObject.set(x, "freezeAtPosition", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setHasFrozenPanes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasFrozenPanes", value.toJsFn)
  }
}
