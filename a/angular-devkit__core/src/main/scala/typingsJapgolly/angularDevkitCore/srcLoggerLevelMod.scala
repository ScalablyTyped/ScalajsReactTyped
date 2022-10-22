package typingsJapgolly.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LogLevel
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoggerLevelMod {
  
  @JSImport("@angular-devkit/core/src/logger/level", "LevelCapLogger")
  @js.native
  open class LevelCapLogger protected () extends LevelTransformLogger {
    def this(name: String, parent: Null, levelCap: LogLevel) = this()
    def this(name: String, parent: Logger, levelCap: LogLevel) = this()
    
    val levelCap: LogLevel = js.native
  }
  /* static members */
  object LevelCapLogger {
    
    @JSImport("@angular-devkit/core/src/logger/level", "LevelCapLogger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/core/src/logger/level", "LevelCapLogger.levelMap")
    @js.native
    def levelMap: StringDictionary[StringDictionary[String]] = js.native
    inline def levelMap_=(x: StringDictionary[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("levelMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/core/src/logger/level", "LevelTransformLogger")
  @js.native
  open class LevelTransformLogger protected () extends Logger {
    def this(name: String, parent: Null, levelTransform: js.Function1[/* level */ LogLevel, LogLevel]) = this()
    def this(name: String, parent: Logger, levelTransform: js.Function1[/* level */ LogLevel, LogLevel]) = this()
    
    def levelTransform(level: LogLevel): LogLevel = js.native
  }
}
