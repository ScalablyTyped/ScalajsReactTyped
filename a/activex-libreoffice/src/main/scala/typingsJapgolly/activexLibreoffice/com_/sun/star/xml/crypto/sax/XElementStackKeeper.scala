package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manipulate the "key SAX events" in a SAX event stream. */
trait XElementStackKeeper
  extends StObject
     with XInterface {
  
  /**
    * Transfers the buffered key SAX events to a document handler.
    *
    * All transferred events are removed from the buffer.
    * @param handler the document to receive key SAX events
    * @param includingTheLastEvent whether to transfer the last key SAX event
    */
  def retrieve(handler: XDocumentHandler, includingTheLastEvent: Boolean): Unit
  
  /** Starts to buffer key SAX events. */
  def start(): Unit
  
  /** Stops buffering key SAX events. */
  def stop(): Unit
}
object XElementStackKeeper {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    retrieve: (XDocumentHandler, Boolean) => Callback,
    start: Callback,
    stop: Callback
  ): XElementStackKeeper = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, retrieve = js.Any.fromFunction2((t0: XDocumentHandler, t1: Boolean) => (retrieve(t0, t1)).runNow()), start = start.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[XElementStackKeeper]
  }
  
  extension [Self <: XElementStackKeeper](x: Self) {
    
    inline def setRetrieve(value: (XDocumentHandler, Boolean) => Callback): Self = StObject.set(x, "retrieve", js.Any.fromFunction2((t0: XDocumentHandler, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
