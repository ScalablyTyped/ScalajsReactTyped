package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.anon.First
import typingsJapgolly.winrt.anon.Index
import typingsJapgolly.winrt.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collections {
  
  @js.native
  sealed trait CollectionChange extends StObject
  @JSGlobal("Windows.Foundation.Collections.CollectionChange")
  @js.native
  object CollectionChange extends StObject {
    
    @js.native
    sealed trait itemChanged
      extends StObject
         with CollectionChange
    
    @js.native
    sealed trait itemInserted
      extends StObject
         with CollectionChange
    
    @js.native
    sealed trait itemRemoved
      extends StObject
         with CollectionChange
    
    @js.native
    sealed trait reset
      extends StObject
         with CollectionChange
  }
  
  trait IIterable[T] extends StObject {
    
    def first(): IIterator[T]
  }
  object IIterable {
    
    inline def apply[T](first: CallbackTo[IIterator[T]]): IIterable[T] = {
      val __obj = js.Dynamic.literal(first = first.toJsFn)
      __obj.asInstanceOf[IIterable[T]]
    }
    
    extension [Self <: IIterable[?], T](x: Self & IIterable[T]) {
      
      inline def setFirst(value: CallbackTo[IIterator[T]]): Self = StObject.set(x, "first", value.toJsFn)
    }
  }
  
  trait IIterator[T] extends StObject {
    
    var current: T
    
    def getMany(): Items[T]
    
    var hasCurrent: Boolean
    
    def moveNext(): Boolean
  }
  object IIterator {
    
    inline def apply[T](current: T, getMany: CallbackTo[Items[T]], hasCurrent: Boolean, moveNext: CallbackTo[Boolean]): IIterator[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = getMany.toJsFn, hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = moveNext.toJsFn)
      __obj.asInstanceOf[IIterator[T]]
    }
    
    extension [Self <: IIterator[?], T](x: Self & IIterator[T]) {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setGetMany(value: CallbackTo[Items[T]]): Self = StObject.set(x, "getMany", value.toJsFn)
      
      inline def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
      
      inline def setMoveNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "moveNext", value.toJsFn)
    }
  }
  
  trait IKeyValuePair[K, V] extends StObject {
    
    var key: K
    
    var value: V
  }
  object IKeyValuePair {
    
    inline def apply[K, V](key: K, value: V): IKeyValuePair[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyValuePair[K, V]]
    }
    
    extension [Self <: IKeyValuePair[?, ?], K, V](x: Self & (IKeyValuePair[K, V])) {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMap[K, V]
    extends StObject
       with IIterable[IKeyValuePair[K, V]] {
    
    def clear(): Unit
    
    def getView(): IMapView[K, V]
    
    def hasKey(key: K): Boolean
    
    def insert(key: K, value: V): Boolean
    
    def lookup(key: K): V
    
    def remove(key: K): Unit
    
    var size: Double
  }
  object IMap {
    
    inline def apply[K, V](
      clear: Callback,
      first: CallbackTo[IIterator[IKeyValuePair[K, V]]],
      getView: CallbackTo[IMapView[K, V]],
      hasKey: K => Boolean,
      insert: (K, V) => Boolean,
      lookup: K => V,
      remove: K => Callback,
      size: Double
    ): IMap[K, V] = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, first = first.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1((t0: K) => remove(t0).runNow()), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMap[K, V]]
    }
    
    extension [Self <: IMap[?, ?], K, V](x: Self & (IMap[K, V])) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setGetView(value: CallbackTo[IMapView[K, V]]): Self = StObject.set(x, "getView", value.toJsFn)
      
      inline def setHasKey(value: K => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      inline def setInsert(value: (K, V) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      inline def setLookup(value: K => V): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setRemove(value: K => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: K) => value(t0).runNow()))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMapChangedEventArgs[K] extends StObject {
    
    var collectionChange: CollectionChange
    
    var key: K
  }
  object IMapChangedEventArgs {
    
    inline def apply[K](collectionChange: CollectionChange, key: K): IMapChangedEventArgs[K] = {
      val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMapChangedEventArgs[K]]
    }
    
    extension [Self <: IMapChangedEventArgs[?], K](x: Self & IMapChangedEventArgs[K]) {
      
      inline def setCollectionChange(value: CollectionChange): Self = StObject.set(x, "collectionChange", value.asInstanceOf[js.Any])
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMapView[K, V]
    extends StObject
       with IIterable[IKeyValuePair[K, V]] {
    
    def hasKey(key: K): Boolean
    
    def lookup(key: K): V
    
    var size: Double
    
    def split(): First[K, V]
  }
  object IMapView {
    
    inline def apply[K, V](
      first: CallbackTo[IIterator[IKeyValuePair[K, V]]],
      hasKey: K => Boolean,
      lookup: K => V,
      size: Double,
      split: CallbackTo[First[K, V]]
    ): IMapView[K, V] = {
      val __obj = js.Dynamic.literal(first = first.toJsFn, hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = split.toJsFn)
      __obj.asInstanceOf[IMapView[K, V]]
    }
    
    extension [Self <: IMapView[?, ?], K, V](x: Self & (IMapView[K, V])) {
      
      inline def setHasKey(value: K => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      inline def setLookup(value: K => V): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSplit(value: CallbackTo[First[K, V]]): Self = StObject.set(x, "split", value.toJsFn)
    }
  }
  
  trait IObservableMap[K, V]
    extends StObject
       with IMap[K, V] {
    
    var onmapchanged: Any
  }
  object IObservableMap {
    
    inline def apply[K, V](
      clear: Callback,
      first: CallbackTo[IIterator[IKeyValuePair[K, V]]],
      getView: CallbackTo[IMapView[K, V]],
      hasKey: K => Boolean,
      insert: (K, V) => Boolean,
      lookup: K => V,
      onmapchanged: Any,
      remove: K => Callback,
      size: Double
    ): IObservableMap[K, V] = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, first = first.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: K) => remove(t0).runNow()), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableMap[K, V]]
    }
    
    extension [Self <: IObservableMap[?, ?], K, V](x: Self & (IObservableMap[K, V])) {
      
      inline def setOnmapchanged(value: Any): Self = StObject.set(x, "onmapchanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IObservableVector[T]
    extends StObject
       with IVector[T] {
    
    var onvectorchanged: Any = js.native
  }
  
  trait IPropertySet
    extends StObject
       with IObservableMap[String, Any]
  object IPropertySet {
    
    inline def apply(
      clear: Callback,
      first: CallbackTo[IIterator[IKeyValuePair[String, Any]]],
      getView: CallbackTo[IMapView[String, Any]],
      hasKey: String => Boolean,
      insert: (String, Any) => Boolean,
      lookup: String => Any,
      onmapchanged: Any,
      remove: String => Callback,
      size: Double
    ): IPropertySet = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, first = first.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPropertySet]
    }
  }
  
  @js.native
  trait IVector[T]
    extends StObject
       with IIterable[T] {
    
    def append(value: T): Unit = js.native
    
    def clear(): Unit = js.native
    
    def concat(items: js.Array[T]*): js.Array[T] = js.native
    
    def every(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
    def every(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: Any
    ): Boolean = js.native
    
    def filter(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): js.Array[T] = js.native
    def filter(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: Any
    ): js.Array[T] = js.native
    
    def forEach(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: Any
    ): Unit = js.native
    
    def getAt(index: Double): T = js.native
    
    def getMany(startIndex: Double): Items[T] = js.native
    
    def getView(): IVectorView[T] = js.native
    
    def indexOf(value: T): Index = js.native
    
    def insertAt(index: Double, value: T): Unit = js.native
    
    def join(seperator: String): String = js.native
    
    def lastIndexOf(searchElement: T): Double = js.native
    def lastIndexOf(searchElement: T, fromIndex: Double): Double = js.native
    
    var length: Double = js.native
    
    def map(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Any]): js.Array[Any] = js.native
    def map(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Any],
      thisArg: Any
    ): js.Array[Any] = js.native
    
    def pop(): T = js.native
    
    def push(items: T*): Unit = js.native
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          Any
        ]
    ): Any = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          Any
        ],
      initialValue: Any
    ): Any = js.native
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          Any
        ]
    ): Any = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          Any
        ],
      initialValue: Any
    ): Any = js.native
    
    def removeAt(index: Double): Unit = js.native
    
    def removeAtEnd(): Unit = js.native
    
    def replaceAll(items: js.Array[T]): Unit = js.native
    
    def reverse(): js.Array[T] = js.native
    
    def setAt(index: Double, value: T): Unit = js.native
    
    def shift(): T = js.native
    
    var size: Double = js.native
    
    def slice(start: Double): js.Array[T] = js.native
    def slice(start: Double, end: Double): js.Array[T] = js.native
    
    def some(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
    def some(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: Any
    ): Boolean = js.native
    
    def sort(): js.Array[T] = js.native
    def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
    
    def splice(start: Double): js.Array[T] = js.native
    def splice(start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
    
    def unshift(items: T*): Double = js.native
  }
  
  trait IVectorChangedEventArgs extends StObject {
    
    var collectionChange: CollectionChange
    
    var index: Double
  }
  object IVectorChangedEventArgs {
    
    inline def apply(collectionChange: CollectionChange, index: Double): IVectorChangedEventArgs = {
      val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVectorChangedEventArgs]
    }
    
    extension [Self <: IVectorChangedEventArgs](x: Self) {
      
      inline def setCollectionChange(value: CollectionChange): Self = StObject.set(x, "collectionChange", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IVectorView[T]
    extends StObject
       with IIterable[T] {
    
    def concat(items: js.Array[T]*): js.Array[T] = js.native
    
    def every(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
    def every(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: Any
    ): Boolean = js.native
    
    def filter(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): js.Array[T] = js.native
    def filter(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: Any
    ): js.Array[T] = js.native
    
    def forEach(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: Any
    ): Unit = js.native
    
    def getAt(index: Double): T = js.native
    
    def getMany(startIndex: Double): Items[T] = js.native
    
    def indexOf(value: T): Index = js.native
    
    def join(seperator: String): String = js.native
    
    def lastIndexOf(searchElement: T): Double = js.native
    def lastIndexOf(searchElement: T, fromIndex: Double): Double = js.native
    
    var length: Double = js.native
    
    def map(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Any]): js.Array[Any] = js.native
    def map(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Any],
      thisArg: Any
    ): js.Array[Any] = js.native
    
    def pop(): T = js.native
    
    def push(items: T*): Unit = js.native
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          Any
        ]
    ): Any = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          Any
        ],
      initialValue: Any
    ): Any = js.native
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          Any
        ]
    ): Any = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          Any
        ],
      initialValue: Any
    ): Any = js.native
    
    def reverse(): js.Array[T] = js.native
    
    def shift(): T = js.native
    
    var size: Double = js.native
    
    def slice(start: Double): js.Array[T] = js.native
    def slice(start: Double, end: Double): js.Array[T] = js.native
    
    def some(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
    def some(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: Any
    ): Boolean = js.native
    
    def sort(): js.Array[T] = js.native
    def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
    
    def splice(start: Double): js.Array[T] = js.native
    def splice(start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
    
    def unshift(items: T*): Double = js.native
  }
  
  type MapChangedEventHandler[K, V] = js.Function2[/* sender */ IObservableMap[K, V], /* event */ IMapChangedEventArgs[K], Unit]
  
  trait PropertySet
    extends StObject
       with IPropertySet
  object PropertySet {
    
    inline def apply(
      clear: Callback,
      first: CallbackTo[IIterator[IKeyValuePair[String, Any]]],
      getView: CallbackTo[IMapView[String, Any]],
      hasKey: String => Boolean,
      insert: (String, Any) => Boolean,
      lookup: String => Any,
      onmapchanged: Any,
      remove: String => Callback,
      size: Double
    ): PropertySet = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, first = first.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertySet]
    }
  }
  
  trait ValueSet
    extends StObject
       with IPropertySet
  object ValueSet {
    
    inline def apply(
      clear: Callback,
      first: CallbackTo[IIterator[IKeyValuePair[String, Any]]],
      getView: CallbackTo[IMapView[String, Any]],
      hasKey: String => Boolean,
      insert: (String, Any) => Boolean,
      lookup: String => Any,
      onmapchanged: Any,
      remove: String => Callback,
      size: Double
    ): ValueSet = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, first = first.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueSet]
    }
  }
  
  type VectorChangedEventHandler[T] = js.Function2[/* sender */ IObservableVector[T], /* event */ IVectorChangedEventArgs, Unit]
}
