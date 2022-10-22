package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of this interface is used by the {@link XGridColumnModel} to get notifications about column model changes.
  * @since OOo 3.3
  */
trait XGridColumnListener
  extends StObject
     with XEventListener {
  
  /** Invoked after a column was modified. */
  def columnChanged(event: GridColumnEvent): Unit
}
object XGridColumnListener {
  
  inline def apply(
    acquire: Callback,
    columnChanged: GridColumnEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XGridColumnListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, columnChanged = js.Any.fromFunction1((t0: GridColumnEvent) => columnChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XGridColumnListener]
  }
  
  extension [Self <: XGridColumnListener](x: Self) {
    
    inline def setColumnChanged(value: GridColumnEvent => Callback): Self = StObject.set(x, "columnChanged", js.Any.fromFunction1((t0: GridColumnEvent) => value(t0).runNow()))
  }
}
