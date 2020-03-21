package typingsJapgolly.flux.fluxStoreMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fbemitter.mod.EventEmitter
import typingsJapgolly.fbemitter.mod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the most basic functionality for a FluxStore. Do not
  * extend this store directly; instead extend FluxReduceStore when creating a
  * new store.
  */
trait FluxStore[TPayload] extends js.Object {
  var __changeEvent: String
  var __changed: Boolean
  var __className: String
  var __dispatcher: typingsJapgolly.flux.dispatcherMod.^[TPayload]
  var __emitter: EventEmitter
  /**
    * Emit an event notifying all listeners that this store has changed.
    * This can only be invoked when dispatching.
    * Changes are de-duplicated and resolved at the end of this store's __onDispatch function.
    */
  /* protected */ def __emitChange(): Unit
  /**
    * This method encapsulates all logic for invoking __onDispatch. It should
    * be used for things like catching changes and emitting them after the
    * subclass has handled a payload.
    */
  /* protected */ def __invokeOnDispatch(payload: TPayload): Unit
  /**
    * Subclasses must override this method.
    * This is how the store receives actions from the dispatcher.
    * All state mutation logic must be done during this method.
    */
  /* protected */ def __onDispatch(payload: TPayload): Unit
  /**
    * Adds a listener to the store, when the store changes the given callback will be called.
    * A token is returned that can be used to remove the listener.
    * Calling the remove() function on the returned token will remove the listener.
    */
  def addListener(callback: js.Function0[Unit]): EventSubscription
  /**
    * Returns the dispatch token that the dispatcher recognizes this store by.
    * Can be used to waitFor() this store.
    */
  def getDispatchToken(): String
  /**
    * Returns the dispatcher this store is registered with.
    */
  def getDispatcher(): typingsJapgolly.flux.dispatcherMod.^[TPayload]
  /**
    * Ask if a store has changed during the current dispatch.
    * Can only be invoked while dispatching.
    * This can be used for constructing derived stores that depend on data from other stores.
    */
  def hasChanged(): Boolean
}

object FluxStore {
  @scala.inline
  def apply[TPayload](
    __changeEvent: String,
    __changed: Boolean,
    __className: String,
    __dispatcher: typingsJapgolly.flux.dispatcherMod.^[TPayload],
    __emitChange: Callback,
    __emitter: EventEmitter,
    __invokeOnDispatch: TPayload => Callback,
    __onDispatch: TPayload => Callback,
    addListener: js.Function0[Unit] => CallbackTo[EventSubscription],
    getDispatchToken: CallbackTo[String],
    getDispatcher: CallbackTo[typingsJapgolly.flux.dispatcherMod.^[TPayload]],
    hasChanged: CallbackTo[Boolean]
  ): FluxStore[TPayload] = {
    val __obj = js.Dynamic.literal(__changeEvent = __changeEvent.asInstanceOf[js.Any], __changed = __changed.asInstanceOf[js.Any], __className = __className.asInstanceOf[js.Any], __dispatcher = __dispatcher.asInstanceOf[js.Any], __emitter = __emitter.asInstanceOf[js.Any])
    __obj.updateDynamic("__emitChange")(__emitChange.toJsFn)
    __obj.updateDynamic("__invokeOnDispatch")(js.Any.fromFunction1((t0: TPayload) => __invokeOnDispatch(t0).runNow()))
    __obj.updateDynamic("__onDispatch")(js.Any.fromFunction1((t0: TPayload) => __onDispatch(t0).runNow()))
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => addListener(t0).runNow()))
    __obj.updateDynamic("getDispatchToken")(getDispatchToken.toJsFn)
    __obj.updateDynamic("getDispatcher")(getDispatcher.toJsFn)
    __obj.updateDynamic("hasChanged")(hasChanged.toJsFn)
    __obj.asInstanceOf[FluxStore[TPayload]]
  }
}

