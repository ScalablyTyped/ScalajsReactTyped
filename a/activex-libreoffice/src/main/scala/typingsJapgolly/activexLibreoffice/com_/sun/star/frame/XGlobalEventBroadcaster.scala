package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameReplace
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.DocumentEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XDocumentEventBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XDocumentEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XEventBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XEventsSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the unified interface of {@link theGlobalEventBroadcaster} singleton.
  * @since LibreOffice 4.0
  */
trait XGlobalEventBroadcaster
  extends StObject
     with XEventsSupplier
     with XDocumentEventBroadcaster
     with XEventBroadcaster
     with XSet
     with XDocumentEventListener
object XGlobalEventBroadcaster {
  
  inline def apply(
    ElementType: `type`,
    Events: XNameReplace,
    acquire: Callback,
    addDocumentEventListener: XDocumentEventListener => Callback,
    addEventListener: XEventListener => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    disposing: EventObject => Callback,
    documentEventOccured: DocumentEvent => Callback,
    getElementType: CallbackTo[`type`],
    getEvents: CallbackTo[XNameReplace],
    has: Any => Boolean,
    hasElements: CallbackTo[Boolean],
    insert: Any => Callback,
    notifyDocumentEvent: (String, XController2, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    remove: Any => Callback,
    removeDocumentEventListener: XDocumentEventListener => Callback,
    removeEventListener: XEventListener => Callback
  ): XGlobalEventBroadcaster = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDocumentEventListener = js.Any.fromFunction1((t0: XDocumentEventListener) => addDocumentEventListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), createEnumeration = createEnumeration.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), documentEventOccured = js.Any.fromFunction1((t0: DocumentEvent) => documentEventOccured(t0).runNow()), getElementType = getElementType.toJsFn, getEvents = getEvents.toJsFn, has = js.Any.fromFunction1(has), hasElements = hasElements.toJsFn, insert = js.Any.fromFunction1((t0: Any) => insert(t0).runNow()), notifyDocumentEvent = js.Any.fromFunction3((t0: String, t1: XController2, t2: Any) => (notifyDocumentEvent(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: Any) => remove(t0).runNow()), removeDocumentEventListener = js.Any.fromFunction1((t0: XDocumentEventListener) => removeDocumentEventListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XGlobalEventBroadcaster]
  }
}
