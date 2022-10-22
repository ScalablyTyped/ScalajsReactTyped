package typingsJapgolly.grpcGrpcJs.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Console> */
trait PartialConsole extends StObject {
  
  var assert: js.UndefOr[js.Function2[/* condition */ Boolean, /* repeated */ scala.Any, Unit]] = js.undefined
  
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var count: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var countReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var debug: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var dir: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var dirxml: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var group: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var groupCollapsed: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var groupEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var info: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var log: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var table: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var time: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var timeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var timeLog: js.UndefOr[js.Function2[/* label */ String, /* repeated */ scala.Any, Unit]] = js.undefined
  
  var timeStamp: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var trace: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var warn: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
}
object PartialConsole {
  
  inline def apply(): PartialConsole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConsole]
  }
  
  extension [Self <: PartialConsole](x: Self) {
    
    inline def setAssert(value: (/* condition */ Boolean, /* repeated */ scala.Any) => Callback): Self = StObject.set(x, "assert", js.Any.fromFunction2((t0: /* condition */ Boolean, t1: /* repeated */ scala.Any) => (value(t0, t1)).runNow()))
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setCount(value: Callback): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setCountReset(value: Callback): Self = StObject.set(x, "countReset", value.toJsFn)
    
    inline def setCountResetUndefined: Self = StObject.set(x, "countReset", js.undefined)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDebug(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDir(value: Callback): Self = StObject.set(x, "dir", value.toJsFn)
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDirxml(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "dirxml", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setDirxmlUndefined: Self = StObject.set(x, "dirxml", js.undefined)
    
    inline def setError(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGroup(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "group", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setGroupCollapsed(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "groupCollapsed", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setGroupCollapsedUndefined: Self = StObject.set(x, "groupCollapsed", js.undefined)
    
    inline def setGroupEnd(value: Callback): Self = StObject.set(x, "groupEnd", value.toJsFn)
    
    inline def setGroupEndUndefined: Self = StObject.set(x, "groupEnd", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setInfo(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLog(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setTable(value: Callback): Self = StObject.set(x, "table", value.toJsFn)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTime(value: Callback): Self = StObject.set(x, "time", value.toJsFn)
    
    inline def setTimeEnd(value: Callback): Self = StObject.set(x, "timeEnd", value.toJsFn)
    
    inline def setTimeEndUndefined: Self = StObject.set(x, "timeEnd", js.undefined)
    
    inline def setTimeLog(value: (/* label */ String, /* repeated */ scala.Any) => Callback): Self = StObject.set(x, "timeLog", js.Any.fromFunction2((t0: /* label */ String, t1: /* repeated */ scala.Any) => (value(t0, t1)).runNow()))
    
    inline def setTimeLogUndefined: Self = StObject.set(x, "timeLog", js.undefined)
    
    inline def setTimeStamp(value: Callback): Self = StObject.set(x, "timeStamp", value.toJsFn)
    
    inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTrace(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setWarn(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
