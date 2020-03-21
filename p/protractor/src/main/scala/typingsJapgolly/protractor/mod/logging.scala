package typingsJapgolly.protractor.mod

import typingsJapgolly.seleniumWebdriver.loggingMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "logging")
@js.native
object logging extends js.Object {
  @js.native
  class Entry protected ()
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
    def this(level: typingsJapgolly.seleniumWebdriver.loggingMod.Level, message: String) = this()
    def this(level: String, message: String, opt_timestamp: Double) = this()
    def this(level: Double, message: String, opt_timestamp: Double) = this()
    def this(level: typingsJapgolly.seleniumWebdriver.loggingMod.Level, message: String, opt_timestamp: Double) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(
      level: typingsJapgolly.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: Double,
      opt_type: String
    ) = this()
    def this(
      level: typingsJapgolly.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: Double,
      opt_type: IType
    ) = this()
  }
  
  @js.native
  class Level protected ()
    extends typingsJapgolly.seleniumWebdriver.mod.logging.Level {
    /**
      * @param {string} name the level's name.
      * @param {number} level the level's numeric value.
      */
    def this(name: String, level: Double) = this()
  }
  
  @js.native
  class LogManager ()
    extends typingsJapgolly.seleniumWebdriver.loggingMod.LogManager
  
  @js.native
  class Logger protected ()
    extends typingsJapgolly.seleniumWebdriver.mod.logging.Logger {
    /**
      * @param {string} name the name of this logger.
      * @param {Level=} opt_level the initial level for this logger.
      */
    def this(name: String) = this()
    def this(name: String, opt_level: typingsJapgolly.seleniumWebdriver.loggingMod.Level) = this()
  }
  
  @js.native
  class Preferences ()
    extends typingsJapgolly.seleniumWebdriver.mod.logging.Preferences
  
  val Type: IType = js.native
  def addConsoleHandler(): Unit = js.native
  def addConsoleHandler(opt_logger: typingsJapgolly.seleniumWebdriver.loggingMod.Logger): Unit = js.native
  def getLevel(nameOrValue: String): typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
  def getLevel(nameOrValue: Double): typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
  def getLogger(): typingsJapgolly.seleniumWebdriver.loggingMod.Logger = js.native
  def getLogger(name: String): typingsJapgolly.seleniumWebdriver.loggingMod.Logger = js.native
  def installConsoleHandler(): Unit = js.native
  def removeConsoleHandler(): Unit = js.native
  def removeConsoleHandler(opt_logger: typingsJapgolly.seleniumWebdriver.loggingMod.Logger): Unit = js.native
  /* static members */
  @js.native
  object Level extends js.Object {
    /**
      * Indicates all log messages should be recorded.
      * @const
      */
    var ALL: typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
    /**
      * Log messages with a level of `700` or higher.
      * @const
      */
    var DEBUG: typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
    /**
      * Log messages with a level of `500` or higher.
      * @const
      */
    var FINE: typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
    /**
      * Log messages with a level of `400` or higher.
      * @const
      */
    var FINER: typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
    /**
      * Log messages with a level of `300` or higher.
      * @const
      */
    var FINEST: typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
    /**
      * Log messages with a level of `800` or higher.
      * @const
      */
    var INFO: typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
    /**
      * Indicates no log messages should be recorded.
      * @const
      */
    var OFF: typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
    /**
      * Log messages with a level of `1000` or higher.
      * @const
      */
    var SEVERE: typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
    /**
      * Log messages with a level of `900` or higher.
      * @const
      */
    var WARNING: typingsJapgolly.seleniumWebdriver.loggingMod.Level = js.native
  }
  
}

