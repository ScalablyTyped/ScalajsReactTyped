package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Streams library comes with a logging utility that can be used to easily gather logs and provide them for diagnostic purposes.
  * You can even add your own logs to this logger if you prefer.
  * Logs are written to the console log per normal and also kept in memory.
  */
trait Logger extends StObject {
  
  /**
    * Adds a log entry with debug level.
    * @param template The `printf`-style template.
    * @param args The arguments to the template.
    */
  def debug(template: String, args: Any*): LogEntry
  
  /** Downloads the logs on the agent's machine in JSON form. */
  def download(): Unit
  
  /**
    * Adds a log entry with error level.
    * @param template The `printf`-style template.
    * @param args The arguments to the template.
    */
  def error(template: String, args: Any*): LogEntry
  
  /**
    * Adds a log entry with info level.
    * @param template The `printf`-style template.
    * @param args The arguments to the template.
    */
  def info(template: String, args: Any*): LogEntry
  
  /**
    * Adds a log entry with warn level.
    * @param template The `printf`-style template.
    * @param args The arguments to the template.
    */
  def warn(template: String, args: Any*): LogEntry
}
object Logger {
  
  inline def apply(
    debug: (String, /* repeated */ Any) => LogEntry,
    download: Callback,
    error: (String, /* repeated */ Any) => LogEntry,
    info: (String, /* repeated */ Any) => LogEntry,
    warn: (String, /* repeated */ Any) => LogEntry
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), download = download.toJsFn, error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), warn = js.Any.fromFunction2(warn))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: (String, /* repeated */ Any) => LogEntry): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
    
    inline def setDownload(value: Callback): Self = StObject.set(x, "download", value.toJsFn)
    
    inline def setError(value: (String, /* repeated */ Any) => LogEntry): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    inline def setInfo(value: (String, /* repeated */ Any) => LogEntry): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
    
    inline def setWarn(value: (String, /* repeated */ Any) => LogEntry): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
  }
}
