package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a listener which is to be notified about state changes in a grid control
  * @see XGridControl
  * @since OOo 3.1
  */
trait XGridControlListener
  extends StObject
     with XEventListener {
  
  /**
    * called when the current column in a grid control changed
    * @see XGrid.getCurrentColumnPosition
    */
  def columnChanged(event: EventObject): Unit
}
object XGridControlListener {
  
  inline def apply(
    acquire: Callback,
    columnChanged: EventObject => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XGridControlListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, columnChanged = js.Any.fromFunction1((t0: EventObject) => columnChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XGridControlListener]
  }
  
  extension [Self <: XGridControlListener](x: Self) {
    
    inline def setColumnChanged(value: EventObject => Callback): Self = StObject.set(x, "columnChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
