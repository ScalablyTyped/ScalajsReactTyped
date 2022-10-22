package typingsJapgolly.popoto

import japgolly.scalajs.react.Callback
import typingsJapgolly.popoto.popotoInts.`0`
import typingsJapgolly.popoto.popotoInts.`1`
import typingsJapgolly.popoto.popotoInts.`2`
import typingsJapgolly.popoto.popotoInts.`3`
import typingsJapgolly.popoto.popotoInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  /* Inlined std.Readonly<{  DEBUG :0,   INFO :1,   WARN :2,   ERROR :3,   NONE :4}> */
  trait LogLevels extends StObject {
    
    val DEBUG: `0`
    
    val ERROR: `3`
    
    val INFO: `1`
    
    val NONE: `4`
    
    val WARN: `2`
  }
  object LogLevels {
    
    inline def apply(): LogLevels = {
      val __obj = js.Dynamic.literal(DEBUG = 0, ERROR = 3, INFO = 1, NONE = 4, WARN = 2)
      __obj.asInstanceOf[LogLevels]
    }
    
    extension [Self <: LogLevels](x: Self) {
      
      inline def setDEBUG(value: `0`): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: `3`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: `1`): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: `4`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: `2`): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  trait Logger extends StObject {
    
    var LEVEL: LogLevels
    
    var LogLevels: typingsJapgolly.popoto.loggerMod.LogLevels
    
    var TRACE: Boolean
    
    /**
      * Log a message in DEBUG level.
      * @param message to log.
      */
    def debug(message: String): Unit
    
    /**
      * Log a message in ERROR level.
      * @param message to log.
      */
    def error(message: String): Unit
    
    /**
      * Log a message in INFO level.
      * @param message to log.
      */
    def info(message: String): Unit
    
    /**
      * Log a message on console depending on configured log levels.
      * Level is define in popoto.logger.LEVEL property.
      * If popoto.logger.TRACE is set to true, the stack trace is also added in log.
      * @param logLevel Level of the message from popoto.logger.LogLevels.
      * @param message Message to log.
      */
    def log(logLevel: LogLevels, message: String): Unit
    
    /**
      * Log a message in WARN level.
      * @param message to log.
      */
    def warn(message: String): Unit
  }
  object Logger {
    
    inline def apply(
      LEVEL: LogLevels,
      LogLevels: LogLevels,
      TRACE: Boolean,
      debug: String => Callback,
      error: String => Callback,
      info: String => Callback,
      log: (LogLevels, String) => Callback,
      warn: String => Callback
    ): Logger = {
      val __obj = js.Dynamic.literal(LEVEL = LEVEL.asInstanceOf[js.Any], LogLevels = LogLevels.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], debug = js.Any.fromFunction1((t0: String) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), info = js.Any.fromFunction1((t0: String) => info(t0).runNow()), log = js.Any.fromFunction2((t0: LogLevels, t1: String) => (log(t0, t1)).runNow()), warn = js.Any.fromFunction1((t0: String) => warn(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: String => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setInfo(value: String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLEVEL(value: LogLevels): Self = StObject.set(x, "LEVEL", value.asInstanceOf[js.Any])
      
      inline def setLog(value: (LogLevels, String) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: LogLevels, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setLogLevels(value: LogLevels): Self = StObject.set(x, "LogLevels", value.asInstanceOf[js.Any])
      
      inline def setTRACE(value: Boolean): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
