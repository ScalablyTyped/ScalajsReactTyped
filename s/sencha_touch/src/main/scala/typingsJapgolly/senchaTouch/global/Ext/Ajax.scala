package typingsJapgolly.senchaTouch.global.Ext

import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Ajax")
@js.native
open class Ajax ()
  extends StObject
     with typingsJapgolly.senchaTouch.Ext.Ajax
/* static members */
object Ajax {
  
  @JSGlobal("Ext.Ajax")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Aborts any outstanding request
    * @param request Object Defaults to the last request.
    */
  inline def abort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[Unit]
  inline def abort(request: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Aborts all outstanding requests  */
  inline def abortAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abortAll")().asInstanceOf[Unit]
  
  /** [Method] Appends an after event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  inline def addAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")().asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Appends a before event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  inline def addBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")().asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
    */
  inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
  inline def addEvents(eventNames: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  inline def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
  inline def addListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  inline def addManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Ajax.autoAbort")
  @js.native
  def autoAbort: Boolean = js.native
  inline def autoAbort_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoAbort")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
  inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
  inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
  inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Removes all listeners for this object  */
  inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
  
  /** [Method]  */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param events String/String[] The event name to bubble, or an Array of event names.
    */
  inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
  inline def enableBubble(events: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
    * @param eventName String The name of the event to fire.
    * @param args Array Arguments to pass to handers.
    * @param fn Function Action.
    * @param scope Object Scope of fn.
    * @returns Object
    */
  inline def fireAction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")().asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: typingsJapgolly.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: typingsJapgolly.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: typingsJapgolly.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: typingsJapgolly.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: typingsJapgolly.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: typingsJapgolly.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: typingsJapgolly.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: typingsJapgolly.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean Returns false if any of the handlers return false.
    */
  inline def fireEvent(eventName: java.lang.String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(scala.List(eventName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  /** [Method] Returns the value of async
    * @returns Boolean
    */
  inline def getAsync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsync")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of autoAbort
    * @returns Boolean
    */
  inline def getAutoAbort(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoAbort")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of bubbleEvents
    * @returns String/String[]
    */
  inline def getBubbleEvents(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleEvents")().asInstanceOf[Any]
  
  /** [Method] Returns the value of defaultHeaders
    * @returns Object
    */
  inline def getDefaultHeaders(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultHeaders")().asInstanceOf[Any]
  
  /** [Method] Returns the value of defaultPostHeader
    * @returns String
    */
  inline def getDefaultPostHeader(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultPostHeader")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of defaultXhrHeader
    * @returns String
    */
  inline def getDefaultXhrHeader(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultXhrHeader")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of disableCaching
    * @returns Boolean
    */
  inline def getDisableCaching(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisableCaching")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of disableCachingParam
    * @returns String
    */
  inline def getDisableCachingParam(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisableCachingParam")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of extraParams
    * @returns Object
    */
  inline def getExtraParams(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtraParams")().asInstanceOf[Any]
  
  /** [Method] Retrieves the id of this component
    * @returns String id
    */
  inline def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
  inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Returns the value of listeners
    * @returns Object
    */
  inline def getListeners(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getListeners")().asInstanceOf[Any]
  
  /** [Method] Returns the value of method
    * @returns String
    */
  inline def getMethod(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMethod")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of password
    * @returns String
    */
  inline def getPassword(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  inline def getTimeout(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")().asInstanceOf[Double]
  
  /** [Method] Returns the value of url
    * @returns String
    */
  inline def getUrl(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of useDefaultHeader
    * @returns Boolean
    */
  inline def getUseDefaultHeader(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUseDefaultHeader")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of useDefaultXhrHeader
    * @returns Boolean
    */
  inline def getUseDefaultXhrHeader(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUseDefaultXhrHeader")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of username
    * @returns String
    */
  inline def getUsername(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsername")().asInstanceOf[java.lang.String]
  
  /** [Method] Checks to see if this object has any listeners for a specified event
    * @param eventName String The name of the event to check for
    * @returns Boolean True if the event is being listened for, else false
    */
  inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
  inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
  inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Determines whether this object has a request outstanding
    * @param request Object The request to check.
    * @returns Boolean True if there is an outstanding request.
    */
  inline def isLoading(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoading")().asInstanceOf[Boolean]
  inline def isLoading(request: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoading")(request.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Alias for addManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  inline def mon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[Unit]
  inline def mon(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for removeManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
  inline def mun(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for addListener
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  inline def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
  inline def on(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for addAfterListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  inline def onAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")().asInstanceOf[Unit]
  inline def onAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for addBeforeListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  inline def onBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")().asInstanceOf[Unit]
  inline def onBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Checks if the response status was successful
    * @param status Number The status code.
    * @param xhr XMLHttpRequest
    * @returns Object An object containing success/status state.
    */
  inline def parseStatus(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStatus")().asInstanceOf[Any]
  inline def parseStatus(status: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStatus")(status.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parseStatus(status: Double, xhr: XMLHttpRequest): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStatus")(status.asInstanceOf[js.Any], xhr.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parseStatus(status: Unit, xhr: XMLHttpRequest): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStatus")(status.asInstanceOf[js.Any], xhr.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  inline def relayEvents(): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[IObservable]
  inline def relayEvents(`object`: Any): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any]).asInstanceOf[IObservable]
  inline def relayEvents(`object`: Any, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
  inline def relayEvents(`object`: Unit, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  inline def removeAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")().asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  inline def removeBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")().asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes an event handler
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
  inline def removeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Sends an HTTP request to a remote server
    * @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
    * @returns Object/null The request object. This may be used to cancel the request.
    */
  inline def request(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[Any]
  inline def request(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Resumes firing events see suspendEvents
    * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
    */
  inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
  inline def resumeEvents(discardQueuedEvents: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")(discardQueuedEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Ajax.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sets the value of async
    * @param async Boolean The new value.
    */
  inline def setAsync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsync")().asInstanceOf[Unit]
  inline def setAsync(async: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsync")(async.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of autoAbort
    * @param autoAbort Boolean The new value.
    */
  inline def setAutoAbort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoAbort")().asInstanceOf[Unit]
  inline def setAutoAbort(autoAbort: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoAbort")(autoAbort.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of bubbleEvents
    * @param bubbleEvents String/String[] The new value.
    */
  inline def setBubbleEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")().asInstanceOf[Unit]
  inline def setBubbleEvents(bubbleEvents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")(bubbleEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaultHeaders
    * @param defaultHeaders Object The new value.
    */
  inline def setDefaultHeaders(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHeaders")().asInstanceOf[Unit]
  inline def setDefaultHeaders(defaultHeaders: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHeaders")(defaultHeaders.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaultPostHeader
    * @param defaultPostHeader String The new value.
    */
  inline def setDefaultPostHeader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultPostHeader")().asInstanceOf[Unit]
  inline def setDefaultPostHeader(defaultPostHeader: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultPostHeader")(defaultPostHeader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaultXhrHeader
    * @param defaultXhrHeader String The new value.
    */
  inline def setDefaultXhrHeader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultXhrHeader")().asInstanceOf[Unit]
  inline def setDefaultXhrHeader(defaultXhrHeader: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultXhrHeader")(defaultXhrHeader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of disableCaching
    * @param disableCaching Boolean The new value.
    */
  inline def setDisableCaching(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisableCaching")().asInstanceOf[Unit]
  inline def setDisableCaching(disableCaching: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisableCaching")(disableCaching.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of disableCachingParam
    * @param disableCachingParam String The new value.
    */
  inline def setDisableCachingParam(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisableCachingParam")().asInstanceOf[Unit]
  inline def setDisableCachingParam(disableCachingParam: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisableCachingParam")(disableCachingParam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of extraParams
    * @param extraParams Object The new value.
    */
  inline def setExtraParams(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtraParams")().asInstanceOf[Unit]
  inline def setExtraParams(extraParams: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtraParams")(extraParams.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of listeners
    * @param listeners Object The new value.
    */
  inline def setListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")().asInstanceOf[Unit]
  inline def setListeners(listeners: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of method
    * @param method String The new value.
    */
  inline def setMethod(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMethod")().asInstanceOf[Unit]
  inline def setMethod(method: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMethod")(method.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets various options such as the url params for the request
    * @param options Object The initial options.
    * @param scope Object The scope to execute in.
    * @returns Object The params for the request.
    */
  inline def setOptions(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")().asInstanceOf[Any]
  inline def setOptions(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def setOptions(options: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def setOptions(options: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Sets the value of password
    * @param password String The new value.
    */
  inline def setPassword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")().asInstanceOf[Unit]
  inline def setPassword(password: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(password.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  inline def setTimeout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")().asInstanceOf[Unit]
  inline def setTimeout(timeout: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(timeout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  inline def setUrl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")().asInstanceOf[Unit]
  inline def setUrl(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of useDefaultHeader
    * @param useDefaultHeader Boolean The new value.
    */
  inline def setUseDefaultHeader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseDefaultHeader")().asInstanceOf[Unit]
  inline def setUseDefaultHeader(useDefaultHeader: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseDefaultHeader")(useDefaultHeader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of useDefaultXhrHeader
    * @param useDefaultXhrHeader Boolean The new value.
    */
  inline def setUseDefaultXhrHeader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseDefaultXhrHeader")().asInstanceOf[Unit]
  inline def setUseDefaultXhrHeader(useDefaultXhrHeader: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseDefaultXhrHeader")(useDefaultXhrHeader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of username
    * @param username String The new value.
    */
  inline def setUsername(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUsername")().asInstanceOf[Unit]
  inline def setUsername(username: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUsername")(username.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Suspends the firing of all events  */
  inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
  
  /** [Method] Alias for removeListener
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
  inline def un(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for removeAfterListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  inline def unAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")().asInstanceOf[Unit]
  inline def unAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for removeBeforeListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  inline def unBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")().asInstanceOf[Unit]
  inline def unBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Uploads a form using a hidden iframe
    * @param form String/HTMLElement/Ext.Element The form to upload.
    * @param url String The url to post to.
    * @param params String Any extra parameters to pass.
    * @param options Object The initial options.
    */
  inline def upload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("upload")().asInstanceOf[Unit]
  inline def upload(form: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def upload(form: Any, url: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Any, url: java.lang.String, params: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Any, url: java.lang.String, params: java.lang.String, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Any, url: java.lang.String, params: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Any, url: Unit, params: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Any, url: Unit, params: java.lang.String, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Any, url: Unit, params: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Unit, url: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Unit, url: java.lang.String, params: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Unit, url: java.lang.String, params: java.lang.String, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Unit, url: java.lang.String, params: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Unit, url: Unit, params: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Unit, url: Unit, params: java.lang.String, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def upload(form: Unit, url: Unit, params: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
