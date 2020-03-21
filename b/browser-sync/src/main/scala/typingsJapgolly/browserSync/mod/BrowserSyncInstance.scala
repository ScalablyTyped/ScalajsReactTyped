package typingsJapgolly.browserSync.mod

import typingsJapgolly.browserSync.AnonPlugin
import typingsJapgolly.browserSync.AnonStream
import typingsJapgolly.chokidar.mod.WatchOptions
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.NodeJS.EventEmitter
import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserSyncInstance extends js.Object {
  /**
    * A simple true/false flag that you can use to determine if there's a currently-running Browsersync instance.
    */
  var active: Boolean = js.native
  /**
    * The internal Event Emitter used by the running Browsersync instance (if there is one). You can use
    * this to emit your own events, such as changed files, logging etc.
    */
  var emitter: EventEmitter = js.native
  /** the name of this instance of browser-sync */
  var name: String = js.native
  /**
    * A simple true/false flag to determine if the current instance is paused
    */
  var paused: Boolean = js.native
  /**
    * Instance Cleanup.
    */
  def cleanup(): Unit = js.native
  def cleanup(fn: js.Function2[/* error */ ErrnoException, /* bs */ this.type, Unit]): Unit = js.native
  /**
    * This method will close any running server, stop file watching & exit the current process.
    */
  def exit(): Unit = js.native
  /**
    * Callback helper to examine what options have been set.
    * @param {string} name The key to search options map for.
    */
  def getOption(name: String): js.Any = js.native
  /**
    * Start the Browsersync service. This will launch a server, proxy or start the snippet mode
    * depending on your use-case.
    */
  def init(): BrowserSyncInstance = js.native
  def init(config: Options): BrowserSyncInstance = js.native
  def init(config: Options, callback: js.Function2[/* err */ js.Error, /* bs */ this.type, _]): BrowserSyncInstance = js.native
  /**
    * Helper method for browser notifications
    * @param message Can be a simple message such as 'Connected' or HTML
    * @param timeout How long the message will remain in the browser. @since 1.3.0
    */
  def notify(message: String): Unit = js.native
  def notify(message: String, timeout: Double): Unit = js.native
  /**
    * Method to pause file change events
    */
  def pause(): Unit = js.native
  /**
    * Reload the browser
    * The reload method will inform all browsers about changed files and will either cause the browser
    * to refresh, or inject the files where possible.
    */
  def reload(): Unit = js.native
  /**
    * Reload a single file
    * The reload method will inform all browsers about changed files and will either cause the browser
    * to refresh, or inject the files where possible.
    */
  def reload(file: String): Unit = js.native
  /**
    * Reload multiple files
    * The reload method will inform all browsers about changed files and will either cause the browser
    * to refresh, or inject the files where possible.
    */
  def reload(files: js.Array[String]): Unit = js.native
  /**
    * The reload method will inform all browsers about changed files and will either cause the browser
    * to refresh, or inject the files where possible.
    */
  def reload(options: AnonStream): ReadWriteStream = js.native
  /**
    * Method to resume paused watchers
    */
  def resume(): Unit = js.native
  /**
    * The stream method returns a transform stream and can act once or on many files.
    * @param opts Configuration for the stream method
    */
  def stream(): ReadWriteStream = js.native
  def stream(opts: StreamOptions): ReadWriteStream = js.native
  /**
    * Register a plugin.
    * Must implement at least a 'plugin' property that returns
    * callable function.
    *
    * @method use
    * @param {object} module The object to be `required`.
    * @param {object} options The
    * @param {any} cb A callback function that will return any errors.
    */
  def use(module: AnonPlugin): Unit = js.native
  def use(module: AnonPlugin, options: js.Object): Unit = js.native
  def use(module: AnonPlugin, options: js.Object, cb: js.Any): Unit = js.native
  /**
    * Stand alone file-watcher. Use this along with Browsersync to create your own, minimal build system
    */
  def watch(patterns: String): EventEmitter = js.native
  def watch(patterns: String, opts: WatchOptions): EventEmitter = js.native
  def watch(patterns: String, opts: WatchOptions, fn: js.Function2[/* event */ String, /* file */ Stats, _]): EventEmitter = js.native
}

