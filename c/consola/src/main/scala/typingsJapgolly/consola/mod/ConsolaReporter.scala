package typingsJapgolly.consola.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaReporter extends StObject {
  
  def log(logObj: ConsolaReporterLogObject, args: ConsolaReporterArgs): Unit
}
object ConsolaReporter {
  
  inline def apply(log: (ConsolaReporterLogObject, ConsolaReporterArgs) => Callback): ConsolaReporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction2((t0: ConsolaReporterLogObject, t1: ConsolaReporterArgs) => (log(t0, t1)).runNow()))
    __obj.asInstanceOf[ConsolaReporter]
  }
  
  extension [Self <: ConsolaReporter](x: Self) {
    
    inline def setLog(value: (ConsolaReporterLogObject, ConsolaReporterArgs) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: ConsolaReporterLogObject, t1: ConsolaReporterArgs) => (value(t0, t1)).runNow()))
  }
}
