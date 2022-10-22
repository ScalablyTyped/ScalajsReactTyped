package typingsJapgolly.protractor

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.protractor.builtBrowserMod.ProtractorBrowser
import typingsJapgolly.protractor.builtConfigMod.Config
import typingsJapgolly.protractor.builtDriverProvidersMod.DriverProvider
import typingsJapgolly.protractor.builtPluginsMod.Plugins
import typingsJapgolly.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtRunnerMod {
  
  @JSImport("protractor/built/runner", "Runner")
  @js.native
  open class Runner protected () extends EventEmitter {
    def this(config: Config) = this()
    
    /**
      * Called after each test finishes.
      *
      * Responsible for `restartBrowserBetweenTests`
      *
      * @public
      * @return {q.Promise} A promise that will resolve when the work here is done
      */
    def afterEach(): Promise[Unit] = js.native
    
    var config_ : Config = js.native
    
    /**
      * Get the control flow used by this runner.
      * @return {Object} WebDriver control flow.
      */
    def controlFlow(): Any = js.native
    
    /**
      * Create a new driver from a driverProvider. Then set up a
      * new protractor instance using this driver.
      * This is used to set up the initial protractor instances and any
      * future ones.
      *
      * @param {Plugin} plugins The plugin functions
      * @param {ProtractorBrowser=} parentBrowser The browser which spawned this one
      *
      * @return {Protractor} a protractor instance.
      * @public
      */
    def createBrowser(plugins: Any): Any = js.native
    def createBrowser(plugins: Any, parentBrowser: ProtractorBrowser): Any = js.native
    
    var driverprovider_ : DriverProvider = js.native
    
    /**
      * Responsible for cleaning up test run and exiting the process.
      * @private
      * @param {int} Standard unix exit code
      */
    def exit_(exitCode: Double): Any = js.native
    
    var frameworkUsesAfterEach: Boolean = js.native
    
    /**
      * Getter for the Runner config object
      * @public
      * @return {Object} config
      */
    def getConfig(): Config = js.native
    
    /**
      * Grab driver provider based on type
      * @private
      *
      * Priority
      * 1) if directConnect is true, use that
      * 2) if seleniumAddress is given, use that
      * 3) if a Sauce Labs account is given, use that
      * 4) if a seleniumServerJar is specified, use that
      * 5) try to find the seleniumServerJar in protractor/selenium
      */
    def loadDriverProvider_(config: Config): Unit = js.native
    
    var o: Any = js.native
    
    var plugins_ : Plugins = js.native
    
    var preparer_ : Any = js.native
    
    var ready_ : js.UndefOr[js.Promise[Unit]] = js.native
    
    var restartPromise: Promise[Any] = js.native
    
    /**
      * The primary workhorse interface. Kicks off the test running process.
      *
      * @return {q.Promise} A promise which resolves to the exit code of the tests.
      * @public
      */
    def run(): Promise[Any] = js.native
    
    /**
      * Executor of testPreparer
      * @public
      * @param {string[]=} An optional list of command line arguments the framework will accept.
      * @return {q.Promise} A promise that will resolve when the test preparers
      *     are finished.
      */
    def runTestPreparer(): Promise[Any] = js.native
    def runTestPreparer(extraFlags: js.Array[String]): Promise[Any] = js.native
    
    /**
      * Registrar for testPreparers - executed right before tests run.
      * @public
      * @param {string/Fn} filenameOrFn
      */
    def setTestPreparer(filenameOrFn: String): Unit = js.native
    def setTestPreparer(filenameOrFn: js.Function): Unit = js.native
    
    /**
      * Sets up convenience globals for test specs
      * @private
      */
    def setupGlobals_(browser_ : ProtractorBrowser): Unit = js.native
    
    /**
      * Final cleanup on exiting the runner.
      *
      * @return {q.Promise} A promise which resolves on finish.
      * @private
      */
    def shutdown_(): Promise[Unit] = js.native
  }
}
