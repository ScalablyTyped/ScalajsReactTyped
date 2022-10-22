package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.meteorTypings.Meteor.LiveQueryHandle
import typingsJapgolly.meteorTypings.anon.Connection
import typingsJapgolly.meteorTypings.anon.Fetch
import typingsJapgolly.meteorTypings.anon.InsertedId
import typingsJapgolly.meteorTypings.anon.Limit
import typingsJapgolly.meteorTypings.anon.Multi
import typingsJapgolly.meteorTypings.anon.Skip
import typingsJapgolly.meteorTypings.anon.`1`
import typingsJapgolly.std.Number
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mongo {
  
  trait AllowDenyOptions extends StObject {
    
    var fetch: js.UndefOr[js.Array[String]] = js.undefined
    
    var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ Any, Boolean]] = js.undefined
    
    var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ Any, Boolean]] = js.undefined
    
    var transform: js.UndefOr[js.Function] = js.undefined
    
    var update: js.UndefOr[
        js.Function4[
          /* userId */ String, 
          /* doc */ Any, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Any, 
          Boolean
        ]
      ] = js.undefined
  }
  object AllowDenyOptions {
    
    inline def apply(): AllowDenyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowDenyOptions]
    }
    
    extension [Self <: AllowDenyOptions](x: Self) {
      
      inline def setFetch(value: js.Array[String]): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setFetchVarargs(value: String*): Self = StObject.set(x, "fetch", js.Array(value*))
      
      inline def setInsert(value: (/* userId */ String, /* doc */ Any) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setRemove(value: (/* userId */ String, /* doc */ Any) => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUpdate(
        value: (/* userId */ String, /* doc */ Any, /* fieldNames */ js.Array[String], /* modifier */ Any) => Boolean
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait Collection[T] extends StObject {
    
    def _dropIndex(keys: String): Unit = js.native
    def _dropIndex(keys: StringDictionary[Double | String]): Unit = js.native
    
    def _ensureIndex(keys: String): Unit = js.native
    def _ensureIndex(keys: String, options: StringDictionary[Any]): Unit = js.native
    def _ensureIndex(keys: StringDictionary[Double | String]): Unit = js.native
    def _ensureIndex(keys: StringDictionary[Double | String], options: StringDictionary[Any]): Unit = js.native
    
    def allow(options: Fetch[T]): Boolean = js.native
    
    def deny(options: Fetch[T]): Boolean = js.native
    
    def find(): Cursor[T] = js.native
    def find(selector: String): Cursor[T] = js.native
    def find(selector: String, options: Limit): Cursor[T] = js.native
    def find(selector: Unit, options: Limit): Cursor[T] = js.native
    def find(selector: ObjectID): Cursor[T] = js.native
    def find(selector: ObjectID, options: Limit): Cursor[T] = js.native
    def find(selector: Selector): Cursor[T] = js.native
    def find(selector: Selector, options: Limit): Cursor[T] = js.native
    
    def findOne(): T = js.native
    def findOne(selector: String): T = js.native
    def findOne(selector: String, options: Skip): T = js.native
    def findOne(selector: Unit, options: Skip): T = js.native
    def findOne(selector: ObjectID): T = js.native
    def findOne(selector: ObjectID, options: Skip): T = js.native
    def findOne(selector: Selector): T = js.native
    def findOne(selector: Selector, options: Skip): T = js.native
    
    def insert(doc: T): String = js.native
    def insert(doc: T, callback: js.Function): String = js.native
    
    def rawCollection(): Any = js.native
    
    def rawDatabase(): Any = js.native
    
    def remove(selector: String): Double = js.native
    def remove(selector: String, callback: js.Function): Double = js.native
    def remove(selector: ObjectID): Double = js.native
    def remove(selector: ObjectID, callback: js.Function): Double = js.native
    def remove(selector: Selector): Double = js.native
    def remove(selector: Selector, callback: js.Function): Double = js.native
    
    def update(selector: String, modifier: Modifier): Double = js.native
    def update(selector: String, modifier: Modifier, options: Unit, callback: js.Function): Double = js.native
    def update(selector: String, modifier: Modifier, options: Multi): Double = js.native
    def update(selector: String, modifier: Modifier, options: Multi, callback: js.Function): Double = js.native
    def update(selector: ObjectID, modifier: Modifier): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Unit, callback: js.Function): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Multi): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Multi, callback: js.Function): Double = js.native
    def update(selector: Selector, modifier: Modifier): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Unit, callback: js.Function): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Multi): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Multi, callback: js.Function): Double = js.native
    
    def upsert(selector: String, modifier: Modifier): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: Unit, callback: js.Function): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: `1`): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: `1`, callback: js.Function): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: Unit, callback: js.Function): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: `1`): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: `1`, callback: js.Function): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: Unit, callback: js.Function): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: `1`): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: `1`, callback: js.Function): InsertedId = js.native
  }
  
  @js.native
  trait CollectionStatic
    extends StObject
       with Instantiable0[Collection[js.Object]]
       with Instantiable1[/* name */ String, Collection[js.Object]]
       with Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ Connection, 
          Collection[js.Object]
        ]
  
  @js.native
  trait Cursor[T] extends StObject {
    
    def count(): Double = js.native
    def count(applySkipLimit: Boolean): Double = js.native
    
    def fetch(): js.Array[T] = js.native
    
    def forEach(callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], Unit],
      thisArg: Any
    ): Unit = js.native
    
    def map[U](callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
    def map[U](callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U], thisArg: Any): js.Array[U] = js.native
    
    def observe(callbacks: ObserveCallbacks): LiveQueryHandle = js.native
    
    def observeChanges(callbacks: ObserveChangesCallbacks): LiveQueryHandle = js.native
  }
  
  @js.native
  trait CursorStatic
    extends StObject
       with Instantiable0[Cursor[js.Object]]
  
  type FieldSpecifier = StringDictionary[Number]
  
  trait Modifier extends StObject
  
  trait ObjectID extends StObject
  
  @js.native
  trait ObjectIDStatic
    extends StObject
       with Instantiable0[ObjectID]
       with Instantiable1[/* hexString */ String, ObjectID]
  
  trait ObserveCallbacks extends StObject {
    
    var added: js.UndefOr[js.Function1[/* document */ js.Object, Unit]] = js.undefined
    
    var addedAt: js.UndefOr[
        js.Function3[/* document */ js.Object, /* atIndex */ Double, /* before */ js.Object, Unit]
      ] = js.undefined
    
    var changed: js.UndefOr[js.Function2[/* newDocument */ js.Object, /* oldDocument */ js.Object, Unit]] = js.undefined
    
    var changedAt: js.UndefOr[
        js.Function3[/* newDocument */ js.Object, /* oldDocument */ js.Object, /* indexAt */ Double, Unit]
      ] = js.undefined
    
    var movedTo: js.UndefOr[
        js.Function4[
          /* document */ js.Object, 
          /* fromIndex */ Double, 
          /* toIndex */ Double, 
          /* before */ js.Object, 
          Unit
        ]
      ] = js.undefined
    
    var removed: js.UndefOr[js.Function1[/* oldDocument */ js.Object, Unit]] = js.undefined
    
    var removedAt: js.UndefOr[js.Function2[/* oldDocument */ js.Object, /* atIndex */ Double, Unit]] = js.undefined
  }
  object ObserveCallbacks {
    
    inline def apply(): ObserveCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObserveCallbacks]
    }
    
    extension [Self <: ObserveCallbacks](x: Self) {
      
      inline def setAdded(value: /* document */ js.Object => Callback): Self = StObject.set(x, "added", js.Any.fromFunction1((t0: /* document */ js.Object) => value(t0).runNow()))
      
      inline def setAddedAt(value: (/* document */ js.Object, /* atIndex */ Double, /* before */ js.Object) => Callback): Self = StObject.set(x, "addedAt", js.Any.fromFunction3((t0: /* document */ js.Object, t1: /* atIndex */ Double, t2: /* before */ js.Object) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddedAtUndefined: Self = StObject.set(x, "addedAt", js.undefined)
      
      inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      inline def setChanged(value: (/* newDocument */ js.Object, /* oldDocument */ js.Object) => Callback): Self = StObject.set(x, "changed", js.Any.fromFunction2((t0: /* newDocument */ js.Object, t1: /* oldDocument */ js.Object) => (value(t0, t1)).runNow()))
      
      inline def setChangedAt(
        value: (/* newDocument */ js.Object, /* oldDocument */ js.Object, /* indexAt */ Double) => Callback
      ): Self = StObject.set(x, "changedAt", js.Any.fromFunction3((t0: /* newDocument */ js.Object, t1: /* oldDocument */ js.Object, t2: /* indexAt */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setChangedAtUndefined: Self = StObject.set(x, "changedAt", js.undefined)
      
      inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
      
      inline def setMovedTo(
        value: (/* document */ js.Object, /* fromIndex */ Double, /* toIndex */ Double, /* before */ js.Object) => Callback
      ): Self = StObject.set(x, "movedTo", js.Any.fromFunction4((t0: /* document */ js.Object, t1: /* fromIndex */ Double, t2: /* toIndex */ Double, t3: /* before */ js.Object) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setMovedToUndefined: Self = StObject.set(x, "movedTo", js.undefined)
      
      inline def setRemoved(value: /* oldDocument */ js.Object => Callback): Self = StObject.set(x, "removed", js.Any.fromFunction1((t0: /* oldDocument */ js.Object) => value(t0).runNow()))
      
      inline def setRemovedAt(value: (/* oldDocument */ js.Object, /* atIndex */ Double) => Callback): Self = StObject.set(x, "removedAt", js.Any.fromFunction2((t0: /* oldDocument */ js.Object, t1: /* atIndex */ Double) => (value(t0, t1)).runNow()))
      
      inline def setRemovedAtUndefined: Self = StObject.set(x, "removedAt", js.undefined)
      
      inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    }
  }
  
  trait ObserveChangesCallbacks extends StObject {
    
    var added: js.UndefOr[js.Function2[/* id */ String, /* fields */ js.Object, Unit]] = js.undefined
    
    var addedBefore: js.UndefOr[
        js.Function3[/* id */ String, /* fields */ js.Object, /* before */ js.Object, Unit]
      ] = js.undefined
    
    var changed: js.UndefOr[js.Function2[/* id */ String, /* fields */ js.Object, Unit]] = js.undefined
    
    var movedBefore: js.UndefOr[js.Function2[/* id */ String, /* before */ js.Object, Unit]] = js.undefined
    
    var removed: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
  }
  object ObserveChangesCallbacks {
    
    inline def apply(): ObserveChangesCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObserveChangesCallbacks]
    }
    
    extension [Self <: ObserveChangesCallbacks](x: Self) {
      
      inline def setAdded(value: (/* id */ String, /* fields */ js.Object) => Callback): Self = StObject.set(x, "added", js.Any.fromFunction2((t0: /* id */ String, t1: /* fields */ js.Object) => (value(t0, t1)).runNow()))
      
      inline def setAddedBefore(value: (/* id */ String, /* fields */ js.Object, /* before */ js.Object) => Callback): Self = StObject.set(x, "addedBefore", js.Any.fromFunction3((t0: /* id */ String, t1: /* fields */ js.Object, t2: /* before */ js.Object) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddedBeforeUndefined: Self = StObject.set(x, "addedBefore", js.undefined)
      
      inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      inline def setChanged(value: (/* id */ String, /* fields */ js.Object) => Callback): Self = StObject.set(x, "changed", js.Any.fromFunction2((t0: /* id */ String, t1: /* fields */ js.Object) => (value(t0, t1)).runNow()))
      
      inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
      
      inline def setMovedBefore(value: (/* id */ String, /* before */ js.Object) => Callback): Self = StObject.set(x, "movedBefore", js.Any.fromFunction2((t0: /* id */ String, t1: /* before */ js.Object) => (value(t0, t1)).runNow()))
      
      inline def setMovedBeforeUndefined: Self = StObject.set(x, "movedBefore", js.undefined)
      
      inline def setRemoved(value: /* id */ String => Callback): Self = StObject.set(x, "removed", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
      
      inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    }
  }
  
  trait Selector
    extends StObject
       with Object
       with /* key */ StringDictionary[Any]
  object Selector {
    
    inline def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): Selector = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[Selector]
    }
  }
  
  trait SortSpecifier extends StObject
}
