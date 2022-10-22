package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typingsJapgolly.rxjs.distTypesInternalTypesMod.Observer
import typingsJapgolly.rxjs.distTypesInternalTypesMod.PartialObserver
import typingsJapgolly.rxjs.distTypesInternalTypesMod.Unsubscribable
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.rxjs.mod.Subject
import typingsJapgolly.rxjs.mod.Subscription
import typingsJapgolly.std.Partial
import typingsJapgolly.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoggerLoggerMod {
  
  @JSImport("@angular-devkit/core/src/logger/logger", "Logger")
  @js.native
  open class Logger protected ()
    extends Observable_[LogEntry]
       with LoggerApi {
    def this(name: String) = this()
    def this(name: String, parent: Logger) = this()
    
    /* protected */ var _metadata: LoggerMetadata = js.native
    
    /* private */ var _obs: Any = js.native
    
    /* protected */ def _observable: Observable_[LogEntry] = js.native
    /* protected */ def _observable_=(v: Observable_[LogEntry]): Unit = js.native
    
    /* protected */ val _subject: Subject[LogEntry] = js.native
    
    /* private */ var _subscription: Any = js.native
    
    def asApi(): LoggerApi = js.native
    
    def complete(): Unit = js.native
    
    def forEach(next: js.Function1[/* value */ LogEntry, Unit], PromiseCtor: PromiseConstructor): js.Promise[Unit] = js.native
    
    val name: String = js.native
    
    def next(entry: LogEntry): Unit = js.native
    
    val parent: Logger | Null = js.native
    
    def subscribe(observer: PartialObserver[LogEntry]): Subscription = js.native
    /* InferMemberOverrides */
    override def subscribe(observer: Partial[Observer[LogEntry]]): Unsubscribable = js.native
  }
  
  trait LogEntry
    extends StObject
       with LoggerMetadata {
    
    var level: LogLevel
    
    var message: String
    
    var timestamp: Double
  }
  object LogEntry {
    
    inline def apply(level: LogLevel, message: String, name: String, path: js.Array[String], timestamp: Double): LogEntry = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEntry]
    }
    
    extension [Self <: LogEntry](x: Self) {
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.debug
    - typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.info
    - typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.warn
    - typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.error
    - typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.fatal
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.debug = "debug".asInstanceOf[typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.debug]
    
    inline def error: typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.error = "error".asInstanceOf[typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.error]
    
    inline def fatal: typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.fatal = "fatal".asInstanceOf[typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.fatal]
    
    inline def info: typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.info = "info".asInstanceOf[typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.info]
    
    inline def warn: typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.warn = "warn".asInstanceOf[typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.warn]
  }
  
  @js.native
  trait LoggerApi extends StObject {
    
    def createChild(name: String): Logger = js.native
    
    def debug(message: String): Unit = js.native
    def debug(message: String, metadata: JsonObject): Unit = js.native
    
    def error(message: String): Unit = js.native
    def error(message: String, metadata: JsonObject): Unit = js.native
    
    def fatal(message: String): Unit = js.native
    def fatal(message: String, metadata: JsonObject): Unit = js.native
    
    def info(message: String): Unit = js.native
    def info(message: String, metadata: JsonObject): Unit = js.native
    
    def log(level: LogLevel, message: String): Unit = js.native
    def log(level: LogLevel, message: String, metadata: JsonObject): Unit = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: String, metadata: JsonObject): Unit = js.native
  }
  
  trait LoggerMetadata
    extends StObject
       with JsonObject {
    
    var name: String
    
    var path: js.Array[String]
  }
  object LoggerMetadata {
    
    inline def apply(name: String, path: js.Array[String]): LoggerMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerMetadata]
    }
    
    extension [Self <: LoggerMetadata](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
}
