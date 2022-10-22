package typingsJapgolly.jestConsole

import typingsJapgolly.jestMessageUtil.mod.StackTraceConfig
import typingsJapgolly.jestTypes.mod.GlobalConfig
import typingsJapgolly.node.processMod.global.NodeJS.WriteStream
import typingsJapgolly.node.utilMod.InspectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Console_2 * / any */ @JSImport("@jest/console", "BufferedConsole")
  @js.native
  open class BufferedConsole () extends StObject {
    
    var Console: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Console_2 */ Any = js.native
    
    /* private */ val _buffer: Any = js.native
    
    /* private */ var _counters: Any = js.native
    
    /* private */ var _groupDepth: Any = js.native
    
    /* private */ var _log: Any = js.native
    
    /* private */ var _timers: Any = js.native
    
    def assert(value: Any): Unit = js.native
    def assert(value: Any, message: String): Unit = js.native
    def assert(value: Any, message: js.Error): Unit = js.native
    
    def count(): Unit = js.native
    def count(label: String): Unit = js.native
    
    def countReset(): Unit = js.native
    def countReset(label: String): Unit = js.native
    
    def debug(firstArg: Any, rest: Any*): Unit = js.native
    
    def dir(firstArg: Any): Unit = js.native
    def dir(firstArg: Any, options: InspectOptions): Unit = js.native
    
    def dirxml(firstArg: Any, rest: Any*): Unit = js.native
    
    def error(firstArg: Any, rest: Any*): Unit = js.native
    
    def getBuffer(): js.UndefOr[ConsoleBuffer] = js.native
    
    def group(title: String, rest: Any*): Unit = js.native
    def group(title: Unit, rest: Any*): Unit = js.native
    
    def groupCollapsed(title: String, rest: Any*): Unit = js.native
    def groupCollapsed(title: Unit, rest: Any*): Unit = js.native
    
    def groupEnd(): Unit = js.native
    
    def info(firstArg: Any, rest: Any*): Unit = js.native
    
    def log(firstArg: Any, rest: Any*): Unit = js.native
    
    def time(): Unit = js.native
    def time(label: String): Unit = js.native
    
    def timeEnd(): Unit = js.native
    def timeEnd(label: String): Unit = js.native
    
    def timeLog(label: String, data: Any*): Unit = js.native
    def timeLog(label: Unit, data: Any*): Unit = js.native
    
    def warn(firstArg: Any, rest: Any*): Unit = js.native
  }
  /* static members */
  object BufferedConsole {
    
    @JSImport("@jest/console", "BufferedConsole")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage): ConsoleBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ConsoleBuffer]
    inline def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage, level: Double): ConsoleBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[ConsoleBuffer]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Console_2 * / any */ @JSImport("@jest/console", "CustomConsole")
  @js.native
  open class CustomConsole protected () extends StObject {
    def this(stdout: WriteStream, stderr: WriteStream) = this()
    def this(stdout: WriteStream, stderr: WriteStream, formatBuffer: Formatter) = this()
    
    var Console: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Console_2 */ Any = js.native
    
    /* private */ var _counters: Any = js.native
    
    /* private */ val _formatBuffer: Any = js.native
    
    /* private */ var _groupDepth: Any = js.native
    
    /* private */ var _log: Any = js.native
    
    /* private */ var _logError: Any = js.native
    
    /* private */ val _stderr: Any = js.native
    
    /* private */ val _stdout: Any = js.native
    
    /* private */ var _timers: Any = js.native
    
    def assert(value: Any): /* asserts value */ Boolean = js.native
    def assert(value: Any, message: String): /* asserts value */ Boolean = js.native
    def assert(value: Any, message: js.Error): /* asserts value */ Boolean = js.native
    
    def count(): Unit = js.native
    def count(label: String): Unit = js.native
    
    def countReset(): Unit = js.native
    def countReset(label: String): Unit = js.native
    
    def debug(firstArg: Any, args: Any*): Unit = js.native
    
    def dir(firstArg: Any): Unit = js.native
    def dir(firstArg: Any, options: InspectOptions): Unit = js.native
    
    def dirxml(firstArg: Any, args: Any*): Unit = js.native
    
    def error(firstArg: Any, args: Any*): Unit = js.native
    
    def getBuffer(): Unit = js.native
    
    def group(title: String, args: Any*): Unit = js.native
    def group(title: Unit, args: Any*): Unit = js.native
    
    def groupCollapsed(title: String, args: Any*): Unit = js.native
    def groupCollapsed(title: Unit, args: Any*): Unit = js.native
    
    def groupEnd(): Unit = js.native
    
    def info(firstArg: Any, args: Any*): Unit = js.native
    
    def log(firstArg: Any, args: Any*): Unit = js.native
    
    def time(): Unit = js.native
    def time(label: String): Unit = js.native
    
    def timeEnd(): Unit = js.native
    def timeEnd(label: String): Unit = js.native
    
    def timeLog(label: String, data: Any*): Unit = js.native
    def timeLog(label: Unit, data: Any*): Unit = js.native
    
    def warn(firstArg: Any, args: Any*): Unit = js.native
  }
  
  @JSImport("@jest/console", "NullConsole")
  @js.native
  open class NullConsole protected () extends CustomConsole {
    def this(stdout: WriteStream, stderr: WriteStream) = this()
    def this(stdout: WriteStream, stderr: WriteStream, formatBuffer: Formatter) = this()
    
    def assert(): Unit = js.native
    
    def debug(): Unit = js.native
    
    def dir(): Unit = js.native
    
    def error(): Unit = js.native
    
    def group(): Unit = js.native
    
    def groupCollapsed(): Unit = js.native
    
    def info(): Unit = js.native
    
    def log(): Unit = js.native
    
    def timeLog(): Unit = js.native
    
    def trace(): Unit = js.native
    
    def warn(): Unit = js.native
  }
  
  inline def getConsoleOutput(buffer: ConsoleBuffer, config: StackTraceConfig, globalConfig: GlobalConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getConsoleOutput")(buffer.asInstanceOf[js.Any], config.asInstanceOf[js.Any], globalConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type ConsoleBuffer = js.Array[LogEntry]
  
  type Formatter = js.Function2[/* type */ LogType, /* message */ LogMessage, String]
  
  trait LogEntry extends StObject {
    
    var message: LogMessage
    
    var origin: String
    
    var `type`: LogType
  }
  object LogEntry {
    
    inline def apply(message: LogMessage, origin: String, `type`: LogType): LogEntry = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEntry]
    }
    
    extension [Self <: LogEntry](x: Self) {
      
      inline def setMessage(value: LogMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setType(value: LogType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type LogMessage = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jestConsole.jestConsoleStrings.assert
    - typingsJapgolly.jestConsole.jestConsoleStrings.count
    - typingsJapgolly.jestConsole.jestConsoleStrings.debug
    - typingsJapgolly.jestConsole.jestConsoleStrings.dir
    - typingsJapgolly.jestConsole.jestConsoleStrings.dirxml
    - typingsJapgolly.jestConsole.jestConsoleStrings.error
    - typingsJapgolly.jestConsole.jestConsoleStrings.group
    - typingsJapgolly.jestConsole.jestConsoleStrings.groupCollapsed
    - typingsJapgolly.jestConsole.jestConsoleStrings.info
    - typingsJapgolly.jestConsole.jestConsoleStrings.log
    - typingsJapgolly.jestConsole.jestConsoleStrings.time
    - typingsJapgolly.jestConsole.jestConsoleStrings.warn
  */
  trait LogType extends StObject
  object LogType {
    
    inline def assert: typingsJapgolly.jestConsole.jestConsoleStrings.assert = "assert".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.assert]
    
    inline def count: typingsJapgolly.jestConsole.jestConsoleStrings.count = "count".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.count]
    
    inline def debug: typingsJapgolly.jestConsole.jestConsoleStrings.debug = "debug".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.debug]
    
    inline def dir: typingsJapgolly.jestConsole.jestConsoleStrings.dir = "dir".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.dir]
    
    inline def dirxml: typingsJapgolly.jestConsole.jestConsoleStrings.dirxml = "dirxml".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.dirxml]
    
    inline def error: typingsJapgolly.jestConsole.jestConsoleStrings.error = "error".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.error]
    
    inline def group: typingsJapgolly.jestConsole.jestConsoleStrings.group = "group".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.group]
    
    inline def groupCollapsed: typingsJapgolly.jestConsole.jestConsoleStrings.groupCollapsed = "groupCollapsed".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.groupCollapsed]
    
    inline def info: typingsJapgolly.jestConsole.jestConsoleStrings.info = "info".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.info]
    
    inline def log: typingsJapgolly.jestConsole.jestConsoleStrings.log = "log".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.log]
    
    inline def time: typingsJapgolly.jestConsole.jestConsoleStrings.time = "time".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.time]
    
    inline def warn: typingsJapgolly.jestConsole.jestConsoleStrings.warn = "warn".asInstanceOf[typingsJapgolly.jestConsole.jestConsoleStrings.warn]
  }
}
