package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** registers listeners for specified events. */
trait XEventAttacherManager
  extends StObject
     with XInterface {
  
  /**
    * adds an {@link XScriptListener} that will be notified when an event takes place. For that a {@link ScriptEventDescriptor} is registered at and
    * attached to an object by an {@link XEventAttacherManager} .
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see removeScriptListener
    */
  def addScriptListener(xListener: XScriptListener): Unit
  
  /**
    * attaches all the ScriptEvents which are registered for the given index to the given object.
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    */
  def attach(nIndex: Double, xObject: XInterface, aHelper: Any): Unit
  
  /**
    * detaches all the ScriptEvents from the given object which are registered at this object for the given index.
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    */
  def detach(nIndex: Double, xObject: XInterface): Unit
  
  /**
    * @param Index an index previously inserted with the method insertEntry.
    * @returns all events registered for the given object index.
    * @throws IllegalArgumentException if Index is not valid.
    */
  def getScriptEvents(Index: Double): SafeArray[ScriptEventDescriptor]
  
  /**
    * creates an empty entry at the given position.
    *
    * The index **n** of all entries with `n &gt;= nIndex` will be increased by one.
    */
  def insertEntry(nIndex: Double): Unit
  
  /**
    * registers one event for an object identified by its index.
    *
    * If any object is attached under this index, then this event is attached automatically.
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    */
  def registerScriptEvent(nIndex: Double, aScriptEvent: ScriptEventDescriptor): Unit
  
  /**
    * registers several events for an object identified by its index.
    *
    * The result is the same as if the method {@link registerScriptEvent()} was called once for each {@link ScriptEventDescriptor} in the sequence.
    *
    * If any object is attached under this index, then this event is attached automatically (see {@link attach()} )
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    * @see registerScriptEvent
    * @see attach
    */
  def registerScriptEvents(nIndex: Double, aScriptEvents: SeqEquiv[ScriptEventDescriptor]): Unit
  
  /**
    * removes the entry at the given position.
    *
    * If any events are registered at this index, they will be revoked, too. So if the events at this index have been attached to any object they are
    * detached automatically. (see {@link attach()} ).
    * @see attach
    */
  def removeEntry(nIndex: Double): Unit
  
  /**
    * removes a {@link XScriptListener} from the listener list.
    *
    * Nothing happens if the listener is not registered.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see addScriptListener
    */
  def removeScriptListener(Listener: XScriptListener): Unit
  
  /**
    * revokes the registration of an event.
    *
    * The parameters **ListenerType** and **EventMethod** are equivalent to the first two members of the {@link ScriptEventDescriptor} used to register
    * events. If this event at this index has been attached to any object, it is detached automatically (see {@link attach()} ).
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    * @see attach
    */
  def revokeScriptEvent(nIndex: Double, aListenerType: String, aEventMethod: String, aRemoveListenerParam: String): Unit
  
  /**
    * revokes all events which are registered for the given index.
    *
    * If the events at this index have been attached to any object, they are detached automatically. (see {@link attach()} ).
    * @see attach
    */
  def revokeScriptEvents(nIndex: Double): Unit
}
object XEventAttacherManager {
  
  inline def apply(
    acquire: Callback,
    addScriptListener: XScriptListener => Callback,
    attach: (Double, XInterface, Any) => Callback,
    detach: (Double, XInterface) => Callback,
    getScriptEvents: Double => SafeArray[ScriptEventDescriptor],
    insertEntry: Double => Callback,
    queryInterface: `type` => Any,
    registerScriptEvent: (Double, ScriptEventDescriptor) => Callback,
    registerScriptEvents: (Double, SeqEquiv[ScriptEventDescriptor]) => Callback,
    release: Callback,
    removeEntry: Double => Callback,
    removeScriptListener: XScriptListener => Callback,
    revokeScriptEvent: (Double, String, String, String) => Callback,
    revokeScriptEvents: Double => Callback
  ): XEventAttacherManager = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addScriptListener = js.Any.fromFunction1((t0: XScriptListener) => addScriptListener(t0).runNow()), attach = js.Any.fromFunction3((t0: Double, t1: XInterface, t2: Any) => (attach(t0, t1, t2)).runNow()), detach = js.Any.fromFunction2((t0: Double, t1: XInterface) => (detach(t0, t1)).runNow()), getScriptEvents = js.Any.fromFunction1(getScriptEvents), insertEntry = js.Any.fromFunction1((t0: Double) => insertEntry(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), registerScriptEvent = js.Any.fromFunction2((t0: Double, t1: ScriptEventDescriptor) => (registerScriptEvent(t0, t1)).runNow()), registerScriptEvents = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[ScriptEventDescriptor]) => (registerScriptEvents(t0, t1)).runNow()), release = release.toJsFn, removeEntry = js.Any.fromFunction1((t0: Double) => removeEntry(t0).runNow()), removeScriptListener = js.Any.fromFunction1((t0: XScriptListener) => removeScriptListener(t0).runNow()), revokeScriptEvent = js.Any.fromFunction4((t0: Double, t1: String, t2: String, t3: String) => (revokeScriptEvent(t0, t1, t2, t3)).runNow()), revokeScriptEvents = js.Any.fromFunction1((t0: Double) => revokeScriptEvents(t0).runNow()))
    __obj.asInstanceOf[XEventAttacherManager]
  }
  
  extension [Self <: XEventAttacherManager](x: Self) {
    
    inline def setAddScriptListener(value: XScriptListener => Callback): Self = StObject.set(x, "addScriptListener", js.Any.fromFunction1((t0: XScriptListener) => value(t0).runNow()))
    
    inline def setAttach(value: (Double, XInterface, Any) => Callback): Self = StObject.set(x, "attach", js.Any.fromFunction3((t0: Double, t1: XInterface, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setDetach(value: (Double, XInterface) => Callback): Self = StObject.set(x, "detach", js.Any.fromFunction2((t0: Double, t1: XInterface) => (value(t0, t1)).runNow()))
    
    inline def setGetScriptEvents(value: Double => SafeArray[ScriptEventDescriptor]): Self = StObject.set(x, "getScriptEvents", js.Any.fromFunction1(value))
    
    inline def setInsertEntry(value: Double => Callback): Self = StObject.set(x, "insertEntry", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRegisterScriptEvent(value: (Double, ScriptEventDescriptor) => Callback): Self = StObject.set(x, "registerScriptEvent", js.Any.fromFunction2((t0: Double, t1: ScriptEventDescriptor) => (value(t0, t1)).runNow()))
    
    inline def setRegisterScriptEvents(value: (Double, SeqEquiv[ScriptEventDescriptor]) => Callback): Self = StObject.set(x, "registerScriptEvents", js.Any.fromFunction2((t0: Double, t1: SeqEquiv[ScriptEventDescriptor]) => (value(t0, t1)).runNow()))
    
    inline def setRemoveEntry(value: Double => Callback): Self = StObject.set(x, "removeEntry", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRemoveScriptListener(value: XScriptListener => Callback): Self = StObject.set(x, "removeScriptListener", js.Any.fromFunction1((t0: XScriptListener) => value(t0).runNow()))
    
    inline def setRevokeScriptEvent(value: (Double, String, String, String) => Callback): Self = StObject.set(x, "revokeScriptEvent", js.Any.fromFunction4((t0: Double, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRevokeScriptEvents(value: Double => Callback): Self = StObject.set(x, "revokeScriptEvents", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
