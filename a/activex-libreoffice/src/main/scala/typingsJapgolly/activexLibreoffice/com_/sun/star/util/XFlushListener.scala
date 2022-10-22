package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive **flushed** events. */
trait XFlushListener
  extends StObject
     with XEventListener {
  
  /** is called when the object data is flushed. */
  def flushed(rEvent: EventObject): Unit
}
object XFlushListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    flushed: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XFlushListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), flushed = js.Any.fromFunction1((t0: EventObject) => flushed(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFlushListener]
  }
  
  extension [Self <: XFlushListener](x: Self) {
    
    inline def setFlushed(value: EventObject => Callback): Self = StObject.set(x, "flushed", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
