package typingsJapgolly.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cypress.anon.OmitCoreConfigOptionsinde
import typingsJapgolly.cypress.anon.OpenMode
import typingsJapgolly.cypress.cypressBooleans.`false`
import typingsJapgolly.cypress.cypressStrings.bundled
import typingsJapgolly.cypress.cypressStrings.legacy
import typingsJapgolly.cypress.cypressStrings.strict
import typingsJapgolly.cypress.cypressStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Takes ComponentDevServerOpts to track the signature of the devServerConfig for the provided `devServer`,
  * so we have proper completion for `devServerConfig`
  */
/* Inlined std.Partial<cypress.Cypress.UserConfigOptions<ComponentDevServerOpts>> & {  hosts :null | {[key: string] : string} | undefined} */
trait ConfigOptions[ComponentDevServerOpts] extends StObject {
  
  var animationDistanceThreshold: js.UndefOr[Double] = js.undefined
  
  var blockHosts: js.UndefOr[Null | String | js.Array[String]] = js.undefined
  
  var chromeWebSecurity: js.UndefOr[Boolean] = js.undefined
  
  var clientCertificates: js.UndefOr[js.Array[ClientCertificate]] = js.undefined
  
  var component: js.UndefOr[ComponentConfigOptions[ComponentDevServerOpts]] = js.undefined
  
  var defaultCommandTimeout: js.UndefOr[Double] = js.undefined
  
  var downloadsFolder: js.UndefOr[String] = js.undefined
  
  var e2e: js.UndefOr[OmitCoreConfigOptionsinde] = js.undefined
  
  var env: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var execTimeout: js.UndefOr[Double] = js.undefined
  
  var experimentalFetchPolyfill: js.UndefOr[Boolean] = js.undefined
  
  var experimentalInteractiveRunEvents: js.UndefOr[Boolean] = js.undefined
  
  var experimentalModifyObstructiveThirdPartyCode: js.UndefOr[Boolean] = js.undefined
  
  var experimentalSessionAndOrigin: js.UndefOr[Boolean] = js.undefined
  
  var experimentalSourceRewriting: js.UndefOr[Boolean] = js.undefined
  
  var experimentalStudio: js.UndefOr[Boolean] = js.undefined
  
  var experimentalWebKitSupport: js.UndefOr[Boolean] = js.undefined
  
  var fileServerFolder: js.UndefOr[String] = js.undefined
  
  var fixturesFolder: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * Hosts mappings to IP addresses.
    */
  var hosts: js.UndefOr[Null | StringDictionary[String]] = js.undefined
  
  var includeShadowDom: js.UndefOr[Boolean] = js.undefined
  
  var modifyObstructiveCode: js.UndefOr[Boolean] = js.undefined
  
  var nodeVersion: js.UndefOr[system | bundled] = js.undefined
  
  var numTestsKeptInMemory: js.UndefOr[Double] = js.undefined
  
  var pageLoadTimeout: js.UndefOr[Double] = js.undefined
  
  var port: js.UndefOr[Double | Null] = js.undefined
  
  var projectId: js.UndefOr[Null | String] = js.undefined
  
  var redirectionLimit: js.UndefOr[Double] = js.undefined
  
  var reporter: js.UndefOr[String] = js.undefined
  
  var reporterOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var requestTimeout: js.UndefOr[Double] = js.undefined
  
  var resolvedNodePath: js.UndefOr[String] = js.undefined
  
  var resolvedNodeVersion: js.UndefOr[String] = js.undefined
  
  var responseTimeout: js.UndefOr[Double] = js.undefined
  
  var retries: js.UndefOr[Nullable[Double | OpenMode]] = js.undefined
  
  var screenshotOnRunFailure: js.UndefOr[Boolean] = js.undefined
  
  var screenshotsFolder: js.UndefOr[String | `false`] = js.undefined
  
  var scrollBehavior: js.UndefOr[scrollBehaviorOptions] = js.undefined
  
  var setupNodeEvents: js.UndefOr[
    js.Function2[
      /* on */ PluginEvents, 
      /* config */ PluginConfigOptions, 
      (js.Promise[PluginConfigOptions | Unit]) | PluginConfigOptions | Unit
    ]
  ] = js.undefined
  
  var slowTestThreshold: js.UndefOr[Double] = js.undefined
  
  var supportFolder: js.UndefOr[String] = js.undefined
  
  var taskTimeout: js.UndefOr[Double] = js.undefined
  
  var testIsolation: js.UndefOr[legacy | strict] = js.undefined
  
  var trashAssetsBeforeRuns: js.UndefOr[Boolean] = js.undefined
  
  var userAgent: js.UndefOr[Null | String] = js.undefined
  
  var video: js.UndefOr[Boolean] = js.undefined
  
  var videoCompression: js.UndefOr[Double | `false`] = js.undefined
  
  var videoUploadOnPasses: js.UndefOr[Boolean] = js.undefined
  
  var videosFolder: js.UndefOr[String] = js.undefined
  
  var viewportHeight: js.UndefOr[Double] = js.undefined
  
  var viewportWidth: js.UndefOr[Double] = js.undefined
  
  var waitForAnimations: js.UndefOr[Boolean] = js.undefined
  
  var watchForFileChanges: js.UndefOr[Boolean] = js.undefined
}
object ConfigOptions {
  
  inline def apply[ComponentDevServerOpts](): ConfigOptions[ComponentDevServerOpts] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions[ComponentDevServerOpts]]
  }
  
  extension [Self <: ConfigOptions[?], ComponentDevServerOpts](x: Self & ConfigOptions[ComponentDevServerOpts]) {
    
    inline def setAnimationDistanceThreshold(value: Double): Self = StObject.set(x, "animationDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setAnimationDistanceThresholdUndefined: Self = StObject.set(x, "animationDistanceThreshold", js.undefined)
    
    inline def setBlockHosts(value: String | js.Array[String]): Self = StObject.set(x, "blockHosts", value.asInstanceOf[js.Any])
    
    inline def setBlockHostsNull: Self = StObject.set(x, "blockHosts", null)
    
    inline def setBlockHostsUndefined: Self = StObject.set(x, "blockHosts", js.undefined)
    
    inline def setBlockHostsVarargs(value: String*): Self = StObject.set(x, "blockHosts", js.Array(value*))
    
    inline def setChromeWebSecurity(value: Boolean): Self = StObject.set(x, "chromeWebSecurity", value.asInstanceOf[js.Any])
    
    inline def setChromeWebSecurityUndefined: Self = StObject.set(x, "chromeWebSecurity", js.undefined)
    
    inline def setClientCertificates(value: js.Array[ClientCertificate]): Self = StObject.set(x, "clientCertificates", value.asInstanceOf[js.Any])
    
    inline def setClientCertificatesUndefined: Self = StObject.set(x, "clientCertificates", js.undefined)
    
    inline def setClientCertificatesVarargs(value: ClientCertificate*): Self = StObject.set(x, "clientCertificates", js.Array(value*))
    
    inline def setComponent(value: ComponentConfigOptions[ComponentDevServerOpts]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDefaultCommandTimeout(value: Double): Self = StObject.set(x, "defaultCommandTimeout", value.asInstanceOf[js.Any])
    
    inline def setDefaultCommandTimeoutUndefined: Self = StObject.set(x, "defaultCommandTimeout", js.undefined)
    
    inline def setDownloadsFolder(value: String): Self = StObject.set(x, "downloadsFolder", value.asInstanceOf[js.Any])
    
    inline def setDownloadsFolderUndefined: Self = StObject.set(x, "downloadsFolder", js.undefined)
    
    inline def setE2e(value: OmitCoreConfigOptionsinde): Self = StObject.set(x, "e2e", value.asInstanceOf[js.Any])
    
    inline def setE2eUndefined: Self = StObject.set(x, "e2e", js.undefined)
    
    inline def setEnv(value: StringDictionary[Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExecTimeout(value: Double): Self = StObject.set(x, "execTimeout", value.asInstanceOf[js.Any])
    
    inline def setExecTimeoutUndefined: Self = StObject.set(x, "execTimeout", js.undefined)
    
    inline def setExperimentalFetchPolyfill(value: Boolean): Self = StObject.set(x, "experimentalFetchPolyfill", value.asInstanceOf[js.Any])
    
    inline def setExperimentalFetchPolyfillUndefined: Self = StObject.set(x, "experimentalFetchPolyfill", js.undefined)
    
    inline def setExperimentalInteractiveRunEvents(value: Boolean): Self = StObject.set(x, "experimentalInteractiveRunEvents", value.asInstanceOf[js.Any])
    
    inline def setExperimentalInteractiveRunEventsUndefined: Self = StObject.set(x, "experimentalInteractiveRunEvents", js.undefined)
    
    inline def setExperimentalModifyObstructiveThirdPartyCode(value: Boolean): Self = StObject.set(x, "experimentalModifyObstructiveThirdPartyCode", value.asInstanceOf[js.Any])
    
    inline def setExperimentalModifyObstructiveThirdPartyCodeUndefined: Self = StObject.set(x, "experimentalModifyObstructiveThirdPartyCode", js.undefined)
    
    inline def setExperimentalSessionAndOrigin(value: Boolean): Self = StObject.set(x, "experimentalSessionAndOrigin", value.asInstanceOf[js.Any])
    
    inline def setExperimentalSessionAndOriginUndefined: Self = StObject.set(x, "experimentalSessionAndOrigin", js.undefined)
    
    inline def setExperimentalSourceRewriting(value: Boolean): Self = StObject.set(x, "experimentalSourceRewriting", value.asInstanceOf[js.Any])
    
    inline def setExperimentalSourceRewritingUndefined: Self = StObject.set(x, "experimentalSourceRewriting", js.undefined)
    
    inline def setExperimentalStudio(value: Boolean): Self = StObject.set(x, "experimentalStudio", value.asInstanceOf[js.Any])
    
    inline def setExperimentalStudioUndefined: Self = StObject.set(x, "experimentalStudio", js.undefined)
    
    inline def setExperimentalWebKitSupport(value: Boolean): Self = StObject.set(x, "experimentalWebKitSupport", value.asInstanceOf[js.Any])
    
    inline def setExperimentalWebKitSupportUndefined: Self = StObject.set(x, "experimentalWebKitSupport", js.undefined)
    
    inline def setFileServerFolder(value: String): Self = StObject.set(x, "fileServerFolder", value.asInstanceOf[js.Any])
    
    inline def setFileServerFolderUndefined: Self = StObject.set(x, "fileServerFolder", js.undefined)
    
    inline def setFixturesFolder(value: String | `false`): Self = StObject.set(x, "fixturesFolder", value.asInstanceOf[js.Any])
    
    inline def setFixturesFolderUndefined: Self = StObject.set(x, "fixturesFolder", js.undefined)
    
    inline def setHosts(value: StringDictionary[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsNull: Self = StObject.set(x, "hosts", null)
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setIncludeShadowDom(value: Boolean): Self = StObject.set(x, "includeShadowDom", value.asInstanceOf[js.Any])
    
    inline def setIncludeShadowDomUndefined: Self = StObject.set(x, "includeShadowDom", js.undefined)
    
    inline def setModifyObstructiveCode(value: Boolean): Self = StObject.set(x, "modifyObstructiveCode", value.asInstanceOf[js.Any])
    
    inline def setModifyObstructiveCodeUndefined: Self = StObject.set(x, "modifyObstructiveCode", js.undefined)
    
    inline def setNodeVersion(value: system | bundled): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    
    inline def setNodeVersionUndefined: Self = StObject.set(x, "nodeVersion", js.undefined)
    
    inline def setNumTestsKeptInMemory(value: Double): Self = StObject.set(x, "numTestsKeptInMemory", value.asInstanceOf[js.Any])
    
    inline def setNumTestsKeptInMemoryUndefined: Self = StObject.set(x, "numTestsKeptInMemory", js.undefined)
    
    inline def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPageLoadTimeoutUndefined: Self = StObject.set(x, "pageLoadTimeout", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRedirectionLimit(value: Double): Self = StObject.set(x, "redirectionLimit", value.asInstanceOf[js.Any])
    
    inline def setRedirectionLimitUndefined: Self = StObject.set(x, "redirectionLimit", js.undefined)
    
    inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterOptions(value: StringDictionary[Any]): Self = StObject.set(x, "reporterOptions", value.asInstanceOf[js.Any])
    
    inline def setReporterOptionsUndefined: Self = StObject.set(x, "reporterOptions", js.undefined)
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setResolvedNodePath(value: String): Self = StObject.set(x, "resolvedNodePath", value.asInstanceOf[js.Any])
    
    inline def setResolvedNodePathUndefined: Self = StObject.set(x, "resolvedNodePath", js.undefined)
    
    inline def setResolvedNodeVersion(value: String): Self = StObject.set(x, "resolvedNodeVersion", value.asInstanceOf[js.Any])
    
    inline def setResolvedNodeVersionUndefined: Self = StObject.set(x, "resolvedNodeVersion", js.undefined)
    
    inline def setResponseTimeout(value: Double): Self = StObject.set(x, "responseTimeout", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeoutUndefined: Self = StObject.set(x, "responseTimeout", js.undefined)
    
    inline def setRetries(value: Nullable[Double | OpenMode]): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesNull: Self = StObject.set(x, "retries", null)
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setScreenshotOnRunFailure(value: Boolean): Self = StObject.set(x, "screenshotOnRunFailure", value.asInstanceOf[js.Any])
    
    inline def setScreenshotOnRunFailureUndefined: Self = StObject.set(x, "screenshotOnRunFailure", js.undefined)
    
    inline def setScreenshotsFolder(value: String | `false`): Self = StObject.set(x, "screenshotsFolder", value.asInstanceOf[js.Any])
    
    inline def setScreenshotsFolderUndefined: Self = StObject.set(x, "screenshotsFolder", js.undefined)
    
    inline def setScrollBehavior(value: scrollBehaviorOptions): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
    
    inline def setSetupNodeEvents(
      value: (/* on */ PluginEvents, /* config */ PluginConfigOptions) => (js.Promise[PluginConfigOptions | Unit]) | PluginConfigOptions | Unit
    ): Self = StObject.set(x, "setupNodeEvents", js.Any.fromFunction2(value))
    
    inline def setSetupNodeEventsUndefined: Self = StObject.set(x, "setupNodeEvents", js.undefined)
    
    inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
    
    inline def setSlowTestThresholdUndefined: Self = StObject.set(x, "slowTestThreshold", js.undefined)
    
    inline def setSupportFolder(value: String): Self = StObject.set(x, "supportFolder", value.asInstanceOf[js.Any])
    
    inline def setSupportFolderUndefined: Self = StObject.set(x, "supportFolder", js.undefined)
    
    inline def setTaskTimeout(value: Double): Self = StObject.set(x, "taskTimeout", value.asInstanceOf[js.Any])
    
    inline def setTaskTimeoutUndefined: Self = StObject.set(x, "taskTimeout", js.undefined)
    
    inline def setTestIsolation(value: legacy | strict): Self = StObject.set(x, "testIsolation", value.asInstanceOf[js.Any])
    
    inline def setTestIsolationUndefined: Self = StObject.set(x, "testIsolation", js.undefined)
    
    inline def setTrashAssetsBeforeRuns(value: Boolean): Self = StObject.set(x, "trashAssetsBeforeRuns", value.asInstanceOf[js.Any])
    
    inline def setTrashAssetsBeforeRunsUndefined: Self = StObject.set(x, "trashAssetsBeforeRuns", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoCompression(value: Double | `false`): Self = StObject.set(x, "videoCompression", value.asInstanceOf[js.Any])
    
    inline def setVideoCompressionUndefined: Self = StObject.set(x, "videoCompression", js.undefined)
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setVideoUploadOnPasses(value: Boolean): Self = StObject.set(x, "videoUploadOnPasses", value.asInstanceOf[js.Any])
    
    inline def setVideoUploadOnPassesUndefined: Self = StObject.set(x, "videoUploadOnPasses", js.undefined)
    
    inline def setVideosFolder(value: String): Self = StObject.set(x, "videosFolder", value.asInstanceOf[js.Any])
    
    inline def setVideosFolderUndefined: Self = StObject.set(x, "videosFolder", js.undefined)
    
    inline def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
    
    inline def setViewportHeightUndefined: Self = StObject.set(x, "viewportHeight", js.undefined)
    
    inline def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
    
    inline def setViewportWidthUndefined: Self = StObject.set(x, "viewportWidth", js.undefined)
    
    inline def setWaitForAnimations(value: Boolean): Self = StObject.set(x, "waitForAnimations", value.asInstanceOf[js.Any])
    
    inline def setWaitForAnimationsUndefined: Self = StObject.set(x, "waitForAnimations", js.undefined)
    
    inline def setWatchForFileChanges(value: Boolean): Self = StObject.set(x, "watchForFileChanges", value.asInstanceOf[js.Any])
    
    inline def setWatchForFileChangesUndefined: Self = StObject.set(x, "watchForFileChanges", js.undefined)
  }
}
