package typingsJapgolly.logger

import typingsJapgolly.logger.loggerBooleans.`false`
import typingsJapgolly.logger.loggerStrings.debug
import typingsJapgolly.logger.loggerStrings.error
import typingsJapgolly.logger.loggerStrings.fatal
import typingsJapgolly.logger.loggerStrings.info
import typingsJapgolly.logger.loggerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("logger", "Logger")
  @js.native
  open class Logger () extends StObject {
    def this(logFilePath: String) = this()
    
    def debug(args: String*): String | `false` = js.native
    @JSName("debug")
    var debug_Original: Args = js.native
    
    def error(args: String*): String | `false` = js.native
    @JSName("error")
    var error_Original: Args = js.native
    
    def fatal(args: String*): String | `false` = js.native
    @JSName("fatal")
    var fatal_Original: Args = js.native
    
    def format(level: LogLevel, data: String, message: String): String = js.native
    
    def info(args: String*): String | `false` = js.native
    @JSName("info")
    var info_Original: Args = js.native
    
    def log(level: LogLevel, args: String*): String | `false` = js.native
    
    def setLevel(level: LogLevel): Double | `false` = js.native
    
    def warn(args: String*): String | `false` = js.native
    @JSName("warn")
    var warn_Original: Args = js.native
  }
  object Logger {
    
    @JSImport("logger", "Logger.levels")
    @js.native
    val levels: js.Tuple5[fatal, error, warn, info, debug] = js.native
  }
  
  inline def createLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")().asInstanceOf[Logger]
  inline def createLogger(logFilePath: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(logFilePath.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  @js.native
  trait Args extends StObject {
    
    def apply(args: String*): String | `false` = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.logger.loggerStrings.fatal
    - typingsJapgolly.logger.loggerStrings.error
    - typingsJapgolly.logger.loggerStrings.warn
    - typingsJapgolly.logger.loggerStrings.info
    - typingsJapgolly.logger.loggerStrings.debug
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typingsJapgolly.logger.loggerStrings.debug = "debug".asInstanceOf[typingsJapgolly.logger.loggerStrings.debug]
    
    inline def error: typingsJapgolly.logger.loggerStrings.error = "error".asInstanceOf[typingsJapgolly.logger.loggerStrings.error]
    
    inline def fatal: typingsJapgolly.logger.loggerStrings.fatal = "fatal".asInstanceOf[typingsJapgolly.logger.loggerStrings.fatal]
    
    inline def info: typingsJapgolly.logger.loggerStrings.info = "info".asInstanceOf[typingsJapgolly.logger.loggerStrings.info]
    
    inline def warn: typingsJapgolly.logger.loggerStrings.warn = "warn".asInstanceOf[typingsJapgolly.logger.loggerStrings.warn]
  }
}
