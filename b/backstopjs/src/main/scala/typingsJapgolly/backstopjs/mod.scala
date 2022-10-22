package typingsJapgolly.backstopjs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.backstopjs.anon.Args
import typingsJapgolly.backstopjs.anon.Bitmapsreference
import typingsJapgolly.backstopjs.anon.ErrorColor
import typingsJapgolly.backstopjs.anon.Format
import typingsJapgolly.backstopjs.backstopjsStrings.CI
import typingsJapgolly.backstopjs.backstopjsStrings.approve
import typingsJapgolly.backstopjs.backstopjsStrings.browser
import typingsJapgolly.backstopjs.backstopjsStrings.chromy
import typingsJapgolly.backstopjs.backstopjsStrings.desktop
import typingsJapgolly.backstopjs.backstopjsStrings.init
import typingsJapgolly.backstopjs.backstopjsStrings.json
import typingsJapgolly.backstopjs.backstopjsStrings.phone
import typingsJapgolly.backstopjs.backstopjsStrings.puppeteer
import typingsJapgolly.backstopjs.backstopjsStrings.reference
import typingsJapgolly.backstopjs.backstopjsStrings.tablet
import typingsJapgolly.backstopjs.backstopjsStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backstopjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(command: approve | init | reference | test): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(command: approve | init | reference | test, options: typingsJapgolly.backstopjs.anon.Config): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait Config extends StObject {
    
    var asyncCaptureLimit: js.UndefOr[Double] = js.undefined
    
    var asyncCompareLimit: js.UndefOr[Double] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var ci: js.UndefOr[Format] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var debugWindow: js.UndefOr[Boolean] = js.undefined
    
    var dockerCommandTemplate: js.UndefOr[String] = js.undefined
    
    var engine: js.UndefOr[chromy | puppeteer] = js.undefined
    
    var engineOptions: js.UndefOr[Args] = js.undefined
    
    var id: String
    
    var onBeforeScript: js.UndefOr[String] = js.undefined
    
    var onReadyScript: js.UndefOr[String] = js.undefined
    
    var paths: js.UndefOr[Bitmapsreference] = js.undefined
    
    var report: js.UndefOr[js.Array[browser | CI | json]] = js.undefined
    
    var resembleOutputOptions: js.UndefOr[ErrorColor] = js.undefined
    
    var scenarios: js.Array[Scenario]
    
    var viewports: js.Array[Viewport]
  }
  object Config {
    
    inline def apply(id: String, scenarios: js.Array[Scenario], viewports: js.Array[Viewport]): Config = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], viewports = viewports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAsyncCaptureLimit(value: Double): Self = StObject.set(x, "asyncCaptureLimit", value.asInstanceOf[js.Any])
      
      inline def setAsyncCaptureLimitUndefined: Self = StObject.set(x, "asyncCaptureLimit", js.undefined)
      
      inline def setAsyncCompareLimit(value: Double): Self = StObject.set(x, "asyncCompareLimit", value.asInstanceOf[js.Any])
      
      inline def setAsyncCompareLimitUndefined: Self = StObject.set(x, "asyncCompareLimit", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCi(value: Format): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDebugWindow(value: Boolean): Self = StObject.set(x, "debugWindow", value.asInstanceOf[js.Any])
      
      inline def setDebugWindowUndefined: Self = StObject.set(x, "debugWindow", js.undefined)
      
      inline def setDockerCommandTemplate(value: String): Self = StObject.set(x, "dockerCommandTemplate", value.asInstanceOf[js.Any])
      
      inline def setDockerCommandTemplateUndefined: Self = StObject.set(x, "dockerCommandTemplate", js.undefined)
      
      inline def setEngine(value: chromy | puppeteer): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineOptions(value: Args): Self = StObject.set(x, "engineOptions", value.asInstanceOf[js.Any])
      
      inline def setEngineOptionsUndefined: Self = StObject.set(x, "engineOptions", js.undefined)
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeScript(value: String): Self = StObject.set(x, "onBeforeScript", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeScriptUndefined: Self = StObject.set(x, "onBeforeScript", js.undefined)
      
      inline def setOnReadyScript(value: String): Self = StObject.set(x, "onReadyScript", value.asInstanceOf[js.Any])
      
      inline def setOnReadyScriptUndefined: Self = StObject.set(x, "onReadyScript", js.undefined)
      
      inline def setPaths(value: Bitmapsreference): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setReport(value: js.Array[browser | CI | json]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
      
      inline def setReportVarargs(value: (browser | CI | json)*): Self = StObject.set(x, "report", js.Array(value*))
      
      inline def setResembleOutputOptions(value: ErrorColor): Self = StObject.set(x, "resembleOutputOptions", value.asInstanceOf[js.Any])
      
      inline def setResembleOutputOptionsUndefined: Self = StObject.set(x, "resembleOutputOptions", js.undefined)
      
      inline def setScenarios(value: js.Array[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      inline def setScenariosVarargs(value: Scenario*): Self = StObject.set(x, "scenarios", js.Array(value*))
      
      inline def setViewports(value: js.Array[Viewport]): Self = StObject.set(x, "viewports", value.asInstanceOf[js.Any])
      
      inline def setViewportsVarargs(value: Viewport*): Self = StObject.set(x, "viewports", js.Array(value*))
    }
  }
  
  trait KeypressSelector extends StObject {
    
    var keyPress: String
    
    var selector: String
  }
  object KeypressSelector {
    
    inline def apply(keyPress: String, selector: String): KeypressSelector = {
      val __obj = js.Dynamic.literal(keyPress = keyPress.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeypressSelector]
    }
    
    extension [Self <: KeypressSelector](x: Self) {
      
      inline def setKeyPress(value: String): Self = StObject.set(x, "keyPress", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scenario
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    // Allow for custom properties.
    var clickSelector: js.UndefOr[String] = js.undefined
    
    // Click the specified DOM element prior to screenshot
    var clickSelectors: js.UndefOr[js.Array[String]] = js.undefined
    
    // Simulates multiple sequential click interactions
    var cookiePath: js.UndefOr[String] = js.undefined
    
    // Import cookies in JSON format
    var delay: js.UndefOr[Double] = js.undefined
    
    // Wait for x milliseconds
    var expect: js.UndefOr[Double] = js.undefined
    
    // Use with selectorExpansion true to expect number of results found
    var hideSelectors: js.UndefOr[js.Array[String]] = js.undefined
    
    // Selectors set to visibility: hidden
    var hoverSelector: js.UndefOr[String] = js.undefined
    
    // Move pointer over the given DOM element prior to screenshot
    var hoverSelectors: js.UndefOr[js.Array[String]] = js.undefined
    
    // Simulates multiple sequential hover interactions
    var keyPressSelector: js.UndefOr[KeypressSelector] = js.undefined
    
    // Press key in the DOM element prior to screenshot
    var keyPressSelectors: js.UndefOr[js.Array[KeypressSelector]] = js.undefined
    
    // Simulates multiple sequential keypress interactions
    var label: String
    
    // Tag saved with your reference images
    var misMatchThreshold: js.UndefOr[Double] = js.undefined
    
    // Percentage of different pixels allowed to pass test
    var onBeforeScript: js.UndefOr[String] = js.undefined
    
    // Used to set up browser state e.g. cookies
    var onReadyScript: js.UndefOr[String] = js.undefined
    
    // Used to modify UI state prior to screenshots e.g. hovers, clicks etc
    var postInteractionWait: js.UndefOr[Double] = js.undefined
    
    // Wait for selector (ms) after interacting with hover or click
    var readyEvent: js.UndefOr[String] = js.undefined
    
    // Wait until this string has been logged to the console
    var readySelector: js.UndefOr[String] = js.undefined
    
    // Wait until this selector exists before continuing
    var referenceUrl: js.UndefOr[String] = js.undefined
    
    // Specify a different state or environment when creating reference
    var removeSelectors: js.UndefOr[js.Array[String]] = js.undefined
    
    // Selectors set to display: none
    var requireSameDimensions: js.UndefOr[Boolean] = js.undefined
    
    // If true, take screenshots of all matching selector instances
    var scrollToSelector: js.UndefOr[String] = js.undefined
    
    // Selectors to capture
    var selectorExpansion: js.UndefOr[Boolean] = js.undefined
    
    // If true, any change in selector size will trigger a failure
    var selectors: js.UndefOr[js.Array[String]] = js.undefined
    
    // Scroll the specified DOM element into view prior to screenshots
    var url: String
    
    // The url of your app state
    var viewports: js.UndefOr[js.Array[Viewport]] = js.undefined
  }
  object Scenario {
    
    inline def apply(label: String, url: String): Scenario = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scenario]
    }
    
    extension [Self <: Scenario](x: Self) {
      
      inline def setClickSelector(value: String): Self = StObject.set(x, "clickSelector", value.asInstanceOf[js.Any])
      
      inline def setClickSelectorUndefined: Self = StObject.set(x, "clickSelector", js.undefined)
      
      inline def setClickSelectors(value: js.Array[String]): Self = StObject.set(x, "clickSelectors", value.asInstanceOf[js.Any])
      
      inline def setClickSelectorsUndefined: Self = StObject.set(x, "clickSelectors", js.undefined)
      
      inline def setClickSelectorsVarargs(value: String*): Self = StObject.set(x, "clickSelectors", js.Array(value*))
      
      inline def setCookiePath(value: String): Self = StObject.set(x, "cookiePath", value.asInstanceOf[js.Any])
      
      inline def setCookiePathUndefined: Self = StObject.set(x, "cookiePath", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setExpect(value: Double): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
      
      inline def setExpectUndefined: Self = StObject.set(x, "expect", js.undefined)
      
      inline def setHideSelectors(value: js.Array[String]): Self = StObject.set(x, "hideSelectors", value.asInstanceOf[js.Any])
      
      inline def setHideSelectorsUndefined: Self = StObject.set(x, "hideSelectors", js.undefined)
      
      inline def setHideSelectorsVarargs(value: String*): Self = StObject.set(x, "hideSelectors", js.Array(value*))
      
      inline def setHoverSelector(value: String): Self = StObject.set(x, "hoverSelector", value.asInstanceOf[js.Any])
      
      inline def setHoverSelectorUndefined: Self = StObject.set(x, "hoverSelector", js.undefined)
      
      inline def setHoverSelectors(value: js.Array[String]): Self = StObject.set(x, "hoverSelectors", value.asInstanceOf[js.Any])
      
      inline def setHoverSelectorsUndefined: Self = StObject.set(x, "hoverSelectors", js.undefined)
      
      inline def setHoverSelectorsVarargs(value: String*): Self = StObject.set(x, "hoverSelectors", js.Array(value*))
      
      inline def setKeyPressSelector(value: KeypressSelector): Self = StObject.set(x, "keyPressSelector", value.asInstanceOf[js.Any])
      
      inline def setKeyPressSelectorUndefined: Self = StObject.set(x, "keyPressSelector", js.undefined)
      
      inline def setKeyPressSelectors(value: js.Array[KeypressSelector]): Self = StObject.set(x, "keyPressSelectors", value.asInstanceOf[js.Any])
      
      inline def setKeyPressSelectorsUndefined: Self = StObject.set(x, "keyPressSelectors", js.undefined)
      
      inline def setKeyPressSelectorsVarargs(value: KeypressSelector*): Self = StObject.set(x, "keyPressSelectors", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMisMatchThreshold(value: Double): Self = StObject.set(x, "misMatchThreshold", value.asInstanceOf[js.Any])
      
      inline def setMisMatchThresholdUndefined: Self = StObject.set(x, "misMatchThreshold", js.undefined)
      
      inline def setOnBeforeScript(value: String): Self = StObject.set(x, "onBeforeScript", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeScriptUndefined: Self = StObject.set(x, "onBeforeScript", js.undefined)
      
      inline def setOnReadyScript(value: String): Self = StObject.set(x, "onReadyScript", value.asInstanceOf[js.Any])
      
      inline def setOnReadyScriptUndefined: Self = StObject.set(x, "onReadyScript", js.undefined)
      
      inline def setPostInteractionWait(value: Double): Self = StObject.set(x, "postInteractionWait", value.asInstanceOf[js.Any])
      
      inline def setPostInteractionWaitUndefined: Self = StObject.set(x, "postInteractionWait", js.undefined)
      
      inline def setReadyEvent(value: String): Self = StObject.set(x, "readyEvent", value.asInstanceOf[js.Any])
      
      inline def setReadyEventUndefined: Self = StObject.set(x, "readyEvent", js.undefined)
      
      inline def setReadySelector(value: String): Self = StObject.set(x, "readySelector", value.asInstanceOf[js.Any])
      
      inline def setReadySelectorUndefined: Self = StObject.set(x, "readySelector", js.undefined)
      
      inline def setReferenceUrl(value: String): Self = StObject.set(x, "referenceUrl", value.asInstanceOf[js.Any])
      
      inline def setReferenceUrlUndefined: Self = StObject.set(x, "referenceUrl", js.undefined)
      
      inline def setRemoveSelectors(value: js.Array[String]): Self = StObject.set(x, "removeSelectors", value.asInstanceOf[js.Any])
      
      inline def setRemoveSelectorsUndefined: Self = StObject.set(x, "removeSelectors", js.undefined)
      
      inline def setRemoveSelectorsVarargs(value: String*): Self = StObject.set(x, "removeSelectors", js.Array(value*))
      
      inline def setRequireSameDimensions(value: Boolean): Self = StObject.set(x, "requireSameDimensions", value.asInstanceOf[js.Any])
      
      inline def setRequireSameDimensionsUndefined: Self = StObject.set(x, "requireSameDimensions", js.undefined)
      
      inline def setScrollToSelector(value: String): Self = StObject.set(x, "scrollToSelector", value.asInstanceOf[js.Any])
      
      inline def setScrollToSelectorUndefined: Self = StObject.set(x, "scrollToSelector", js.undefined)
      
      inline def setSelectorExpansion(value: Boolean): Self = StObject.set(x, "selectorExpansion", value.asInstanceOf[js.Any])
      
      inline def setSelectorExpansionUndefined: Self = StObject.set(x, "selectorExpansion", js.undefined)
      
      inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setViewports(value: js.Array[Viewport]): Self = StObject.set(x, "viewports", value.asInstanceOf[js.Any])
      
      inline def setViewportsUndefined: Self = StObject.set(x, "viewports", js.undefined)
      
      inline def setViewportsVarargs(value: Viewport*): Self = StObject.set(x, "viewports", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.backstopjs.mod.ViewportNext
    - typingsJapgolly.backstopjs.mod.ViewportLegacy
  */
  trait Viewport extends StObject
  object Viewport {
    
    inline def ViewportLegacy(height: Double, name: phone | tablet | desktop, width: Double): typingsJapgolly.backstopjs.mod.ViewportLegacy = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.backstopjs.mod.ViewportLegacy]
    }
    
    inline def ViewportNext(height: Double, label: String, width: Double): typingsJapgolly.backstopjs.mod.ViewportNext = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.backstopjs.mod.ViewportNext]
    }
  }
  
  trait ViewportLegacy
    extends StObject
       with Viewport {
    
    var height: Double
    
    var name: phone | tablet | desktop
    
    var width: Double
  }
  object ViewportLegacy {
    
    inline def apply(height: Double, name: phone | tablet | desktop, width: Double): ViewportLegacy = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportLegacy]
    }
    
    extension [Self <: ViewportLegacy](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setName(value: phone | tablet | desktop): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewportNext
    extends StObject
       with Viewport {
    
    var height: Double
    
    var label: String
    
    var width: Double
  }
  object ViewportNext {
    
    inline def apply(height: Double, label: String, width: Double): ViewportNext = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportNext]
    }
    
    extension [Self <: ViewportNext](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
