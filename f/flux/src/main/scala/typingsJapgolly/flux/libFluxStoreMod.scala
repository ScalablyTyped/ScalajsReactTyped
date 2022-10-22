package typingsJapgolly.flux

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fbemitter.mod.EventEmitter
import typingsJapgolly.fbemitter.mod.EventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFluxStoreMod {
  
  /**
    * This class represents the most basic functionality for a FluxStore. Do not
    * extend this store directly; instead extend FluxReduceStore when creating a
    * new store.
    */
  /* note: abstract class */ @JSImport("flux/lib/FluxStore", JSImport.Namespace)
  @js.native
  open class ^[TPayload] protected ()
    extends StObject
       with FluxStore[TPayload] {
    /**
      * Constructs and registers an instance of this store with the given dispatcher.
      */
    def this(dispatcher: typingsJapgolly.flux.libDispatcherMod.^[TPayload]) = this()
    
    /* protected */ /* CompleteClass */
    var __changeEvent: String = js.native
    
    /* protected */ /* CompleteClass */
    var __changed: Boolean = js.native
    
    /* protected */ /* CompleteClass */
    var __className: String = js.native
    
    /* protected */ /* CompleteClass */
    var __dispatcher: typingsJapgolly.flux.libDispatcherMod.^[TPayload] = js.native
    
    /**
      * Emit an event notifying all listeners that this store has changed.
      * This can only be invoked when dispatching.
      * Changes are de-duplicated and resolved at the end of this store's __onDispatch function.
      */
    /* protected */ /* CompleteClass */
    override def __emitChange(): Unit = js.native
    
    /* protected */ /* CompleteClass */
    var __emitter: EventEmitter = js.native
    
    /**
      * This method encapsulates all logic for invoking __onDispatch. It should
      * be used for things like catching changes and emitting them after the
      * subclass has handled a payload.
      */
    /* protected */ /* CompleteClass */
    override def __invokeOnDispatch(payload: TPayload): Unit = js.native
    
    /**
      * Subclasses must override this method.
      * This is how the store receives actions from the dispatcher.
      * All state mutation logic must be done during this method.
      */
    /* protected */ /* CompleteClass */
    override def __onDispatch(payload: TPayload): Unit = js.native
    
    /**
      * Adds a listener to the store, when the store changes the given callback will be called.
      * A token is returned that can be used to remove the listener.
      * Calling the remove() function on the returned token will remove the listener.
      */
    /* CompleteClass */
    override def addListener(callback: js.Function0[Unit]): EventSubscription = js.native
    
    /**
      * Returns the dispatch token that the dispatcher recognizes this store by.
      * Can be used to waitFor() this store.
      */
    /* CompleteClass */
    override def getDispatchToken(): String = js.native
    
    /**
      * Returns the dispatcher this store is registered with.
      */
    /* CompleteClass */
    override def getDispatcher(): typingsJapgolly.flux.libDispatcherMod.^[TPayload] = js.native
    
    /**
      * Ask if a store has changed during the current dispatch.
      * Can only be invoked while dispatching.
      * This can be used for constructing derived stores that depend on data from other stores.
      */
    /* CompleteClass */
    override def hasChanged(): Boolean = js.native
  }
  
  /**
    * This class represents the most basic functionality for a FluxStore. Do not
    * extend this store directly; instead extend FluxReduceStore when creating a
    * new store.
    */
  trait FluxStore[TPayload] extends StObject {
    
    /* protected */ var __changeEvent: String
    
    /* protected */ var __changed: Boolean
    
    /* protected */ var __className: String
    
    /* protected */ var __dispatcher: typingsJapgolly.flux.libDispatcherMod.^[TPayload]
    
    /**
      * Emit an event notifying all listeners that this store has changed.
      * This can only be invoked when dispatching.
      * Changes are de-duplicated and resolved at the end of this store's __onDispatch function.
      */
    /* protected */ def __emitChange(): Unit
    
    /* protected */ var __emitter: EventEmitter
    
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
    def getDispatcher(): typingsJapgolly.flux.libDispatcherMod.^[TPayload]
    
    /**
      * Ask if a store has changed during the current dispatch.
      * Can only be invoked while dispatching.
      * This can be used for constructing derived stores that depend on data from other stores.
      */
    def hasChanged(): Boolean
  }
  object FluxStore {
    
    inline def apply[TPayload](
      __changeEvent: String,
      __changed: Boolean,
      __className: String,
      __dispatcher: typingsJapgolly.flux.libDispatcherMod.^[TPayload],
      __emitChange: Callback,
      __emitter: EventEmitter,
      __invokeOnDispatch: TPayload => Callback,
      __onDispatch: TPayload => Callback,
      addListener: js.Function0[Unit] => EventSubscription,
      getDispatchToken: CallbackTo[String],
      getDispatcher: CallbackTo[typingsJapgolly.flux.libDispatcherMod.^[TPayload]],
      hasChanged: CallbackTo[Boolean]
    ): FluxStore[TPayload] = {
      val __obj = js.Dynamic.literal(__changeEvent = __changeEvent.asInstanceOf[js.Any], __changed = __changed.asInstanceOf[js.Any], __className = __className.asInstanceOf[js.Any], __dispatcher = __dispatcher.asInstanceOf[js.Any], __emitChange = __emitChange.toJsFn, __emitter = __emitter.asInstanceOf[js.Any], __invokeOnDispatch = js.Any.fromFunction1((t0: TPayload) => __invokeOnDispatch(t0).runNow()), __onDispatch = js.Any.fromFunction1((t0: TPayload) => __onDispatch(t0).runNow()), addListener = js.Any.fromFunction1(addListener), getDispatchToken = getDispatchToken.toJsFn, getDispatcher = getDispatcher.toJsFn, hasChanged = hasChanged.toJsFn)
      __obj.asInstanceOf[FluxStore[TPayload]]
    }
    
    extension [Self <: FluxStore[?], TPayload](x: Self & FluxStore[TPayload]) {
      
      inline def setAddListener(value: js.Function0[Unit] => EventSubscription): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setGetDispatchToken(value: CallbackTo[String]): Self = StObject.set(x, "getDispatchToken", value.toJsFn)
      
      inline def setGetDispatcher(value: CallbackTo[typingsJapgolly.flux.libDispatcherMod.^[TPayload]]): Self = StObject.set(x, "getDispatcher", value.toJsFn)
      
      inline def setHasChanged(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChanged", value.toJsFn)
      
      inline def set__changeEvent(value: String): Self = StObject.set(x, "__changeEvent", value.asInstanceOf[js.Any])
      
      inline def set__changed(value: Boolean): Self = StObject.set(x, "__changed", value.asInstanceOf[js.Any])
      
      inline def set__className(value: String): Self = StObject.set(x, "__className", value.asInstanceOf[js.Any])
      
      inline def set__dispatcher(value: typingsJapgolly.flux.libDispatcherMod.^[TPayload]): Self = StObject.set(x, "__dispatcher", value.asInstanceOf[js.Any])
      
      inline def set__emitChange(value: Callback): Self = StObject.set(x, "__emitChange", value.toJsFn)
      
      inline def set__emitter(value: EventEmitter): Self = StObject.set(x, "__emitter", value.asInstanceOf[js.Any])
      
      inline def set__invokeOnDispatch(value: TPayload => Callback): Self = StObject.set(x, "__invokeOnDispatch", js.Any.fromFunction1((t0: TPayload) => value(t0).runNow()))
      
      inline def set__onDispatch(value: TPayload => Callback): Self = StObject.set(x, "__onDispatch", js.Any.fromFunction1((t0: TPayload) => value(t0).runNow()))
    }
  }
}
