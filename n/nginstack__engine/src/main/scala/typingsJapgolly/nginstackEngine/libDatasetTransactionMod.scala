package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetTransactionMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_database: Connection): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_database.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(opt_database: Database): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_database.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/Transaction", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Transaction {
    def this(opt_database: Connection) = this()
    def this(opt_database: Database) = this()
    
    /* CompleteClass */
    override def add(ds: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Unit = js.native
    
    /* CompleteClass */
    override def commit(): Double = js.native
    
    /* CompleteClass */
    override def contains(ds: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var dataById_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var data_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var database_ : Any = js.native
    
    /* CompleteClass */
    override def get(id: String): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    override def getOrSet(id: String, createFunc: js.Function0[typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^]): Any = js.native
    
    /* CompleteClass */
    override def rollback(): Unit = js.native
    
    /* CompleteClass */
    override def set(id: String, dataSet: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/dataset/Transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Connection = typingsJapgolly.nginstackEngine.libConnectionConnectionMod.^
  
  type Database = typingsJapgolly.nginstackEngine.libDatabaseDatabaseMod.^
  
  trait Transaction extends StObject {
    
    def add(ds: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Unit
    
    def commit(): Double
    
    def contains(ds: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Boolean
    
    /* private */ var dataById_ : Any
    
    /* private */ var data_ : Any
    
    /* private */ var database_ : Any
    
    def get(id: String): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
    
    def getOrSet(id: String, createFunc: js.Function0[typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^]): Any
    
    def rollback(): Unit
    
    def set(id: String, dataSet: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Unit
  }
  object Transaction {
    
    inline def apply(
      add: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ => Callback,
      commit: CallbackTo[Double],
      contains: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ => Boolean,
      dataById_ : Any,
      data_ : Any,
      database_ : Any,
      get: String => typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      getOrSet: (String, js.Function0[typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^]) => Any,
      rollback: Callback,
      set: (String, typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^) => Callback
    ): Transaction = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^) => add(t0).runNow()), commit = commit.toJsFn, contains = js.Any.fromFunction1(contains), dataById_ = dataById_.asInstanceOf[js.Any], data_ = data_.asInstanceOf[js.Any], database_ = database_.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getOrSet = js.Any.fromFunction2(getOrSet), rollback = rollback.toJsFn, set = js.Any.fromFunction2((t0: String, t1: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^) => (set(t0, t1)).runNow()))
      __obj.asInstanceOf[Transaction]
    }
    
    extension [Self <: Transaction](x: Self) {
      
      inline def setAdd(value: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^) => value(t0).runNow()))
      
      inline def setCommit(value: CallbackTo[Double]): Self = StObject.set(x, "commit", value.toJsFn)
      
      inline def setContains(value: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setDataById_(value: Any): Self = StObject.set(x, "dataById_", value.asInstanceOf[js.Any])
      
      inline def setData_(value: Any): Self = StObject.set(x, "data_", value.asInstanceOf[js.Any])
      
      inline def setDatabase_(value: Any): Self = StObject.set(x, "database_", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetOrSet(value: (String, js.Function0[typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^]) => Any): Self = StObject.set(x, "getOrSet", js.Any.fromFunction2(value))
      
      inline def setRollback(value: Callback): Self = StObject.set(x, "rollback", value.toJsFn)
      
      inline def setSet(value: (String, typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^) => (value(t0, t1)).runNow()))
    }
  }
}
