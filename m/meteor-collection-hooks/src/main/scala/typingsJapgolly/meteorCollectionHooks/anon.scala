package typingsJapgolly.meteorCollectionHooks

import japgolly.scalajs.react.Callback
import typingsJapgolly.meteorCollectionHooks.meteorMongoMod.CollectionHooks.HookOptionValue
import typingsJapgolly.meteorCollectionHooks.meteorMongoMod.CollectionHooks.ModifierOptions
import typingsJapgolly.meteorTypings.Mongo.Cursor
import typingsJapgolly.meteorTypings.Mongo.FieldSpecifier
import typingsJapgolly.meteorTypings.Mongo.Modifier
import typingsJapgolly.meteorTypings.Mongo.ObjectID
import typingsJapgolly.meteorTypings.Mongo.Selector
import typingsJapgolly.meteorTypings.Mongo.SortSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.UndefOr[FieldSpecifier] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var reactive: js.UndefOr[Boolean] = js.undefined
    
    var skip: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[SortSpecifier] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* doc */ Any, Unit]] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: FieldSpecifier): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setReactive(value: Boolean): Self = StObject.set(x, "reactive", value.asInstanceOf[js.Any])
      
      inline def setReactiveUndefined: Self = StObject.set(x, "reactive", js.undefined)
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSort(value: SortSpecifier): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTransform(value: /* doc */ Any => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction1((t0: /* doc */ Any) => value(t0).runNow()))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait Find[T] extends StObject {
    
    def find(
      hook: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit]
    ): Unit
    
    def findOne(
      hook: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit]
    ): Unit
    
    def insert(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit
    
    def remove(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit
    
    def update(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ ModifierOptions, 
          Unit
        ]
    ): Unit
    
    def upsert(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* selector */ Selector, 
          /* modifier */ Modifier, 
          /* options */ ModifierOptions, 
          Unit
        ]
    ): Unit
  }
  object Find {
    
    inline def apply[T](
      find: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit] => Callback,
      findOne: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit] => Callback,
      insert: js.Function2[/* userId */ String, /* doc */ T, Unit] => Callback,
      remove: js.Function2[/* userId */ String, /* doc */ T, Unit] => Callback,
      update: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ ModifierOptions, 
          Unit
        ] => Callback,
      upsert: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* selector */ Selector, 
          /* modifier */ Modifier, 
          /* options */ ModifierOptions, 
          Unit
        ] => Callback
    ): Find[T] = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1((t0: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit]) => find(t0).runNow()), findOne = js.Any.fromFunction1((t0: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit]) => findOne(t0).runNow()), insert = js.Any.fromFunction1((t0: js.Function2[/* userId */ String, /* doc */ T, Unit]) => insert(t0).runNow()), remove = js.Any.fromFunction1((t0: js.Function2[/* userId */ String, /* doc */ T, Unit]) => remove(t0).runNow()), update = js.Any.fromFunction1((t0: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ ModifierOptions, 
          Unit
        ]) => update(t0).runNow()), upsert = js.Any.fromFunction1((t0: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* selector */ Selector, 
          /* modifier */ Modifier, 
          /* options */ ModifierOptions, 
          Unit
        ]) => upsert(t0).runNow()))
      __obj.asInstanceOf[Find[T]]
    }
    
    extension [Self <: Find[?], T](x: Self & Find[T]) {
      
      inline def setFind(
        value: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit] => Callback
      ): Self = StObject.set(x, "find", js.Any.fromFunction1((t0: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit]) => value(t0).runNow()))
      
      inline def setFindOne(
        value: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit] => Callback
      ): Self = StObject.set(x, "findOne", js.Any.fromFunction1((t0: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit]) => value(t0).runNow()))
      
      inline def setInsert(value: js.Function2[/* userId */ String, /* doc */ T, Unit] => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: js.Function2[/* userId */ String, /* doc */ T, Unit]) => value(t0).runNow()))
      
      inline def setRemove(value: js.Function2[/* userId */ String, /* doc */ T, Unit] => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: js.Function2[/* userId */ String, /* doc */ T, Unit]) => value(t0).runNow()))
      
      inline def setUpdate(
        value: js.Function5[
              /* userId */ String, 
              /* doc */ T, 
              /* fieldNames */ js.Array[String], 
              /* modifier */ Modifier, 
              /* options */ ModifierOptions, 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: js.Function5[
              /* userId */ String, 
              /* doc */ T, 
              /* fieldNames */ js.Array[String], 
              /* modifier */ Modifier, 
              /* options */ ModifierOptions, 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setUpsert(
        value: js.Function5[
              /* userId */ String, 
              /* doc */ T, 
              /* selector */ Selector, 
              /* modifier */ Modifier, 
              /* options */ ModifierOptions, 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "upsert", js.Any.fromFunction1((t0: js.Function5[
              /* userId */ String, 
              /* doc */ T, 
              /* selector */ Selector, 
              /* modifier */ Modifier, 
              /* options */ ModifierOptions, 
              Unit
            ]) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait FindOne[T] extends StObject {
    
    def find(
      hook: js.Function4[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ ModifierOptions, 
          /* cursor */ Cursor[T], 
          Unit
        ]
    ): Unit = js.native
    
    def findOne(
      hook: js.Function4[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ ModifierOptions, 
          /* doc */ T, 
          Unit
        ]
    ): Unit = js.native
    
    def insert(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit = js.native
    
    def remove(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit = js.native
    
    def update(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ ModifierOptions, 
          Unit
        ]
    ): Unit = js.native
    def update(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ ModifierOptions, 
          Unit
        ],
      options: HookOptionValue
    ): Unit = js.native
    
    def upsert(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* selector */ Selector, 
          /* modifier */ Modifier, 
          /* options */ ModifierOptions, 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  trait Insert[T] extends StObject {
    
    def find(): Cursor[T] = js.native
    def find(selector: String): Cursor[T] = js.native
    def find(selector: String, options: Fields): Cursor[T] = js.native
    def find(selector: Unit, options: Fields): Cursor[T] = js.native
    def find(selector: ObjectID): Cursor[T] = js.native
    def find(selector: ObjectID, options: Fields): Cursor[T] = js.native
    def find(selector: Selector): Cursor[T] = js.native
    def find(selector: Selector, options: Fields): Cursor[T] = js.native
    
    def findOne(): T = js.native
    def findOne(selector: String): T = js.native
    def findOne(selector: String, options: Reactive): T = js.native
    def findOne(selector: Unit, options: Reactive): T = js.native
    def findOne(selector: ObjectID): T = js.native
    def findOne(selector: ObjectID, options: Reactive): T = js.native
    def findOne(selector: Selector): T = js.native
    def findOne(selector: Selector, options: Reactive): T = js.native
    
    def insert(doc: T): String = js.native
    def insert(doc: T, callback: js.Function0[Unit]): String = js.native
    
    def remove(selector: String): Double = js.native
    def remove(selector: String, callback: js.Function0[Unit]): Double = js.native
    def remove(selector: ObjectID): Double = js.native
    def remove(selector: ObjectID, callback: js.Function0[Unit]): Double = js.native
    def remove(selector: Selector): Double = js.native
    def remove(selector: Selector, callback: js.Function0[Unit]): Double = js.native
    
    def update(selector: String, modifier: Modifier): Double = js.native
    def update(selector: String, modifier: Modifier, options: Unit, callback: js.Function0[Unit]): Double = js.native
    def update(selector: String, modifier: Modifier, options: Multi): Double = js.native
    def update(selector: String, modifier: Modifier, options: Multi, callback: js.Function0[Unit]): Double = js.native
    def update(selector: ObjectID, modifier: Modifier): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Unit, callback: js.Function0[Unit]): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Multi): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Multi, callback: js.Function0[Unit]): Double = js.native
    def update(selector: Selector, modifier: Modifier): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Unit, callback: js.Function0[Unit]): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Multi): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Multi, callback: js.Function0[Unit]): Double = js.native
    
    def upsert(selector: String, modifier: Modifier): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: Unit, callback: js.Function0[Unit]): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: `0`): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: `0`, callback: js.Function0[Unit]): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: Unit, callback: js.Function0[Unit]): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: `0`): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: `0`, callback: js.Function0[Unit]): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: Unit, callback: js.Function0[Unit]): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: `0`): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: `0`, callback: js.Function0[Unit]): InsertedId = js.native
  }
  
  trait InsertedId extends StObject {
    
    var insertedId: js.UndefOr[String] = js.undefined
    
    var numberAffected: js.UndefOr[Double] = js.undefined
  }
  object InsertedId {
    
    inline def apply(): InsertedId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertedId]
    }
    
    extension [Self <: InsertedId](x: Self) {
      
      inline def setInsertedId(value: String): Self = StObject.set(x, "insertedId", value.asInstanceOf[js.Any])
      
      inline def setInsertedIdUndefined: Self = StObject.set(x, "insertedId", js.undefined)
      
      inline def setNumberAffected(value: Double): Self = StObject.set(x, "numberAffected", value.asInstanceOf[js.Any])
      
      inline def setNumberAffectedUndefined: Self = StObject.set(x, "numberAffected", js.undefined)
    }
  }
  
  trait Multi extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var upsert: js.UndefOr[Boolean] = js.undefined
  }
  object Multi {
    
    inline def apply(): Multi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multi]
    }
    
    extension [Self <: Multi](x: Self) {
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
  
  trait Reactive extends StObject {
    
    var fields: js.UndefOr[FieldSpecifier] = js.undefined
    
    var reactive: js.UndefOr[Boolean] = js.undefined
    
    var skip: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[SortSpecifier] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* doc */ Any, Unit]] = js.undefined
  }
  object Reactive {
    
    inline def apply(): Reactive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reactive]
    }
    
    extension [Self <: Reactive](x: Self) {
      
      inline def setFields(value: FieldSpecifier): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setReactive(value: Boolean): Self = StObject.set(x, "reactive", value.asInstanceOf[js.Any])
      
      inline def setReactiveUndefined: Self = StObject.set(x, "reactive", js.undefined)
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSort(value: SortSpecifier): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTransform(value: /* doc */ Any => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction1((t0: /* doc */ Any) => value(t0).runNow()))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait Remove[T] extends StObject {
    
    def find(
      hook: js.Function3[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]
    ): Unit
    
    def findOne(
      hook: js.Function3[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]
    ): Unit
    
    def insert(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit
    
    def remove(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit
    
    def update(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]
    ): Unit
    
    def upsert(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* selector */ Selector, 
          /* modifier */ Modifier, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]
    ): Unit
  }
  object Remove {
    
    inline def apply[T](
      find: js.Function3[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ] => Callback,
      findOne: js.Function3[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ] => Callback,
      insert: js.Function2[/* userId */ String, /* doc */ T, Unit] => Callback,
      remove: js.Function2[/* userId */ String, /* doc */ T, Unit] => Callback,
      update: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ] => Callback,
      upsert: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* selector */ Selector, 
          /* modifier */ Modifier, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ] => Callback
    ): Remove[T] = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1((t0: js.Function3[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]) => find(t0).runNow()), findOne = js.Any.fromFunction1((t0: js.Function3[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]) => findOne(t0).runNow()), insert = js.Any.fromFunction1((t0: js.Function2[/* userId */ String, /* doc */ T, Unit]) => insert(t0).runNow()), remove = js.Any.fromFunction1((t0: js.Function2[/* userId */ String, /* doc */ T, Unit]) => remove(t0).runNow()), update = js.Any.fromFunction1((t0: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]) => update(t0).runNow()), upsert = js.Any.fromFunction1((t0: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* selector */ Selector, 
          /* modifier */ Modifier, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]) => upsert(t0).runNow()))
      __obj.asInstanceOf[Remove[T]]
    }
    
    extension [Self <: Remove[?], T](x: Self & Remove[T]) {
      
      inline def setFind(
        value: js.Function3[
              /* userId */ String, 
              /* selector */ Selector, 
              /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "find", js.Any.fromFunction1((t0: js.Function3[
              /* userId */ String, 
              /* selector */ Selector, 
              /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setFindOne(
        value: js.Function3[
              /* userId */ String, 
              /* selector */ Selector, 
              /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "findOne", js.Any.fromFunction1((t0: js.Function3[
              /* userId */ String, 
              /* selector */ Selector, 
              /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setInsert(value: js.Function2[/* userId */ String, /* doc */ T, Unit] => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: js.Function2[/* userId */ String, /* doc */ T, Unit]) => value(t0).runNow()))
      
      inline def setRemove(value: js.Function2[/* userId */ String, /* doc */ T, Unit] => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: js.Function2[/* userId */ String, /* doc */ T, Unit]) => value(t0).runNow()))
      
      inline def setUpdate(
        value: js.Function5[
              /* userId */ String, 
              /* doc */ T, 
              /* fieldNames */ js.Array[String], 
              /* modifier */ Modifier, 
              /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: js.Function5[
              /* userId */ String, 
              /* doc */ T, 
              /* fieldNames */ js.Array[String], 
              /* modifier */ Modifier, 
              /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setUpsert(
        value: js.Function5[
              /* userId */ String, 
              /* doc */ T, 
              /* selector */ Selector, 
              /* modifier */ Modifier, 
              /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "upsert", js.Any.fromFunction1((t0: js.Function5[
              /* userId */ String, 
              /* doc */ T, 
              /* selector */ Selector, 
              /* modifier */ Modifier, 
              /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
              Unit
            ]) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait Update[T] extends StObject {
    
    def find(
      hook: js.Function4[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          /* cursor */ Cursor[T], 
          Unit
        ]
    ): Unit = js.native
    
    def findOne(
      hook: js.Function4[
          /* userId */ String, 
          /* selector */ Selector, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          /* doc */ T, 
          Unit
        ]
    ): Unit = js.native
    
    def insert(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit = js.native
    
    def remove(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit = js.native
    
    def update(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]
    ): Unit = js.native
    def update(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Modifier, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ],
      options: typingsJapgolly.meteorCollectionHooks.CollectionHooks.HookOptionValue
    ): Unit = js.native
    
    def upsert(
      hook: js.Function5[
          /* userId */ String, 
          /* doc */ T, 
          /* selector */ Selector, 
          /* modifier */ Modifier, 
          /* options */ typingsJapgolly.meteorCollectionHooks.CollectionHooks.ModifierOptions, 
          Unit
        ]
    ): Unit = js.native
  }
}
