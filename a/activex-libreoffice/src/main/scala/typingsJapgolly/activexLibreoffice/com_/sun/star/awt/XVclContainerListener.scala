package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive container events.
  *
  * Container events are provided **only** for notification purposes. The VCL will automatically handle add and remove operations internally.
  * @deprecated Deprecated
  */
trait XVclContainerListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a window has been added to the VCL container window. */
  def windowAdded(e: VclContainerEvent): Unit
  
  /** is invoked when a window has been removed from the VCL container window. */
  def windowRemoved(e: VclContainerEvent): Unit
}
object XVclContainerListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    windowAdded: VclContainerEvent => Callback,
    windowRemoved: VclContainerEvent => Callback
  ): XVclContainerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, windowAdded = js.Any.fromFunction1((t0: VclContainerEvent) => windowAdded(t0).runNow()), windowRemoved = js.Any.fromFunction1((t0: VclContainerEvent) => windowRemoved(t0).runNow()))
    __obj.asInstanceOf[XVclContainerListener]
  }
  
  extension [Self <: XVclContainerListener](x: Self) {
    
    inline def setWindowAdded(value: VclContainerEvent => Callback): Self = StObject.set(x, "windowAdded", js.Any.fromFunction1((t0: VclContainerEvent) => value(t0).runNow()))
    
    inline def setWindowRemoved(value: VclContainerEvent => Callback): Self = StObject.set(x, "windowRemoved", js.Any.fromFunction1((t0: VclContainerEvent) => value(t0).runNow()))
  }
}
