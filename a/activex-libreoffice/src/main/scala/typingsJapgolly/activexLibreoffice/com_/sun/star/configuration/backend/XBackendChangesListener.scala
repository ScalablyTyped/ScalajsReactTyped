package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notification from backend broadcaster objects.
  * @see XBackendChangesNotifier
  */
trait XBackendChangesListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when component data in backend source changes
    * @param Event Event indicating the component data change
    */
  def componentDataChanged(Event: ComponentChangeEvent): Unit
}
object XBackendChangesListener {
  
  inline def apply(
    acquire: Callback,
    componentDataChanged: ComponentChangeEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XBackendChangesListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, componentDataChanged = js.Any.fromFunction1((t0: ComponentChangeEvent) => componentDataChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XBackendChangesListener]
  }
  
  extension [Self <: XBackendChangesListener](x: Self) {
    
    inline def setComponentDataChanged(value: ComponentChangeEvent => Callback): Self = StObject.set(x, "componentDataChanged", js.Any.fromFunction1((t0: ComponentChangeEvent) => value(t0).runNow()))
  }
}
