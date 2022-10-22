package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interfaces allows the object to act according to dictionary-list events.
  *
  * This interface is the base class for all dictionary-list event listeners. Its single function will be called by the broadcasting dictionary-list in
  * order to notify its registered listeners.
  * @see com.sun.star.linguistic2.DictionaryListEvent
  * @see com.sun.star.linguistic2.XDictionaryList
  */
trait XDictionaryListEventListener
  extends StObject
     with XEventListener {
  
  /**
    * is used to notify the object about dictionary-list events.
    * @param aDicListEvent the event to be notified of.
    * @see com.sun.star.linguistic2.DictionaryListEvent
    */
  def processDictionaryListEvent(aDicListEvent: DictionaryListEvent): Unit
}
object XDictionaryListEventListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    processDictionaryListEvent: DictionaryListEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDictionaryListEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), processDictionaryListEvent = js.Any.fromFunction1((t0: DictionaryListEvent) => processDictionaryListEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDictionaryListEventListener]
  }
  
  extension [Self <: XDictionaryListEventListener](x: Self) {
    
    inline def setProcessDictionaryListEvent(value: DictionaryListEvent => Callback): Self = StObject.set(x, "processDictionaryListEvent", js.Any.fromFunction1((t0: DictionaryListEvent) => value(t0).runNow()))
  }
}
