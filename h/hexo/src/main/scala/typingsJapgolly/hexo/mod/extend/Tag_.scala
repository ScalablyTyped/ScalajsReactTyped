package typingsJapgolly.hexo.mod.extend

import typingsJapgolly.hexo.mod.extend.Tag.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag_ extends js.Object {
  def register(
    name: String,
    fn: js.Function2[/* args */ js.Array[String], /* content */ js.UndefOr[String], String]
  ): Unit = js.native
  def register(
    name: String,
    fn: js.Function2[/* args */ js.Array[String], /* content */ js.UndefOr[String], String],
    options: Options
  ): Unit = js.native
}

