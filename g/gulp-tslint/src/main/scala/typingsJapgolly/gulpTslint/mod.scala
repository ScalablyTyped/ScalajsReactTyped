package typingsJapgolly.gulpTslint

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Main plugin function
    * @param {PluginOptions} [pluginOptions] contains the options for gulp-tslint.
    * Optional.
    * @returns {any}
    */
  @JSImport("gulp-tslint", JSImport.Default)
  @js.native
  val default: TslintPlugin = js.native
  
  trait PluginOptions extends StObject {
    
    var configuration: js.UndefOr[Any] = js.undefined
    
    var fix: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[String | js.Function] = js.undefined
    
    var formattersDirectory: js.UndefOr[String] = js.undefined
    
    var program: js.UndefOr[Any] = js.undefined
    
    var rulesDirectory: js.UndefOr[String] = js.undefined
    
    var tslint: js.UndefOr[Any] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setConfiguration(value: Any): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setFormatter(value: String | js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setFormattersDirectory(value: String): Self = StObject.set(x, "formattersDirectory", value.asInstanceOf[js.Any])
      
      inline def setFormattersDirectoryUndefined: Self = StObject.set(x, "formattersDirectory", js.undefined)
      
      inline def setProgram(value: Any): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      inline def setRulesDirectory(value: String): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
      
      inline def setRulesDirectoryUndefined: Self = StObject.set(x, "rulesDirectory", js.undefined)
      
      inline def setTslint(value: Any): Self = StObject.set(x, "tslint", value.asInstanceOf[js.Any])
      
      inline def setTslintUndefined: Self = StObject.set(x, "tslint", js.undefined)
    }
  }
  
  trait ReportOptions extends StObject {
    
    var allowWarnings: js.UndefOr[Boolean] = js.undefined
    
    var emitError: js.UndefOr[Boolean] = js.undefined
    
    var reportLimit: js.UndefOr[Double] = js.undefined
    
    var summarizeFailureOutput: js.UndefOr[Boolean] = js.undefined
  }
  object ReportOptions {
    
    inline def apply(): ReportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportOptions]
    }
    
    extension [Self <: ReportOptions](x: Self) {
      
      inline def setAllowWarnings(value: Boolean): Self = StObject.set(x, "allowWarnings", value.asInstanceOf[js.Any])
      
      inline def setAllowWarningsUndefined: Self = StObject.set(x, "allowWarnings", js.undefined)
      
      inline def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      inline def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      inline def setReportLimit(value: Double): Self = StObject.set(x, "reportLimit", value.asInstanceOf[js.Any])
      
      inline def setReportLimitUndefined: Self = StObject.set(x, "reportLimit", js.undefined)
      
      inline def setSummarizeFailureOutput(value: Boolean): Self = StObject.set(x, "summarizeFailureOutput", value.asInstanceOf[js.Any])
      
      inline def setSummarizeFailureOutputUndefined: Self = StObject.set(x, "summarizeFailureOutput", js.undefined)
    }
  }
  
  trait TslintFile extends StObject {
    
    var contents: Buffer | Any
    
    def isNull(): Boolean
    
    def isStream(): Boolean
    
    var path: String
    
    var relative: String
    
    var tslint: Any
  }
  object TslintFile {
    
    inline def apply(
      contents: Buffer | Any,
      isNull: CallbackTo[Boolean],
      isStream: CallbackTo[Boolean],
      path: String,
      relative: String,
      tslint: Any
    ): TslintFile = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], isNull = isNull.toJsFn, isStream = isStream.toJsFn, path = path.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], tslint = tslint.asInstanceOf[js.Any])
      __obj.asInstanceOf[TslintFile]
    }
    
    extension [Self <: TslintFile](x: Self) {
      
      inline def setContents(value: Buffer | Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setIsNull(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNull", value.toJsFn)
      
      inline def setIsStream(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStream", value.toJsFn)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setTslint(value: Any): Self = StObject.set(x, "tslint", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TslintPlugin extends StObject {
    
    def apply(): ReadWriteStream = js.native
    def apply(pluginOptions: PluginOptions): ReadWriteStream = js.native
    
    var pluginOptions: PluginOptions = js.native
    
    def report(): ReadWriteStream = js.native
    def report(options: ReportOptions): ReadWriteStream = js.native
  }
  
  type _To = TslintPlugin
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: TslintPlugin = default
}
