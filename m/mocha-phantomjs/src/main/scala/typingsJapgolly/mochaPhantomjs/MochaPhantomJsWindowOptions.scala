package typingsJapgolly.mochaPhantomjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MochaPhantomJsWindowOptions
  extends StObject
     with Window {
  
  var ended: Boolean
  
  var env: Any
  
  var failures: Double
  
  def run(): Unit
  
  var started: Boolean
}
object MochaPhantomJsWindowOptions {
  
  inline def apply(
    ended: Boolean,
    env: Any,
    failures: Double,
    mochaPhantomJS: CallbackTo[MochaPhantomJsWindowOptions],
    run: Callback,
    started: Boolean
  ): MochaPhantomJsWindowOptions = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], mochaPhantomJS = mochaPhantomJS.toJsFn, run = run.toJsFn, started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJsWindowOptions]
  }
  
  extension [Self <: MochaPhantomJsWindowOptions](x: Self) {
    
    inline def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setRun(value: Callback): Self = StObject.set(x, "run", value.toJsFn)
    
    inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
