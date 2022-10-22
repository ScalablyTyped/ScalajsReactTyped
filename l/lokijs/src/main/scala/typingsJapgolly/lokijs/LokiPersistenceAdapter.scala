package typingsJapgolly.lokijs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*------------------+
| PERSISTENCE       |
-------------------*/
/** there are two build in persistence adapters for internal use
  * fs             for use in Nodejs type environments
  * localStorage   for use in browser environment
  * defined as helper classes here so its easy and clean to use
  */
trait LokiPersistenceAdapter extends StObject {
  
  var deleteDatabase: js.UndefOr[
    js.Function2[
      /* dbnameOrOptions */ Any, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var exportDatabase: js.UndefOr[
    js.Function3[
      /* dbname */ String, 
      /* dbref */ Loki, 
      /* callback */ js.Function1[/* err */ js.Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  
  def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit
  
  var mode: js.UndefOr[String] = js.undefined
  
  var saveDatabase: js.UndefOr[
    js.Function3[
      /* dbname */ String, 
      /* dbstring */ Any, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}
object LokiPersistenceAdapter {
  
  inline def apply(loadDatabase: (String, js.Function1[/* value */ Any, Unit]) => Callback): LokiPersistenceAdapter = {
    val __obj = js.Dynamic.literal(loadDatabase = js.Any.fromFunction2((t0: String, t1: js.Function1[/* value */ Any, Unit]) => (loadDatabase(t0, t1)).runNow()))
    __obj.asInstanceOf[LokiPersistenceAdapter]
  }
  
  extension [Self <: LokiPersistenceAdapter](x: Self) {
    
    inline def setDeleteDatabase(
      value: (/* dbnameOrOptions */ Any, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit]) => Callback
    ): Self = StObject.set(x, "deleteDatabase", js.Any.fromFunction2((t0: /* dbnameOrOptions */ Any, t1: /* callback */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setDeleteDatabaseUndefined: Self = StObject.set(x, "deleteDatabase", js.undefined)
    
    inline def setExportDatabase(
      value: (/* dbname */ String, /* dbref */ Loki, /* callback */ js.Function1[/* err */ js.Error | Null, Unit]) => Callback
    ): Self = StObject.set(x, "exportDatabase", js.Any.fromFunction3((t0: /* dbname */ String, t1: /* dbref */ Loki, t2: /* callback */ js.Function1[/* err */ js.Error | Null, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExportDatabaseUndefined: Self = StObject.set(x, "exportDatabase", js.undefined)
    
    inline def setLoadDatabase(value: (String, js.Function1[/* value */ Any, Unit]) => Callback): Self = StObject.set(x, "loadDatabase", js.Any.fromFunction2((t0: String, t1: js.Function1[/* value */ Any, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSaveDatabase(
      value: (/* dbname */ String, /* dbstring */ Any, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback
    ): Self = StObject.set(x, "saveDatabase", js.Any.fromFunction3((t0: /* dbname */ String, t1: /* dbstring */ Any, t2: /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSaveDatabaseUndefined: Self = StObject.set(x, "saveDatabase", js.undefined)
  }
}
