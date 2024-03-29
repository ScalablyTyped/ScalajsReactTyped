package typingsJapgolly.electron

import typingsJapgolly.electron.Electron.BlinkMemoryInfo
import typingsJapgolly.electron.Electron.CPUUsage
import typingsJapgolly.electron.Electron.HeapStatistics
import typingsJapgolly.electron.Electron.IOCounters
import typingsJapgolly.electron.Electron.ProcessMemoryInfo
import typingsJapgolly.electron.Electron.SystemMemoryInfo
import typingsJapgolly.electron.electronStrings.browser_
import typingsJapgolly.electron.electronStrings.loaded
import typingsJapgolly.electron.electronStrings.renderer
import typingsJapgolly.electron.electronStrings.worker
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  @js.native
  trait Process
    extends StObject
       with EventEmitter {
    
    @JSName("addListener")
    def addListener_loaded(event: loaded, listener: js.Function): this.type = js.native
    
    /**
      * A `string` representing Chrome's version string.
      *
      */
    val chrome: String = js.native
    
    /**
      * A `string` (optional) representing a globally unique ID of the current
      * JavaScript context. Each frame has its own JavaScript context. When
      * contextIsolation is enabled, the isolated world also has a separate JavaScript
      * context. This property is only available in the renderer process.
      *
      */
    val contextId: js.UndefOr[String] = js.native
    
    /**
      * A `boolean` that indicates whether the current renderer context has
      * `contextIsolation` enabled. It is `undefined` in the main process.
      *
      */
    val contextIsolated: Boolean = js.native
    
    /**
      * Causes the main thread of the current process crash.
      */
    def crash(): Unit = js.native
    
    /**
      * A `boolean`. When app is started by being passed as parameter to the default
      * app, this property is `true` in the main process, otherwise it is `undefined`.
      *
      */
    val defaultApp: Boolean = js.native
    
    /**
      * A `string` representing Electron's version string.
      *
      */
    val electron: String = js.native
    
    /**
      * * `allocated` Integer - Size of all allocated objects in Kilobytes.
      * * `total` Integer - Total allocated space in Kilobytes.
      * 
      * Returns an object with Blink memory information. It can be useful for debugging
      * rendering / DOM related memory issues. Note that all values are reported in
      * Kilobytes.
      */
    def getBlinkMemoryInfo(): BlinkMemoryInfo = js.native
    
    def getCPUUsage(): CPUUsage = js.native
    
    /**
      * The number of milliseconds since epoch, or `null` if the information is
      * unavailable
      * 
      * Indicates the creation time of the application. The time is represented as
      * number of milliseconds since epoch. It returns null if it is unable to get the
      * process creation time.
      */
    def getCreationTime(): Double | Null = js.native
    
    /**
      * * `totalHeapSize` Integer
      * * `totalHeapSizeExecutable` Integer
      * * `totalPhysicalSize` Integer
      * * `totalAvailableSize` Integer
      * * `usedHeapSize` Integer
      * * `heapSizeLimit` Integer
      * * `mallocedMemory` Integer
      * * `peakMallocedMemory` Integer
      * * `doesZapGarbage` boolean
      * 
      * Returns an object with V8 heap statistics. Note that all statistics are reported
      * in Kilobytes.
      */
    def getHeapStatistics(): HeapStatistics = js.native
    
    def getIOCounters(): IOCounters = js.native
    
    /**
      * Resolves with a ProcessMemoryInfo
      * 
      * Returns an object giving memory usage statistics about the current process. Note
      * that all statistics are reported in Kilobytes. This api should be called after
      * app ready.
      * 
      * Chromium does not provide `residentSet` value for macOS. This is because macOS
      * performs in-memory compression of pages that haven't been recently used. As a
      * result the resident set size value is not what one would expect. `private`
      * memory is more representative of the actual pre-compression memory usage of the
      * process on macOS.
      */
    def getProcessMemoryInfo(): js.Promise[ProcessMemoryInfo] = js.native
    
    /**
      * * `total` Integer - The total amount of physical memory in Kilobytes available
      * to the system.
      * * `free` Integer - The total amount of memory not being used by applications or
      * disk cache.
      * * `swapTotal` Integer _Windows_ _Linux_ - The total amount of swap memory in
      * Kilobytes available to the system.
      * * `swapFree` Integer _Windows_ _Linux_ - The free amount of swap memory in
      * Kilobytes available to the system.
      * 
      * Returns an object giving memory usage statistics about the entire system. Note
      * that all statistics are reported in Kilobytes.
      */
    def getSystemMemoryInfo(): SystemMemoryInfo = js.native
    
    /**
      * The version of the host operating system.
      * 
      * Example:
      * 
      * **Note:** It returns the actual operating system version instead of kernel
      * version on macOS unlike `os.release()`.
      */
    def getSystemVersion(): String = js.native
    
    /**
      * Causes the main thread of the current process hang.
      */
    def hang(): Unit = js.native
    
    /**
      * A `boolean`, `true` when the current renderer context is the "main" renderer
      * frame. If you want the ID of the current frame you should use
      * `webFrame.routingId`.
      *
      */
    val isMainFrame: Boolean = js.native
    
    /**
      * A `boolean`. For Mac App Store build, this property is `true`, for other builds
      * it is `undefined`.
      *
      */
    val mas: Boolean = js.native
    
    /**
      * A `boolean` that controls ASAR support inside your application. Setting this to
      * `true` will disable the support for `asar` archives in Node's built-in modules.
      */
    var noAsar: Boolean = js.native
    
    /**
      * A `boolean` that controls whether or not deprecation warnings are printed to
      * `stderr`. Setting this to `true` will silence deprecation warnings. This
      * property is used instead of the `--no-deprecation` command line flag.
      */
    var noDeprecation: Boolean = js.native
    
    // Docs: https://electronjs.org/docs/api/process
    /**
      * Emitted when Electron has loaded its internal initialization script and is
      * beginning to load the web page or the main script.
      */
    @JSName("on")
    def on_loaded(event: loaded, listener: js.Function): this.type = js.native
    
    @JSName("once")
    def once_loaded(event: loaded, listener: js.Function): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_loaded(event: loaded, listener: js.Function): this.type = js.native
    
    /**
      * A `string` representing the path to the resources directory.
      *
      */
    val resourcesPath: String = js.native
    
    /**
      * A `boolean`. When the renderer process is sandboxed, this property is `true`,
      * otherwise it is `undefined`.
      *
      */
    val sandboxed: Boolean = js.native
    
    /**
      * Sets the file descriptor soft limit to `maxDescriptors` or the OS hard limit,
      * whichever is lower for the current process.
      *
      * @platform darwin,linux
      */
    def setFdLimit(maxDescriptors: Double): Unit = js.native
    
    /**
      * Indicates whether the snapshot has been created successfully.
      * 
      * Takes a V8 heap snapshot and saves it to `filePath`.
      */
    def takeHeapSnapshot(filePath: String): Boolean = js.native
    
    /**
      * A `boolean` that controls whether or not deprecation warnings will be thrown as
      * exceptions. Setting this to `true` will throw errors for deprecations. This
      * property is used instead of the `--throw-deprecation` command line flag.
      */
    var throwDeprecation: Boolean = js.native
    
    /**
      * A `boolean` that controls whether or not deprecations printed to `stderr`
      * include their stack trace. Setting this to `true` will print stack traces for
      * deprecations. This property is instead of the `--trace-deprecation` command line
      * flag.
      */
    var traceDeprecation: Boolean = js.native
    
    /**
      * A `boolean` that controls whether or not process warnings printed to `stderr`
      * include their stack trace. Setting this to `true` will print stack traces for
      * process warnings (including deprecations). This property is instead of the
      * `--trace-warnings` command line flag.
      */
    var traceProcessWarnings: Boolean = js.native
    
    /**
      * A `string` representing the current process's type, can be:
      * 
      * * `browser` - The main process
      * * `renderer` - A renderer process
      * * `worker` - In a web worker
      *
      */
    val `type`: browser_ | renderer | worker = js.native
    
    /**
      * A `boolean`. If the app is running as a Windows Store app (appx), this property
      * is `true`, for otherwise it is `undefined`.
      *
      */
    val windowsStore: Boolean = js.native
  }
  
  trait ProcessVersions extends StObject {
    
    val chrome: String
    
    val electron: String
  }
  object ProcessVersions {
    
    inline def apply(chrome: String, electron: String): ProcessVersions = {
      val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], electron = electron.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessVersions]
    }
    
    extension [Self <: ProcessVersions](x: Self) {
      
      inline def setChrome(value: String): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def setElectron(value: String): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
    }
  }
}
