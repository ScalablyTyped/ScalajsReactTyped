package typingsJapgolly.webdriverManager

import typingsJapgolly.webdriverManager.builtLibCliLoggerMod.LogLevel
import typingsJapgolly.webdriverManager.builtLibCliLoggerMod.WriteTo
import typingsJapgolly.webdriverManager.builtLibCliOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibCliMod {
  
  @JSImport("webdriver-manager/built/lib/cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver-manager/built/lib/cli", "Cli")
  @js.native
  open class Cli ()
    extends typingsJapgolly.webdriverManager.builtLibCliCliMod.Cli
  
  @JSImport("webdriver-manager/built/lib/cli", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.webdriverManager.builtLibCliLoggerMod.LogLevel & Double] = js.native
    
    /* 3 */ val DEBUG: typingsJapgolly.webdriverManager.builtLibCliLoggerMod.LogLevel.DEBUG & Double = js.native
    
    /* 0 */ val ERROR: typingsJapgolly.webdriverManager.builtLibCliLoggerMod.LogLevel.ERROR & Double = js.native
    
    /* 2 */ val INFO: typingsJapgolly.webdriverManager.builtLibCliLoggerMod.LogLevel.INFO & Double = js.native
    
    /* 1 */ val WARN: typingsJapgolly.webdriverManager.builtLibCliLoggerMod.LogLevel.WARN & Double = js.native
  }
  
  @JSImport("webdriver-manager/built/lib/cli", "Logger")
  @js.native
  open class Logger protected ()
    extends typingsJapgolly.webdriverManager.builtLibCliLoggerMod.Logger {
    /**
      * Creates a logger instance with an ID for the logger.
      * @constructor
      */
    def this(id: String) = this()
  }
  /* static members */
  object Logger {
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.fd")
    @js.native
    def fd: Any = js.native
    inline def fd_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fd")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.firstWrite")
    @js.native
    def firstWrite: Boolean = js.native
    inline def firstWrite_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firstWrite")(x.asInstanceOf[js.Any])
    
    /**
      * Get the identifier of the logger as '/<id>'
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted id
      */
    inline def id_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("id_")(logLevel.asInstanceOf[js.Any], id.asInstanceOf[js.Any], writeTo.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Get the log level formatted with the first letter. For info, it is I.
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted log level
      */
    inline def level_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("level_")(logLevel.asInstanceOf[js.Any], id.asInstanceOf[js.Any], writeTo.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.logLevel")
    @js.native
    def logLevel: LogLevel = js.native
    inline def logLevel_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    /**
      * Convert the list of messages to a single string message.
      * @param msgs The list of messages.
      * @return The string of the formatted messages
      */
    inline def msgToFile_(msgs: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("msgToFile_")(msgs.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Set up the write location. If writing to a file, get the file descriptor.
      * @param writeTo The enum for where to write the logs.
      * @param opt_logFile An optional parameter to override the log file location.
      */
    inline def setWrite(writeTo: WriteTo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWrite")(writeTo.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setWrite(writeTo: WriteTo, opt_logFile: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWrite")(writeTo.asInstanceOf[js.Any], opt_logFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.showId")
    @js.native
    def showId: Boolean = js.native
    inline def showId_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showId")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.showTimestamp")
    @js.native
    def showTimestamp: Boolean = js.native
    inline def showTimestamp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTimestamp")(x.asInstanceOf[js.Any])
    
    /**
      * Get a timestamp formatted with [hh:mm:ss]
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted timestamp
      */
    inline def timestamp_(writeTo: WriteTo): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp_")(writeTo.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.writeTo")
    @js.native
    def writeTo: WriteTo = js.native
    inline def writeTo_=(x: WriteTo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeTo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/cli", "Option")
  @js.native
  open class Option protected ()
    extends typingsJapgolly.webdriverManager.builtLibCliOptionsMod.Option {
    def this(opt: String, description: String, `type`: String) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: String) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: Boolean) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: Double) = this()
  }
  
  @JSImport("webdriver-manager/built/lib/cli", "Program")
  @js.native
  open class Program ()
    extends typingsJapgolly.webdriverManager.builtLibCliProgramsMod.Program
  /* static members */
  object Program {
    
    @JSImport("webdriver-manager/built/lib/cli", "Program")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/cli", "Program.MIN_SPACING")
    @js.native
    def MIN_SPACING: Double = js.native
    inline def MIN_SPACING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SPACING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/cli", "WriteTo")
  @js.native
  object WriteTo extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.webdriverManager.builtLibCliLoggerMod.WriteTo & Double] = js.native
    
    /* 2 */ val BOTH: typingsJapgolly.webdriverManager.builtLibCliLoggerMod.WriteTo.BOTH & Double = js.native
    
    /* 0 */ val CONSOLE: typingsJapgolly.webdriverManager.builtLibCliLoggerMod.WriteTo.CONSOLE & Double = js.native
    
    /* 1 */ val FILE: typingsJapgolly.webdriverManager.builtLibCliLoggerMod.WriteTo.FILE & Double = js.native
    
    /* 3 */ val NONE: typingsJapgolly.webdriverManager.builtLibCliLoggerMod.WriteTo.NONE & Double = js.native
  }
  
  inline def unparseOptions(options: Options): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unparseOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
