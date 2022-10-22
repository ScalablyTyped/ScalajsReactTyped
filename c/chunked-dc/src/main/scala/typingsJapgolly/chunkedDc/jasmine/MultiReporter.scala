package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiReporter
  extends StObject
     with Reporter {
  
  def addReporter(reporter: Reporter): Unit
}
object MultiReporter {
  
  inline def apply(
    addReporter: Reporter => Callback,
    log: String => Callback,
    reportRunnerResults: Runner => Callback,
    reportRunnerStarting: Runner => Callback,
    reportSpecResults: Spec => Callback,
    reportSpecStarting: Spec => Callback,
    reportSuiteResults: Suite => Callback
  ): MultiReporter = {
    val __obj = js.Dynamic.literal(addReporter = js.Any.fromFunction1((t0: Reporter) => addReporter(t0).runNow()), log = js.Any.fromFunction1((t0: String) => log(t0).runNow()), reportRunnerResults = js.Any.fromFunction1((t0: Runner) => reportRunnerResults(t0).runNow()), reportRunnerStarting = js.Any.fromFunction1((t0: Runner) => reportRunnerStarting(t0).runNow()), reportSpecResults = js.Any.fromFunction1((t0: Spec) => reportSpecResults(t0).runNow()), reportSpecStarting = js.Any.fromFunction1((t0: Spec) => reportSpecStarting(t0).runNow()), reportSuiteResults = js.Any.fromFunction1((t0: Suite) => reportSuiteResults(t0).runNow()))
    __obj.asInstanceOf[MultiReporter]
  }
  
  extension [Self <: MultiReporter](x: Self) {
    
    inline def setAddReporter(value: Reporter => Callback): Self = StObject.set(x, "addReporter", js.Any.fromFunction1((t0: Reporter) => value(t0).runNow()))
  }
}
