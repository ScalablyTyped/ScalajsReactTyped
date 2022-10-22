package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events from a component when the state of an item changes. */
trait XItemListener
  extends StObject
     with XEventListener {
  
  /** is invoked when an item changes its state. */
  def itemStateChanged(rEvent: ItemEvent): Unit
}
object XItemListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    itemStateChanged: ItemEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XItemListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), itemStateChanged = js.Any.fromFunction1((t0: ItemEvent) => itemStateChanged(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XItemListener]
  }
  
  extension [Self <: XItemListener](x: Self) {
    
    inline def setItemStateChanged(value: ItemEvent => Callback): Self = StObject.set(x, "itemStateChanged", js.Any.fromFunction1((t0: ItemEvent) => value(t0).runNow()))
  }
}
