package typingsJapgolly.memfs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessMod {
  
  @JSImport("memfs/lib/process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("memfs/lib/process", JSImport.Default)
  @js.native
  val default: IProcess = js.native
  
  inline def createProcess(): IProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("createProcess")().asInstanceOf[IProcess]
  
  trait IProcess extends StObject {
    
    def cwd(): String
    
    def emitWarning(message: String, `type`: String): Unit
    
    var getgid: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getuid: js.UndefOr[js.Function0[Double]] = js.undefined
    
    def nextTick(callback: js.Function1[/* repeated */ Any, Unit], args: Any*): Unit
    
    var platform: String
  }
  object IProcess {
    
    inline def apply(
      cwd: CallbackTo[String],
      emitWarning: (String, String) => Callback,
      nextTick: (js.Function1[/* repeated */ Any, Unit], /* repeated */ Any) => Callback,
      platform: String
    ): IProcess = {
      val __obj = js.Dynamic.literal(cwd = cwd.toJsFn, emitWarning = js.Any.fromFunction2((t0: String, t1: String) => (emitWarning(t0, t1)).runNow()), nextTick = js.Any.fromFunction2((t0: js.Function1[/* repeated */ Any, Unit], t1: /* repeated */ Any) => (nextTick(t0, t1)).runNow()), platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProcess]
    }
    
    extension [Self <: IProcess](x: Self) {
      
      inline def setCwd(value: CallbackTo[String]): Self = StObject.set(x, "cwd", value.toJsFn)
      
      inline def setEmitWarning(value: (String, String) => Callback): Self = StObject.set(x, "emitWarning", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setGetgid(value: CallbackTo[Double]): Self = StObject.set(x, "getgid", value.toJsFn)
      
      inline def setGetgidUndefined: Self = StObject.set(x, "getgid", js.undefined)
      
      inline def setGetuid(value: CallbackTo[Double]): Self = StObject.set(x, "getuid", value.toJsFn)
      
      inline def setGetuidUndefined: Self = StObject.set(x, "getuid", js.undefined)
      
      inline def setNextTick(value: (js.Function1[/* repeated */ Any, Unit], /* repeated */ Any) => Callback): Self = StObject.set(x, "nextTick", js.Any.fromFunction2((t0: js.Function1[/* repeated */ Any, Unit], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}
