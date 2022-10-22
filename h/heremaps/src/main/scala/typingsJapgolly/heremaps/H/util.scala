package typingsJapgolly.heremaps.H

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.heremaps.H.util.Request.State
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** util *****/
object util {
  
  /**
    * A generic class to represent a handle for any kind of asynchronous processed requests
    */
  trait Request extends StObject {
    
    /**
      * Returns the number of processingsteps which have been failed
      * @returns {number}
      */
    def getFailed(): Double
    
    /**
      * Returns the number of steps which are already processed by this request
      * @returns {number}
      */
    def getProcessed(): Double
    
    /**
      * Returns the state of this request
      * @returns {H.util.Request.State}
      */
    def getState(): State
    
    /**
      * Returns the number of processing steps to complete this request
      * @returns {number}
      */
    def getTotal(): Double
  }
  object Request {
    
    inline def apply(
      getFailed: CallbackTo[Double],
      getProcessed: CallbackTo[Double],
      getState: CallbackTo[State],
      getTotal: CallbackTo[Double]
    ): Request = {
      val __obj = js.Dynamic.literal(getFailed = getFailed.toJsFn, getProcessed = getProcessed.toJsFn, getState = getState.toJsFn, getTotal = getTotal.toJsFn)
      __obj.asInstanceOf[Request]
    }
    
    @js.native
    sealed trait State extends StObject
    /**
      * The supported states of an request
      */
    @JSGlobal("H.util.Request.State")
    @js.native
    object State extends StObject {
      
      @js.native
      sealed trait CANCELLED
        extends StObject
           with State
      
      @js.native
      sealed trait COMPLETE
        extends StObject
           with State
      
      @js.native
      sealed trait ERROR
        extends StObject
           with State
      
      @js.native
      sealed trait PENDING
        extends StObject
           with State
      
      @js.native
      sealed trait PROCESSING
        extends StObject
           with State
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setGetFailed(value: CallbackTo[Double]): Self = StObject.set(x, "getFailed", value.toJsFn)
      
      inline def setGetProcessed(value: CallbackTo[Double]): Self = StObject.set(x, "getProcessed", value.toJsFn)
      
      inline def setGetState(value: CallbackTo[State]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setGetTotal(value: CallbackTo[Double]): Self = StObject.set(x, "getTotal", value.toJsFn)
    }
  }
  
  /**
    * The cache represents a in-memory LRU-cache with a fixed size. It stores any data that is added until the cache's content exceeds a maximum size. Once the size of all content elements
    * exceeds the maximum size the cache will drop the least recently retrieved elements until the size of the cache is within the bounds of its maximum size. Data elements are always
    * associated with an identifier that allow to retrieve them at a later stage and their content size.
    */
  @js.native
  trait Cache
    extends StObject
       with ICache {
    
    def forEach(callback: js.Function3[/* s */ String, /* i */ Any, /* n */ Double, Unit], opt_ctx: Any): Unit = js.native
    def forEach(
      callback: js.Function3[/* s */ String, /* i */ Any, /* n */ Double, Unit],
      opt_ctx: Any,
      opt_matcher: js.Function3[/* s */ String, /* i */ Any, /* n */ Double, Boolean]
    ): Unit = js.native
    
    /**
      * This method returns the current size of this cache.
      * @returns {number} - the current size of the cache
      */
    def getCurrentSize(): Double = js.native
    
    /**
      * This method returns the maximum size of this cache.
      * @returns {number} - the maximum size of the cache
      */
    def getMaxSize(): Double = js.native
    
    /**
      * This method sets this cache's maximum size to a new size. If the cache's contents exceed the new size, least recently used data elements will be dropped.
      * @param maxSize {number} - the new maximum size of this cache.
      * @returns {H.util.Cache} - this cache
      */
    def setMaxSize(maxSize: Double): Cache = js.native
  }
  
  /**
    * This event indicates a change. It contains the old and the new value.
    * @property target {*} - Object which triggered the event
    * @property currentTarget {*} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  trait ChangeEvent
    extends StObject
       with Event
  object ChangeEvent {
    
    inline def apply(
      currentTarget: Any,
      defaultPrevented: Boolean,
      preventDefault: Callback,
      stopPropagation: Callback,
      target: Any,
      `type`: String
    ): ChangeEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent]
    }
  }
  
  /**
    * This class represents a contextual information/action.
    * @property SEPARATOR {H.util.ContextItem} - Separator for the context items
    */
  @js.native
  trait ContextItem
    extends StObject
       with EventTarget {
    
    def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
    
    /**
      * This method returns label of the context item
      * @returns {string} - the label of the context item
      */
    def getLabel(): String = js.native
    
    /**
      * This method returns disabled state of the context item.
      * @returns {boolean} -  true if the item is disabled, false otherwise
      */
    def isDisabled(): Boolean = js.native
    
    /**
      * This method enables/disables the context item
      * @param disabled {boolean} -  true to disable and false to enabled it
      * @returns {H.util.ContextItem} - this context item instance
      */
    def setDisabled(disabled: Boolean): ContextItem = js.native
    
    /**
      * This method changes context item label to the specified one
      * @param label {string} - New label for the context item
      * @returns {H.util.ContextItem} - this context item instance
      */
    def setLabel(label: String): ContextItem = js.native
  }
  object ContextItem {
    
    /**
      * This type defines options which can be used to initialize the context item.
      * @property label {string=} - the label of the context item
      * @property disabled {boolean=} - flag indicatting whether context item is disabled or no, by default false
      * @property callback {function(H.util.Event)=} - Optional callback function to call once context item is selected
      */
    trait Options extends StObject {
      
      var callback: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
      
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCallback(value: /* event */ Event => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      }
    }
  }
  
  /**
    * Object which can be safely disposed.
    */
  @js.native
  trait Disposable extends StObject {
    
    /**
      * Method adds a callback which will be triggered when the object is disposed
      * @param callback {Function}
      * @param opt_scope {Object=}
      */
    def addOnDisposeCallback(callback: js.Function0[Unit]): Unit = js.native
    def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  }
  
  /**
    * Base Event class which is used for all events dispatched by any EventTarget within the api.
    * @property target {*} - Object which triggered the event
    * @property currentTarget {*} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  trait Event extends StObject {
    
    var currentTarget: Any
    
    var defaultPrevented: Boolean
    
    /**
      * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
      */
    def preventDefault(): Unit
    
    /**
      * Stops propagation for current event.
      */
    def stopPropagation(): Unit
    
    var target: Any
    
    var `type`: String
  }
  object Event {
    
    inline def apply(
      currentTarget: Any,
      defaultPrevented: Boolean,
      preventDefault: Callback,
      stopPropagation: Callback,
      target: Any,
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * EventTarget enabled listening and dispatching events on all instances and derived classes.
    */
  @js.native
  trait EventTarget extends StObject {
    
    /**
      * This method allows to listen for specific event triggered by the object. Keep in mind, that you must removeEventListener manually or dispose an object when you no longer need it.
      * Otherwise memory leak is possible.
      * @param type {string} - name of event
      * @param handler {Function} - event handler function
      * @param opt_capture {boolean=} - if set to true will listen in the capture phase (bubble otherwise)
      * @param opt_scope {Object=} - scope for the handler function
      */
    def addEventListener(`type`: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, handler: EventListenerOrEventListenerObject, opt_capture: Boolean): Unit = js.native
    def addEventListener(`type`: String, handler: EventListenerOrEventListenerObject, opt_capture: Boolean, opt_scope: Any): Unit = js.native
    def addEventListener(`type`: String, handler: EventListenerOrEventListenerObject, opt_capture: Unit, opt_scope: Any): Unit = js.native
    
    /**
      * This method adds callback which is triggered when the object is being disposed
      * @param callback {Function} - The callback function.
      * @param opt_scope {Object=} - An optional scope to call the callback in.
      */
    def addOnDisposeCallback(callback: js.Function0[Unit]): Unit = js.native
    def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: Any): Unit = js.native
    
    def dispatchEvent(evt: String): Unit = js.native
    /**
      * This method will dispatch event on the event target object
      * @param evt {H.util.Event | string} - event object or event name
      */
    def dispatchEvent(evt: Event): Unit = js.native
    
    /**
      * Removes listeners from this object. Classes that extend EventTarget may need to override this method in order to remove references to DOM Elements and additional listeners.
      */
    def dispose(): Unit = js.native
    
    /**
      * This method will removed previously added listener from the event target
      * @param type {string} - name of event
      * @param handler {Function} - event handler function
      * @param opt_capture {boolean=} - if set to true will listen in the capture phase (bubble otherwise)
      * @param opt_scope {Object=} - scope for the handler function
      */
    def removeEventListener(`type`: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, handler: EventListenerOrEventListenerObject, opt_capture: Boolean): Unit = js.native
    def removeEventListener(`type`: String, handler: EventListenerOrEventListenerObject, opt_capture: Boolean, opt_scope: Any): Unit = js.native
    def removeEventListener(`type`: String, handler: EventListenerOrEventListenerObject, opt_capture: Unit, opt_scope: Any): Unit = js.native
  }
  
  /**
    * An interface definition for the generic cache. Any data elements can be stored in the cache. They are always associated with an identifier to retrieve them at a later stage and their
    * content size.
    */
  @js.native
  trait ICache extends StObject {
    
    /**
      * This method adds an element to the cache.
      * @param id {*} - The identifier of this data element, the value is converted to a string.
      * @param data {*} - the actual data to be stored
      * @param size {number} - the size of the data element
      * @returns {boolean} - a boolean value indicating whether the data was added
      */
    def add(id: Any, data: Any, size: Double): Boolean = js.native
    
    /**
      * This method explicitly drops an element from the cache.
      * @param id {*} - the id of the item to drop
      */
    def drop(id: Any): Unit = js.native
    
    /**
      * This method will execute the provided callback function on each of the cache's entries. If the optional match predicate is passed to this method the callback will only be executed on
      * those entries for which the predicated returns true.
      * @param callback {function(string, ?, number)} - the callback to be invoked for each entry
      * @param opt_ctx {Object=} - an optional context object to be used as this within the callback
      * @param opt_matcher {(function(string, ?, number): boolean)=} - an optional match predicate to customize on which entries the callback will be called
      */
    def forEach(callback: js.Function3[/* s */ String, /* t */ Any, /* n */ Double, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* s */ String, /* t */ Any, /* n */ Double, Unit], opt_ctx: js.Object): Unit = js.native
    def forEach(
      callback: js.Function3[/* s */ String, /* t */ Any, /* n */ Double, Unit],
      opt_ctx: js.Object,
      opt_matcher: js.Function3[/* s */ String, /* t */ Any, /* n */ Double, Boolean]
    ): Unit = js.native
    def forEach(
      callback: js.Function3[/* s */ String, /* t */ Any, /* n */ Double, Unit],
      opt_ctx: Unit,
      opt_matcher: js.Function3[/* s */ String, /* t */ Any, /* n */ Double, Boolean]
    ): Unit = js.native
    
    /**
      * This method retrieves an element from the cache.
      * @param id {string} - the ID of the data element to be retrieved.
      * @param opt_noUpdate {boolean=} - and optional flag to indicate that the retrieved object should not be marked as 'most recently used'.
      * @returns {*} - returns the data associated with the ID or undefined if the data element is not currently in the cache.
      */
    def get(id: String): Any = js.native
    def get(id: String, opt_noUpdate: Boolean): Any = js.native
    
    /**
      * This method registers a callback that should be called each time an entry is dropped from the cache.
      * @param callback {(function(string, ?, number))} - the callback to be invoked for each entry
      */
    def registerOnDrop(callback: js.Function3[/* s */ String, /* t */ Any, /* n */ Double, Unit]): Unit = js.native
    
    /**
      * This method removes all data elements from the cache. If the optional match predicate is passed to this method only those data elements will be removed for which the predicate
      * return true.
      * @param opt_matcher {(function(string, ?, number): boolean)=} - an optional function that receives an entries id, data and size and may return true or false to either remove it or
      * leave the entry in the cache respectively
      */
    def removeAll(): Unit = js.native
    def removeAll(opt_matcher: js.Function3[/* s */ String, /* t */ Any, /* n */ Double, Boolean]): Unit = js.native
  }
  
  /**
    * An interface to cancelable requests and actions.
    */
  trait ICancelable extends StObject {
    
    /**
      * This method is used to cancel current action
      */
    def cancel(): Unit
  }
  object ICancelable {
    
    inline def apply(cancel: Callback): ICancelable = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
      __obj.asInstanceOf[ICancelable]
    }
    
    extension [Self <: ICancelable](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    }
  }
  
  @js.native
  trait ICapturable extends StObject {
    
    /**
      * This method is used to capture the element view
      * @param canvas {HTMLCanvasElement} - HTML Canvas element to draw the view of the capturable element
      * @param pixelRation {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
      * @param callback {ICapturable~captureCallback} - Callback function to call once result of the capturing is ready
      * @param opt_errback {ICapturable~errorCallback} - Callback function to call if error occurred during capturing
      */
    def capture(
      canvas: HTMLCanvasElement,
      pixelRation: Double,
      callback: js.Function1[/* canvas */ js.UndefOr[HTMLCanvasElement], Unit]
    ): Unit = js.native
    def capture(
      canvas: HTMLCanvasElement,
      pixelRation: Double,
      callback: js.Function1[/* canvas */ js.UndefOr[HTMLCanvasElement], Unit],
      opt_errback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
  }
  
  /**
    * There is no documentation about this API
    */
  object Job {
    
    type Priority = Any
  }
  
  /**
    * This class represents an list of ordered entries which dispatches events when the list is modified.
    * @event add {H.util.OList.Event} - Fired when an entry was added to the list.
    * @event remove {H.util.OList.Event} - Fired when an entry was removed from the list.
    * @event set {H.util.OList.Event} - Fired when an entry was set in the list.
    * @event move {H.util.OList.Event} - Fired when an entry was moved within the list.
    */
  @js.native
  trait OList
    extends StObject
       with EventTarget {
    
    /**
      * This method inserts an entry to the list. Optionally it can place new entry at provided index.
      * @param entry {?} - The entry to insert
      * @param opt_idx {number=} - The index where the new entry should be inserted; if omitted or greater then the current size of the list, the entry is added at the end of the list;
      * a negative index is treated as being relative from the end of the list
      */
    def add(entry: Any): Unit = js.native
    def add(entry: Any, opt_idx: Double): Unit = js.native
    
    def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
    
    /**
      * This method returns all list's entries as an array.
      * @returns {Array<*>} - The list as an array
      */
    def asArray(): js.Array[Any] = js.native
    
    /**
      * This method removes all entries from the list.
      */
    def flush(): Unit = js.native
    
    /**
      * To get the entry at the specified index.
      * @param idx {number} - The index of the entry to get a negative index is treated as being relative from the end of the list
      * @returns {?} - The element at the given index
      */
    def get(idx: Double): Any = js.native
    
    /**
      * This method returns the length of the list.
      * @returns {number}
      */
    def getLength(): Double = js.native
    
    /**
      * This method retrieves the index of the first object in this list that is identical with the object supplied by the caller.
      * @param entry {?} - The entry for which to return the index.
      * @returns {number} - The index of the first matching entry in this list or -1 if the entry provided by the caller is not found in the list
      */
    def indexOf(entry: Any): Double = js.native
    
    /**
      * This method removes the the first entry which is identical with the given entry.
      * @param entry {?} - The entry to remove
      * @returns {boolean} - signals if the entry could be found in the list and is removed
      */
    def remove(entry: Any): Boolean = js.native
    
    /**
      * This method removes an entry by a given index from the list.
      * @param idx {number} - The index of the entry which should be removed; a negative index is treated as being relative from the end of the list
      * @returns {?} - The removed entry
      */
    def removeAt(idx: Double): Any = js.native
    
    /**
      * This method replaces an entry at the given index with the given entry.
      * @param idx {number} - The index of the entry which should be replaced; a negative index is treated as being relative from the end of the list
      * @param entry {?} - The entry which replaces the existing one
      * @returns {?} - The replaced entry
      */
    def set(idx: Double, entry: Any): Any = js.native
  }
  object OList {
    
    /**
      * The event class for events that are dispatched by OList
      * @property target {*} - Object which triggered the event
      * @property currentTarget {*} - Object which has listener attached
      * @property type {string} - Name of the dispatched event
      * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
      */
    trait Event
      extends StObject
         with typingsJapgolly.heremaps.H.util.Event
    object Event {
      
      inline def apply(
        currentTarget: Any,
        defaultPrevented: Boolean,
        preventDefault: Callback,
        stopPropagation: Callback,
        target: Any,
        `type`: String
      ): typingsJapgolly.heremaps.H.util.OList.Event = {
        val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.heremaps.H.util.OList.Event]
      }
    }
  }
  
  object animation {
    
    /**
      * This mamespace contains easing functions used for Animation class.
      */
    trait ease extends StObject
  }
  
  object kinetics {
    
    /**
      * This interface defines kinetic move parameters used by map for kinetic drag.
      * @property power {number} - Power multiplier. Multiplier is used to increase the speed of the kinetic move. By default map uses 1.
      * @property duration {number} - Defines duration of the kinetic move.
      */
    trait IKinetics extends StObject {
      
      var duration: Double
      
      /**
        * Easing function modifies animation progress. In example it can modify the animation in a way it starts rapidly and then slows down at the end.
        * @param p {number} - current progress
        * @returns {number} - modified progress
        */
      def ease(p: Double): Double
      
      var power: Double
    }
    object IKinetics {
      
      inline def apply(duration: Double, ease: Double => Double, power: Double): IKinetics = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), power = power.asInstanceOf[js.Any])
        __obj.asInstanceOf[IKinetics]
      }
      
      extension [Self <: IKinetics](x: Self) {
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setEase(value: Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
        
        inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      }
    }
  }
}
