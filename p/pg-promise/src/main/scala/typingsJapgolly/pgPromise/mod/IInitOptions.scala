package typingsJapgolly.pgPromise.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.pgPromise.typescriptPgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Library's Initialization Options
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
trait IInitOptions[Ext, C /* <: IClient */] extends StObject {
  
  var capSQL: js.UndefOr[Boolean] = js.undefined
  
  var connect: js.UndefOr[js.Function3[/* client */ C, /* dc */ Any, /* useCount */ Double, Unit]] = js.undefined
  
  var disconnect: js.UndefOr[js.Function2[/* client */ C, /* dc */ Any, Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function2[/* err */ Any, /* e */ IEventContext[C], Unit]] = js.undefined
  
  var extend: js.UndefOr[js.Function2[/* obj */ (IDatabase[Ext, C]) & Ext, /* dc */ Any, Unit]] = js.undefined
  
  var noLocking: js.UndefOr[Boolean] = js.undefined
  
  var noWarnings: js.UndefOr[Boolean] = js.undefined
  
  var pgFormatting: js.UndefOr[Boolean] = js.undefined
  
  var pgNative: js.UndefOr[Boolean] = js.undefined
  
  var promiseLib: js.UndefOr[Any] = js.undefined
  
  var query: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.undefined
  
  // NOTE: result is undefined when data comes from QueryStream, i.e. via method Database.stream
  var receive: js.UndefOr[
    js.Function3[
      /* data */ js.Array[Any], 
      /* result */ IResultExt | Unit, 
      /* e */ IEventContext[C], 
      Unit
    ]
  ] = js.undefined
  
  var schema: js.UndefOr[ValidSchema | (js.Function1[/* dc */ Any, ValidSchema])] = js.undefined
  
  var task: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.undefined
  
  var transact: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.undefined
}
object IInitOptions {
  
  inline def apply[Ext, C /* <: IClient */](): IInitOptions[Ext, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitOptions[Ext, C]]
  }
  
  extension [Self <: IInitOptions[?, ?], Ext, C /* <: IClient */](x: Self & (IInitOptions[Ext, C])) {
    
    inline def setCapSQL(value: Boolean): Self = StObject.set(x, "capSQL", value.asInstanceOf[js.Any])
    
    inline def setCapSQLUndefined: Self = StObject.set(x, "capSQL", js.undefined)
    
    inline def setConnect(value: (/* client */ C, /* dc */ Any, /* useCount */ Double) => Callback): Self = StObject.set(x, "connect", js.Any.fromFunction3((t0: /* client */ C, t1: /* dc */ Any, t2: /* useCount */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setDisconnect(value: (/* client */ C, /* dc */ Any) => Callback): Self = StObject.set(x, "disconnect", js.Any.fromFunction2((t0: /* client */ C, t1: /* dc */ Any) => (value(t0, t1)).runNow()))
    
    inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
    
    inline def setError(value: (/* err */ Any, /* e */ IEventContext[C]) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction2((t0: /* err */ Any, t1: /* e */ IEventContext[C]) => (value(t0, t1)).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExtend(value: (/* obj */ (IDatabase[Ext, C]) & Ext, /* dc */ Any) => Callback): Self = StObject.set(x, "extend", js.Any.fromFunction2((t0: /* obj */ (IDatabase[Ext, C]) & Ext, t1: /* dc */ Any) => (value(t0, t1)).runNow()))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setNoLocking(value: Boolean): Self = StObject.set(x, "noLocking", value.asInstanceOf[js.Any])
    
    inline def setNoLockingUndefined: Self = StObject.set(x, "noLocking", js.undefined)
    
    inline def setNoWarnings(value: Boolean): Self = StObject.set(x, "noWarnings", value.asInstanceOf[js.Any])
    
    inline def setNoWarningsUndefined: Self = StObject.set(x, "noWarnings", js.undefined)
    
    inline def setPgFormatting(value: Boolean): Self = StObject.set(x, "pgFormatting", value.asInstanceOf[js.Any])
    
    inline def setPgFormattingUndefined: Self = StObject.set(x, "pgFormatting", js.undefined)
    
    inline def setPgNative(value: Boolean): Self = StObject.set(x, "pgNative", value.asInstanceOf[js.Any])
    
    inline def setPgNativeUndefined: Self = StObject.set(x, "pgNative", js.undefined)
    
    inline def setPromiseLib(value: Any): Self = StObject.set(x, "promiseLib", value.asInstanceOf[js.Any])
    
    inline def setPromiseLibUndefined: Self = StObject.set(x, "promiseLib", js.undefined)
    
    inline def setQuery(value: /* e */ IEventContext[C] => Callback): Self = StObject.set(x, "query", js.Any.fromFunction1((t0: /* e */ IEventContext[C]) => value(t0).runNow()))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReceive(
      value: (/* data */ js.Array[Any], /* result */ IResultExt | Unit, /* e */ IEventContext[C]) => Callback
    ): Self = StObject.set(x, "receive", js.Any.fromFunction3((t0: /* data */ js.Array[Any], t1: /* result */ IResultExt | Unit, t2: /* e */ IEventContext[C]) => (value(t0, t1, t2)).runNow()))
    
    inline def setReceiveUndefined: Self = StObject.set(x, "receive", js.undefined)
    
    inline def setSchema(value: ValidSchema | (js.Function1[/* dc */ Any, ValidSchema])): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaFunction1(value: /* dc */ Any => ValidSchema): Self = StObject.set(x, "schema", js.Any.fromFunction1(value))
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSchemaVarargs(value: String*): Self = StObject.set(x, "schema", js.Array(value*))
    
    inline def setTask(value: /* e */ IEventContext[C] => Callback): Self = StObject.set(x, "task", js.Any.fromFunction1((t0: /* e */ IEventContext[C]) => value(t0).runNow()))
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
    
    inline def setTransact(value: /* e */ IEventContext[C] => Callback): Self = StObject.set(x, "transact", js.Any.fromFunction1((t0: /* e */ IEventContext[C]) => value(t0).runNow()))
    
    inline def setTransactUndefined: Self = StObject.set(x, "transact", js.undefined)
  }
}
