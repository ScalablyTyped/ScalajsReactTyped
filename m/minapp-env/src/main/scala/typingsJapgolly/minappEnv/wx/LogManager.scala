package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogManager extends StObject {
  
  /** [LogManager.debug()](LogManager.debug.md)
    *
    * 写 debug 日志 */
  def debug(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: Any*): Unit
  
  /** [LogManager.info()](LogManager.info.md)
    *
    * 写 info 日志 */
  def info(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: Any*): Unit
  
  /** [LogManager.log()](LogManager.log.md)
    *
    * 写 log 日志 */
  def log(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: Any*): Unit
  
  /** [LogManager.warn()](LogManager.warn.md)
    *
    * 写 warn 日志 */
  def warn(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: Any*): Unit
}
object LogManager {
  
  inline def apply(
    debug: /* repeated */ Any => Callback,
    info: /* repeated */ Any => Callback,
    log: /* repeated */ Any => Callback,
    warn: /* repeated */ Any => Callback
  ): LogManager = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), log = js.Any.fromFunction1((t0: /* repeated */ Any) => log(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
    __obj.asInstanceOf[LogManager]
  }
  
  extension [Self <: LogManager](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setLog(value: /* repeated */ Any => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
