package typingsJapgolly.electron.NodeJS

import typingsJapgolly.electron.Electron.CPUUsage
import typingsJapgolly.electron.Electron.HeapStatistics
import typingsJapgolly.electron.Electron.IOCounters
import typingsJapgolly.electron.Electron.ProcessMemoryInfo
import typingsJapgolly.electron.Electron.SystemMemoryInfo
import typingsJapgolly.electron.electronStrings.loaded
import typingsJapgolly.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends EventEmitter {
  /**
    * A Boolean. When app is started by being passed as parameter to the default app,
    * this property is true in the main process, otherwise it is undefined.
    */
  var defaultApp: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean that controls whether or not deprecation warnings are printed to
    * stderr when formerly callback-based APIs converted to Promises are invoked using
    * callbacks. Setting this to true will enable deprecation warnings.
    */
  var enablePromiseAPIs: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean, true when the current renderer context is the "main" renderer frame.
    * If you want the ID of the current frame you should use webFrame.routingId.
    */
  var isMainFrame: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean. For Mac App Store build, this property is true, for other builds it
    * is undefined.
    */
  var mas: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean that controls ASAR support inside your application. Setting this to
    * true will disable the support for asar archives in Node's built-in modules.
    */
  var noAsar: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean that controls whether or not deprecation warnings are printed to
    * stderr. Setting this to true will silence deprecation warnings. This property is
    * used instead of the --no-deprecation command line flag.
    */
  var noDeprecation: js.UndefOr[Boolean] = js.native
  /**
    * A String representing the path to the resources directory.
    */
  var resourcesPath: js.UndefOr[String] = js.native
  /**
    * A Boolean. When the renderer process is sandboxed, this property is true,
    * otherwise it is undefined.
    */
  var sandboxed: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean that controls whether or not deprecation warnings will be thrown as
    * exceptions. Setting this to true will throw errors for deprecations. This
    * property is used instead of the --throw-deprecation command line flag.
    */
  var throwDeprecation: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean that controls whether or not deprecations printed to stderr include
    * their stack trace. Setting this to true will print stack traces for
    * deprecations. This property is instead of the --trace-deprecation command line
    * flag.
    */
  var traceDeprecation: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean that controls whether or not process warnings printed to stderr
    * include their stack trace. Setting this to true will print stack traces for
    * process warnings (including deprecations). This property is instead of the
    * --trace-warnings command line flag.
    */
  var traceProcessWarnings: js.UndefOr[Boolean] = js.native
  /**
    * A String representing the current process's type, can be "browser" (i.e. main
    * process), "renderer", or "worker" (i.e. web worker).
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A Boolean. If the app is running as a Windows Store app (appx), this property is
    * true, for otherwise it is undefined.
    */
  var windowsStore: js.UndefOr[Boolean] = js.native
  @JSName("addListener")
  def addListener_loaded(event: loaded, listener: js.Function): this.type = js.native
  /**
    * Causes the main thread of the current process crash.
    */
  def crash(): Unit = js.native
  def getCPUUsage(): CPUUsage = js.native
  /**
    * Indicates the creation time of the application. The time is represented as
    * number of milliseconds since epoch. It returns null if it is unable to get the
    * process creation time.
    */
  def getCreationTime(): Double | Null = js.native
  /**
    * Returns an object with V8 heap statistics. Note that all statistics are reported
    * in Kilobytes.
    */
  def getHeapStatistics(): HeapStatistics = js.native
  def getIOCounters(): IOCounters = js.native
  /**
    * Returns an object giving memory usage statistics about the current process. Note
    * that all statistics are reported in Kilobytes. This api should be called after
    * app ready. Chromium does not provide residentSet value for macOS. This is
    * because macOS performs in-memory compression of pages that haven't been recently
    * used. As a result the resident set size value is not what one would expect.
    * private memory is more representative of the actual pre-compression memory usage
    * of the process on macOS.
    */
  def getProcessMemoryInfo(): js.Promise[ProcessMemoryInfo] = js.native
  /**
    * Returns an object giving memory usage statistics about the entire system. Note
    * that all statistics are reported in Kilobytes.
    */
  def getSystemMemoryInfo(): SystemMemoryInfo = js.native
  /**
    * Examples: Note: It returns the actual operating system version instead of kernel
    * version on macOS unlike os.release().
    */
  def getSystemVersion(): String = js.native
  /**
    * Causes the main thread of the current process hang.
    */
  def hang(): Unit = js.native
  // Docs: http://electronjs.org/docs/api/process
  /**
    * Emitted when Electron has loaded its internal initialization script and is
    * beginning to load the web page or the main script. It can be used by the preload
    * script to add removed Node global symbols back to the global scope when node
    * integration is turned off:
    */
  @JSName("on")
  def on_loaded(event: loaded, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_loaded(event: loaded, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_loaded(event: loaded, listener: js.Function): this.type = js.native
  /**
    * Sets the file descriptor soft limit to maxDescriptors or the OS hard limit,
    * whichever is lower for the current process.
    */
  def setFdLimit(maxDescriptors: Double): Unit = js.native
  /**
    * Takes a V8 heap snapshot and saves it to filePath.
    */
  def takeHeapSnapshot(filePath: String): Boolean = js.native
}

