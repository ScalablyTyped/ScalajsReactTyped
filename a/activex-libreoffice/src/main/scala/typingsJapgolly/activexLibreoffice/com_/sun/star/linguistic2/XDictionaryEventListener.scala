package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interfaces allows the object to act according to dictionary events.
  *
  * The single method is used by a dictionary to notify its listeners about com::sun::star::linguistic2::DictionaryEvents.
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.lang.XEventListener
  */
trait XDictionaryEventListener
  extends StObject
     with XEventListener {
  
  /**
    * is used to get notification of dictionary events.
    * @param aDicEvent the event to be notified of.
    * @see com.sun.star.lang.DictionaryEvent
    */
  def processDictionaryEvent(aDicEvent: DictionaryEvent): Unit
}
object XDictionaryEventListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    processDictionaryEvent: DictionaryEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDictionaryEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), processDictionaryEvent = js.Any.fromFunction1((t0: DictionaryEvent) => processDictionaryEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDictionaryEventListener]
  }
  
  extension [Self <: XDictionaryEventListener](x: Self) {
    
    inline def setProcessDictionaryEvent(value: DictionaryEvent => Callback): Self = StObject.set(x, "processDictionaryEvent", js.Any.fromFunction1((t0: DictionaryEvent) => value(t0).runNow()))
  }
}
