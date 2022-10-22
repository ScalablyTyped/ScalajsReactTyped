package typingsJapgolly.protractor.mod

import typingsJapgolly.seleniumWebdriver.libLoggingMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logging {
  
  @JSImport("protractor", "logging")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("protractor", "logging.Entry")
  @js.native
  open class Entry protected ()
    extends typingsJapgolly.seleniumWebdriver.mod.logging.Entry {
    def this(level: String, message: String) = this()
    def this(level: Double, message: String) = this()
    /**
      * @param {(!logging.Level|string)} level The entry level.
      * @param {string} message The log message.
      * @param {number=} opt_timestamp The time this entry was generated, in
      *     milliseconds since 0:00:00, January 1, 1970 UTC. If omitted, the
      *     current time will be used.
      * @param {string=} opt_type The log type, if known.
      * @constructor
      */
    def this(level: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level, message: String) = this()
    def this(level: String, message: String, opt_timestamp: Double) = this()
    def this(level: Double, message: String, opt_timestamp: Double) = this()
    def this(
      level: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level,
      message: String,
      opt_timestamp: Double
    ) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: String, message: String, opt_timestamp: Unit, opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: Unit, opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: Unit, opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: Unit, opt_type: IType) = this()
    def this(
      level: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level,
      message: String,
      opt_timestamp: Double,
      opt_type: String
    ) = this()
    def this(
      level: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level,
      message: String,
      opt_timestamp: Double,
      opt_type: IType
    ) = this()
    def this(
      level: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level,
      message: String,
      opt_timestamp: Unit,
      opt_type: String
    ) = this()
    def this(
      level: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level,
      message: String,
      opt_timestamp: Unit,
      opt_type: IType
    ) = this()
  }
  
  @JSImport("protractor", "logging.Level")
  @js.native
  open class Level protected ()
    extends typingsJapgolly.seleniumWebdriver.mod.logging.Level {
    /**
      * @param {string} name the level's name.
      * @param {number} level the level's numeric value.
      */
    def this(name: String, level: Double) = this()
  }
  /* static members */
  object Level {
    
    @JSImport("protractor", "logging.Level")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Indicates all log messages should be recorded.
      * @const
      */
    @JSImport("protractor", "logging.Level.ALL")
    @js.native
    def ALL: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = js.native
    inline def ALL_=(x: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `700` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.DEBUG")
    @js.native
    def DEBUG: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = js.native
    inline def DEBUG_=(x: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `500` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.FINE")
    @js.native
    def FINE: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = js.native
    
    /**
      * Log messages with a level of `400` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.FINER")
    @js.native
    def FINER: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = js.native
    inline def FINER_=(x: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINER")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `300` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.FINEST")
    @js.native
    def FINEST: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = js.native
    inline def FINEST_=(x: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINEST")(x.asInstanceOf[js.Any])
    
    inline def FINE_=(x: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINE")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `800` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.INFO")
    @js.native
    def INFO: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = js.native
    inline def INFO_=(x: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates no log messages should be recorded.
      * @const
      */
    @JSImport("protractor", "logging.Level.OFF")
    @js.native
    def OFF: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = js.native
    inline def OFF_=(x: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFF")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `1000` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.SEVERE")
    @js.native
    def SEVERE: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = js.native
    inline def SEVERE_=(x: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEVERE")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `900` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.WARNING")
    @js.native
    def WARNING: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = js.native
    inline def WARNING_=(x: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("protractor", "logging.LogManager")
  @js.native
  open class LogManager ()
    extends typingsJapgolly.seleniumWebdriver.mod.logging.LogManager
  
  @JSImport("protractor", "logging.Logger")
  @js.native
  open class Logger protected ()
    extends typingsJapgolly.seleniumWebdriver.mod.logging.Logger {
    /**
      * @param {string} name the name of this logger.
      * @param {Level=} opt_level the initial level for this logger.
      */
    def this(name: String) = this()
    def this(name: String, opt_level: typingsJapgolly.seleniumWebdriver.libLoggingMod.Level) = this()
  }
  
  @JSImport("protractor", "logging.Preferences")
  @js.native
  open class Preferences ()
    extends typingsJapgolly.seleniumWebdriver.mod.logging.Preferences
  
  @JSImport("protractor", "logging.Type")
  @js.native
  val Type: IType = js.native
  
  inline def addConsoleHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConsoleHandler")().asInstanceOf[Unit]
  inline def addConsoleHandler(opt_logger: typingsJapgolly.seleniumWebdriver.libLoggingMod.Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConsoleHandler")(opt_logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getLevel(nameOrValue: String): typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = ^.asInstanceOf[js.Dynamic].applyDynamic("getLevel")(nameOrValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.seleniumWebdriver.libLoggingMod.Level]
  inline def getLevel(nameOrValue: Double): typingsJapgolly.seleniumWebdriver.libLoggingMod.Level = ^.asInstanceOf[js.Dynamic].applyDynamic("getLevel")(nameOrValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.seleniumWebdriver.libLoggingMod.Level]
  
  inline def getLogger(): typingsJapgolly.seleniumWebdriver.libLoggingMod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[typingsJapgolly.seleniumWebdriver.libLoggingMod.Logger]
  inline def getLogger(name: String): typingsJapgolly.seleniumWebdriver.libLoggingMod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.seleniumWebdriver.libLoggingMod.Logger]
  
  inline def installConsoleHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installConsoleHandler")().asInstanceOf[Unit]
  
  inline def removeConsoleHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeConsoleHandler")().asInstanceOf[Unit]
  inline def removeConsoleHandler(opt_logger: typingsJapgolly.seleniumWebdriver.libLoggingMod.Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeConsoleHandler")(opt_logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
