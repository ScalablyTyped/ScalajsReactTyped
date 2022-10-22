package typingsJapgolly.pa11y

import japgolly.scalajs.react.Callback
import typingsJapgolly.puppeteer.mod.Browser
import typingsJapgolly.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): js.Promise[Results] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Results]]
  inline def apply(url: String, options: Options): js.Promise[Results] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Results]]
  
  @JSImport("pa11y", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidAction(action: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAction")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pa11y.pa11yStrings.Section508
    - typingsJapgolly.pa11y.pa11yStrings.WCAG2A
    - typingsJapgolly.pa11y.pa11yStrings.WCAG2AA
    - typingsJapgolly.pa11y.pa11yStrings.WCAG2AAA
  */
  trait AccessibilityStandard extends StObject
  object AccessibilityStandard {
    
    inline def Section508: typingsJapgolly.pa11y.pa11yStrings.Section508 = "Section508".asInstanceOf[typingsJapgolly.pa11y.pa11yStrings.Section508]
    
    inline def WCAG2A: typingsJapgolly.pa11y.pa11yStrings.WCAG2A = "WCAG2A".asInstanceOf[typingsJapgolly.pa11y.pa11yStrings.WCAG2A]
    
    inline def WCAG2AA: typingsJapgolly.pa11y.pa11yStrings.WCAG2AA = "WCAG2AA".asInstanceOf[typingsJapgolly.pa11y.pa11yStrings.WCAG2AA]
    
    inline def WCAG2AAA: typingsJapgolly.pa11y.pa11yStrings.WCAG2AAA = "WCAG2AAA".asInstanceOf[typingsJapgolly.pa11y.pa11yStrings.WCAG2AAA]
  }
  
  trait LaunchConfig extends StObject {
    
    var executablePath: String
    
    var ignoreHTTPSErrors: Boolean
  }
  object LaunchConfig {
    
    inline def apply(executablePath: String, ignoreHTTPSErrors: Boolean): LaunchConfig = {
      val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], ignoreHTTPSErrors = ignoreHTTPSErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchConfig]
    }
    
    extension [Self <: LaunchConfig](x: Self) {
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogConfig extends StObject {
    
    var debug: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var info: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object LogConfig {
    
    inline def apply(): LogConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogConfig]
    }
    
    extension [Self <: LogConfig](x: Self) {
      
      inline def setDebug(value: Callback): Self = StObject.set(x, "debug", value.toJsFn)
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setError(value: Callback): Self = StObject.set(x, "error", value.toJsFn)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: Callback): Self = StObject.set(x, "info", value.toJsFn)
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var actions: js.UndefOr[js.Array[String]] = js.undefined
    
    var browser: js.UndefOr[Browser] = js.undefined
    
    var chromeLaunchConfig: js.UndefOr[LaunchConfig] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var hideElements: js.UndefOr[String] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreUrl: js.UndefOr[Boolean] = js.undefined
    
    var includeNotices: js.UndefOr[Boolean] = js.undefined
    
    var includeWarnings: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[LogConfig] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[Page] = js.undefined
    
    var pages: js.UndefOr[js.Array[Page]] = js.undefined
    
    var postData: js.UndefOr[String] = js.undefined
    
    var reporter: js.UndefOr[String] = js.undefined
    
    var rootElement: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[js.Array[String]] = js.undefined
    
    var runners: js.UndefOr[js.Array[String]] = js.undefined
    
    var screenCapture: js.UndefOr[String] = js.undefined
    
    var standard: js.UndefOr[AccessibilityStandard] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
    
    var viewport: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Viewport */ Any
      ] = js.undefined
    
    @JSName("wait")
    var wait_FOptions: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setChromeLaunchConfig(value: LaunchConfig): Self = StObject.set(x, "chromeLaunchConfig", value.asInstanceOf[js.Any])
      
      inline def setChromeLaunchConfigUndefined: Self = StObject.set(x, "chromeLaunchConfig", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHideElements(value: String): Self = StObject.set(x, "hideElements", value.asInstanceOf[js.Any])
      
      inline def setHideElementsUndefined: Self = StObject.set(x, "hideElements", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreUrl(value: Boolean): Self = StObject.set(x, "ignoreUrl", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUrlUndefined: Self = StObject.set(x, "ignoreUrl", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setIncludeNotices(value: Boolean): Self = StObject.set(x, "includeNotices", value.asInstanceOf[js.Any])
      
      inline def setIncludeNoticesUndefined: Self = StObject.set(x, "includeNotices", js.undefined)
      
      inline def setIncludeWarnings(value: Boolean): Self = StObject.set(x, "includeWarnings", value.asInstanceOf[js.Any])
      
      inline def setIncludeWarningsUndefined: Self = StObject.set(x, "includeWarnings", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLog(value: LogConfig): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
      
      inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setRootElement(value: String): Self = StObject.set(x, "rootElement", value.asInstanceOf[js.Any])
      
      inline def setRootElementUndefined: Self = StObject.set(x, "rootElement", js.undefined)
      
      inline def setRules(value: js.Array[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setRunners(value: js.Array[String]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
      
      inline def setRunnersUndefined: Self = StObject.set(x, "runners", js.undefined)
      
      inline def setRunnersVarargs(value: String*): Self = StObject.set(x, "runners", js.Array(value*))
      
      inline def setScreenCapture(value: String): Self = StObject.set(x, "screenCapture", value.asInstanceOf[js.Any])
      
      inline def setScreenCaptureUndefined: Self = StObject.set(x, "screenCapture", js.undefined)
      
      inline def setStandard(value: AccessibilityStandard): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setViewport(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Viewport */ Any
      ): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  trait ResultIssue extends StObject {
    
    var code: String
    
    var context: String
    
    var message: String
    
    var selector: String
    
    var `type`: String
    
    var typeCode: Double
  }
  object ResultIssue {
    
    inline def apply(code: String, context: String, message: String, selector: String, `type`: String, typeCode: Double): ResultIssue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeCode = typeCode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultIssue]
    }
    
    extension [Self <: ResultIssue](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeCode(value: Double): Self = StObject.set(x, "typeCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results extends StObject {
    
    var documentTitle: String
    
    var issues: js.Array[ResultIssue]
    
    var pageUrl: String
  }
  object Results {
    
    inline def apply(documentTitle: String, issues: js.Array[ResultIssue], pageUrl: String): Results = {
      val __obj = js.Dynamic.literal(documentTitle = documentTitle.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setDocumentTitle(value: String): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: js.Array[ResultIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setIssuesVarargs(value: ResultIssue*): Self = StObject.set(x, "issues", js.Array(value*))
      
      inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    }
  }
}
