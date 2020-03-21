package typingsJapgolly.grunt.grunt.event

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/hij1nx/EventEmitter2}
  */
trait EventModule extends js.Object {
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    */
  def addListener(event: String, listener: js.Function): EventModule
  /**
    * Execute each of the listeners that may be listening for the specified event name
    * in order with the list of arguments.
    */
  def emit(event: String, args: js.Any*): js.Any
  /**
    * Returns an array of listeners for the specified event.
    * This array can be manipulated, e.g. to remove listeners.
    */
  def listeners(event: String): js.Array[js.Function]
  /**
    * Returns an array of listeners that are listening for any event that is specified.
    * This array can be manipulated, e.g. to remove listeners.
    */
  def listenersAny(): js.Array[js.Function]
  /**
    * Adds a listener that will execute n times for the event before being removed.
    * The listener is invoked only the first time the event is fired, after which it is removed.
    */
  def many(event: String, timesToListen: Double, listener: js.Function): EventModule
  def off(event: String, listener: js.Function): EventModule
  /**
    * Removes the listener that will be fired when any event is emitted.
    */
  def offAny(listener: js.Function): EventModule
  def on(event: String, listener: js.Function): EventModule
  /**
    * Adds a listener that will be fired when any event is emitted.
    */
  def onAny(listener: js.Function): EventModule
  /**
    * Adds a one time listener for the event.
    * The listener is invoked only the first time the event is fired, after which it is removed.
    */
  def once(event: String, listener: js.Function): EventModule
  /**
    * Removes all listeners, or those of the specified event.
    */
  def removeAllListeners(event: String): EventModule
  /**
    * Remove a listener from the listener array for the specified event.
    * Caution: changes array indices in the listener array behind the listener.
    */
  def removeListener(event: String, listener: js.Function): EventModule
  /**
    * By default EventEmitters will print a warning if more than 10 listeners are added to it.
    * This is a useful default which helps finding memory leaks. Obviously not all Emitters
    * should be limited to 10. This function allows that to be increased.
    *
    * Set to zero for unlimited.
    */
  def setMaxListener(n: Double): Unit
}

object EventModule {
  @scala.inline
  def apply(
    addListener: (String, js.Function) => CallbackTo[EventModule],
    emit: (String, /* repeated */ js.Any) => CallbackTo[js.Any],
    listeners: String => CallbackTo[js.Array[js.Function]],
    listenersAny: CallbackTo[js.Array[js.Function]],
    many: (String, Double, js.Function) => CallbackTo[EventModule],
    off: (String, js.Function) => CallbackTo[EventModule],
    offAny: js.Function => CallbackTo[EventModule],
    on: (String, js.Function) => CallbackTo[EventModule],
    onAny: js.Function => CallbackTo[EventModule],
    once: (String, js.Function) => CallbackTo[EventModule],
    removeAllListeners: String => CallbackTo[EventModule],
    removeListener: (String, js.Function) => CallbackTo[EventModule],
    setMaxListener: Double => Callback
  ): EventModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("listeners")(js.Any.fromFunction1((t0: java.lang.String) => listeners(t0).runNow()))
    __obj.updateDynamic("listenersAny")(listenersAny.toJsFn)
    __obj.updateDynamic("many")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: js.Function) => many(t0, t1, t2).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => off(t0, t1).runNow()))
    __obj.updateDynamic("offAny")(js.Any.fromFunction1((t0: js.Function) => offAny(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => on(t0, t1).runNow()))
    __obj.updateDynamic("onAny")(js.Any.fromFunction1((t0: js.Function) => onAny(t0).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => once(t0, t1).runNow()))
    __obj.updateDynamic("removeAllListeners")(js.Any.fromFunction1((t0: java.lang.String) => removeAllListeners(t0).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => removeListener(t0, t1).runNow()))
    __obj.updateDynamic("setMaxListener")(js.Any.fromFunction1((t0: scala.Double) => setMaxListener(t0).runNow()))
    __obj.asInstanceOf[EventModule]
  }
}

