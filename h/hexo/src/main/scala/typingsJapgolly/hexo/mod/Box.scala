package typingsJapgolly.hexo.mod

import typingsJapgolly.hexo.AnonEncoding
import typingsJapgolly.hexo.hexoStrings.create
import typingsJapgolly.hexo.hexoStrings.delete
import typingsJapgolly.hexo.hexoStrings.skip
import typingsJapgolly.hexo.hexoStrings.update
import typingsJapgolly.hexo.mod.Box.File
import typingsJapgolly.hexoUtil.mod.Pattern
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box extends EventEmitter {
  /**
    * A processor is an essential element of `Box` and is used to process files.
    * You can use path matching as described above to restrict what exactly the processor should process.
    * Register a new processor with the `addProcessor` method.
    */
  def addProcessor(pattern: String, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def addProcessor(pattern: Pattern[Boolean], fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def addProcessor(pattern: RegExp, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  /**
    * Loads all files in the folder.
    */
  def process(fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  /**
    * Stop watching.
    */
  def unwatch(): Unit = js.native
  /**
    * Loads all files in the folder and start watching for file changes.
    */
  def watch(): js.Promise[Unit] = js.native
  def watch(fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
}

@JSImport("hexo", "Box")
@js.native
object Box extends js.Object {
  @js.native
  trait File extends js.Object {
    /**
      * The information from path matching.
      */
    val params: js.Any = js.native
    /**
      * Relative path to the box of the file
      */
    val path: String = js.native
    /**
      * Full path of the file
      */
    val source: String = js.native
    /**
      * File type. The value can be `create` , `update` , `skip`, `delete` .
      */
    val `type`: create | update | skip | delete = js.native
    /**
      * Read a file
      */
    def read(): js.Promise[String | Buffer] = js.native
    def read(fn: js.Function2[/* err */ js.Any, /* result */ String | Buffer, Unit]): js.Promise[String | Buffer] = js.native
    def read(option: AnonEncoding): js.Promise[String | Buffer] = js.native
    def read(option: AnonEncoding, fn: js.Function2[/* err */ js.Any, /* result */ String | Buffer, Unit]): js.Promise[String | Buffer] = js.native
    /**
      * Read a file synchronously
      */
    def readSync(): String | Buffer = js.native
    def readSync(option: AnonEncoding): String | Buffer = js.native
    /**
      * Render a file
      */
    def render(): js.Promise[String] = js.native
    def render(fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
    def render(option: js.Any): js.Promise[String] = js.native
    def render(option: js.Any, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
    /**
      * Render a file synchronously
      */
    def renderSync(): String = js.native
    def renderSync(option: js.Any): String = js.native
    /**
      * Read the status of a file
      */
    def stat(): js.Promise[Stats] = js.native
    def stat(fn: js.Function2[/* err */ js.Any, /* result */ Stats, Unit]): js.Promise[Stats] = js.native
    /**
      * Read the status of a file synchronously
      */
    def statSync(): Stats = js.native
  }
  
}

