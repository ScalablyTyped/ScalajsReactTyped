package typingsJapgolly.bsLogger

import typingsJapgolly.bsLogger.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerLevelMod {
  
  @JSImport("bs-logger/dist/logger/level", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bs-logger/dist/logger/level", "LogLevelNames")
  @js.native
  val LogLevelNames: js.Array[LogLevelName] = js.native
  
  @JSImport("bs-logger/dist/logger/level", "LogLevelValues")
  @js.native
  val LogLevelValues: js.Array[Double] = js.native
  
  object LogLevels {
    
    @JSImport("bs-logger/dist/logger/level", "LogLevels")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bs-logger/dist/logger/level", "LogLevels.debug")
    @js.native
    def debug: Double = js.native
    inline def debug_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger/dist/logger/level", "LogLevels.error")
    @js.native
    def error: Double = js.native
    inline def error_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger/dist/logger/level", "LogLevels.fatal")
    @js.native
    def fatal: Double = js.native
    inline def fatal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fatal")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger/dist/logger/level", "LogLevels.higher")
    @js.native
    val higher: Double = js.native
    
    @JSImport("bs-logger/dist/logger/level", "LogLevels.info")
    @js.native
    def info: Double = js.native
    inline def info_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger/dist/logger/level", "LogLevels.lower")
    @js.native
    val lower: Double = js.native
    
    @JSImport("bs-logger/dist/logger/level", "LogLevels.trace")
    @js.native
    def trace: Double = js.native
    inline def trace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger/dist/logger/level", "LogLevels.warn")
    @js.native
    def warn: Double = js.native
    inline def warn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bs-logger/dist/logger/level", "LogLevelsScale")
  @js.native
  val LogLevelsScale: js.Array[LogLevelsScaleEntry] = js.native
  
  inline def logLevelNameFor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logLevelNameFor")().asInstanceOf[String]
  inline def logLevelNameFor(level: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logLevelNameFor")(level.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseLogLevel(level: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def parseLogLevel(level: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bsLogger.bsLoggerStrings.trace
    - typingsJapgolly.bsLogger.bsLoggerStrings.debug
    - typingsJapgolly.bsLogger.bsLoggerStrings.info
    - typingsJapgolly.bsLogger.bsLoggerStrings.warn
    - typingsJapgolly.bsLogger.bsLoggerStrings.error
    - typingsJapgolly.bsLogger.bsLoggerStrings.fatal
  */
  trait LogLevelName extends StObject
  object LogLevelName {
    
    inline def debug: typingsJapgolly.bsLogger.bsLoggerStrings.debug = "debug".asInstanceOf[typingsJapgolly.bsLogger.bsLoggerStrings.debug]
    
    inline def error: typingsJapgolly.bsLogger.bsLoggerStrings.error = "error".asInstanceOf[typingsJapgolly.bsLogger.bsLoggerStrings.error]
    
    inline def fatal: typingsJapgolly.bsLogger.bsLoggerStrings.fatal = "fatal".asInstanceOf[typingsJapgolly.bsLogger.bsLoggerStrings.fatal]
    
    inline def info: typingsJapgolly.bsLogger.bsLoggerStrings.info = "info".asInstanceOf[typingsJapgolly.bsLogger.bsLoggerStrings.info]
    
    inline def trace: typingsJapgolly.bsLogger.bsLoggerStrings.trace = "trace".asInstanceOf[typingsJapgolly.bsLogger.bsLoggerStrings.trace]
    
    inline def warn: typingsJapgolly.bsLogger.bsLoggerStrings.warn = "warn".asInstanceOf[typingsJapgolly.bsLogger.bsLoggerStrings.warn]
  }
  
  trait LogLevelsScaleEntry extends StObject {
    
    var name: String
    
    var range: From
    
    def test(level: Double): Boolean
  }
  object LogLevelsScaleEntry {
    
    inline def apply(name: String, range: From, test: Double => Boolean): LogLevelsScaleEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[LogLevelsScaleEntry]
    }
    
    extension [Self <: LogLevelsScaleEntry](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRange(value: From): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTest(value: Double => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
}
