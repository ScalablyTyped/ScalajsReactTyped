package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface can be used to attach script events to a number of objects that give access to the definition of events that should be attached to
  * them, e.g., by supporting XEventsSupplier
  */
trait XScriptEventsAttacher
  extends StObject
     with XInterface {
  
  /**
    * Attaches the events defined by {@link XScriptEventsSupplier} to the corresponding object implementing {@link XScriptEventsSupplier} .
    * @param Objects Sequence of all objects. Usually the objects should directly support {@link XScriptEventsAttacher} to define the events but this is not s
    * @param xListener All events (if defined by {@link XScriptEventsSupplier} ) that are fired by one of the objects are mapped into a {@link ScriptEvent} an
    * @param Helper Helper object for the implementation. This value will be passed to the {@link XScriptListener} as Helper property in the {@link ScriptEvent} .
    */
  def attachEvents(Objects: SeqEquiv[XInterface], xListener: XScriptListener, Helper: Any): Unit
}
object XScriptEventsAttacher {
  
  inline def apply(
    acquire: Callback,
    attachEvents: (SeqEquiv[XInterface], XScriptListener, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XScriptEventsAttacher = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, attachEvents = js.Any.fromFunction3((t0: SeqEquiv[XInterface], t1: XScriptListener, t2: Any) => (attachEvents(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XScriptEventsAttacher]
  }
  
  extension [Self <: XScriptEventsAttacher](x: Self) {
    
    inline def setAttachEvents(value: (SeqEquiv[XInterface], XScriptListener, Any) => Callback): Self = StObject.set(x, "attachEvents", js.Any.fromFunction3((t0: SeqEquiv[XInterface], t1: XScriptListener, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
