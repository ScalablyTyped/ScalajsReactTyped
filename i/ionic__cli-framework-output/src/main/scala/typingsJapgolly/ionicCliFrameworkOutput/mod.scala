package typingsJapgolly.ionicCliFrameworkOutput

import typingsJapgolly.ionicCliFrameworkOutput.distColorsMod.ColorFunction
import typingsJapgolly.ionicCliFrameworkOutput.distColorsMod.Colors
import typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.CreateTaggedFormatterOptions
import typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.LoggerFormatter
import typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.LoggerHandler
import typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.LoggerLevel
import typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.LoggerLevelWeight
import typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.LoggerOptions
import typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.StreamHandlerOptions
import typingsJapgolly.ionicCliFrameworkOutput.distOutputMod.OutputStrategy
import typingsJapgolly.ionicCliFrameworkOutput.distOutputMod.StreamOutputStrategyOptions
import typingsJapgolly.ionicCliFrameworkOutput.distOutputMod.TTYOutputRedrawerOptions
import typingsJapgolly.ionicCliFrameworkOutput.distOutputMod.TTYOutputStrategyOptions
import typingsJapgolly.ionicCliFrameworkOutput.distTasksMod.TaskChainOptions
import typingsJapgolly.ionicCliFrameworkOutput.distTasksMod.TaskOptions
import typingsJapgolly.ionicUtilsTerminal.distFormatMod.WordWrapOptions
import typingsJapgolly.std.ReadonlyMap
import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.std.Set
import typingsJapgolly.stringWidth.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/cli-framework-output", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/cli-framework-output", "DEFAULT_LOGGER_HANDLERS")
  @js.native
  val DEFAULT_LOGGER_HANDLERS: ReadonlySet[typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.StreamHandler] = js.native
  
  @JSImport("@ionic/cli-framework-output", "ICON_FAILURE")
  @js.native
  val ICON_FAILURE: String = js.native
  
  @JSImport("@ionic/cli-framework-output", "ICON_SUCCESS")
  @js.native
  val ICON_SUCCESS: String = js.native
  
  /* Inlined {readonly [ L in @ionic/cli-framework-output.@ionic/cli-framework-output/dist/logger.LoggerLevel ]: @ionic/cli-framework-output.@ionic/cli-framework-output/dist/logger.LoggerLevelWeight} */
  object LOGGER_LEVELS {
    
    @JSImport("@ionic/cli-framework-output", "LOGGER_LEVELS.DEBUG")
    @js.native
    val DEBUG: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework-output", "LOGGER_LEVELS.ERROR")
    @js.native
    val ERROR: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework-output", "LOGGER_LEVELS.INFO")
    @js.native
    val INFO: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework-output", "LOGGER_LEVELS.WARN")
    @js.native
    val WARN: LoggerLevelWeight = js.native
  }
  
  @JSImport("@ionic/cli-framework-output", "LOGGER_LEVEL_NAMES")
  @js.native
  val LOGGER_LEVEL_NAMES: ReadonlyMap[LoggerLevelWeight, LoggerLevel] = js.native
  
  @JSImport("@ionic/cli-framework-output", "Logger")
  @js.native
  open class Logger ()
    extends typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.Logger {
    def this(hasLevelHandlers: LoggerOptions) = this()
  }
  /* static members */
  object Logger {
    
    @JSImport("@ionic/cli-framework-output", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneHandlers")(handlers.asInstanceOf[js.Any]).asInstanceOf[Set[LoggerHandler]]
  }
  
  @JSImport("@ionic/cli-framework-output", "NO_COLORS")
  @js.native
  val NO_COLORS: Colors = js.native
  
  @JSImport("@ionic/cli-framework-output", "Spinner")
  @js.native
  open class Spinner ()
    extends typingsJapgolly.ionicCliFrameworkOutput.distTasksMod.Spinner {
    def this(frames: js.Array[String]) = this()
  }
  
  @JSImport("@ionic/cli-framework-output", "StreamHandler")
  @js.native
  open class StreamHandler protected ()
    extends typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.StreamHandler {
    def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework-output", "StreamOutputStrategy")
  @js.native
  open class StreamOutputStrategy protected ()
    extends typingsJapgolly.ionicCliFrameworkOutput.distOutputMod.StreamOutputStrategy {
    def this(hasStreamColors: StreamOutputStrategyOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework-output", "TTYOutputRedrawer")
  @js.native
  open class TTYOutputRedrawer protected ()
    extends typingsJapgolly.ionicCliFrameworkOutput.distOutputMod.TTYOutputRedrawer {
    def this(hasStream: TTYOutputRedrawerOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework-output", "TTYOutputStrategy")
  @js.native
  open class TTYOutputStrategy ()
    extends typingsJapgolly.ionicCliFrameworkOutput.distOutputMod.TTYOutputStrategy {
    def this(hasStreamColors: TTYOutputStrategyOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework-output", "TTY_WIDTH")
  @js.native
  val TTY_WIDTH: Double = js.native
  
  @JSImport("@ionic/cli-framework-output", "Task")
  @js.native
  open class Task ()
    extends typingsJapgolly.ionicCliFrameworkOutput.distTasksMod.Task {
    def this(hasMsgTickInterval: TaskOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework-output", "TaskChain")
  @js.native
  open class TaskChain ()
    extends typingsJapgolly.ionicCliFrameworkOutput.distTasksMod.TaskChain {
    def this(hasTaskOptions: TaskChainOptions) = this()
  }
  
  inline def createDefaultLogger(): typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultLogger")().asInstanceOf[typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.Logger]
  inline def createDefaultLogger(hasOutputFormatterOptions: CreateDefaultLoggerOptions): typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultLogger")(hasOutputFormatterOptions.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ionicCliFrameworkOutput.distLoggerMod.Logger]
  
  inline def createPrefixedFormatter(prefix: String): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedFormatter")(prefix.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  inline def createPrefixedFormatter(prefix: js.Function0[String]): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedFormatter")(prefix.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  
  inline def createTaggedFormatter(): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedFormatter")().asInstanceOf[LoggerFormatter]
  inline def createTaggedFormatter(hasColorsPrefixTagsTitleizeWrap: CreateTaggedFormatterOptions): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedFormatter")(hasColorsPrefixTagsTitleizeWrap.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  
  inline def getLoggerLevelColor(colors: Colors): js.UndefOr[ColorFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelColor")(colors.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ColorFunction]]
  inline def getLoggerLevelColor(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelColor")(colors.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ColorFunction]]
  
  inline def getLoggerLevelName(): js.UndefOr[LoggerLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelName")().asInstanceOf[js.UndefOr[LoggerLevel]]
  inline def getLoggerLevelName(level: LoggerLevelWeight): js.UndefOr[LoggerLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelName")(level.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[LoggerLevel]]
  
  inline def indent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")().asInstanceOf[String]
  inline def indent(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object sliceAnsi {
    
    @JSImport("@ionic/cli-framework-output", "sliceAnsi")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(input: String, beginSlice: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], beginSlice.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def default(input: String, beginSlice: Double, endSlice: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], beginSlice.asInstanceOf[js.Any], endSlice.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object stringWidth {
    
    @JSImport("@ionic/cli-framework-output", "stringWidth")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def default(string: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object stripAnsi {
    
    @JSImport("@ionic/cli-framework-output", "stripAnsi")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def wordWrap(msg: String, hasWidthIndentationAppend: WordWrapOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(msg.asInstanceOf[js.Any], hasWidthIndentationAppend.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait CreateDefaultLoggerOptions extends StObject {
    
    /**
      * Specify custom logger formatter options.
      */
    var formatterOptions: js.UndefOr[CreateTaggedFormatterOptions] = js.undefined
    
    /**
      * Specify a custom output strategy to use for the logger.
      *
      * By default, the logger uses a output strategy with process.stdout and no colors.
      */
    var output: js.UndefOr[OutputStrategy] = js.undefined
  }
  object CreateDefaultLoggerOptions {
    
    inline def apply(): CreateDefaultLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDefaultLoggerOptions]
    }
    
    extension [Self <: CreateDefaultLoggerOptions](x: Self) {
      
      inline def setFormatterOptions(value: CreateTaggedFormatterOptions): Self = StObject.set(x, "formatterOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatterOptionsUndefined: Self = StObject.set(x, "formatterOptions", js.undefined)
      
      inline def setOutput(value: OutputStrategy): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
}
