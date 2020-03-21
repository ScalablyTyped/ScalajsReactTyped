package typingsJapgolly.lokijs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*------------------+
| PERSISTENCE       |
-------------------*/
/** there are two build in persistence adapters for internal use
  * fs             for use in Nodejs type environments
  * localStorage   for use in browser environment
  * defined as helper classes here so its easy and clean to use
  */
trait LokiPersistenceAdapter extends js.Object {
  var deleteDatabase: js.UndefOr[
    js.Function2[
      /* dbnameOrOptions */ js.Any, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[js.Any], Unit], 
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
  var mode: js.UndefOr[String] = js.undefined
  var saveDatabase: js.UndefOr[
    js.Function3[
      /* dbname */ String, 
      /* dbstring */ js.Any, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit
}

object LokiPersistenceAdapter {
  @scala.inline
  def apply(
    loadDatabase: (String, js.Function1[/* value */ js.Any, Unit]) => Callback,
    deleteDatabase: (/* dbnameOrOptions */ js.Any, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[js.Any], Unit]) => Callback = null,
    exportDatabase: (/* dbname */ String, /* dbref */ Loki, /* callback */ js.Function1[/* err */ js.Error | Null, Unit]) => Callback = null,
    mode: String = null,
    saveDatabase: (/* dbname */ String, /* dbstring */ js.Any, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Callback = null
  ): LokiPersistenceAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadDatabase")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* value */ js.Any, scala.Unit]) => loadDatabase(t0, t1).runNow()))
    if (deleteDatabase != null) __obj.updateDynamic("deleteDatabase")(js.Any.fromFunction2((t0: /* dbnameOrOptions */ js.Any, t1: /* callback */ js.Function2[
  /* err */ js.UndefOr[js.Error | scala.Null], 
  /* data */ js.UndefOr[js.Any], 
  scala.Unit]) => deleteDatabase(t0, t1).runNow()))
    if (exportDatabase != null) __obj.updateDynamic("exportDatabase")(js.Any.fromFunction3((t0: /* dbname */ java.lang.String, t1: /* dbref */ typingsJapgolly.lokijs.Loki, t2: /* callback */ js.Function1[/* err */ js.Error | scala.Null, scala.Unit]) => exportDatabase(t0, t1, t2).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (saveDatabase != null) __obj.updateDynamic("saveDatabase")(js.Any.fromFunction3((t0: /* dbname */ java.lang.String, t1: /* dbstring */ js.Any, t2: /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]) => saveDatabase(t0, t1, t2).runNow()))
    __obj.asInstanceOf[LokiPersistenceAdapter]
  }
}

