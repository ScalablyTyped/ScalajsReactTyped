package typingsJapgolly.asynciterator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.asynciterator.anon.AutoStart
import typingsJapgolly.asynciterator.anon.BufferedIteratorOptionsde
import typingsJapgolly.asynciterator.anon.End
import typingsJapgolly.asynciterator.anon.Limit
import typingsJapgolly.asynciterator.distTaskschedulerMod.Task
import typingsJapgolly.asynciterator.distTaskschedulerMod.TaskScheduler
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asynciterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("asynciterator", "ArrayIterator")
  @js.native
  /**
    Creates a new `ArrayIterator`.
    @param {Array} items The items that will be emitted.
    @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
    @param {boolean} [options.preserve=true] If false, the passed array can be safely modified
    */
  open class ArrayIterator[T] () extends AsyncIterator[T] {
    def this(items: js.Iterable[T]) = this()
    def this(items: js.Iterable[T], hasAutoStartPreserve: AutoStart) = this()
    def this(items: Unit, hasAutoStartPreserve: AutoStart) = this()
    
    /* private */ var _buffer: Any = js.native
    
    /* protected */ var _index: Double = js.native
    
    /* protected */ var _sourceStarted: Boolean = js.native
    
    /* protected */ var _truncateThreshold: Double = js.native
  }
  
  @JSImport("asynciterator", "AsyncIterator")
  @js.native
  /** Creates a new `AsyncIterator`. */
  open class AsyncIterator[T] () extends EventEmitter {
    def this(initialState: Double) = this()
    
    /**
      Changes the iterator to the given state if possible and necessary,
      possibly emitting events to signal that change.
      @protected
      @param {integer} newState The ID of the new state
      @param {boolean} [eventAsync=false] Whether resulting events should be emitted asynchronously
      @returns {boolean} Whether the state was changed
      @emits module:asynciterator.AsyncIterator.end
      */
    /* protected */ def _changeState(newState: Double): Boolean = js.native
    /* protected */ def _changeState(newState: Double, eventAsync: Boolean): Boolean = js.native
    
    /**
      Called by {@link module:asynciterator.AsyncIterator#destroy}.
      Implementers can override this, but this should not be called directly.
      @param {?Error} cause The reason why the iterator is destroyed.
      @param {Function} callback A callback function with an optional error argument.
      */
    /* protected */ def _destroy(cause: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    /* protected */ def _destroy(cause: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      Ends the iterator and cleans up.
      Should never be called before {@link module:asynciterator.AsyncIterator#close};
      typically, `close` is responsible for calling `_end`.
      @param {boolean} [destroy] If the iterator should be forcefully destroyed.
      @protected
      @emits module:asynciterator.AsyncIterator.end
      */
    /* protected */ def _end(): Unit = js.native
    /* protected */ def _end(destroy: Boolean): Unit = js.native
    
    /**
      Asynchronously calls `_end`.
      @protected
      */
    /* protected */ def _endAsync(): Unit = js.native
    
    /* protected */ var _properties: js.UndefOr[StringDictionary[Any]] = js.native
    
    /* protected */ var _propertyCallbacks: js.UndefOr[StringDictionary[js.Array[js.Function1[/* value */ Any, Unit]]]] = js.native
    
    /* private */ var _readable: Any = js.native
    
    /* protected */ var _state: Double = js.native
    
    /**
      Generates details for a textual representation of the iterator.
      @protected
      */
    /* protected */ def _toStringDetails(): String = js.native
    
    /**
      Appends the items after those of the current iterator.
      After this operation, only read the returned iterator instead of the current one.
      @param {Array|module:asynciterator.AsyncIterator} items Items to insert after this iterator's (remaining) items
      @returns {module:asynciterator.AsyncIterator} A new iterator that appends items to this iterator
      */
    def append(items: js.Array[T]): AsyncIterator[T] = js.native
    def append(items: AsyncIterator[T]): AsyncIterator[T] = js.native
    
    /**
      Stops the iterator from generating new items.
      Already generated items or terminating items can still be emitted.
      After this, the iterator will end asynchronously.
      @emits module:asynciterator.AsyncIterator.end
      */
    def close(): Unit = js.native
    
    /**
      Gets whether the iterator has stopped generating new items.
      @type boolean
      @readonly
      */
    def closed: Boolean = js.native
    
    /**
      Copies the given properties from the source iterator.
      @param {module:asynciterator.AsyncIterator} source The iterator to copy from
      @param {Array} propertyNames List of property names to copy
      */
    def copyProperties(source: AsyncIterator[Any], propertyNames: js.Array[String]): Unit = js.native
    
    /**
      Destroy the iterator and stop it from generating new items.
      This will not do anything if the iterator was already ended or destroyed.
      All internal resources will be released an no new items will be emitted,
      even not already generated items.
      Implementors should not override this method,
      but instead implement {@link module:asynciterator.AsyncIterator#_destroy}.
      @param {Error} [cause] An optional error to emit.
      @emits module:asynciterator.AsyncIterator.end
      @emits module:asynciterator.AsyncIterator.error Only if an error is passed.
      */
    def destroy(): Unit = js.native
    def destroy(cause: js.Error): Unit = js.native
    
    /**
      Gets whether the iterator has been destroyed.
      @type boolean
      @readonly
      */
    def destroyed: Boolean = js.native
    
    /**
      Gets whether the iterator will not emit anymore items,
      either due to being closed or due to being destroyed.
      @type boolean
      @readonly
      */
    def done: Boolean = js.native
    
    /**
      Gets whether the iterator has finished emitting items.
      @type boolean
      @readonly
      */
    def ended: Boolean = js.native
    
    def filter(filter: js.Function1[/* item */ T, Boolean]): AsyncIterator[T] = js.native
    def filter(filter: js.Function1[/* item */ T, Boolean], self: Any): AsyncIterator[T] = js.native
    /**
      Return items from this iterator that match the filter.
      After this operation, only read the returned iterator instead of the current one.
      @param {Function} filter A filter function to call on this iterator's (remaining) items
      @param {object?} self The `this` pointer for the filter function
      @returns {module:asynciterator.AsyncIterator} A new iterator that filters items from this iterator
      */
    @JSName("filter")
    def filter_K[K /* <: T */](filter: js.Function1[/* item */ T, /* is K */ Boolean]): AsyncIterator[K] = js.native
    @JSName("filter")
    def filter_K[K /* <: T */](filter: js.Function1[/* item */ T, /* is K */ Boolean], self: Any): AsyncIterator[K] = js.native
    
    /**
      The iterator emits a `readable` event when it might have new items available
      after having had no items available right before this event.
      If the iterator is not in flow mode, items can be retrieved
      by calling {@link module:asynciterator.AsyncIterator#read}.
      @event module:asynciterator.readable
      */
    /**
      The iterator emits a `data` event with a new item as soon as it becomes available.
      When one or more listeners are attached to the `data` event,
      the iterator switches to _flow mode_,
      generating and emitting new items as fast as possible.
      This drains the source and might create backpressure on the consumers,
      so only subscribe to this event if this behavior is intended.
      In flow mode, don't use {@link module:asynciterator.AsyncIterator#read}.
      To switch back to _on-demand mode_, remove all listeners from the `data` event.
      You can then obtain items through `read` again.
      @event module:asynciterator.data
      @param {object} item The new item
      */
    /**
      Invokes the callback for each remaining item in the iterator.
      Switches the iterator to flow mode.
      @param {Function} callback A function that will be called with each item
      @param {object?} self The `this` pointer for the callback
      */
    def forEach(callback: js.Function1[/* item */ T, Unit]): Unit = js.native
    def forEach(callback: js.Function1[/* item */ T, Unit], self: js.Object): Unit = js.native
    
    /**
      Retrieves all properties of the iterator.
      @returns {object} An object with property names as keys.
      */
    def getProperties(): StringDictionary[Any] = js.native
    
    /**
      Retrieves the property with the given name from the iterator.
      If no callback is passed, it returns the value of the property
      or `undefined` if the property is not set.
      If a callback is passed, it returns `undefined`
      and calls the callback with the property the moment it is set.
      @param {string} propertyName The name of the property to retrieve
      @param {Function?} [callback] A one-argument callback to receive the property value
      @returns {object?} The value of the property (if set and no callback is given)
      */
    def getProperty[P](propertyName: String): js.UndefOr[P] = js.native
    def getProperty[P](propertyName: String, callback: js.Function1[/* value */ P, Unit]): js.UndefOr[P] = js.native
    
    /**
      Maps items from this iterator using the given function.
      After this operation, only read the returned iterator instead of the current one.
      @param {Function} map A mapping function to call on this iterator's (remaining) items
      @param {object?} self The `this` pointer for the mapping function
      @returns {module:asynciterator.AsyncIterator} A new iterator that maps the items from this iterator
      */
    def map[D](map: MapFunction[T, D]): AsyncIterator[D] = js.native
    def map[D](map: MapFunction[T, D], self: Any): AsyncIterator[D] = js.native
    
    /**
      Prepends the items after those of the current iterator.
      After this operation, only read the returned iterator instead of the current one.
      @param {Array|module:asynciterator.AsyncIterator} items Items to insert before this iterator's (remaining) items
      @returns {module:asynciterator.AsyncIterator} A new iterator that prepends items to this iterator
      */
    def prepend(items: js.Array[T]): AsyncIterator[T] = js.native
    def prepend(items: AsyncIterator[T]): AsyncIterator[T] = js.native
    
    /**
      Limits the current iterator to the given range.
      The current iterator may not be read anymore until the returned iterator ends.
      @param {integer} start Index of the first item to return
      @param {integer} end Index of the last item to return
      @returns {module:asynciterator.AsyncIterator} A new iterator with items in the given range
      */
    def range(start: Double, end: Double): AsyncIterator[T] = js.native
    
    /**
      Tries to read the next item from the iterator.
      This is the main method for reading the iterator in _on-demand mode_,
      where new items are only created when needed by consumers.
      If no items are currently available, this methods returns `null`.
      The {@link module:asynciterator.event:readable} event
      will then signal when new items might be ready.
      To read all items from the iterator,
      switch to _flow mode_ by subscribing
      to the {@link module:asynciterator.event:data} event.
      When in flow mode, do not use the `read` method.
      @returns {object?} The next item, or `null` if none is available
      */
    def read(): T | Null = js.native
    
    /**
      The `end` event is emitted after the last item of the iterator has been read.
      @event module:asynciterator.end
      */
    /**
      Gets or sets whether this iterator might have items available for read.
      A value of `false` means there are _definitely_ no items available;
      a value of `true` means items _might_ be available.
      @type boolean
      @emits module:asynciterator.AsyncIterator.readable
      */
    def readable: Boolean = js.native
    def readable_=(readable: Boolean): Unit = js.native
    
    /**
      Sets all of the given properties.
      @param {object} properties Key/value pairs of properties to set
      */
    def setProperties(properties: StringDictionary[Any]): Unit = js.native
    
    /**
      Sets the property with the given name to the value.
      @param {string} propertyName The name of the property to set
      @param {object?} value The new value of the property
      */
    def setProperty[P](propertyName: String, value: P): Unit = js.native
    
    /**
      Skips the given number of items from the current iterator.
      The current iterator may not be read anymore until the returned iterator ends.
      @param {integer} offset The number of items to skip
      @returns {module:asynciterator.AsyncIterator} A new iterator that skips the given number of items
      */
    def skip(offset: Double): AsyncIterator[T] = js.native
    
    /**
      Surrounds items of the current iterator with the given items.
      After this operation, only read the returned iterator instead of the current one.
      @param {Array|module:asynciterator.AsyncIterator} prepend Items to insert before this iterator's (remaining) items
      @param {Array|module:asynciterator.AsyncIterator} append Items to insert after this iterator's (remaining) items
      @returns {module:asynciterator.AsyncIterator} A new iterator that appends and prepends items to this iterator
      */
    def surround(prepend: AsyncIteratorOrArray[T], append: AsyncIteratorOrArray[T]): AsyncIterator[T] = js.native
    
    /**
      Limits the current iterator to the given number of items.
      The current iterator may not be read anymore until the returned iterator ends.
      @param {integer} limit The maximum number of items
      @returns {module:asynciterator.AsyncIterator} A new iterator with at most the given number of items
      */
    def take(limit: Double): AsyncIterator[T] = js.native
    
    /**
      Consume all remaining items of the iterator into an array that will be returned asynchronously.
      @param {object} [options] Settings for array creation
      @param {integer} [options.limit] The maximum number of items to place in the array.
      */
    def toArray(): js.Promise[js.Array[T]] = js.native
    def toArray(options: Limit): js.Promise[js.Array[T]] = js.native
    
    /**
      Transforms items from this iterator.
      After this operation, only read the returned iterator instead of the current one.
      @param {object|Function} [options] Settings of the iterator, or the transformation function
      @param {integer} [options.maxbufferSize=4] The maximum number of items to keep in the buffer
      @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
      @param {integer} [options.offset] The number of items to skip
      @param {integer} [options.limit] The maximum number of items
      @param {Function} [options.filter] A function to synchronously filter items from the source
      @param {Function} [options.map] A function to synchronously transform items from the source
      @param {Function} [options.transform] A function to asynchronously transform items from the source
      @param {boolean} [options.optional=false] If transforming is optional, the original item is pushed when its mapping yields `null` or its transformation yields no items
      @param {Array|module:asynciterator.AsyncIterator} [options.prepend] Items to insert before the source items
      @param {Array|module:asynciterator.AsyncIterator} [options.append]  Items to insert after the source items
      @returns {module:asynciterator.AsyncIterator} A new iterator that maps the items from this iterator
      */
    def transform[D](options: TransformOptions[T, D]): AsyncIterator[D] = js.native
    
    /**
      * Returns a new iterator containing all of the unique items in the original iterator.
      * @param by - The derived value by which to determine uniqueness (e.g., stringification).
      Defaults to the identity function.
      * @returns An iterator with duplicates filtered out.
      */
    def uniq(): AsyncIterator[T] = js.native
    def uniq(by: js.Function1[/* item */ T, Any]): AsyncIterator[T] = js.native
  }
  
  @JSImport("asynciterator", "BufferedIterator")
  @js.native
  /**
    Creates a new `BufferedIterator`.
    @param {object} [options] Settings of the iterator
    @param {integer} [options.maxBufferSize=4] The number of items to preload in the internal buffer
    @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
    */
  open class BufferedIterator[T] () extends AsyncIterator[T] {
    def this(hasMaxBufferSizeAutoStart: BufferedIteratorOptions) = this()
    
    /**
      Writes beginning items and opens iterator resources.
      Should never be called before {@link BufferedIterator#_init};
      typically, `_init` is responsible for calling `_begin`.
      @protected
      @param {function} done To be called when initialization is complete
      */
    /* protected */ def _begin(done: js.Function0[Unit]): Unit = js.native
    
    /* private */ var _buffer: Any = js.native
    
    /**
      Stops the iterator from generating new items,
      switching from `CLOSING` state into `CLOSED` state.
      @protected
      @emits module:asynciterator.AsyncIterator.end
      */
    /* protected */ def _completeClose(): Unit = js.native
    
    /**
      Fills the internal buffer until `this._maxBufferSize` items are present.
      This method calls {@link BufferedIterator#_read} to fetch items.
      @protected
      @emits module:asynciterator.AsyncIterator.readable
      */
    /* protected */ def _fillBuffer(): Unit = js.native
    
    /**
      Schedules `_fillBuffer` asynchronously.
      */
    /* protected */ def _fillBufferAsync(): Unit = js.native
    
    /**
      Writes terminating items and closes iterator resources.
      Should never be called before {@link BufferedIterator#close};
      typically, `close` is responsible for calling `_flush`.
      @protected
      @param {function} done To be called when termination is complete
      */
    /* protected */ def _flush(done: js.Function0[Unit]): Unit = js.native
    
    /**
      Initializing the iterator by calling {@link BufferedIterator#_begin}
      and changing state from INIT to OPEN.
      @protected
      @param {boolean} autoStart Whether reading of items should immediately start after OPEN.
      */
    /* protected */ def _init(autoStart: Boolean): Unit = js.native
    
    /* private */ var _maxBufferSize: Any = js.native
    
    /**
      Adds an item to the internal buffer.
      @protected
      @param {object} item The item to add
      @emits module:asynciterator.AsyncIterator.readable
      */
    /* protected */ def _push(item: T): Unit = js.native
    
    /* protected */ var _pushedCount: Double = js.native
    
    /**
      Tries to generate the given number of items.
      Implementers should add `count` items through {@link BufferedIterator#_push}.
      @protected
      @param {integer} count The number of items to generate
      @param {function} done To be called when reading is complete
      */
    /* protected */ def _read(count: Double, done: js.Function0[Unit]): Unit = js.native
    
    /* protected */ var _reading: Boolean = js.native
    
    /* protected */ var _sourceStarted: Boolean = js.native
    
    /**
      The maximum number of items to preload in the internal buffer.
      A `BufferedIterator` tries to fill its buffer as far as possible.
      Set to `Infinity` to fully drain the source.
      @type number
      */
    def maxBufferSize: Double = js.native
    def maxBufferSize_=(maxBufferSize: Double): Unit = js.native
  }
  
  @JSImport("asynciterator", "CLOSED")
  @js.native
  val CLOSED: Double = js.native
  
  @JSImport("asynciterator", "CLOSING")
  @js.native
  val CLOSING: Double = js.native
  
  @JSImport("asynciterator", "ClonedIterator")
  @js.native
  open class ClonedIterator[T] protected () extends TransformIterator[T, T] {
    /**
      Creates a new `ClonedIterator`.
      @param {module:asynciterator.AsyncIterator|Readable} [source] The source this iterator copies items from
      */
    def this(source: AsyncIterator[T]) = this()
    
    /* protected */ def _getSourceProperty[P](propertyName: String, callback: js.Function1[/* value */ P, Unit]): Unit = js.native
    
    /* protected */ def _init(): Unit = js.native
    
    /* private */ var _readPosition: Any = js.native
  }
  
  @JSImport("asynciterator", "DESTINATION")
  @js.native
  val DESTINATION: js.Symbol = js.native
  
  @JSImport("asynciterator", "DESTROYED")
  @js.native
  val DESTROYED: Double = js.native
  
  @JSImport("asynciterator", "ENDED")
  @js.native
  val ENDED: Double = js.native
  
  @JSImport("asynciterator", "EmptyIterator")
  @js.native
  /** Creates a new `EmptyIterator`. */
  open class EmptyIterator[T] () extends AsyncIterator[T]
  
  @JSImport("asynciterator", "INIT")
  @js.native
  val INIT: Double = js.native
  
  @JSImport("asynciterator", "IntegerIterator")
  @js.native
  /**
    Creates a new `IntegerIterator`.
    @param {object} [options] Settings of the iterator
    @param {integer} [options.start=0] The first number to emit
    @param {integer} [options.end=Infinity] The last number to emit
    @param {integer} [options.step=1] The increment between two numbers
    */
  open class IntegerIterator () extends AsyncIterator[Double] {
    def this(hasStartStepEnd: End) = this()
    
    /* private */ var _last: Any = js.native
    
    /* private */ var _next: Any = js.native
    
    /* private */ var _step: Any = js.native
  }
  
  @JSImport("asynciterator", "LinkedList")
  @js.native
  open class LinkedList[V] ()
    extends typingsJapgolly.asynciterator.distLinkedlistMod.LinkedList[V]
  
  @JSImport("asynciterator", "MappingIterator")
  @js.native
  open class MappingIterator[S, D] protected () extends AsyncIterator[D] {
    /**
      * Applies the given mapping to the source iterator.
      */
    def this(source: AsyncIterator[S]) = this()
    def this(source: AsyncIterator[S], map: MapFunction[S, D]) = this()
    def this(source: AsyncIterator[S], map: Unit, options: SourcedIteratorOptions) = this()
    def this(source: AsyncIterator[S], map: MapFunction[S, D], options: SourcedIteratorOptions) = this()
    
    /* protected */ val _destroySource: Boolean = js.native
    
    /* protected */ def _map(item: S): D | Null = js.native
    
    /* protected */ val _source: InternalSource[S] = js.native
  }
  
  @JSImport("asynciterator", "MultiTransformIterator")
  @js.native
  open class MultiTransformIterator[S, D] protected () extends TransformIterator[S, D] {
    /**
      Creates a new `MultiTransformIterator`.
      @param {module:asynciterator.AsyncIterator|Readable} [source] The source this iterator generates items from
      @param {object|Function} [options] Settings of the iterator, or the transformation function
      @param {integer} [options.maxbufferSize=4] The maximum number of items to keep in the buffer
      @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
      @param {module:asynciterator.AsyncIterator} [options.source] The source this iterator generates items from
      @param {integer} [options.offset] The number of items to skip
      @param {integer} [options.limit] The maximum number of items
      @param {Function} [options.filter] A function to synchronously filter items from the source
      @param {Function} [options.map] A function to synchronously transform items from the source
      @param {Function} [options.transform] A function to asynchronously transform items from the source
      @param {boolean} [options.optional=false] If transforming is optional, the original item is pushed when its mapping yields `null` or its transformation yields no items
      @param {Function} [options.multiTransform] A function to asynchronously transform items to iterators from the source
      @param {Array|module:asynciterator.AsyncIterator} [options.prepend] Items to insert before the source items
      @param {Array|module:asynciterator.AsyncIterator} [options.append]  Items to insert after the source items
      */
    def this(source: AsyncIterator[S]) = this()
    def this(
      source: AsyncIterator[S],
      options: (MultiTransformOptions[S, D]) & (js.Function1[/* item */ S, AsyncIterator[D]])
    ) = this()
    def this(source: AsyncIterator[S], options: MultiTransformOptions[S, D]) = this()
    
    /**
      Creates a transformer for the given item.
      @param {object} item The last read item from the source
      @returns {module:asynciterator.AsyncIterator} An iterator that transforms the given item
      */
    /* protected */ def _createTransformer(item: S): AsyncIterator[D] = js.native
    
    /* private */ var _transformerQueue: Any = js.native
  }
  
  @JSImport("asynciterator", "OPEN")
  @js.native
  val OPEN: Double = js.native
  
  @JSImport("asynciterator", "SimpleTransformIterator")
  @js.native
  /**
    Creates a new `SimpleTransformIterator`.
    @param {module:asynciterator.AsyncIterator|Readable} [source] The source this iterator generates items from
    @param {object|Function} [options] Settings of the iterator, or the transformation function
    @param {integer} [options.maxbufferSize=4] The maximum number of items to keep in the buffer
    @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
    @param {module:asynciterator.AsyncIterator} [options.source] The source this iterator generates items from
    @param {integer} [options.offset] The number of items to skip
    @param {integer} [options.limit] The maximum number of items
    @param {Function} [options.filter] A function to synchronously filter items from the source
    @param {Function} [options.map] A function to synchronously transform items from the source
    @param {Function} [options.transform] A function to asynchronously transform items from the source
    @param {boolean} [options.optional=false] If transforming is optional, the original item is pushed when its mapping yields `null` or its transformation yields no items
    @param {Array|module:asynciterator.AsyncIterator} [options.prepend] Items to insert before the source items
    @param {Array|module:asynciterator.AsyncIterator} [options.append]  Items to insert after the source items
    */
  open class SimpleTransformIterator[S, D] () extends TransformIterator[S, D] {
    def this(source: SourceExpression[S]) = this()
    def this(
      source: Unit,
      options: (TransformOptions[S, D]) & (js.Function2[/* item */ S, /* done */ js.Function0[Unit], Unit])
    ) = this()
    def this(source: Unit, options: TransformOptions[S, D]) = this()
    def this(
      source: SourceExpression[S],
      options: (TransformOptions[S, D]) & (js.Function2[/* item */ S, /* done */ js.Function0[Unit], Unit])
    ) = this()
    def this(source: SourceExpression[S], options: TransformOptions[S, D]) = this()
    
    /* private */ var _appender: Any = js.native
    
    /* private */ var _filter: Any = js.native
    
    /* protected */ def _insert(inserter: Unit, done: js.Function0[Unit]): Unit = js.native
    /* protected */ def _insert(inserter: AsyncIterator[D], done: js.Function0[Unit]): Unit = js.native
    
    /* private */ var _limit: Any = js.native
    
    /* private */ var _map: Any = js.native
    
    /* private */ var _offset: Any = js.native
    
    /* private */ var _prepender: Any = js.native
    
    /* protected */ def _readAndTransformSimple(count: Double, next: js.Function0[Unit], done: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("asynciterator", "SingletonIterator")
  @js.native
  open class SingletonIterator[T] protected () extends AsyncIterator[T] {
    /**
      Creates a new `SingletonIterator`.
      @param {object} item The item that will be emitted.
      */
    def this(item: T) = this()
    
    /* private */ var _item: Any = js.native
  }
  
  @JSImport("asynciterator", "TransformIterator")
  @js.native
  /**
    Creates a new `TransformIterator`.
    @param {module:asynciterator.AsyncIterator|Readable} [source] The source this iterator generates items from
    @param {object} [options] Settings of the iterator
    @param {integer} [options.maxBufferSize=4] The maximum number of items to keep in the buffer
    @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
    @param {boolean} [options.optional=false] If transforming is optional, the original item is pushed when its transformation yields no items
    @param {boolean} [options.destroySource=true] Whether the source should be destroyed when this transformed iterator is closed or destroyed
    @param {module:asynciterator.AsyncIterator} [options.source] The source this iterator generates items from
    */
  open class TransformIterator[S, D] () extends BufferedIterator[D] {
    def this(source: SourceExpression[S]) = this()
    def this(source: Unit, options: TransformIteratorOptions[S]) = this()
    def this(source: SourceExpression[S], options: TransformIteratorOptions[S]) = this()
    
    /* protected */ def _boundPush(item: D): Unit = js.native
    
    /**
      Closes the iterator when pending items are transformed.
      @protected
      */
    /* protected */ def _closeWhenDone(): Unit = js.native
    
    /* protected */ var _createSource: js.UndefOr[js.Function0[MaybePromise[AsyncIterator[S]]] | Null] = js.native
    
    /* protected */ var _destroySource: Boolean = js.native
    
    /**
      Initializes a source that was set through a promise
      @protected
      */
    /* protected */ def _loadSourceAsync(): Unit = js.native
    
    /* protected */ var _optional: Boolean = js.native
    
    /**
      Tries to transform the item;
      if the transformation yields no items, pushes the original item.
      */
    /* protected */ def _optionalTransform(item: S, done: js.Function0[Unit]): Unit = js.native
    
    /**
      Reads a transforms an item
      */
    /* protected */ def _readAndTransform(next: js.Function0[Unit], done: js.Function0[Unit]): Unit = js.native
    
    /* protected */ var _source: js.UndefOr[InternalSource[S]] = js.native
    
    /**
      Generates items based on the item from the source.
      Implementers should add items through {@link BufferedIterator#_push}.
      The default implementation pushes the source item as-is.
      @protected
      @param {object} item The last read item from the source
      @param {function} done To be called when reading is complete
      @param {function} push A callback to push zero or more transformation results.
      */
    /* protected */ def _transform(item: S, done: js.Function0[Unit], push: js.Function1[/* i */ D, Unit]): Unit = js.native
    
    /**
      Validates whether the given iterator can be used as a source.
      @protected
      @param {object} source The source to validate
      @param {boolean} allowDestination Whether the source can already have a destination
      */
    /* protected */ def _validateSource(): InternalSource[S] = js.native
    /* protected */ def _validateSource(source: Unit, allowDestination: Boolean): InternalSource[S] = js.native
    /* protected */ def _validateSource(source: AsyncIterator[S]): InternalSource[S] = js.native
    /* protected */ def _validateSource(source: AsyncIterator[S], allowDestination: Boolean): InternalSource[S] = js.native
    
    /**
      The source this iterator generates items from.
      @type module:asynciterator.AsyncIterator
      */
    def source: js.UndefOr[AsyncIterator[S]] = js.native
    def source_=(value: js.UndefOr[AsyncIterator[S]]): Unit = js.native
  }
  
  @JSImport("asynciterator", "UnionIterator")
  @js.native
  open class UnionIterator[T] protected () extends BufferedIterator[T] {
    /**
      Creates a new `UnionIterator`.
      @param {module:asynciterator.AsyncIterator|Array} [sources] The sources to read from
      @param {object} [options] Settings of the iterator
      @param {boolean} [options.destroySource=true] Whether the sources should be destroyed when transformed iterator is closed or destroyed
      */
    def this(sources: AsyncIteratorOrArray[AsyncIterator[T] | MaybePromise[AsyncIterator[T]] | js.Promise[AsyncIterator[T]]]) = this()
    def this(
      sources: AsyncIteratorOrArray[AsyncIterator[T] | MaybePromise[AsyncIterator[T]] | js.Promise[AsyncIterator[T]]],
      options: BufferedIteratorOptionsde
    ) = this()
    
    /* protected */ def _addSource(source: MaybePromise[InternalSource[T]]): Unit = js.native
    
    /* private */ var _currentSource: Any = js.native
    
    /* protected */ var _destroySources: Boolean = js.native
    
    /* protected */ def _loadSources(): Unit = js.native
    
    /* private */ var _pending: Any = js.native
    
    /* protected */ def _removeEmptySources(): Unit = js.native
    
    /* private */ var _sources: Any = js.native
  }
  
  @JSImport("asynciterator", "WrappingIterator")
  @js.native
  open class WrappingIterator[T] () extends AsyncIterator[T] {
    def this(source: MaybePromise[IterableSource[T]]) = this()
    def this(source: Unit, opts: SourcedIteratorOptions) = this()
    def this(source: MaybePromise[IterableSource[T]], opts: SourcedIteratorOptions) = this()
    
    /* protected */ var _destroySource: Boolean = js.native
    
    /* protected */ var _source: InternalSource[T] | Null = js.native
    
    def source_=(value: IterableSource[T]): Unit = js.native
  }
  
  inline def empty[T](): AsyncIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[AsyncIterator[T]]
  
  inline def fromArray[T](items: js.Iterable[T]): AsyncIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(items.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T]]
  
  inline def fromIterable[T](source: js.Iterable[T]): AsyncIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T]]
  inline def fromIterable[T](source: js.Iterator[T]): AsyncIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T]]
  
  inline def fromIterator[T](source: js.Iterable[T]): AsyncIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterator")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T]]
  inline def fromIterator[T](source: js.Iterator[T]): AsyncIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterator")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T]]
  
  inline def getTaskScheduler(): TaskScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("getTaskScheduler")().asInstanceOf[TaskScheduler]
  
  inline def identity[S](item: S): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isEventEmitter(`object`: Any): /* is node.events.EventEmitter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEventEmitter")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is node.events.EventEmitter */ Boolean]
  
  inline def isFunction(`object`: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isIterable[T](`object`: StringDictionary[Any]): /* is std.Iterable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<T> */ Boolean]
  
  inline def isIterator[T](`object`: StringDictionary[Any]): /* is std.Iterator<T, any, undefined> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterator")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterator<T, any, undefined> */ Boolean]
  
  inline def isPromise[T](`object`: Any): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  
  inline def isSourceExpression[T](`object`: Any): /* is asynciterator.asynciterator.SourceExpression<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSourceExpression")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is asynciterator.asynciterator.SourceExpression<T> */ Boolean]
  
  inline def range(start: Double, end: Double): IntegerIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[IntegerIterator]
  inline def range(start: Double, end: Double, step: Double): IntegerIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IntegerIterator]
  
  inline def scheduleTask(task: Task): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTask")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTaskScheduler(scheduler: TaskScheduler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTaskScheduler")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def single[T](item: T): AsyncIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(item.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T]]
  
  inline def union[T](
    sources: AsyncIteratorOrArray[AsyncIterator[T] | MaybePromise[AsyncIterator[T]] | js.Promise[AsyncIterator[T]]]
  ): UnionIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(sources.asInstanceOf[js.Any]).asInstanceOf[UnionIterator[T]]
  
  inline def wrap[T](): AsyncIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")().asInstanceOf[AsyncIterator[T]]
  inline def wrap[T](source: Null, options: TransformIteratorOptions[T]): AsyncIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[T]]
  inline def wrap[T](source: Unit, options: TransformIteratorOptions[T]): AsyncIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[T]]
  inline def wrap[T](source: MaybePromise[IterableSource[T]]): AsyncIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T]]
  inline def wrap[T](source: MaybePromise[IterableSource[T]], options: TransformIteratorOptions[T]): AsyncIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[T]]
  
  type AsyncIteratorOrArray[T] = js.Array[T] | AsyncIterator[T]
  
  trait BufferedIteratorOptions extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var maxBufferSize: js.UndefOr[Double] = js.undefined
  }
  object BufferedIteratorOptions {
    
    inline def apply(): BufferedIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferedIteratorOptions]
    }
    
    extension [Self <: BufferedIteratorOptions](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
    }
  }
  
  @js.native
  trait InternalSource[T] extends AsyncIterator[T]
  
  type IterableSource[T] = js.Array[T] | AsyncIterator[T] | EventEmitter | js.Iterator[T] | js.Iterable[T]
  
  type MapFunction[S, D] = js.Function1[/* item */ S, D | Null]
  
  type MaybePromise[T] = T | js.Promise[T]
  
  trait MultiTransformOptions[S, D]
    extends StObject
       with TransformOptions[S, D] {
    
    var multiTransform: js.UndefOr[js.Function1[/* item */ S, AsyncIterator[D]]] = js.undefined
  }
  object MultiTransformOptions {
    
    inline def apply[S, D](): MultiTransformOptions[S, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiTransformOptions[S, D]]
    }
    
    extension [Self <: MultiTransformOptions[?, ?], S, D](x: Self & (MultiTransformOptions[S, D])) {
      
      inline def setMultiTransform(value: /* item */ S => AsyncIterator[D]): Self = StObject.set(x, "multiTransform", js.Any.fromFunction1(value))
      
      inline def setMultiTransformUndefined: Self = StObject.set(x, "multiTransform", js.undefined)
    }
  }
  
  type SourceExpression[T] = MaybePromise[AsyncIterator[T]] | js.Function0[MaybePromise[AsyncIterator[T]]]
  
  trait SourcedIteratorOptions extends StObject {
    
    var destroySource: js.UndefOr[Boolean] = js.undefined
  }
  object SourcedIteratorOptions {
    
    inline def apply(): SourcedIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourcedIteratorOptions]
    }
    
    extension [Self <: SourcedIteratorOptions](x: Self) {
      
      inline def setDestroySource(value: Boolean): Self = StObject.set(x, "destroySource", value.asInstanceOf[js.Any])
      
      inline def setDestroySourceUndefined: Self = StObject.set(x, "destroySource", js.undefined)
    }
  }
  
  trait TransformIteratorOptions[S]
    extends StObject
       with SourcedIteratorOptions
       with BufferedIteratorOptions {
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[SourceExpression[S]] = js.undefined
  }
  object TransformIteratorOptions {
    
    inline def apply[S](): TransformIteratorOptions[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformIteratorOptions[S]]
    }
    
    extension [Self <: TransformIteratorOptions[?], S](x: Self & TransformIteratorOptions[S]) {
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setSource(value: SourceExpression[S]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceCallbackTo(value: CallbackTo[MaybePromise[AsyncIterator[S]]]): Self = StObject.set(x, "source", value.toJsFn)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait TransformOptions[S, D]
    extends StObject
       with TransformIteratorOptions[S] {
    
    var append: js.UndefOr[AsyncIteratorOrArray[D]] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* item */ S, Boolean]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[js.Function1[/* item */ S, D]] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var prepend: js.UndefOr[AsyncIteratorOrArray[D]] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[
          /* item */ S, 
          /* done */ js.Function0[Unit], 
          /* push */ js.Function1[/* i */ D, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object TransformOptions {
    
    inline def apply[S, D](): TransformOptions[S, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions[S, D]]
    }
    
    extension [Self <: TransformOptions[?, ?], S, D](x: Self & (TransformOptions[S, D])) {
      
      inline def setAppend(value: AsyncIteratorOrArray[D]): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setAppendVarargs(value: D*): Self = StObject.set(x, "append", js.Array(value*))
      
      inline def setFilter(value: /* item */ S => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMap(value: /* item */ S => D): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPrepend(value: AsyncIteratorOrArray[D]): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setPrependVarargs(value: D*): Self = StObject.set(x, "prepend", js.Array(value*))
      
      inline def setTransform(
        value: (/* item */ S, /* done */ js.Function0[Unit], /* push */ js.Function1[/* i */ D, Unit]) => Callback
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3((t0: /* item */ S, t1: /* done */ js.Function0[Unit], t2: /* push */ js.Function1[/* i */ D, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
