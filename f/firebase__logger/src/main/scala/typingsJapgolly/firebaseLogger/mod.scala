package typingsJapgolly.firebaseLogger

import typingsJapgolly.firebaseLogger.loggerMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Logger protected ()
    extends typingsJapgolly.firebaseLogger.loggerMod.Logger {
    /**
      * Gives you an instance of a Logger to capture messages according to
      * Firebase's logging scheme.
      *
      * @param name The name that the logs will be associated with
      */
    def this(name: String) = this()
  }
  
  def setLogLevel(level: LogLevel): Unit = js.native
  @js.native
  object LogLevel extends js.Object {
    /* 0 */ val DEBUG: typingsJapgolly.firebaseLogger.loggerMod.LogLevel.DEBUG with Double = js.native
    /* 4 */ val ERROR: typingsJapgolly.firebaseLogger.loggerMod.LogLevel.ERROR with Double = js.native
    /* 2 */ val INFO: typingsJapgolly.firebaseLogger.loggerMod.LogLevel.INFO with Double = js.native
    /* 5 */ val SILENT: typingsJapgolly.firebaseLogger.loggerMod.LogLevel.SILENT with Double = js.native
    /* 1 */ val VERBOSE: typingsJapgolly.firebaseLogger.loggerMod.LogLevel.VERBOSE with Double = js.native
    /* 3 */ val WARN: typingsJapgolly.firebaseLogger.loggerMod.LogLevel.WARN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.firebaseLogger.loggerMod.LogLevel with Double] = js.native
  }
  
}

