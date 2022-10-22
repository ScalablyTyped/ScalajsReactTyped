package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to be notified of events happening in an {@link OfficeDocument}
  *
  * This interface is the successor of the {@link XEventListener} interface, which should not be used anymore.
  * @see XDocumentEventBroadcaster
  * @since OOo 3.1
  */
trait XDocumentEventListener
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener {
  
  /** is called whenever a document event occurred */
  def documentEventOccured(Event: DocumentEvent): Unit
}
object XDocumentEventListener {
  
  inline def apply(
    acquire: Callback,
    disposing: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback,
    documentEventOccured: DocumentEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDocumentEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => disposing(t0).runNow()), documentEventOccured = js.Any.fromFunction1((t0: DocumentEvent) => documentEventOccured(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDocumentEventListener]
  }
  
  extension [Self <: XDocumentEventListener](x: Self) {
    
    inline def setDocumentEventOccured(value: DocumentEvent => Callback): Self = StObject.set(x, "documentEventOccured", js.Any.fromFunction1((t0: DocumentEvent) => value(t0).runNow()))
  }
}
