package typingsJapgolly.globalNpm.mod

import typingsJapgolly.npm.mod.NPM.Commands
import typingsJapgolly.npm.mod.NPM.Config
import typingsJapgolly.npm.mod.NPM.ConfigOptions
import typingsJapgolly.npm.mod.NPM.Dictionary
import typingsJapgolly.npm.mod.NPM.SimpleCallback
import typingsJapgolly.npm.mod.NPM.Spinner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("global-npm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GLOBAL_NPM_BIN: String = js.native
  var GLOBAL_NPM_PATH: String = js.native
  val NPM: js.Any = js.native
  var abbrevs: Dictionary[String] = js.native
  var bin: String = js.native
  var cache: String = js.native
  var commands: Commands = js.native
  var config: Config = js.native
  var dir: String = js.native
  var fullList: js.Array[String] = js.native
  var globalBin: String = js.native
  var globalDir: String = js.native
  var prefix: String = js.native
  var rollbacks: js.Array[_] = js.native
  var root: String = js.native
  var spinner: Spinner = js.native
  var tmp: String = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def deref(command: String): String = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def getMaxListeners(): Double = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def load(callback: SimpleCallback[Config]): Unit = js.native
  def load(cli: ConfigOptions): Unit = js.native
  def load(cli: ConfigOptions, callback: SimpleCallback[Config]): Unit = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  // Added in Node 6...
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
}

