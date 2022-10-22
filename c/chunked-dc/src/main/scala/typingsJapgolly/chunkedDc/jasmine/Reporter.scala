package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reporter extends StObject {
  
  def log(str: String): Unit
  
  def reportRunnerResults(runner: Runner): Unit
  
  def reportRunnerStarting(runner: Runner): Unit
  
  def reportSpecResults(spec: Spec): Unit
  
  def reportSpecStarting(spec: Spec): Unit
  
  def reportSuiteResults(suite: Suite): Unit
}
object Reporter {
  
  inline def apply(
    log: String => Callback,
    reportRunnerResults: Runner => Callback,
    reportRunnerStarting: Runner => Callback,
    reportSpecResults: Spec => Callback,
    reportSpecStarting: Spec => Callback,
    reportSuiteResults: Suite => Callback
  ): Reporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1((t0: String) => log(t0).runNow()), reportRunnerResults = js.Any.fromFunction1((t0: Runner) => reportRunnerResults(t0).runNow()), reportRunnerStarting = js.Any.fromFunction1((t0: Runner) => reportRunnerStarting(t0).runNow()), reportSpecResults = js.Any.fromFunction1((t0: Spec) => reportSpecResults(t0).runNow()), reportSpecStarting = js.Any.fromFunction1((t0: Spec) => reportSpecStarting(t0).runNow()), reportSuiteResults = js.Any.fromFunction1((t0: Suite) => reportSuiteResults(t0).runNow()))
    __obj.asInstanceOf[Reporter]
  }
  
  extension [Self <: Reporter](x: Self) {
    
    inline def setLog(value: String => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReportRunnerResults(value: Runner => Callback): Self = StObject.set(x, "reportRunnerResults", js.Any.fromFunction1((t0: Runner) => value(t0).runNow()))
    
    inline def setReportRunnerStarting(value: Runner => Callback): Self = StObject.set(x, "reportRunnerStarting", js.Any.fromFunction1((t0: Runner) => value(t0).runNow()))
    
    inline def setReportSpecResults(value: Spec => Callback): Self = StObject.set(x, "reportSpecResults", js.Any.fromFunction1((t0: Spec) => value(t0).runNow()))
    
    inline def setReportSpecStarting(value: Spec => Callback): Self = StObject.set(x, "reportSpecStarting", js.Any.fromFunction1((t0: Spec) => value(t0).runNow()))
    
    inline def setReportSuiteResults(value: Suite => Callback): Self = StObject.set(x, "reportSuiteResults", js.Any.fromFunction1((t0: Suite) => value(t0).runNow()))
  }
}
