package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when a model object changes. */
trait XModifyListener
  extends StObject
     with XEventListener {
  
  /**
    * is called when something changes in the object.
    *
    * Due to such an event, it may be necessary to update views or controllers.
    *
    * The source of the event may be the content of the object to which the listener is registered.
    */
  def modified(aEvent: EventObject): Unit
}
object XModifyListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    modified: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XModifyListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), modified = js.Any.fromFunction1((t0: EventObject) => modified(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XModifyListener]
  }
  
  extension [Self <: XModifyListener](x: Self) {
    
    inline def setModified(value: EventObject => Callback): Self = StObject.set(x, "modified", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
