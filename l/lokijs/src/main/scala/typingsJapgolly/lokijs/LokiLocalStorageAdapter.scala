package typingsJapgolly.lokijs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A loki persistence adapter which persists to web browser's local storage object
  */
trait LokiLocalStorageAdapter extends StObject {
  
  /**
    * deleteDatabase() - delete the database from localstorage, will throw an error if it
    * can't be deleted
    * @param dbname - the filename of the database to delete
    * @param callback - the callback to handle the result
    */
  def deleteDatabase(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit
  
  /**
    * loadDatabase() - Load data from localstorage
    * @param dbname - the name of the database to load
    * @param callback - the callback to handle the result
    */
  def loadDatabase(dbname: String, callback: js.Function1[/* dataOrError */ Any | js.Error, Unit]): Unit
  
  /**
    * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
    * might want to expand this to avoid dataloss on partial save
    * @param dbname - the filename of the database to load
    * @param callback - the callback to handle the result
    */
  def saveDatabase(
    dbname: String,
    dbstring: String,
    callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Unit
}
object LokiLocalStorageAdapter {
  
  inline def apply(
    deleteDatabase: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback,
    loadDatabase: (String, js.Function1[/* dataOrError */ Any | js.Error, Unit]) => Callback,
    saveDatabase: (String, String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback
  ): LokiLocalStorageAdapter = {
    val __obj = js.Dynamic.literal(deleteDatabase = js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => (deleteDatabase(t0, t1)).runNow()), loadDatabase = js.Any.fromFunction2((t0: String, t1: js.Function1[/* dataOrError */ Any | js.Error, Unit]) => (loadDatabase(t0, t1)).runNow()), saveDatabase = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => (saveDatabase(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[LokiLocalStorageAdapter]
  }
  
  extension [Self <: LokiLocalStorageAdapter](x: Self) {
    
    inline def setDeleteDatabase(value: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback): Self = StObject.set(x, "deleteDatabase", js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setLoadDatabase(value: (String, js.Function1[/* dataOrError */ Any | js.Error, Unit]) => Callback): Self = StObject.set(x, "loadDatabase", js.Any.fromFunction2((t0: String, t1: js.Function1[/* dataOrError */ Any | js.Error, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSaveDatabase(value: (String, String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback): Self = StObject.set(x, "saveDatabase", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
