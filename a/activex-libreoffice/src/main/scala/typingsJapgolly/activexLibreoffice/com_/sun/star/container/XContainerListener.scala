package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** receives events when the content of the related container changes. */
trait XContainerListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a container has inserted an element. */
  def elementInserted(Event: ContainerEvent): Unit
  
  /** is invoked when a container has removed an element. */
  def elementRemoved(Event: ContainerEvent): Unit
  
  /** is invoked when a container has replaced an element. */
  def elementReplaced(Event: ContainerEvent): Unit
}
object XContainerListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    elementInserted: ContainerEvent => Callback,
    elementRemoved: ContainerEvent => Callback,
    elementReplaced: ContainerEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XContainerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), elementInserted = js.Any.fromFunction1((t0: ContainerEvent) => elementInserted(t0).runNow()), elementRemoved = js.Any.fromFunction1((t0: ContainerEvent) => elementRemoved(t0).runNow()), elementReplaced = js.Any.fromFunction1((t0: ContainerEvent) => elementReplaced(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContainerListener]
  }
  
  extension [Self <: XContainerListener](x: Self) {
    
    inline def setElementInserted(value: ContainerEvent => Callback): Self = StObject.set(x, "elementInserted", js.Any.fromFunction1((t0: ContainerEvent) => value(t0).runNow()))
    
    inline def setElementRemoved(value: ContainerEvent => Callback): Self = StObject.set(x, "elementRemoved", js.Any.fromFunction1((t0: ContainerEvent) => value(t0).runNow()))
    
    inline def setElementReplaced(value: ContainerEvent => Callback): Self = StObject.set(x, "elementReplaced", js.Any.fromFunction1((t0: ContainerEvent) => value(t0).runNow()))
  }
}
