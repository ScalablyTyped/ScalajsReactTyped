package typingsJapgolly.hexo.mod.extend

import typingsJapgolly.hexo.mod.extend.Console.Options
import typingsJapgolly.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console_ extends js.Object {
  def register(name: String, desc: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  def register(name: String, desc: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  def register(name: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  def register(name: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
}

