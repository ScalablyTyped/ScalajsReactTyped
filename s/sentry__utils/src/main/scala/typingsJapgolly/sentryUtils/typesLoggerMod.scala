package typingsJapgolly.sentryUtils

import japgolly.scalajs.react.Callback
import typingsJapgolly.sentryUtils.sentryUtilsStrings.assert
import typingsJapgolly.sentryUtils.sentryUtilsStrings.debug
import typingsJapgolly.sentryUtils.sentryUtilsStrings.error
import typingsJapgolly.sentryUtils.sentryUtilsStrings.info
import typingsJapgolly.sentryUtils.sentryUtilsStrings.log
import typingsJapgolly.sentryUtils.sentryUtilsStrings.trace
import typingsJapgolly.sentryUtils.sentryUtilsStrings.warn
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLoggerMod {
  
  @JSImport("@sentry/utils/types/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils/types/logger", "CONSOLE_LEVELS")
  @js.native
  val CONSOLE_LEVELS: js.Tuple7[debug, info, warn, error, log, assert, trace] = js.native
  
  inline def consoleSandbox[T](callback: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("consoleSandbox")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@sentry/utils/types/logger", "logger")
  @js.native
  def logger: Logger_ = js.native
  inline def logger_=(x: Logger_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.debug
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.info
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.warn
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.error
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.log
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.assert
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.trace
  */
  trait ConsoleLevel extends StObject
  
  type LoggerConsoleMethods = Record[debug | info | warn | error | log | assert | trace, LoggerMethod]
  
  @js.native
  trait LoggerMethod extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  /** JSDoc */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in 'debug' | 'info' | 'warn' | 'error' | 'log' | 'assert' | 'trace' ]: @sentry/utils.@sentry/utils/types/logger.LoggerMethod} */ trait Logger_ extends StObject {
    
    def disable(): Unit
    
    def enable(): Unit
  }
  object Logger_ {
    
    inline def apply(disable: Callback, enable: Callback): Logger_ = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn)
      __obj.asInstanceOf[Logger_]
    }
    
    extension [Self <: Logger_](x: Self) {
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    }
  }
}
