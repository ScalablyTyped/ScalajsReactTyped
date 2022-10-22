package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController2
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes an event happening in an {@link OfficeDocument}
  *
  * The {@link com.sun.star.lang.EventObject.Source} member of the base type refers to the document which broadcasts the event.
  *
  * This type is the successor of the {@link EventObject} type, which should not be used anymore.
  * @see XDocumentEventBroadcaster
  * @since OOo 3.1
  */
trait DocumentEvent
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject {
  
  /**
    * specifies the name of the event.
    *
    * It's the responsibility of the component supporting the {@link XDocumentEventBroadcaster} interface to specify which events it supports.
    */
  var EventName: String
  
  /**
    * contains supplemental information about the event which is being notified
    *
    * The semantics of this additional information needs to be specified by the broadcaster of the event.
    */
  var Supplement: Any
  
  /**
    * denotes the view respectively controller which the event applies to.
    *
    * Might be `NULL` if the event is not related to a concrete view of the document.
    */
  var ViewController: XController2
}
object DocumentEvent {
  
  inline def apply(EventName: String, Source: XInterface, Supplement: Any, ViewController: XController2): DocumentEvent = {
    val __obj = js.Dynamic.literal(EventName = EventName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Supplement = Supplement.asInstanceOf[js.Any], ViewController = ViewController.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentEvent]
  }
  
  extension [Self <: DocumentEvent](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "EventName", value.asInstanceOf[js.Any])
    
    inline def setSupplement(value: Any): Self = StObject.set(x, "Supplement", value.asInstanceOf[js.Any])
    
    inline def setViewController(value: XController2): Self = StObject.set(x, "ViewController", value.asInstanceOf[js.Any])
  }
}
