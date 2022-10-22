package typingsJapgolly.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LogEntry
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LogLevel
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoggerMod {
  
  @JSImport("@angular-devkit/core/src/logger", "IndentLogger")
  @js.native
  open class IndentLogger protected ()
    extends typingsJapgolly.angularDevkitCore.srcLoggerIndentMod.IndentLogger {
    def this(name: String) = this()
    def this(name: String, parent: typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger) = this()
    def this(name: String, parent: Null, indentation: String) = this()
    def this(name: String, parent: Unit, indentation: String) = this()
    def this(
      name: String,
      parent: typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger,
      indentation: String
    ) = this()
  }
  
  @JSImport("@angular-devkit/core/src/logger", "LevelCapLogger")
  @js.native
  open class LevelCapLogger protected ()
    extends typingsJapgolly.angularDevkitCore.srcLoggerLevelMod.LevelCapLogger {
    def this(name: String, parent: Null, levelCap: LogLevel) = this()
    def this(
      name: String,
      parent: typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger,
      levelCap: LogLevel
    ) = this()
  }
  /* static members */
  object LevelCapLogger {
    
    @JSImport("@angular-devkit/core/src/logger", "LevelCapLogger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/core/src/logger", "LevelCapLogger.levelMap")
    @js.native
    def levelMap: StringDictionary[StringDictionary[String]] = js.native
    inline def levelMap_=(x: StringDictionary[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("levelMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/core/src/logger", "LevelTransformLogger")
  @js.native
  open class LevelTransformLogger protected ()
    extends typingsJapgolly.angularDevkitCore.srcLoggerLevelMod.LevelTransformLogger {
    def this(name: String, parent: Null, levelTransform: js.Function1[/* level */ LogLevel, LogLevel]) = this()
    def this(
      name: String,
      parent: typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger,
      levelTransform: js.Function1[/* level */ LogLevel, LogLevel]
    ) = this()
  }
  
  @JSImport("@angular-devkit/core/src/logger", "Logger")
  @js.native
  open class Logger protected ()
    extends typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger {
    def this(name: String) = this()
    def this(name: String, parent: typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger) = this()
  }
  
  @JSImport("@angular-devkit/core/src/logger", "NullLogger")
  @js.native
  open class NullLogger ()
    extends typingsJapgolly.angularDevkitCore.srcLoggerNullLoggerMod.NullLogger {
    def this(parent: typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger) = this()
  }
  
  @JSImport("@angular-devkit/core/src/logger", "TransformLogger")
  @js.native
  open class TransformLogger protected ()
    extends typingsJapgolly.angularDevkitCore.srcLoggerTransformLoggerMod.TransformLogger {
    def this(name: String, transform: js.Function1[/* stream */ Observable_[LogEntry], Observable_[LogEntry]]) = this()
    def this(
      name: String,
      transform: js.Function1[/* stream */ Observable_[LogEntry], Observable_[LogEntry]],
      parent: typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger
    ) = this()
  }
}
