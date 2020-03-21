package typingsJapgolly.protractor.configMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protractor.AnonDefaultTimeoutInterval
import typingsJapgolly.protractor.AnonDictkey
import typingsJapgolly.protractor.AnonJvmArgs
import typingsJapgolly.protractor.AnonReporter
import typingsJapgolly.protractor.pluginsMod.PluginConfig
import typingsJapgolly.protractor.protractorStrings.DEBUG
import typingsJapgolly.protractor.protractorStrings.ERROR
import typingsJapgolly.protractor.protractorStrings.INFO
import typingsJapgolly.protractor.protractorStrings.WARN
import typingsJapgolly.seleniumWebdriver.mod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Enable/disable the WebDriver Control Flow.
    *
    * WebDriverJS (and by extention, Protractor) uses a Control Flow to manage the order in which
    * commands are executed and promises are resolved (see docs/control-flow.md for details).
    * However, as syntax like `async`/`await` are being introduced, WebDriverJS has decided to
    * deprecate the control flow, and have users manage the asynchronous activity themselves
    * (details here: https://github.com/SeleniumHQ/selenium/issues/2969).
    *
    * At the moment, the WebDriver Control Flow is still enabled by default. You can disable it by
    * setting the environment variable `SELENIUM_PROMISE_MANAGER` to `0`.  In a webdriver release in
    * Q4 2017, the Control Flow will be disabled by default, but you will be able to re-enable it by
    * setting `SELENIUM_PROMISE_MANAGER` to `1`.  At a later point, the control flow will be removed
    * for good.
    *
    * If you don't like managing environment variables, you can set this option in your config file,
    * and Protractor will handle enabling/disabling the control flow for you.  Setting this option
    * is higher priority than the `SELENIUM_PROMISE_MANAGER` environment variable.
    *
    * @type {boolean=}
    */
  var SELENIUM_PROMISE_MANAGER: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback function called once all tests have finished running and
    * the WebDriver instance has been shut down. It is passed the exit code
    * (0 if the tests passed). afterLaunch must return a promise if you want
    * asynchronous code to be executed before the program exits.
    * This is called only once before the program exits (after onCleanUp).
    */
  var afterLaunch: js.UndefOr[js.Function1[/* exitCode */ Double, Unit]] = js.undefined
  /**
    * The timeout in milliseconds for each script run on the browser. This
    * should be longer than the maximum time your application needs to
    * stabilize between tasks.
    */
  var allScriptsTimeout: js.UndefOr[Double] = js.undefined
  /**
    * A base URL for your application under test. Calls to protractor.get()
    * with relative paths will be resolved against this URL (via url.resolve)
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * A callback function called once configs are read but before any
    * environment setup. This will only run once, and before onPrepare.
    *
    * You can specify a file containing code to run by setting beforeLaunch to
    * the filename string.
    *
    * At this point, global variable 'protractor' object will NOT be set up,
    * and globals from the test framework will NOT be available. The main
    * purpose of this function should be to bring up test dependencies.
    */
  var beforeLaunch: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If specified, Protractor will connect to the Blocking Proxy at the given
    * url instead of starting it's own.
    */
  var blockingProxyUrl: js.UndefOr[String] = js.undefined
  /**
    * If browserstackUser and browserstackKey are specified, seleniumServerJar
    * will be ignored. The tests will be run remotely using BrowserStack.
    */
  var browserstackKey: js.UndefOr[String] = js.undefined
  /**
    * Proxy server to be used for connecting to BrowserStack APIs
    * e.g. "http://proxy.example.com:1234".
    * This should be used when you are behind a proxy server.
    */
  var browserstackProxy: js.UndefOr[String] = js.undefined
  /**
    * If browserstackUser and browserstackKey are specified, seleniumServerJar
    * will be ignored. The tests will be run remotely using BrowserStack.
    */
  var browserstackUser: js.UndefOr[String] = js.undefined
  /**
    * Protractor can launch your tests on one or more browsers. If you are
    * testing on a single browser, use the capabilities option. If you are
    * testing on multiple browsers, use the multiCapabilities array.
    *
    * For a list of available capabilities, see
    * https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
    * In addition, you may specify count, shardTestFiles, and maxInstances.
    *
    * Example:
    * capabilities: {
    *   browserName: 'chrome',
    *   name: 'Unnamed Job',
    *   logName: 'Chrome - English',
    *   count: 1,
    *   shardTestFiles: false,
    *   maxInstances: 1,
    *   specs: ['spec/chromeOnlySpec.js'],
    *   exclude: ['spec/doNotRunInChromeSpec.js'],
    *   seleniumAddress: 'http://localhost:4444/wd/hub'
    * }
    */
  var capabilities: js.UndefOr[AnonDictkey] = js.undefined
  /**
    * ChromeDriver location is used to help find the chromedriver binary. This will be passed to the
    * Selenium jar as the system property webdriver.chrome.driver. If the value is not set when
    * launching locally, it will use the default values downloaded from webdriver-manager.
    *
    * example:
    * chromeDriver: './node_modules/webdriver-manager/selenium/chromedriver_2.20'
    */
  var chromeDriver: js.UndefOr[String] = js.undefined
  var configDir: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var debuggerServerPort: js.UndefOr[Double] = js.undefined
  /**
    * If true, Protractor will connect directly to the browser Drivers
    * at the locations specified by chromeDriver and firefoxPath. Only Chrome
    * and Firefox are supported for direct connect.
    *
    * default: false
    */
  var directConnect: js.UndefOr[Boolean] = js.undefined
  /**
    * Protractor will exit with an error if it sees any command line flags it doesn't
    * recognize. Set disableChecks true to disable this check.
    */
  var disableChecks: js.UndefOr[Boolean] = js.undefined
  /**
    * Turns off WebDriver's environment variables overrides to ignore any
    * environment variable and to only use the configuration in this file.
    * Defaults to `false`
    */
  var disableEnvironmentOverrides: js.UndefOr[Boolean] = js.undefined
  var elementExplorer: js.UndefOr[js.Any] = js.undefined
  /**
    * Patterns to exclude specs.
    */
  var exclude: js.UndefOr[js.Array[String] | String] = js.undefined
  /**
    * Path to the firefox application binary. If null, will attempt to find
    * firefox in the default locations.
    */
  var firefoxPath: js.UndefOr[String] = js.undefined
  /**
    * Test framework to use. This may be one of: jasmine, mocha or custom.
    * Default value is 'jasmine'
    *
    * When the framework is set to "custom" you'll need to additionally
    * set frameworkPath with the path relative to the config file or absolute:
    *
    *   framework: 'custom',
    *   frameworkPath: './frameworks/my_custom_jasmine.js',
    *
    * See github.com/angular/protractor/blob/master/lib/frameworks/README.md
    * to comply with the interface details of your custom implementation.
    *
    * Jasmine is fully supported as test and assertion frameworks.
    * Mocha has limited support. You will need to include your
    * own assertion framework (such as Chai) if working with Mocha.
    */
  var framework: js.UndefOr[String] = js.undefined
  var frameworkPath: js.UndefOr[String] = js.undefined
  /**
    * geckoDriver location is used to help find the gecko binary. This will be passed to the Selenium
    * jar as the system property webdriver.gecko.driver. If the value is not set when launching
    * locally, it will use the default values downloaded from webdriver-manager.
    */
  var geckoDriver: js.UndefOr[String] = js.undefined
  /**
    * If you need to resolve multiCapabilities asynchronously (i.e. wait for
    * server/proxy, set firefox profile, etc), you can specify a function here
    * which will return either `multiCapabilities` or a promise to
    * `multiCapabilities`.
    *
    * If this returns a promise, it is resolved immediately after
    * `beforeLaunch` is run, and before any driver is set up. If this is
    * specified, both capabilities and multiCapabilities will be ignored.
    */
  var getMultiCapabilities: js.UndefOr[js.Any] = js.undefined
  /**
    * How long to wait for a page to load.
    */
  var getPageTimeout: js.UndefOr[Double] = js.undefined
  /**
    * If set, Protractor will pause the specified amount of time (in milliseconds)
    * before interactions with browser elements (ie, sending keys, clicking). It will
    * also highlight the element it's about to interact with.
    *
    * This is an experimental feature. Enabling this will also turn on Blocking Proxy
    * synchronization, which is also experimental.
    */
  var highlightDelay: js.UndefOr[Double] = js.undefined
  /**
    * If set, Protractor will ignore uncaught exceptions instead of exiting
    * without an error code. The exceptions will still be logged as warnings.
    */
  var ignoreUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
  /**
    * Options to be passed to jasmine.
    *
    * See https://github.com/jasmine/jasmine-npm/blob/master/lib/jasmine.js
    * for the exact options available.
    */
  var jasmineNodeOpts: js.UndefOr[AnonDefaultTimeoutInterval] = js.undefined
  var jvmArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If kobitonUser and kobitonKey are specified, testobjectUser, testojbectKey, browserStackUser,
    * browserStackKey and seleniumServerJar will be ignored. The tests will be run remotely using
    * TestObject.
    */
  var kobitonKey: js.UndefOr[String] = js.undefined
  /**
    * If kobitonUser and kobitonKey are specified, testobjectUser, testojbectKey, browserstackUser,
    * browserStackKey and seleniumServerJar will be ignored. The tests will be run remotely using
    * TestObject.
    */
  var kobitonUser: js.UndefOr[String] = js.undefined
  /**
    * Can be an object which will be passed to the SeleniumServer class as args.
    * See a full list of options at
    * https://github.com/SeleniumHQ/selenium/blob/master/javascript/node/selenium-webdriver/remote/index.js
    * If you specify `args` or `port` in this object, it will overwrite the
    * values set via the deprecated config values `seleniumPort` and
    * `seleniumArgs`.
    */
  var localSeleniumStandaloneOpts: js.UndefOr[AnonJvmArgs] = js.undefined
  /**
    * Protractor log level
    *
    * default: INFO
    */
  var logLevel: js.UndefOr[ERROR | WARN | INFO | DEBUG] = js.undefined
  /**
    * Maximum number of total browser sessions to run. Tests are queued in
    * sequence if number of browser sessions is limited by this parameter.
    * Use a number less than 1 to denote unlimited. Default is unlimited.
    */
  var maxSessions: js.UndefOr[Double] = js.undefined
  /**
    * Options to be passed to Mocha.
    *
    * See the full list at http://mochajs.org/
    */
  var mochaOpts: js.UndefOr[AnonReporter] = js.undefined
  var mockSelenium: js.UndefOr[Boolean] = js.undefined
  /**
    * If you would like to run more than one instance of WebDriver on the same
    * tests, use multiCapabilities, which takes an array of capabilities.
    * If this is specified, capabilities will be ignored.
    */
  var multiCapabilities: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Tells Protractor to interpret any angular apps it comes across as hybrid
    * angular1/angular2 apps (i.e. apps using ngUpgrade)
    * Defaults to `false`
    *
    * @type {boolean}
    */
  var ng12Hybrid: js.UndefOr[Boolean] = js.undefined
  /**
    * Use default globals: 'protractor', 'browser', '$', '$$', 'element', 'by'.
    * These also exist as properties of the protractor namespace:
    * 'protractor.browser', 'protractor.$', 'protractor.$$',
    * 'protractor.element', 'protractor.by', and 'protractor.By'.
    *
    * When no globals is set to true, the only available global variable will be
    * 'protractor'.
    */
  var noGlobals: js.UndefOr[Boolean] = js.undefined
  var nodeDebug: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback function called once the tests have finished running and
    * the WebDriver instance has been shut down. It is passed the exit code
    * (0 if the tests passed). This is called once per capability.
    */
  var onCleanUp: js.UndefOr[js.Function1[/* exitCode */ Double, Unit]] = js.undefined
  /**
    * A callback function called once tests are finished. onComplete can
    * optionally return a promise, which Protractor will wait for before
    * shutting down webdriver.
    *
    * At this point, tests will be done but global objects will still be
    * available.
    */
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback function called once protractor is ready and available, and
    * before the specs are executed. If multiple capabilities are being run,
    * this will run once per capability.
    *
    * You can specify a file containing code to run by setting onPrepare to
    * the filename string. onPrepare can optionally return a promise, which
    * Protractor will wait for before continuing execution. This can be used if
    * the preparation involves any asynchronous calls, e.g. interacting with
    * the browser. Otherwise Protractor cannot guarantee order of execution
    * and may start the tests before preparation finishes.
    *
    * At this point, global variable 'protractor' object will be set up, and
    * globals from the test framework will be available. For example, if you
    * are using Jasmine, you can add a reporter with:
    *
    *    jasmine.getEnv().addReporter(new jasmine.JUnitXmlReporter(
    *      'outputdir/', true, true));
    *
    * If you need access back to the current configuration object,
    * use a pattern like the following:
    *
    *    return browser.getProcessedConfig().then(function(config) {
    *      // config.capabilities is the CURRENT capability being run, if
    *      // you are using multiCapabilities.
    *      console.log('Executing capability', config.capabilities);
    *    });
    */
  var onPrepare: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The params object will be passed directly to the Protractor instance,
    * and can be accessed from your test as browser.params. It is an arbitrary
    * object and can contain anything you may need in your test.
    * This can be changed via the command line as:
    *   --params.login.user "Joe"
    *
    * Example:
    * params: {
    *   login: {
    *     user: 'Jane',
    *     password: '1234'
    *   }
    * }
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * See docs/plugins.md
    */
  var plugins: js.UndefOr[js.Array[PluginConfig]] = js.undefined
  /**
    * If true, protractor will restart the browser between each test. Default
    * value is false.
    *
    * CAUTION: This will cause your tests to slow down drastically.
    */
  var restartBrowserBetweenTests: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, protractor will save the test output in json format at this path.
    * The path is relative to the location of this config.
    */
  var resultJsonOutputFile: js.UndefOr[js.Any] = js.undefined
  /**
    * A CSS Selector for a DOM element within your Angular application.
    * Protractor will attempt to automatically find your application, but it is
    * necessary to set rootElement in certain cases.
    *
    * In Angular 1, Protractor will use the element your app bootstrapped to by
    * default.  If that doesn't work, it will then search for hooks in `body` or
    * `ng-app` elements (details here: https://git.io/v1b2r).
    *
    * In later versions of Angular, Protractor will try to hook into all angular
    * apps on the page. Use rootElement to limit the scope of which apps
    * Protractor waits for and searches within.
    */
  var rootElement: js.UndefOr[String] = js.undefined
  /**
    * Use sauceAgent if you need custom HTTP agent to connect to saucelabs.com APIs.
    * This is needed if your computer is behind a corporate proxy.
    *
    * To match sauce agent implementation, use
    * [HttpProxyAgent](https://github.com/TooTallNate/node-http-proxy-agent)
    * to generate the agent or use sauceProxy as an alternative. If a
    * sauceProxy is provided, the sauceAgent will be overridden.
    */
  var sauceAgent: js.UndefOr[js.Any] = js.undefined
  /**
    * Use sauceBuild if you want to group test capabilites by a build ID
    */
  var sauceBuild: js.UndefOr[String] = js.undefined
  /**
    * If the sauceUser and sauceKey are specified, seleniumServerJar will be
    * ignored. The tests will be run remotely using Sauce Labs.
    */
  var sauceKey: js.UndefOr[String] = js.undefined
  /**
    * The address of a proxy server to use for communicating to Sauce Labs REST APIs via the
    * saucelabs node module. For example, the Sauce Labs Proxy can be setup with: sauceProxy:
    * 'http://localhost:3128'
    */
  var sauceProxy: js.UndefOr[String] = js.undefined
  /**
    * If you run your tests on SauceLabs you can specify the region you want to run your tests
    * in via the `sauceRegion` property. Available short handles for regions are:
    * us: us-west-1 (default)
    * eu: eu-central-1
    */
  var sauceRegion: js.UndefOr[String] = js.undefined
  /**
    * Use sauceSeleniumAddress if you need to customize the URL Protractor
    * uses to connect to sauce labs (for example, if you are tunneling selenium
    * traffic through a sauce connect tunnel). Default is
    * ondemand.saucelabs.com:443/wd/hub
    */
  var sauceSeleniumAddress: js.UndefOr[String] = js.undefined
  /**
    * If true, Protractor will use http:// protocol instead of https:// to
    * connect to Sauce Labs defined by sauceSeleniumAddress.
    *
    * default: false
    */
  var sauceSeleniumUseHttp: js.UndefOr[Boolean] = js.undefined
  /**
    * If the sauceUser and sauceKey are specified, seleniumServerJar will be
    * ignored. The tests will be run remotely using Sauce Labs.
    */
  var sauceUser: js.UndefOr[String] = js.undefined
  /**
    * The address of a running Selenium Server. If specified, Protractor will
    * connect to an already running instance of Selenium. This usually looks like
    * seleniumAddress: 'http://localhost:4444/wd/hub'
    */
  var seleniumAddress: js.UndefOr[String] = js.undefined
  var seleniumArgs: js.UndefOr[js.Array[_]] = js.undefined
  var seleniumPort: js.UndefOr[Double] = js.undefined
  /**
    * The location of the standalone Selenium Server jar file, relative
    * to the location of webdriver-manager. If no other method of starting
    * Selenium Server is found, this will default to
    * node_modules/protractor/node_modules/webdriver-manager/selenium/<jar file>
    */
  var seleniumServerJar: js.UndefOr[String] = js.undefined
  /**
    * The timeout milliseconds waiting for a local standalone Selenium Server to start.
    *
    * default: 30000ms
    */
  var seleniumServerStartTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The selenium session id allows Protractor to attach to an existing selenium
    * browser session. The selenium session is maintained after the test has
    * completed. Ignored if seleniumAddress is null.
    */
  var seleniumSessionId: js.UndefOr[String] = js.undefined
  var seleniumWebDriver: js.UndefOr[WebDriver] = js.undefined
  /**
    * Turns off source map support.  Stops protractor from registering global
    * variable `source-map-support`.  Defaults to `false`
    */
  var skipSourceMapSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Required. Spec patterns are relative to the location of this config.
    *
    * Example:
    * specs: [
    *   'spec/ *_spec.js'
    * ]
    */
  var specs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If you would like protractor to use a specific suite by default instead of
    * all suites, you can put that in the config file as well.
    */
  var suite: js.UndefOr[String] = js.undefined
  /**
    * Alternatively, suites may be used. When run without a command line
    * parameter, all suites will run. If run with --suite=smoke or
    * --suite=smoke,full only the patterns matched by the specified suites will
    * run.
    *
    * Example:
    * suites: {
    *   smoke: 'spec/smoketests/ *.js',
    *   full: 'spec/ *.js'
    * }
    */
  var suites: js.UndefOr[js.Any] = js.undefined
  /**
    * If testobjectUser and testobjectKey are specified, kobitonUser, kobitonKey, browserStackUser,
    * browserStackKey and seleniumServerJar will be ignored. The tests will be run remotely using
    * TestObject.
    */
  var testobjectKey: js.UndefOr[String] = js.undefined
  /**
    * If testobjectUser and testobjectKey are specified, kobitonUser, kobitonKey, browserstackUser,
    * browserStackKey and seleniumServerJar will be ignored. The tests will be run remotely using
    * TestObject.
    */
  var testobjectUser: js.UndefOr[String] = js.undefined
  var troubleshoot: js.UndefOr[Boolean] = js.undefined
  var unknownFlags_ : js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Protractor will track outstanding $timeouts by default, and report them
    * in the error message if Protractor fails to synchronize with Angular in
    * time. In order to do this Protractor needs to decorate $timeout.
    *
    * CAUTION: If your app decorates $timeout, you must turn on this flag. This
    * is false by default.
    */
  var untrackOutstandingTimeouts: js.UndefOr[Boolean] = js.undefined
  /**
    * If specified, connect to webdriver through a proxy that manages client-side
    * synchronization. Blocking Proxy is an experimental feature and may change
    * without notice.
    */
  var useBlockingProxy: js.UndefOr[Boolean] = js.undefined
  var v8Debug: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether or not to buffer output when running tests on multiple browsers
    * in parallel. By default, when running multiple browser sessions, the
    * results are buffered and not logged until the test run finishes. If true,
    * when running multiple sessions in parallel results will be logged when
    * each test finishes.
    */
  var verboseMultiSessions: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, will create a log file in the given directory with a readable log of
    * the webdriver commands it executes.
    *
    * This is an experimental feature. Enabling this will also turn on Blocking Proxy
    * synchronization, which is also experimental.
    */
  var webDriverLogDir: js.UndefOr[String] = js.undefined
  /**
    * The proxy address that WebDriver (e.g. Selenium commands) traffic will go through
    * which is tied to the browser session.
    */
  var webDriverProxy: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    SELENIUM_PROMISE_MANAGER: js.UndefOr[Boolean] = js.undefined,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    afterLaunch: /* exitCode */ Double => Callback = null,
    allScriptsTimeout: Int | Double = null,
    baseUrl: String = null,
    beforeLaunch: js.UndefOr[Callback] = js.undefined,
    blockingProxyUrl: String = null,
    browserstackKey: String = null,
    browserstackProxy: String = null,
    browserstackUser: String = null,
    capabilities: AnonDictkey = null,
    chromeDriver: String = null,
    configDir: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    debuggerServerPort: Int | Double = null,
    directConnect: js.UndefOr[Boolean] = js.undefined,
    disableChecks: js.UndefOr[Boolean] = js.undefined,
    disableEnvironmentOverrides: js.UndefOr[Boolean] = js.undefined,
    elementExplorer: js.Any = null,
    exclude: js.Array[String] | String = null,
    firefoxPath: String = null,
    framework: String = null,
    frameworkPath: String = null,
    geckoDriver: String = null,
    getMultiCapabilities: js.Any = null,
    getPageTimeout: Int | Double = null,
    highlightDelay: Int | Double = null,
    ignoreUncaughtExceptions: js.UndefOr[Boolean] = js.undefined,
    jasmineNodeOpts: AnonDefaultTimeoutInterval = null,
    jvmArgs: js.Array[String] = null,
    kobitonKey: String = null,
    kobitonUser: String = null,
    localSeleniumStandaloneOpts: AnonJvmArgs = null,
    logLevel: ERROR | WARN | INFO | DEBUG = null,
    maxSessions: Int | Double = null,
    mochaOpts: AnonReporter = null,
    mockSelenium: js.UndefOr[Boolean] = js.undefined,
    multiCapabilities: js.Array[_] = null,
    ng12Hybrid: js.UndefOr[Boolean] = js.undefined,
    noGlobals: js.UndefOr[Boolean] = js.undefined,
    nodeDebug: js.UndefOr[Boolean] = js.undefined,
    onCleanUp: /* exitCode */ Double => Callback = null,
    onComplete: js.UndefOr[Callback] = js.undefined,
    onPrepare: js.UndefOr[Callback] = js.undefined,
    params: js.Any = null,
    plugins: js.Array[PluginConfig] = null,
    restartBrowserBetweenTests: js.UndefOr[Boolean] = js.undefined,
    resultJsonOutputFile: js.Any = null,
    rootElement: String = null,
    sauceAgent: js.Any = null,
    sauceBuild: String = null,
    sauceKey: String = null,
    sauceProxy: String = null,
    sauceRegion: String = null,
    sauceSeleniumAddress: String = null,
    sauceSeleniumUseHttp: js.UndefOr[Boolean] = js.undefined,
    sauceUser: String = null,
    seleniumAddress: String = null,
    seleniumArgs: js.Array[_] = null,
    seleniumPort: Int | Double = null,
    seleniumServerJar: String = null,
    seleniumServerStartTimeout: Int | Double = null,
    seleniumSessionId: String = null,
    seleniumWebDriver: WebDriver = null,
    skipSourceMapSupport: js.UndefOr[Boolean] = js.undefined,
    specs: js.Array[String] = null,
    suite: String = null,
    suites: js.Any = null,
    testobjectKey: String = null,
    testobjectUser: String = null,
    troubleshoot: js.UndefOr[Boolean] = js.undefined,
    unknownFlags_ : js.Array[String] = null,
    untrackOutstandingTimeouts: js.UndefOr[Boolean] = js.undefined,
    useBlockingProxy: js.UndefOr[Boolean] = js.undefined,
    v8Debug: js.Any = null,
    verboseMultiSessions: js.UndefOr[Boolean] = js.undefined,
    webDriverLogDir: String = null,
    webDriverProxy: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SELENIUM_PROMISE_MANAGER)) __obj.updateDynamic("SELENIUM_PROMISE_MANAGER")(SELENIUM_PROMISE_MANAGER.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (afterLaunch != null) __obj.updateDynamic("afterLaunch")(js.Any.fromFunction1((t0: /* exitCode */ scala.Double) => afterLaunch(t0).runNow()))
    if (allScriptsTimeout != null) __obj.updateDynamic("allScriptsTimeout")(allScriptsTimeout.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    beforeLaunch.foreach(p => __obj.updateDynamic("beforeLaunch")(p.toJsFn))
    if (blockingProxyUrl != null) __obj.updateDynamic("blockingProxyUrl")(blockingProxyUrl.asInstanceOf[js.Any])
    if (browserstackKey != null) __obj.updateDynamic("browserstackKey")(browserstackKey.asInstanceOf[js.Any])
    if (browserstackProxy != null) __obj.updateDynamic("browserstackProxy")(browserstackProxy.asInstanceOf[js.Any])
    if (browserstackUser != null) __obj.updateDynamic("browserstackUser")(browserstackUser.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (chromeDriver != null) __obj.updateDynamic("chromeDriver")(chromeDriver.asInstanceOf[js.Any])
    if (configDir != null) __obj.updateDynamic("configDir")(configDir.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (debuggerServerPort != null) __obj.updateDynamic("debuggerServerPort")(debuggerServerPort.asInstanceOf[js.Any])
    if (!js.isUndefined(directConnect)) __obj.updateDynamic("directConnect")(directConnect.asInstanceOf[js.Any])
    if (!js.isUndefined(disableChecks)) __obj.updateDynamic("disableChecks")(disableChecks.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEnvironmentOverrides)) __obj.updateDynamic("disableEnvironmentOverrides")(disableEnvironmentOverrides.asInstanceOf[js.Any])
    if (elementExplorer != null) __obj.updateDynamic("elementExplorer")(elementExplorer.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (firefoxPath != null) __obj.updateDynamic("firefoxPath")(firefoxPath.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (frameworkPath != null) __obj.updateDynamic("frameworkPath")(frameworkPath.asInstanceOf[js.Any])
    if (geckoDriver != null) __obj.updateDynamic("geckoDriver")(geckoDriver.asInstanceOf[js.Any])
    if (getMultiCapabilities != null) __obj.updateDynamic("getMultiCapabilities")(getMultiCapabilities.asInstanceOf[js.Any])
    if (getPageTimeout != null) __obj.updateDynamic("getPageTimeout")(getPageTimeout.asInstanceOf[js.Any])
    if (highlightDelay != null) __obj.updateDynamic("highlightDelay")(highlightDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUncaughtExceptions)) __obj.updateDynamic("ignoreUncaughtExceptions")(ignoreUncaughtExceptions.asInstanceOf[js.Any])
    if (jasmineNodeOpts != null) __obj.updateDynamic("jasmineNodeOpts")(jasmineNodeOpts.asInstanceOf[js.Any])
    if (jvmArgs != null) __obj.updateDynamic("jvmArgs")(jvmArgs.asInstanceOf[js.Any])
    if (kobitonKey != null) __obj.updateDynamic("kobitonKey")(kobitonKey.asInstanceOf[js.Any])
    if (kobitonUser != null) __obj.updateDynamic("kobitonUser")(kobitonUser.asInstanceOf[js.Any])
    if (localSeleniumStandaloneOpts != null) __obj.updateDynamic("localSeleniumStandaloneOpts")(localSeleniumStandaloneOpts.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (maxSessions != null) __obj.updateDynamic("maxSessions")(maxSessions.asInstanceOf[js.Any])
    if (mochaOpts != null) __obj.updateDynamic("mochaOpts")(mochaOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(mockSelenium)) __obj.updateDynamic("mockSelenium")(mockSelenium.asInstanceOf[js.Any])
    if (multiCapabilities != null) __obj.updateDynamic("multiCapabilities")(multiCapabilities.asInstanceOf[js.Any])
    if (!js.isUndefined(ng12Hybrid)) __obj.updateDynamic("ng12Hybrid")(ng12Hybrid.asInstanceOf[js.Any])
    if (!js.isUndefined(noGlobals)) __obj.updateDynamic("noGlobals")(noGlobals.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeDebug)) __obj.updateDynamic("nodeDebug")(nodeDebug.asInstanceOf[js.Any])
    if (onCleanUp != null) __obj.updateDynamic("onCleanUp")(js.Any.fromFunction1((t0: /* exitCode */ scala.Double) => onCleanUp(t0).runNow()))
    onComplete.foreach(p => __obj.updateDynamic("onComplete")(p.toJsFn))
    onPrepare.foreach(p => __obj.updateDynamic("onPrepare")(p.toJsFn))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(restartBrowserBetweenTests)) __obj.updateDynamic("restartBrowserBetweenTests")(restartBrowserBetweenTests.asInstanceOf[js.Any])
    if (resultJsonOutputFile != null) __obj.updateDynamic("resultJsonOutputFile")(resultJsonOutputFile.asInstanceOf[js.Any])
    if (rootElement != null) __obj.updateDynamic("rootElement")(rootElement.asInstanceOf[js.Any])
    if (sauceAgent != null) __obj.updateDynamic("sauceAgent")(sauceAgent.asInstanceOf[js.Any])
    if (sauceBuild != null) __obj.updateDynamic("sauceBuild")(sauceBuild.asInstanceOf[js.Any])
    if (sauceKey != null) __obj.updateDynamic("sauceKey")(sauceKey.asInstanceOf[js.Any])
    if (sauceProxy != null) __obj.updateDynamic("sauceProxy")(sauceProxy.asInstanceOf[js.Any])
    if (sauceRegion != null) __obj.updateDynamic("sauceRegion")(sauceRegion.asInstanceOf[js.Any])
    if (sauceSeleniumAddress != null) __obj.updateDynamic("sauceSeleniumAddress")(sauceSeleniumAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(sauceSeleniumUseHttp)) __obj.updateDynamic("sauceSeleniumUseHttp")(sauceSeleniumUseHttp.asInstanceOf[js.Any])
    if (sauceUser != null) __obj.updateDynamic("sauceUser")(sauceUser.asInstanceOf[js.Any])
    if (seleniumAddress != null) __obj.updateDynamic("seleniumAddress")(seleniumAddress.asInstanceOf[js.Any])
    if (seleniumArgs != null) __obj.updateDynamic("seleniumArgs")(seleniumArgs.asInstanceOf[js.Any])
    if (seleniumPort != null) __obj.updateDynamic("seleniumPort")(seleniumPort.asInstanceOf[js.Any])
    if (seleniumServerJar != null) __obj.updateDynamic("seleniumServerJar")(seleniumServerJar.asInstanceOf[js.Any])
    if (seleniumServerStartTimeout != null) __obj.updateDynamic("seleniumServerStartTimeout")(seleniumServerStartTimeout.asInstanceOf[js.Any])
    if (seleniumSessionId != null) __obj.updateDynamic("seleniumSessionId")(seleniumSessionId.asInstanceOf[js.Any])
    if (seleniumWebDriver != null) __obj.updateDynamic("seleniumWebDriver")(seleniumWebDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSourceMapSupport)) __obj.updateDynamic("skipSourceMapSupport")(skipSourceMapSupport.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    if (suite != null) __obj.updateDynamic("suite")(suite.asInstanceOf[js.Any])
    if (suites != null) __obj.updateDynamic("suites")(suites.asInstanceOf[js.Any])
    if (testobjectKey != null) __obj.updateDynamic("testobjectKey")(testobjectKey.asInstanceOf[js.Any])
    if (testobjectUser != null) __obj.updateDynamic("testobjectUser")(testobjectUser.asInstanceOf[js.Any])
    if (!js.isUndefined(troubleshoot)) __obj.updateDynamic("troubleshoot")(troubleshoot.asInstanceOf[js.Any])
    if (unknownFlags_ != null) __obj.updateDynamic("unknownFlags_")(unknownFlags_.asInstanceOf[js.Any])
    if (!js.isUndefined(untrackOutstandingTimeouts)) __obj.updateDynamic("untrackOutstandingTimeouts")(untrackOutstandingTimeouts.asInstanceOf[js.Any])
    if (!js.isUndefined(useBlockingProxy)) __obj.updateDynamic("useBlockingProxy")(useBlockingProxy.asInstanceOf[js.Any])
    if (v8Debug != null) __obj.updateDynamic("v8Debug")(v8Debug.asInstanceOf[js.Any])
    if (!js.isUndefined(verboseMultiSessions)) __obj.updateDynamic("verboseMultiSessions")(verboseMultiSessions.asInstanceOf[js.Any])
    if (webDriverLogDir != null) __obj.updateDynamic("webDriverLogDir")(webDriverLogDir.asInstanceOf[js.Any])
    if (webDriverProxy != null) __obj.updateDynamic("webDriverProxy")(webDriverProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

