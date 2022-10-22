package typingsJapgolly.expoDevServer

import japgolly.scalajs.react.Callback
import typingsJapgolly.expoBunyan.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLogReporterMod {
  
  @JSImport("@expo/dev-server/build/LogReporter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LogReporter {
    def this(logger: ^) = this()
    def this(logger: ^, reportEvent: js.Function1[/* event */ Any, Unit]) = this()
    
    /* CompleteClass */
    var logger: ^ = js.native
    
    /* CompleteClass */
    override def reportEvent(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def update(event: Any): Unit = js.native
  }
  
  trait LogReporter extends StObject {
    
    var logger: ^
    
    def reportEvent(event: Any): Unit
    
    def update(event: Any): Unit
  }
  object LogReporter {
    
    inline def apply(logger: ^, reportEvent: Any => Callback, update: Any => Callback): LogReporter = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], reportEvent = js.Any.fromFunction1((t0: Any) => reportEvent(t0).runNow()), update = js.Any.fromFunction1((t0: Any) => update(t0).runNow()))
      __obj.asInstanceOf[LogReporter]
    }
    
    extension [Self <: LogReporter](x: Self) {
      
      inline def setLogger(value: ^): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setReportEvent(value: Any => Callback): Self = StObject.set(x, "reportEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setUpdate(value: Any => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
