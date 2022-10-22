package typingsJapgolly.jupyterlabObservables

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typingsJapgolly.jupyterlabObservables.libModeldbMod.IObservable
import typingsJapgolly.jupyterlabObservables.libModeldbMod.ObservableType
import typingsJapgolly.jupyterlabObservables.libObservablemapMod.IObservableMap.IChangedArgs
import typingsJapgolly.jupyterlabObservables.libObservablemapMod.ObservableMap.IOptions
import typingsJapgolly.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObservablemapMod {
  
  @JSImport("@jupyterlab/observables/lib/observablemap", "ObservableMap")
  @js.native
  /**
    * Construct a new observable map.
    */
  open class ObservableMap[T] ()
    extends StObject
       with IObservableMap[T] {
    def this(options: IOptions[T]) = this()
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _itemCmp: Any = js.native
    
    /* private */ var _map: Any = js.native
    
    /**
      * A signal emitted when the map has changed.
      */
    /* CompleteClass */
    override val changed: ISignal[this.type, IChangedArgs[T]] = js.native
    /**
      * A signal emitted when the map has changed.
      */
    @JSName("changed")
    def changed_MObservableMap: ISignal[this.type, IChangedArgs[T]] = js.native
    
    /**
      * Set the ObservableMap to an empty map.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Remove a key from the map
      *
      * @param key - the key to remove.
      *
      * @returns the value of the given key,
      *   or undefined if that does not exist.
      */
    /* CompleteClass */
    override def delete(key: String): js.UndefOr[T] = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Get a value for a given key.
      *
      * @param key - the key.
      *
      * @returns the value for that key.
      */
    /* CompleteClass */
    override def get(key: String): js.UndefOr[T] = js.native
    
    /**
      * Check whether the map has a key.
      *
      * @param key - the key to check.
      *
      * @returns `true` if the map has the key, `false` otherwise.
      */
    /* CompleteClass */
    override def has(key: String): Boolean = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Whether this map has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MObservableMap: Boolean = js.native
    
    /**
      * Get a list of the keys in the map.
      *
      * @returns - a list of keys.
      */
    /* CompleteClass */
    override def keys(): js.Array[String] = js.native
    
    /**
      * Set a key-value pair in the map
      *
      * @param key - The key to set.
      *
      * @param value - The value for the key.
      *
      * @returns the old value for the key, or undefined
      *   if that did not exist.
      */
    /* CompleteClass */
    override def set(key: String, value: T): js.UndefOr[T] = js.native
    
    /**
      * The number of key-value pairs in the map.
      */
    /* CompleteClass */
    override val size: Double = js.native
    /**
      * The number of key-value pairs in the map.
      */
    @JSName("size")
    def size_MObservableMap: Double = js.native
    
    /**
      * The type of this object.
      */
    /* CompleteClass */
    override val `type`: ObservableType = js.native
    /**
      * The type of the Observable.
      */
    /* CompleteClass */
    @JSName("type")
    var type_IObservableMap: Map = js.native
    /**
      * The type of the Observable.
      */
    @JSName("type")
    def type_MObservableMap: Map = js.native
    
    /**
      * Get a list of the values in the map.
      *
      * @returns - a list of values.
      */
    /* CompleteClass */
    override def values(): js.Array[T] = js.native
  }
  object ObservableMap {
    
    /**
      * The options used to initialize an observable map.
      */
    trait IOptions[T] extends StObject {
      
      /**
        * The item comparison function for change detection on `set`.
        *
        * If not given, strict `===` equality will be used.
        */
      var itemCmp: js.UndefOr[js.Function2[/* first */ T, /* second */ T, Boolean]] = js.undefined
      
      /**
        * An optional initial set of values.
        */
      var values: js.UndefOr[StringDictionary[T]] = js.undefined
    }
    object IOptions {
      
      inline def apply[T](): IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T](x: Self & IOptions[T]) {
        
        inline def setItemCmp(value: (/* first */ T, /* second */ T) => Boolean): Self = StObject.set(x, "itemCmp", js.Any.fromFunction2(value))
        
        inline def setItemCmpUndefined: Self = StObject.set(x, "itemCmp", js.undefined)
        
        inline def setValues(value: StringDictionary[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      }
    }
  }
  
  trait IObservableMap[T]
    extends StObject
       with IObservable {
    
    /**
      * A signal emitted when the map has changed.
      */
    val changed: ISignal[this.type, IChangedArgs[T]]
    
    /**
      * Set the ObservableMap to an empty map.
      */
    def clear(): Unit
    
    /**
      * Remove a key from the map
      *
      * @param key - the key to remove.
      *
      * @returns the value of the given key,
      *   or undefined if that does not exist.
      */
    def delete(key: String): js.UndefOr[T]
    
    /**
      * Get a value for a given key.
      *
      * @param key - the key.
      *
      * @returns the value for that key.
      */
    def get(key: String): js.UndefOr[T]
    
    /**
      * Check whether the map has a key.
      *
      * @param key - the key to check.
      *
      * @returns `true` if the map has the key, `false` otherwise.
      */
    def has(key: String): Boolean
    
    /**
      * Get a list of the keys in the map.
      *
      * @returns - a list of keys.
      */
    def keys(): js.Array[String]
    
    /**
      * Set a key-value pair in the map
      *
      * @param key - The key to set.
      *
      * @param value - The value for the key.
      *
      * @returns the old value for the key, or undefined
      *   if that did not exist.
      */
    def set(key: String, value: T): js.UndefOr[T]
    
    /**
      * The number of key-value pairs in the map.
      */
    val size: Double
    
    /**
      * The type of the Observable.
      */
    @JSName("type")
    var type_IObservableMap: Map
    
    /**
      * Get a list of the values in the map.
      *
      * @returns - a list of values.
      */
    def values(): js.Array[T]
  }
  object IObservableMap {
    
    inline def apply[T](
      changed: ISignal[IObservableMap[T], IChangedArgs[T]],
      clear: Callback,
      delete: String => js.UndefOr[T],
      dispose: Callback,
      get: String => js.UndefOr[T],
      has: String => Boolean,
      isDisposed: Boolean,
      keys: CallbackTo[js.Array[String]],
      set: (String, T) => js.UndefOr[T],
      size: Double,
      values: CallbackTo[js.Array[T]]
    ): IObservableMap[T] = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = clear.toJsFn, delete = js.Any.fromFunction1(delete), dispose = dispose.toJsFn, get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = keys.toJsFn, set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = values.toJsFn)
      __obj.updateDynamic("type")("Map")
      __obj.asInstanceOf[IObservableMap[T]]
    }
    
    /**
      * The change types which occur on an observable map.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.add
      - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.remove
      - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.change
    */
    trait ChangeType extends StObject
    object ChangeType {
      
      inline def add: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.add = "add".asInstanceOf[typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.add]
      
      inline def change: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.change = "change".asInstanceOf[typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.change]
      
      inline def remove: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.remove = "remove".asInstanceOf[typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.remove]
    }
    
    /**
      * The changed args object which is emitted by an observable map.
      */
    trait IChangedArgs[T] extends StObject {
      
      /**
        * The key of the change.
        */
      var key: String
      
      /**
        * The new value of the change.
        */
      var newValue: js.UndefOr[T] = js.undefined
      
      /**
        * The old value of the change.
        */
      var oldValue: js.UndefOr[T] = js.undefined
      
      /**
        * The type of change undergone by the map.
        */
      var `type`: ChangeType
    }
    object IChangedArgs {
      
      inline def apply[T](key: String, `type`: ChangeType): IChangedArgs[T] = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IChangedArgs[T]]
      }
      
      extension [Self <: IChangedArgs[?], T](x: Self & IChangedArgs[T]) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
        
        inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
        
        inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
        
        inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
        
        inline def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: IObservableMap[?], T](x: Self & IObservableMap[T]) {
      
      inline def setChanged(value: ISignal[IObservableMap[T], IChangedArgs[T]]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setDelete(value: String => js.UndefOr[T]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSet(value: (String, T) => js.UndefOr[T]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: Map): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
}
