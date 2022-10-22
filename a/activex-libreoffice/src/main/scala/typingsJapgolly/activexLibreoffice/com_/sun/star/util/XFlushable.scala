package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects with data that can be flushed to a data source. */
trait XFlushable
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive event "flushed." */
  def addFlushListener(l: XFlushListener): Unit
  
  /** flushes the data of the object to the connected data source. */
  def flush(): Unit
  
  /** removes the specified listener. */
  def removeFlushListener(l: XFlushListener): Unit
}
object XFlushable {
  
  inline def apply(
    acquire: Callback,
    addFlushListener: XFlushListener => Callback,
    flush: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeFlushListener: XFlushListener => Callback
  ): XFlushable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addFlushListener = js.Any.fromFunction1((t0: XFlushListener) => addFlushListener(t0).runNow()), flush = flush.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeFlushListener = js.Any.fromFunction1((t0: XFlushListener) => removeFlushListener(t0).runNow()))
    __obj.asInstanceOf[XFlushable]
  }
  
  extension [Self <: XFlushable](x: Self) {
    
    inline def setAddFlushListener(value: XFlushListener => Callback): Self = StObject.set(x, "addFlushListener", js.Any.fromFunction1((t0: XFlushListener) => value(t0).runNow()))
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setRemoveFlushListener(value: XFlushListener => Callback): Self = StObject.set(x, "removeFlushListener", js.Any.fromFunction1((t0: XFlushListener) => value(t0).runNow()))
  }
}
