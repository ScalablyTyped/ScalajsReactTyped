package typingsJapgolly.lambdaLog

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Console
import typingsJapgolly.lambdaLog.lambdaLogBooleans.`false`
import typingsJapgolly.lambdaLog.lambdaLogStrings.error
import typingsJapgolly.lambdaLog.lambdaLogStrings.info
import typingsJapgolly.lambdaLog.lambdaLogStrings.log
import typingsJapgolly.lambdaLog.lambdaLogStrings.warn
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lambda-log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @JSImport("lambda-log", "LambdaLog")
  @js.native
  open class LambdaLog () extends EventEmitter {
    def this(options: LambdaLogOptions) = this()
    def this(options: Unit, levels: Any) = this()
    def this(options: LambdaLogOptions, levels: Any) = this()
    
    var LambdaLog: typingsJapgolly.lambdaLog.mod.LambdaLog = js.native
    
    /* private */ var _levels: Any = js.native
    
    /* private */ var _logLevels: Any = js.native
    
    def assert(test: Any, msg: String): Boolean | LogMessage = js.native
    def assert(test: Any, msg: String, meta: js.Object): Boolean | LogMessage = js.native
    def assert(test: Any, msg: String, meta: js.Object, tags: js.Array[String]): Boolean | LogMessage = js.native
    def assert(test: Any, msg: String, meta: Unit, tags: js.Array[String]): Boolean | LogMessage = js.native
    
    var console: Console = js.native
    
    def debug(msg: String): LogMessage = js.native
    def debug(msg: String, meta: js.Object): LogMessage = js.native
    def debug(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
    def debug(msg: String, meta: Unit, tags: js.Array[String]): LogMessage = js.native
    
    def error(msg: String): LogMessage = js.native
    def error(msg: String, meta: js.Object): LogMessage = js.native
    def error(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
    def error(msg: String, meta: Unit, tags: js.Array[String]): LogMessage = js.native
    def error(msg: js.Error): LogMessage = js.native
    def error(msg: js.Error, meta: js.Object): LogMessage = js.native
    def error(msg: js.Error, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
    def error(msg: js.Error, meta: Unit, tags: js.Array[String]): LogMessage = js.native
    
    def info(msg: String): LogMessage = js.native
    def info(msg: String, meta: js.Object): LogMessage = js.native
    def info(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
    def info(msg: String, meta: Unit, tags: js.Array[String]): LogMessage = js.native
    
    def log(level: String, msg: String): LogMessage = js.native
    def log(level: String, msg: String, meta: js.Object): LogMessage = js.native
    def log(level: String, msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
    def log(level: String, msg: String, meta: Unit, tags: js.Array[String]): LogMessage = js.native
    
    var options: LambdaLogOptions = js.native
    
    def warn(msg: String): LogMessage = js.native
    def warn(msg: String, meta: js.Object): LogMessage = js.native
    def warn(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
    def warn(msg: String, meta: Unit, tags: js.Array[String]): LogMessage = js.native
  }
  
  @JSImport("lambda-log", "LogMessage")
  @js.native
  open class LogMessage protected () extends StObject {
    def this(logRecordOptions: LogRecordOptions, opts: LambdaLogOptions) = this()
    
    var level: String = js.native
    
    var log: LogRecord = js.native
    
    var meta: js.UndefOr[Any] = js.native
    
    var msg: String = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
    
    var `throw`: Unit = js.native
    
    def toJSON(): String = js.native
    def toJSON(format: Boolean): String = js.native
    
    var value: LogRecord = js.native
  }
  /* static members */
  object LogMessage {
    
    @JSImport("lambda-log", "LogMessage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isError(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def assert(test: Any, msg: String): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(test.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def assert(test: Any, msg: String, meta: js.Object): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(test.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def assert(test: Any, msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(test.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def assert(test: Any, msg: String, meta: Unit, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(test.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  
  inline def debug(msg: String): LogMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[LogMessage]
  inline def debug(msg: String, meta: js.Object): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def debug(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def debug(msg: String, meta: Unit, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  
  inline def error(msg: String): LogMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[LogMessage]
  inline def error(msg: String, meta: js.Object): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def error(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def error(msg: String, meta: Unit, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def error(msg: js.Error): LogMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[LogMessage]
  inline def error(msg: js.Error, meta: js.Object): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def error(msg: js.Error, meta: js.Object, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def error(msg: js.Error, meta: Unit, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  
  inline def info(msg: String): LogMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[LogMessage]
  inline def info(msg: String, meta: js.Object): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def info(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def info(msg: String, meta: Unit, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  
  inline def log(level: String, msg: String): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def log(level: String, msg: String, meta: js.Object): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def log(level: String, msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def log(level: String, msg: String, meta: Unit, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  
  @JSImport("lambda-log", "options")
  @js.native
  val options: LambdaLogOptions = js.native
  
  inline def warn(msg: String): LogMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[LogMessage]
  inline def warn(msg: String, meta: js.Object): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def warn(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  inline def warn(msg: String, meta: Unit, tags: js.Array[String]): LogMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[LogMessage]
  
  trait LambdaLogOptions extends StObject {
    
    // Enable debugging mode (log.debug messages)
    var debug: js.UndefOr[Boolean] = js.undefined
    
    // Enable development mode which pretty-prints the log object to the console
    var dev: js.UndefOr[Boolean] = js.undefined
    
    // Optional function which will run for every log to inject dynamic metadata
    var dynamicMeta: js.UndefOr[js.Function1[/* message */ LogMessage, Any]] = js.undefined
    
    var meta: js.UndefOr[Any] = js.undefined
    
    // Optional replacer function for `JSON.stringify`
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
    
    // Disables logging to the console (used for testing)
    var silent: js.UndefOr[Boolean] = js.undefined
    
    // Optional stream to write stderr messages to
    var stderrStream: js.UndefOr[WriteStream] = js.undefined
    
    // Optional stream to write stdout messages to
    var stdoutStream: js.UndefOr[WriteStream] = js.undefined
    
    // Global tags array to include with every log
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object LambdaLogOptions {
    
    inline def apply(): LambdaLogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LambdaLogOptions]
    }
    
    extension [Self <: LambdaLogOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setDynamicMeta(value: /* message */ LogMessage => Any): Self = StObject.set(x, "dynamicMeta", js.Any.fromFunction1(value))
      
      inline def setDynamicMetaUndefined: Self = StObject.set(x, "dynamicMeta", js.undefined)
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setStderrStream(value: WriteStream): Self = StObject.set(x, "stderrStream", value.asInstanceOf[js.Any])
      
      inline def setStderrStreamUndefined: Self = StObject.set(x, "stderrStream", js.undefined)
      
      inline def setStdoutStream(value: WriteStream): Self = StObject.set(x, "stdoutStream", value.asInstanceOf[js.Any])
      
      inline def setStdoutStreamUndefined: Self = StObject.set(x, "stdoutStream", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait LogLevels
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var debug: log | `false`
    
    var error: typingsJapgolly.lambdaLog.lambdaLogStrings.error
    
    var info: typingsJapgolly.lambdaLog.lambdaLogStrings.info
    
    var warn: typingsJapgolly.lambdaLog.lambdaLogStrings.warn
  }
  object LogLevels {
    
    inline def apply(debug: log | `false`): LogLevels = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = "error", info = "info", warn = "warn")
      __obj.asInstanceOf[LogLevels]
    }
    
    extension [Self <: LogLevels](x: Self) {
      
      inline def setDebug(value: log | `false`): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: warn): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogRecord extends StObject {
    
    var _logLevel: String
    
    var _tags: js.Array[String]
    
    var meta: Any
    
    var msg: String
  }
  object LogRecord {
    
    inline def apply(_logLevel: String, _tags: js.Array[String], meta: Any, msg: String): LogRecord = {
      val __obj = js.Dynamic.literal(_logLevel = _logLevel.asInstanceOf[js.Any], _tags = _tags.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogRecord]
    }
    
    extension [Self <: LogRecord](x: Self) {
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def set_logLevel(value: String): Self = StObject.set(x, "_logLevel", value.asInstanceOf[js.Any])
      
      inline def set_tags(value: js.Array[String]): Self = StObject.set(x, "_tags", value.asInstanceOf[js.Any])
      
      inline def set_tagsVarargs(value: String*): Self = StObject.set(x, "_tags", js.Array(value*))
    }
  }
  
  trait LogRecordOptions extends StObject {
    
    var level: String
    
    var meta: js.UndefOr[Any] = js.undefined
    
    var msg: String
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object LogRecordOptions {
    
    inline def apply(level: String, msg: String): LogRecordOptions = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogRecordOptions]
    }
    
    extension [Self <: LogRecordOptions](x: Self) {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
