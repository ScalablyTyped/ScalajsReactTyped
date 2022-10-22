package typingsJapgolly.activexLibreoffice.com_.sun.star.lang

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** base interface for all event listeners interfaces. */
trait XEventListener
  extends StObject
     with XInterface {
  
  /**
    * gets called when the broadcaster is about to be disposed.
    *
    * All listeners and all other objects, which reference the broadcaster should release the reference to the source. No method should be invoked anymore
    * on this object ( including {@link XComponent.removeEventListener()} ).
    *
    * This method is called for every listener registration of derived listener interfaced, not only for registrations at {@link XComponent} .
    */
  def disposing(Source: EventObject): Unit
}
object XEventListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEventListener]
  }
  
  extension [Self <: XEventListener](x: Self) {
    
    inline def setDisposing(value: EventObject => Callback): Self = StObject.set(x, "disposing", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
