package typingsJapgolly.ydnDb

import typingsJapgolly.ydnDb.anon.Push
import typingsJapgolly.ydnDb.ydn.db.EventType
import typingsJapgolly.ydnDb.ydn.db.Op
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ydb {
    
    object db {
      
      object algo {
        
        @JSGlobal("ydb.db.algo.NestedLoop")
        @js.native
        open class NestedLoop protected ()
          extends StObject
             with typingsJapgolly.ydnDb.ydb.db.algo.Solver {
          def this(out: Push) = this()
          def this(out: Push, limit: Double) = this()
        }
        
        @JSGlobal("ydb.db.algo.Solver")
        @js.native
        open class Solver ()
          extends StObject
             with typingsJapgolly.ydnDb.ydb.db.algo.Solver
        
        @JSGlobal("ydb.db.algo.SortedMerge")
        @js.native
        open class SortedMerge protected ()
          extends StObject
             with typingsJapgolly.ydnDb.ydb.db.algo.Solver {
          def this(out: Push) = this()
          def this(out: Push, limit: Double) = this()
        }
        
        @JSGlobal("ydb.db.algo.ZigzagMerge")
        @js.native
        open class ZigzagMerge protected ()
          extends StObject
             with typingsJapgolly.ydnDb.ydb.db.algo.Solver {
          def this(out: Push) = this()
          def this(out: Push, limit: Double) = this()
        }
      }
    }
  }
  
  object ydn {
    
    object db {
      
      @JSGlobal("ydn.db")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ydn.db.DbOperator")
      @js.native
      open class DbOperator ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.DbOperator
      
      @JSGlobal("ydn.db.EventType")
      @js.native
      object EventType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.ydnDb.ydn.db.EventType & Double] = js.native
        
        /* 0 */ val created: typingsJapgolly.ydnDb.ydn.db.EventType.created & Double = js.native
        
        /* 1 */ val deleted: typingsJapgolly.ydnDb.ydn.db.EventType.deleted & Double = js.native
        
        /* 2 */ val error: typingsJapgolly.ydnDb.ydn.db.EventType.error & Double = js.native
        
        /* 3 */ val fail: typingsJapgolly.ydnDb.ydn.db.EventType.fail & Double = js.native
        
        /* 4 */ val ready: typingsJapgolly.ydnDb.ydn.db.EventType.ready & Double = js.native
        
        /* 5 */ val updated: typingsJapgolly.ydnDb.ydn.db.EventType.updated & Double = js.native
      }
      
      @JSGlobal("ydn.db.ICursor")
      @js.native
      open class ICursor ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.ICursor
      
      @JSGlobal("ydn.db.IndexKeyIterator")
      @js.native
      open class IndexKeyIterator protected ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Iterator {
        def this(store_name: String, index_name: String) = this()
        def this(store_name: String, index_name: String, key_range: Any) = this()
        def this(store_name: String, index_name: String, key_range: Any, reverse: Boolean) = this()
        def this(store_name: String, index_name: String, key_range: Unit, reverse: Boolean) = this()
      }
      /* static members */
      object IndexKeyIterator {
        
        @JSGlobal("ydn.db.IndexKeyIterator")
        @js.native
        val ^ : js.Any = js.native
        
        inline def where(store_name: String, index_name: String, op: Op, value: Any, op2: Op, value2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(store_name.asInstanceOf[js.Any], index_name.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Any]
      }
      
      @JSGlobal("ydn.db.IndexValueIterator")
      @js.native
      open class IndexValueIterator protected ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Iterator {
        def this(store_name: String, index_name: String) = this()
        def this(store_name: String, index_name: String, key_range: Any) = this()
        def this(store_name: String, index_name: String, key_range: Any, reverse: Boolean) = this()
        def this(store_name: String, index_name: String, key_range: Unit, reverse: Boolean) = this()
      }
      /* static members */
      object IndexValueIterator {
        
        @JSGlobal("ydn.db.IndexValueIterator")
        @js.native
        val ^ : js.Any = js.native
        
        inline def where(store_name: String, index_name: String, op: Op, value: Any, op2: Op, value2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(store_name.asInstanceOf[js.Any], index_name.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Any]
      }
      
      @JSGlobal("ydn.db.Iterator")
      @js.native
      open class Iterator ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Iterator
      
      @JSGlobal("ydn.db.Key")
      @js.native
      open class Key protected ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Key {
        def this(json: js.Object) = this()
        def this(key_string: String) = this()
        def this(store_name: String, id: Any) = this()
        def this(store_name: String, id: Any, parent_key: typingsJapgolly.ydnDb.ydn.db.Key) = this()
      }
      
      @JSGlobal("ydn.db.KeyIterator")
      @js.native
      open class KeyIterator protected ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Iterator {
        def this(store_name: String) = this()
        def this(store_name: String, key_range: Any) = this()
        def this(store_name: String, key_range: Any, reverse: Boolean) = this()
        def this(store_name: String, key_range: Unit, reverse: Boolean) = this()
      }
      /* static members */
      object KeyIterator {
        
        @JSGlobal("ydn.db.KeyIterator")
        @js.native
        val ^ : js.Any = js.native
        
        inline def where(store_name: String, op: Op, value: Any, op2: Op, value2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(store_name.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Any]
      }
      
      @JSGlobal("ydn.db.Op")
      @js.native
      object Op extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.ydnDb.ydn.db.Op & Double] = js.native
        
        /* 5 */ val ^ : typingsJapgolly.ydnDb.ydn.db.Op.^ & Double = js.native
        
        /* 2 */ val Equalssign: typingsJapgolly.ydnDb.ydn.db.Op.Equalssign & Double = js.native
        
        /* 0 */ val Greaterthansign: typingsJapgolly.ydnDb.ydn.db.Op.Greaterthansign & Double = js.native
        
        /* 3 */ val GreaterthansignEqualssign: typingsJapgolly.ydnDb.ydn.db.Op.GreaterthansignEqualssign & Double = js.native
        
        /* 1 */ val Lessthansign: typingsJapgolly.ydnDb.ydn.db.Op.Lessthansign & Double = js.native
        
        /* 4 */ val LessthansignEqualssign: typingsJapgolly.ydnDb.ydn.db.Op.LessthansignEqualssign & Double = js.native
      }
      
      @JSGlobal("ydn.db.Policy")
      @js.native
      object Policy extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.ydnDb.ydn.db.Policy & Double] = js.native
        
        /* 0 */ val all: typingsJapgolly.ydnDb.ydn.db.Policy.all & Double = js.native
        
        /* 1 */ val atomic: typingsJapgolly.ydnDb.ydn.db.Policy.atomic & Double = js.native
        
        /* 2 */ val multi: typingsJapgolly.ydnDb.ydn.db.Policy.multi & Double = js.native
        
        /* 3 */ val repeat: typingsJapgolly.ydnDb.ydn.db.Policy.repeat & Double = js.native
        
        /* 4 */ val single: typingsJapgolly.ydnDb.ydn.db.Policy.single & Double = js.native
      }
      
      @JSGlobal("ydn.db.Query")
      @js.native
      open class Query ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Query
      
      @JSGlobal("ydn.db.Request")
      @js.native
      open class Request ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Request {
        
        /* CompleteClass */
        override def abort(): Any = js.native
        
        /* CompleteClass */
        override def always(callback: js.Function1[/* data */ Any, Unit]): Any = js.native
        
        /* CompleteClass */
        override def canAbort(): Boolean = js.native
        
        /* CompleteClass */
        override def done(callback: js.Function1[/* data */ Any, Unit]): Any = js.native
        
        /* CompleteClass */
        override def fail(callback: js.Function1[/* data */ Any, Unit]): Any = js.native
        
        /* CompleteClass */
        override def `then`(
          success_callback: js.Function1[/* data */ Any, Any],
          error_callback: js.Function1[/* data */ js.Error, Any]
        ): Any = js.native
      }
      
      @JSGlobal("ydn.db.Storage")
      @js.native
      open class Storage ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Storage {
        def this(db_name: String) = this()
        def this(db_name: String, schema: DatabaseSchemaJson) = this()
        def this(db_name: Unit, schema: DatabaseSchemaJson) = this()
        def this(db_name: String, schema: Unit, options: StorageOptions) = this()
        def this(db_name: String, schema: DatabaseSchemaJson, options: StorageOptions) = this()
        def this(db_name: Unit, schema: Unit, options: StorageOptions) = this()
        def this(db_name: Unit, schema: DatabaseSchemaJson, options: StorageOptions) = this()
      }
      
      @JSGlobal("ydn.db.Streamer")
      @js.native
      open class Streamer protected ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Streamer {
        def this(storage: typingsJapgolly.ydnDb.ydn.db.Storage, store_name: String) = this()
        def this(storage: typingsJapgolly.ydnDb.ydn.db.Storage, store_name: String, opt_field_name: String) = this()
      }
      
      @JSGlobal("ydn.db.TransactionMode")
      @js.native
      object TransactionMode extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.ydnDb.ydn.db.TransactionMode & Double] = js.native
        
        /* 0 */ val readonly: typingsJapgolly.ydnDb.ydn.db.TransactionMode.readonly & Double = js.native
        
        /* 1 */ val readwrite: typingsJapgolly.ydnDb.ydn.db.TransactionMode.readwrite & Double = js.native
      }
      
      @JSGlobal("ydn.db.ValueIterator")
      @js.native
      open class ValueIterator protected ()
        extends StObject
           with typingsJapgolly.ydnDb.ydn.db.Iterator {
        def this(store_name: String) = this()
        def this(store_name: String, key_range: Any) = this()
        def this(store_name: String, key_range: Any, reverse: Boolean) = this()
        def this(store_name: String, key_range: Unit, reverse: Boolean) = this()
      }
      /* static members */
      object ValueIterator {
        
        @JSGlobal("ydn.db.ValueIterator")
        @js.native
        val ^ : js.Any = js.native
        
        inline def where(store_name: String, op: Op, value: Any, op2: Op, value2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(store_name.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Any]
      }
      
      inline def cmp(first: Any, second: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def deleteDatabase(db_name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDatabase")(db_name.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def deleteDatabase(db_name: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteDatabase")(db_name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object events {
        
        @JSGlobal("ydn.db.events.Event")
        @js.native
        open class Event ()
          extends StObject
             with typingsJapgolly.ydnDb.ydn.db.events.Event {
          
          /* CompleteClass */
          var name: String = js.native
          
          /* CompleteClass */
          var `type`: EventType = js.native
        }
        
        @JSGlobal("ydn.db.events.RecordEvent")
        @js.native
        open class RecordEvent ()
          extends StObject
             with typingsJapgolly.ydnDb.ydn.db.events.RecordEvent {
          
          /* CompleteClass */
          override def getKey(): Any = js.native
          
          /* CompleteClass */
          override def getStoreName(): String = js.native
          
          /* CompleteClass */
          override def getValue(): Any = js.native
          
          /* CompleteClass */
          var name: String = js.native
          
          /* CompleteClass */
          var `type`: EventType = js.native
        }
        
        @JSGlobal("ydn.db.events.StorageEvent")
        @js.native
        open class StorageEvent ()
          extends StObject
             with typingsJapgolly.ydnDb.ydn.db.events.StorageEvent {
          
          /* CompleteClass */
          override def getError(): js.Error = js.native
          
          /* CompleteClass */
          override def getOldVersion(): Double = js.native
          
          /* CompleteClass */
          override def getVersion(): Double = js.native
          
          /* CompleteClass */
          var name: String = js.native
          
          /* CompleteClass */
          var `type`: EventType = js.native
        }
        
        @JSGlobal("ydn.db.events.StoreEvent")
        @js.native
        open class StoreEvent ()
          extends StObject
             with typingsJapgolly.ydnDb.ydn.db.events.StoreEvent {
          
          /* CompleteClass */
          override def getKeys(): js.Array[Any] = js.native
          
          /* CompleteClass */
          override def getStoreName(): String = js.native
          
          /* CompleteClass */
          override def getValues(): js.Array[Any] = js.native
          
          /* CompleteClass */
          var name: String = js.native
          
          /* CompleteClass */
          var `type`: EventType = js.native
        }
      }
    }
  }
}
