package typingsJapgolly.next

import japgolly.scalajs.react.Callback
import typingsJapgolly.next.anon.FnCall
import typingsJapgolly.next.anon.FnCallItemOptions
import typingsJapgolly.next.anon.FnCallLabel
import typingsJapgolly.next.anon.FnCallLabelData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesConsoleMod` {
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/console", "console")
  @js.native
  val console: IConsole = js.native
  
  trait IConsole extends StObject {
    
    var assert: FnCall
    
    var count: FnCallLabel
    
    var debug: js.Function1[/* repeated */ Any, Unit]
    
    var dir: FnCallItemOptions
    
    var error: js.Function1[/* repeated */ Any, Unit]
    
    var info: js.Function1[/* repeated */ Any, Unit]
    
    var log: js.Function1[/* repeated */ Any, Unit]
    
    var time: FnCallLabel
    
    var timeEnd: FnCallLabel
    
    var timeLog: FnCallLabelData
    
    var trace: js.Function1[/* repeated */ Any, Unit]
    
    var warn: js.Function1[/* repeated */ Any, Unit]
  }
  object IConsole {
    
    inline def apply(
      assert: FnCall,
      count: FnCallLabel,
      debug: /* repeated */ Any => Callback,
      dir: FnCallItemOptions,
      error: /* repeated */ Any => Callback,
      info: /* repeated */ Any => Callback,
      log: /* repeated */ Any => Callback,
      time: FnCallLabel,
      timeEnd: FnCallLabel,
      timeLog: FnCallLabelData,
      trace: /* repeated */ Any => Callback,
      warn: /* repeated */ Any => Callback
    ): IConsole = {
      val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), dir = dir.asInstanceOf[js.Any], error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), log = js.Any.fromFunction1((t0: /* repeated */ Any) => log(t0).runNow()), time = time.asInstanceOf[js.Any], timeEnd = timeEnd.asInstanceOf[js.Any], timeLog = timeLog.asInstanceOf[js.Any], trace = js.Any.fromFunction1((t0: /* repeated */ Any) => trace(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
      __obj.asInstanceOf[IConsole]
    }
    
    extension [Self <: IConsole](x: Self) {
      
      inline def setAssert(value: FnCall): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
      
      inline def setCount(value: FnCallLabel): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setDir(value: FnCallItemOptions): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setLog(value: /* repeated */ Any => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setTime(value: FnCallLabel): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeEnd(value: FnCallLabel): Self = StObject.set(x, "timeEnd", value.asInstanceOf[js.Any])
      
      inline def setTimeLog(value: FnCallLabelData): Self = StObject.set(x, "timeLog", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: /* repeated */ Any => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
}
