package typingsJapgolly.lokijs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lokijs.anon.AsyncResponses
import typingsJapgolly.lokijs.anon.Lastsave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In in-memory persistence adapter for an in-memory database.
  * This simple 'key/value' adapter is intended for unit testing and diagnostics.
  *
  * @param [options] - memory adapter options
  * @param [options.asyncResponses=false] - whether callbacks are invoked asynchronously
  * @param [options.asyncTimeout=50] - timeout in ms to queue callbacks
  */
trait LokiMemoryAdapter
  extends StObject
     with LokiPersistenceAdapter {
  
  /**
    * Deletes a database from its in-memory store.
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - function to call when done
    */
  @JSName("deleteDatabase")
  def deleteDatabase_MLokiMemoryAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit
  
  var hashStore: StringDictionary[Lastsave]
  
  var options: AsyncResponses
  
  /**
    * Saves a serialized database to its in-memory store.
    * (Loki persistence adapter interface function)
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - adapter callback to return load result to caller
    */
  @JSName("saveDatabase")
  def saveDatabase_MLokiMemoryAdapter(dbname: String, dbstring: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit
}
object LokiMemoryAdapter {
  
  inline def apply(
    deleteDatabase: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback,
    hashStore: StringDictionary[Lastsave],
    loadDatabase: (String, js.Function1[/* value */ Any, Unit]) => Callback,
    options: AsyncResponses,
    saveDatabase: (String, Any, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback
  ): LokiMemoryAdapter = {
    val __obj = js.Dynamic.literal(deleteDatabase = js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => (deleteDatabase(t0, t1)).runNow()), hashStore = hashStore.asInstanceOf[js.Any], loadDatabase = js.Any.fromFunction2((t0: String, t1: js.Function1[/* value */ Any, Unit]) => (loadDatabase(t0, t1)).runNow()), options = options.asInstanceOf[js.Any], saveDatabase = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => (saveDatabase(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[LokiMemoryAdapter]
  }
  
  extension [Self <: LokiMemoryAdapter](x: Self) {
    
    inline def setDeleteDatabase(value: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback): Self = StObject.set(x, "deleteDatabase", js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setHashStore(value: StringDictionary[Lastsave]): Self = StObject.set(x, "hashStore", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: AsyncResponses): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSaveDatabase(value: (String, Any, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback): Self = StObject.set(x, "saveDatabase", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
