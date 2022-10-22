package typingsJapgolly.stylelintWebpackPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.postcss.mod.Root_
import typingsJapgolly.postcss.mod.Warning
import typingsJapgolly.std.NonNullable
import typingsJapgolly.stylelint.mod.Config
import typingsJapgolly.stylelint.mod.ConfigRuleSettings
import typingsJapgolly.stylelint.mod.CustomSyntax
import typingsJapgolly.stylelint.mod.Formatter
import typingsJapgolly.stylelint.mod.LintResult
import typingsJapgolly.stylelint.mod.LinterResult
import typingsJapgolly.stylelint.mod.PostcssResult
import typingsJapgolly.stylelint.mod.Problem
import typingsJapgolly.stylelint.mod.RuleMessages
import typingsJapgolly.stylelint.mod.RuleOptions
import typingsJapgolly.stylelintWebpackPlugin.typesLinterMod.InternalApi
import typingsJapgolly.stylelintWebpackPlugin.typesLinterMod.Linter
import typingsJapgolly.stylelintWebpackPlugin.typesLinterMod.Report
import typingsJapgolly.stylelintWebpackPlugin.typesLinterMod.Reporter
import typingsJapgolly.stylelintWebpackPlugin.typesOptionsMod.FormatterType
import typingsJapgolly.stylelintWebpackPlugin.typesOptionsMod.OutputReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Api extends StObject {
    
    var api: InternalApi
    
    def lint(files: String): Unit
    def lint(files: js.Array[String]): Unit
    @JSName("lint")
    var lint_Original: Linter
    
    def report(): js.Promise[Report]
    @JSName("report")
    var report_Original: Reporter
    
    var threads: Double
  }
  object Api {
    
    inline def apply(
      api: InternalApi,
      lint: /* files */ String | js.Array[String] => Callback,
      report: CallbackTo[js.Promise[Report]],
      threads: Double
    ): Api = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], lint = js.Any.fromFunction1((t0: /* files */ String | js.Array[String]) => lint(t0).runNow()), report = report.toJsFn, threads = threads.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    extension [Self <: Api](x: Self) {
      
      inline def setApi(value: InternalApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setLint(value: /* files */ String | js.Array[String] => Callback): Self = StObject.set(x, "lint", js.Any.fromFunction1((t0: /* files */ String | js.Array[String]) => value(t0).runNow()))
      
      inline def setReport(value: CallbackTo[js.Promise[Report]]): Self = StObject.set(x, "report", value.toJsFn)
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckAgainstRule extends StObject {
    
    def checkAgainstRule[T_1, O /* <: js.Object */](options: Root[T_1, O], callback: js.Function1[/* warning */ Warning, Unit]): Unit
    
    def report(problem: Problem): Unit
    
    def ruleMessages[T /* <: RuleMessages */, R /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any */](ruleName: String, messages: T): R
    
    def validateOptions(result: PostcssResult, ruleName: String, optionDescriptions: RuleOptions*): Boolean
  }
  object CheckAgainstRule {
    
    inline def apply(
      checkAgainstRule: (Root[Any, Any], js.Function1[/* warning */ Warning, Unit]) => Callback,
      report: Problem => Callback,
      ruleMessages: (String, Any) => Any,
      validateOptions: (PostcssResult, String, /* repeated */ RuleOptions) => Boolean
    ): CheckAgainstRule = {
      val __obj = js.Dynamic.literal(checkAgainstRule = js.Any.fromFunction2((t0: Root[Any, Any], t1: js.Function1[/* warning */ Warning, Unit]) => (checkAgainstRule(t0, t1)).runNow()), report = js.Any.fromFunction1((t0: Problem) => report(t0).runNow()), ruleMessages = js.Any.fromFunction2(ruleMessages), validateOptions = js.Any.fromFunction3(validateOptions))
      __obj.asInstanceOf[CheckAgainstRule]
    }
    
    extension [Self <: CheckAgainstRule](x: Self) {
      
      inline def setCheckAgainstRule(value: (Root[Any, Any], js.Function1[/* warning */ Warning, Unit]) => Callback): Self = StObject.set(x, "checkAgainstRule", js.Any.fromFunction2((t0: Root[Any, Any], t1: js.Function1[/* warning */ Warning, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setReport(value: Problem => Callback): Self = StObject.set(x, "report", js.Any.fromFunction1((t0: Problem) => value(t0).runNow()))
      
      inline def setRuleMessages(value: (String, Any) => Any): Self = StObject.set(x, "ruleMessages", js.Any.fromFunction2(value))
      
      inline def setValidateOptions(value: (PostcssResult, String, /* repeated */ RuleOptions) => Boolean): Self = StObject.set(x, "validateOptions", js.Any.fromFunction3(value))
    }
  }
  
  /* Inlined std.Partial<stylelint-webpack-plugin.stylelint-webpack-plugin/types/options.PluginOptions> */
  trait PartialPluginOptions extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var emitError: js.UndefOr[Boolean] = js.undefined
    
    var emitWarning: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var failOnError: js.UndefOr[Boolean] = js.undefined
    
    var failOnWarning: js.UndefOr[Boolean] = js.undefined
    
    var files: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var formatter: js.UndefOr[FormatterType] = js.undefined
    
    var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined
    
    var outputReport: js.UndefOr[OutputReport] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var stylelintPath: js.UndefOr[String] = js.undefined
    
    var threads: js.UndefOr[Double | Boolean] = js.undefined
  }
  object PartialPluginOptions {
    
    inline def apply(): PartialPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPluginOptions]
    }
    
    extension [Self <: PartialPluginOptions](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      inline def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      inline def setEmitWarning(value: Boolean): Self = StObject.set(x, "emitWarning", value.asInstanceOf[js.Any])
      
      inline def setEmitWarningUndefined: Self = StObject.set(x, "emitWarning", js.undefined)
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
      
      inline def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
      
      inline def setFailOnWarning(value: Boolean): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
      
      inline def setFailOnWarningUndefined: Self = StObject.set(x, "failOnWarning", js.undefined)
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFormatter(value: FormatterType): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setLintDirtyModulesOnly(value: Boolean): Self = StObject.set(x, "lintDirtyModulesOnly", value.asInstanceOf[js.Any])
      
      inline def setLintDirtyModulesOnlyUndefined: Self = StObject.set(x, "lintDirtyModulesOnly", js.undefined)
      
      inline def setOutputReport(value: OutputReport): Self = StObject.set(x, "outputReport", value.asInstanceOf[js.Any])
      
      inline def setOutputReportUndefined: Self = StObject.set(x, "outputReport", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setStylelintPath(value: String): Self = StObject.set(x, "stylelintPath", value.asInstanceOf[js.Any])
      
      inline def setStylelintPathUndefined: Self = StObject.set(x, "stylelintPath", js.undefined)
      
      inline def setThreads(value: Double | Boolean): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
  
  /* Inlined std.Partial<stylelint-webpack-plugin.stylelint-webpack-plugin/types/options.StylelintOptions> */
  trait PartialStylelintOptions extends StObject {
    
    var allowEmptyInput: js.UndefOr[Boolean] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var cacheLocation: js.UndefOr[String] = js.undefined
    
    var cacheStrategy: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var codeFilename: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[Config] = js.undefined
    
    var configBasedir: js.UndefOr[String] = js.undefined
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var customSyntax: js.UndefOr[CustomSyntax] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var disableDefaultIgnores: js.UndefOr[Boolean] = js.undefined
    
    var files: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var fix: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[typingsJapgolly.stylelint.mod.FormatterType | Formatter] = js.undefined
    
    var globbyOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobbyOptions */ Any
      ] = js.undefined
    
    var ignoreDisables: js.UndefOr[Boolean] = js.undefined
    
    var ignorePath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ignorePattern: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxWarnings: js.UndefOr[Double] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var reportDescriptionlessDisables: js.UndefOr[Boolean] = js.undefined
    
    var reportInvalidScopeDisables: js.UndefOr[Boolean] = js.undefined
    
    var reportNeedlessDisables: js.UndefOr[Boolean] = js.undefined
    
    var syntax: js.UndefOr[String] = js.undefined
  }
  object PartialStylelintOptions {
    
    inline def apply(): PartialStylelintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStylelintOptions]
    }
    
    extension [Self <: PartialStylelintOptions](x: Self) {
      
      inline def setAllowEmptyInput(value: Boolean): Self = StObject.set(x, "allowEmptyInput", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyInputUndefined: Self = StObject.set(x, "allowEmptyInput", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheLocation(value: String): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
      
      inline def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
      
      inline def setCacheStrategy(value: String): Self = StObject.set(x, "cacheStrategy", value.asInstanceOf[js.Any])
      
      inline def setCacheStrategyUndefined: Self = StObject.set(x, "cacheStrategy", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeFilename(value: String): Self = StObject.set(x, "codeFilename", value.asInstanceOf[js.Any])
      
      inline def setCodeFilenameUndefined: Self = StObject.set(x, "codeFilename", js.undefined)
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigBasedir(value: String): Self = StObject.set(x, "configBasedir", value.asInstanceOf[js.Any])
      
      inline def setConfigBasedirUndefined: Self = StObject.set(x, "configBasedir", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCustomSyntax(value: CustomSyntax): Self = StObject.set(x, "customSyntax", value.asInstanceOf[js.Any])
      
      inline def setCustomSyntaxUndefined: Self = StObject.set(x, "customSyntax", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDisableDefaultIgnores(value: Boolean): Self = StObject.set(x, "disableDefaultIgnores", value.asInstanceOf[js.Any])
      
      inline def setDisableDefaultIgnoresUndefined: Self = StObject.set(x, "disableDefaultIgnores", js.undefined)
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setFormatter(value: typingsJapgolly.stylelint.mod.FormatterType | Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterFunction2(value: (/* results */ js.Array[LintResult], /* returnValue */ LinterResult) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setGlobbyOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobbyOptions */ Any
      ): Self = StObject.set(x, "globbyOptions", value.asInstanceOf[js.Any])
      
      inline def setGlobbyOptionsUndefined: Self = StObject.set(x, "globbyOptions", js.undefined)
      
      inline def setIgnoreDisables(value: Boolean): Self = StObject.set(x, "ignoreDisables", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDisablesUndefined: Self = StObject.set(x, "ignoreDisables", js.undefined)
      
      inline def setIgnorePath(value: String | js.Array[String]): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setIgnorePathVarargs(value: String*): Self = StObject.set(x, "ignorePath", js.Array(value*))
      
      inline def setIgnorePattern(value: js.Array[String]): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
      
      inline def setIgnorePatternVarargs(value: String*): Self = StObject.set(x, "ignorePattern", js.Array(value*))
      
      inline def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
      
      inline def setMaxWarningsUndefined: Self = StObject.set(x, "maxWarnings", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setReportDescriptionlessDisables(value: Boolean): Self = StObject.set(x, "reportDescriptionlessDisables", value.asInstanceOf[js.Any])
      
      inline def setReportDescriptionlessDisablesUndefined: Self = StObject.set(x, "reportDescriptionlessDisables", js.undefined)
      
      inline def setReportInvalidScopeDisables(value: Boolean): Self = StObject.set(x, "reportInvalidScopeDisables", value.asInstanceOf[js.Any])
      
      inline def setReportInvalidScopeDisablesUndefined: Self = StObject.set(x, "reportInvalidScopeDisables", js.undefined)
      
      inline def setReportNeedlessDisables(value: Boolean): Self = StObject.set(x, "reportNeedlessDisables", value.asInstanceOf[js.Any])
      
      inline def setReportNeedlessDisablesUndefined: Self = StObject.set(x, "reportNeedlessDisables", js.undefined)
      
      inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  /* Inlined std.Pick<stylelint.stylelint.LinterOptions, 'cwd' | 'config' | 'configFile' | 'configBasedir'> */
  trait PickLinterOptionscwdconfi extends StObject {
    
    var config: js.UndefOr[Config] = js.undefined
    
    var configBasedir: js.UndefOr[String] = js.undefined
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
  }
  object PickLinterOptionscwdconfi {
    
    inline def apply(): PickLinterOptionscwdconfi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickLinterOptionscwdconfi]
    }
    
    extension [Self <: PickLinterOptionscwdconfi](x: Self) {
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigBasedir(value: String): Self = StObject.set(x, "configBasedir", value.asInstanceOf[js.Any])
      
      inline def setConfigBasedirUndefined: Self = StObject.set(x, "configBasedir", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
  
  trait Root[T_1, O /* <: js.Object */] extends StObject {
    
    var root: Root_
    
    var ruleName: String
    
    var ruleSettings: ConfigRuleSettings[T_1, O]
  }
  object Root {
    
    inline def apply[T_1, O /* <: js.Object */](root: Root_, ruleName: String): Root[T_1, O] = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Root[T_1, O]]
    }
    
    extension [Self <: Root[?, ?], T_1, O /* <: js.Object */](x: Self & (Root[T_1, O])) {
      
      inline def setRoot(value: Root_): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setRuleSettings(value: ConfigRuleSettings[T_1, O]): Self = StObject.set(x, "ruleSettings", value.asInstanceOf[js.Any])
      
      inline def setRuleSettingsNull: Self = StObject.set(x, "ruleSettings", null)
      
      inline def setRuleSettingsUndefined: Self = StObject.set(x, "ruleSettings", js.undefined)
      
      inline def setRuleSettingsVarargs(value: NonNullable[T_1]*): Self = StObject.set(x, "ruleSettings", js.Array(value*))
    }
  }
  
  trait Rule extends StObject {
    
    var rule: typingsJapgolly.stylelint.mod.Rule[Any, Any]
    
    var ruleName: String
  }
  object Rule {
    
    inline def apply(rule: typingsJapgolly.stylelint.mod.Rule[Any, Any], ruleName: String): Rule = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setRule(value: typingsJapgolly.stylelint.mod.Rule[Any, Any]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timestamp extends StObject {
    
    var timestamp: Double
  }
  object Timestamp {
    
    inline def apply(timestamp: Double): Timestamp = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timestamp]
    }
    
    extension [Self <: Timestamp](x: Self) {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
