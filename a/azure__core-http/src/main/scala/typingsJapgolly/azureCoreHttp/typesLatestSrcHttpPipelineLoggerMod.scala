package typingsJapgolly.azureCoreHttp

import japgolly.scalajs.react.Callback
import typingsJapgolly.azureCoreHttp.typesLatestSrcHttpPipelineLogLevelMod.HttpPipelineLogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcHttpPipelineLoggerMod {
  
  @JSImport("@azure/core-http/types/latest/src/httpPipelineLogger", "ConsoleHttpPipelineLogger")
  @js.native
  open class ConsoleHttpPipelineLogger protected ()
    extends StObject
       with HttpPipelineLogger {
    /**
      * Create a new ConsoleHttpPipelineLogger.
      * @param minimumLogLevel - The log level threshold for what logs will be logged.
      */
    def this(minimumLogLevel: HttpPipelineLogLevel) = this()
    
    /**
      * Log the provided message.
      * @param logLevel - The HttpLogDetailLevel associated with this message.
      * @param message - The message to log.
      */
    /* CompleteClass */
    override def log(logLevel: HttpPipelineLogLevel, message: String): Unit = js.native
    
    /**
      * The log level threshold for what logs will be logged.
      */
    /* CompleteClass */
    var minimumLogLevel: HttpPipelineLogLevel = js.native
  }
  
  trait HttpPipelineLogger extends StObject {
    
    /**
      * Log the provided message.
      * @param logLevel - The HttpLogDetailLevel associated with this message.
      * @param message - The message to log.
      */
    def log(logLevel: HttpPipelineLogLevel, message: String): Unit
    
    /**
      * The log level threshold for what logs will be logged.
      */
    var minimumLogLevel: HttpPipelineLogLevel
  }
  object HttpPipelineLogger {
    
    inline def apply(log: (HttpPipelineLogLevel, String) => Callback, minimumLogLevel: HttpPipelineLogLevel): HttpPipelineLogger = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction2((t0: HttpPipelineLogLevel, t1: String) => (log(t0, t1)).runNow()), minimumLogLevel = minimumLogLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpPipelineLogger]
    }
    
    extension [Self <: HttpPipelineLogger](x: Self) {
      
      inline def setLog(value: (HttpPipelineLogLevel, String) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: HttpPipelineLogLevel, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setMinimumLogLevel(value: HttpPipelineLogLevel): Self = StObject.set(x, "minimumLogLevel", value.asInstanceOf[js.Any])
    }
  }
}
