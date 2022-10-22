package typingsJapgolly.lokijs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lokijs.anon.AsyncResponses
import typingsJapgolly.lokijs.anon.Found
import typingsJapgolly.lokijs.anon.Lastsave
import typingsJapgolly.lokijs.anon.PageSize
import typingsJapgolly.lokijs.anon.PartialLokiConstructorOpt
import typingsJapgolly.lokijs.lokijsInts.`-1`
import typingsJapgolly.lokijs.lokijsInts.`0`
import typingsJapgolly.lokijs.lokijsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * LokiJS
    * A lightweight document oriented javascript database
    * @author Joe Minichino <joe.minichino@gmail.com>
    */
  @JSImport("lokijs", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Loki {
    def this(filename: String) = this()
    def this(filename: String, options: PartialLokiConstructorOpt) = this()
  }
  @JSImport("lokijs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lokijs", "Collection")
  @js.native
  open class Collection[E /* <: js.Object */] ()
    extends StObject
       with typingsJapgolly.lokijs.Collection[E]
  
  @JSImport("lokijs", "DynamicView")
  @js.native
  open class DynamicView[E /* <: js.Object */] ()
    extends StObject
       with typingsJapgolly.lokijs.DynamicView[E]
  
  @JSImport("lokijs", "KeyValueStore")
  @js.native
  open class KeyValueStore ()
    extends StObject
       with typingsJapgolly.lokijs.KeyValueStore {
    
    /* CompleteClass */
    override def bs(): js.Function2[/* array */ js.Array[Any], /* item */ Any, Found] = js.native
    
    /* CompleteClass */
    override def get(key: Any): js.Array[Any] = js.native
    
    /* CompleteClass */
    var keys: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def set(key: Any, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def setSort(fun: js.Function2[/* target */ Any, /* test */ Any, Any]): Unit = js.native
    
    /* CompleteClass */
    override def sort(a: Any, b: Any): `-1` | `0` | `1` = js.native
    
    /* CompleteClass */
    var values: js.Array[Any] = js.native
  }
  
  @JSImport("lokijs", "LokiFsAdapter")
  @js.native
  open class LokiFsAdapter ()
    extends StObject
       with typingsJapgolly.lokijs.LokiFsAdapter {
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
  }
  
  @JSImport("lokijs", "LokiLocalStorageAdapter")
  @js.native
  open class LokiLocalStorageAdapter ()
    extends StObject
       with typingsJapgolly.lokijs.LokiLocalStorageAdapter {
    
    /**
      * deleteDatabase() - delete the database from localstorage, will throw an error if it
      * can't be deleted
      * @param dbname - the filename of the database to delete
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def deleteDatabase(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /**
      * loadDatabase() - Load data from localstorage
      * @param dbname - the name of the database to load
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* dataOrError */ Any | js.Error, Unit]): Unit = js.native
    
    /**
      * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
      * might want to expand this to avoid dataloss on partial save
      * @param dbname - the filename of the database to load
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def saveDatabase(
      dbname: String,
      dbstring: String,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
  }
  
  @JSImport("lokijs", "LokiMemoryAdapter")
  @js.native
  open class LokiMemoryAdapter ()
    extends StObject
       with typingsJapgolly.lokijs.LokiMemoryAdapter {
    
    /**
      * Deletes a database from its in-memory store.
      *
      * @param dbname - name of the database (filename/keyname)
      * @param callback - function to call when done
      */
    /* CompleteClass */
    @JSName("deleteDatabase")
    override def deleteDatabase_MLokiMemoryAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /* CompleteClass */
    var hashStore: StringDictionary[Lastsave] = js.native
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    var options: AsyncResponses = js.native
    
    /**
      * Saves a serialized database to its in-memory store.
      * (Loki persistence adapter interface function)
      *
      * @param dbname - name of the database (filename/keyname)
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    @JSName("saveDatabase")
    override def saveDatabase_MLokiMemoryAdapter(dbname: String, dbstring: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  }
  
  @JSImport("lokijs", "LokiOps")
  @js.native
  def LokiOps: typingsJapgolly.lokijs.LokiOps = js.native
  inline def LokiOps_=(x: LokiOps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LokiOps")(x.asInstanceOf[js.Any])
  
  @JSImport("lokijs", "LokiPartitioningAdapter")
  @js.native
  open class LokiPartitioningAdapter ()
    extends StObject
       with typingsJapgolly.lokijs.LokiPartitioningAdapter {
    
    /* CompleteClass */
    var adapter: LokiPersistenceAdapter | Null = js.native
    
    /* CompleteClass */
    var dbname: String = js.native
    
    /* CompleteClass */
    var dbref: Loki | Null = js.native
    
    /**
      * Saves a database by partioning into separate key/value saves.
      * (Loki 'reference mode' persistence adapter interface function)
      *
      * @param dbname - name of the database (filename/keyname)
      * @param dbref - reference to database which we will partition and save.
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    @JSName("exportDatabase")
    override def exportDatabase_MLokiPartitioningAdapter(dbname: String, dbref: Loki, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    /**
      * Used to sequentially load the next page of collection partition, one at a time.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def loadNextPage(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Used to sequentially load each collection partition, one at a time.
      *
      * @param partition - ordinal collection position to load next
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def loadNextPartition(partition: Double, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    @JSName("mode")
    var mode_LokiPartitioningAdapter: String = js.native
    
    /* CompleteClass */
    var options: PageSize = js.native
    
    /* CompleteClass */
    var pageIterator: PageIterator | js.Object = js.native
    
    /**
      * Helper method used internally to generate and save the next page of the current (dirty) partition.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def saveNextPage(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    /**
      * Helper method used internally to save each dirty collection, one at a time.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def saveNextPartition(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  }
  
  inline def aeq(prop1: Any, prop2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aeq")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gt(prop1: Any, prop2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(prop1: Any, prop2: Any, equal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any], equal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lt(prop1: Any, prop2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(prop1: Any, prop2: Any, equal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any], equal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object persistenceAdapters {
    
    @JSImport("lokijs", "persistenceAdapters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lokijs", "persistenceAdapters.fs")
    @js.native
    def fs: _LokiFsAdapter = js.native
    inline def fs_=(x: _LokiFsAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fs")(x.asInstanceOf[js.Any])
    
    @JSImport("lokijs", "persistenceAdapters.localStorage")
    @js.native
    def localStorage: _LokiLocalStorageAdapter = js.native
    inline def localStorage_=(x: _LokiLocalStorageAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(x.asInstanceOf[js.Any])
  }
}
