package typingsJapgolly.karmaMochaReporter

import typingsJapgolly.karmaMochaReporter.karmaMochaReporterBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  /* Inlined {[ K in karma-mocha-reporter.karma.ReporterColor ]:? string} */
  trait ColorOptions extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[String] = js.undefined
    
    var warning: js.UndefOr[String] = js.undefined
  }
  object ColorOptions {
    
    inline def apply(): ColorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorOptions]
    }
    
    extension [Self <: ColorOptions](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait ConfigOptions extends StObject {
    
    /**
      * {@link https://github.com/litixsoft/karma-mocha-reporter#options}
      */
    var mochaReporter: js.UndefOr[MochaReporterOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setMochaReporter(value: MochaReporterOptions): Self = StObject.set(x, "mochaReporter", value.asInstanceOf[js.Any])
      
      inline def setMochaReporterUndefined: Self = StObject.set(x, "mochaReporter", js.undefined)
    }
  }
  
  /**
    * Reporter options
    */
  trait MochaReporterOptions extends StObject {
    
    /**
      * Lets you overwrite the default colors.
      * Possible values are all colors and background colors from chalk.
      */
    var colors: js.UndefOr[ColorOptions] = js.undefined
    
    /** The string to output between multiple test runs. Set to false or empty string to disable */
    var divider: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * When setting the ignoreSkipped flag to true, the reporter will ignore the skipped tests in the output
      * and you will see only the tests that where really executed.
      * The summary will still contain the number of skipped tests.
      */
    var ignoreSkipped: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Lets you set the maximum number of lines which are printed for a failure.
      * The default value is 999. Helps to cut long stack traces. Set the value to -1 to disable stack traces.
      */
    var maxLogLines: js.UndefOr[Double] = js.undefined
    
    /**
      * output type printed to the console
      */
    var output: js.UndefOr[OutputOptions] = js.undefined
    
    /**
      * Prints the result of an it block after it is run in one browser.
      * This options is useful when you have tests which are conditionally run in one browser only.
      * Otherwise the result of the it block would not be printed because it was not run in all browsers.
      */
    var printFirstSuccess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shows a diff output. Is disabled by default.
      * All credits to the contributors of mocha, since the diff logic is used from there and customized for this modul
      */
    var showDiff: js.UndefOr[ShowDiffOptions] = js.undefined
    
    /**
      * Lets you overwrite the default symbols.
      */
    var symbols: js.UndefOr[SymbolOptions] = js.undefined
  }
  object MochaReporterOptions {
    
    inline def apply(): MochaReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MochaReporterOptions]
    }
    
    extension [Self <: MochaReporterOptions](x: Self) {
      
      inline def setColors(value: ColorOptions): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setDivider(value: String | `false`): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setIgnoreSkipped(value: Boolean): Self = StObject.set(x, "ignoreSkipped", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSkippedUndefined: Self = StObject.set(x, "ignoreSkipped", js.undefined)
      
      inline def setMaxLogLines(value: Double): Self = StObject.set(x, "maxLogLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLogLinesUndefined: Self = StObject.set(x, "maxLogLines", js.undefined)
      
      inline def setOutput(value: OutputOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPrintFirstSuccess(value: Boolean): Self = StObject.set(x, "printFirstSuccess", value.asInstanceOf[js.Any])
      
      inline def setPrintFirstSuccessUndefined: Self = StObject.set(x, "printFirstSuccess", js.undefined)
      
      inline def setShowDiff(value: ShowDiffOptions): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
      
      inline def setShowDiffUndefined: Self = StObject.set(x, "showDiff", js.undefined)
      
      inline def setSymbols(value: SymbolOptions): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.full
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.autowatch
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.minimal
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.noFailures
  */
  trait OutputOptions extends StObject
  object OutputOptions {
    
    inline def autowatch: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.autowatch = "autowatch".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.autowatch]
    
    inline def full: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.full = "full".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.full]
    
    inline def minimal: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.minimal = "minimal".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.minimal]
    
    inline def noFailures: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.noFailures = "noFailures".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.noFailures]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.success
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.info
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.warning
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.error
  */
  trait ReporterColor extends StObject
  object ReporterColor {
    
    inline def error: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.error = "error".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.error]
    
    inline def info: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.info = "info".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.info]
    
    inline def success: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.success = "success".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.success]
    
    inline def warning: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.warning = "warning".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterBooleans.`true`
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.unified
    - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.`inline`
  */
  trait ShowDiffOptions extends StObject
  object ShowDiffOptions {
    
    inline def `inline`: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.`inline` = "inline".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.`inline`]
    
    inline def `true`: typingsJapgolly.karmaMochaReporter.karmaMochaReporterBooleans.`true` = true.asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterBooleans.`true`]
    
    inline def unified: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.unified = "unified".asInstanceOf[typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.unified]
  }
  
  /* Inlined {[ K in karma-mocha-reporter.karma.ReporterColor ]:? string} */
  trait SymbolOptions extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[String] = js.undefined
    
    var warning: js.UndefOr[String] = js.undefined
  }
  object SymbolOptions {
    
    inline def apply(): SymbolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymbolOptions]
    }
    
    extension [Self <: SymbolOptions](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
}
