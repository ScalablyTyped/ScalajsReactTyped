package typingsJapgolly.hexo.mod

import typingsJapgolly.hexo.mod.Router.Data
import typingsJapgolly.hexo.mod.Router.RouteStream
import typingsJapgolly.hexoUtil.mod.Pattern
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router_ extends js.Object {
  /**
    * The `format` method transforms a string to a valid path.
    */
  def format(path: String): String = js.native
  /**
    * The `get` method returns a `Stream`.
    */
  def get(path: String): js.UndefOr[RouteStream] = js.native
  /**
    * Get the List of Routes
    */
  def list(): js.Array[String] = js.native
  /**
    * Remove a Path
    */
  def remove(path: String): this.type = js.native
  /**
    * The `set` method takes a string, a `Buffer` or a function.
    */
  def set(path: String, data: String): this.type = js.native
  def set(path: String, data: Data): this.type = js.native
  def set(path: String, data: Pattern[Boolean]): this.type = js.native
  def set(path: String, data: Buffer): this.type = js.native
}

